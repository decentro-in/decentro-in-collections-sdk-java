package tech.decentro.in.collections.client.api;

import tech.decentro.in.collections.client.ApiCallback;
import tech.decentro.in.collections.client.ApiClient;
import tech.decentro.in.collections.client.ApiException;
import tech.decentro.in.collections.client.model.GetTransactionStatusResponse;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CollectionsApi extends CollectionsApiGenerated {

    public CollectionsApi(ApiClient apiClient) throws IllegalArgumentException {
        super(apiClient);
    }

    /**
     * Return value of pollTransactionStatus. Can be queried for most recent
     * response's status.
     */
    public static class TransactionStatusPoller {

        private enum Status {
            SUCCESS,
            FAILURE,
            PENDING,
            EXPIRED,
            ERROR
        }

        public GetTransactionStatusResponse mostRecentResponse;
        private int numRequestsSent = 0;

        // Edit here to configure the amount of delay you would like
        // key = request number, value = delay in seconds
        private static final Map<Integer, Integer> delayForRequest = new HashMap<Integer, Integer>() {
            {
                put(0, 0);
                put(1, 2);
                put(2, 5);
                put(3, 7);
                put(4, 14);
                put(5, 30);
                put(6, 50);
                put(7, 80);
                put(8, 240);
                put(9, 37);
                put(10, 60);
            }
        };

        public String getStatus() {
            // First response has not yet come back -> pending
            if (this.mostRecentResponse == null)
                return Status.PENDING.name();

            boolean isExpired = this.isExpired();
            // The most recent response from the server was an error
            // If we have not yet expired, we will try again -> pending
            // If we have expired, due to last response being an error -> error
            if (this.mostRecentResponse.getStatus().equals(Status.FAILURE.name()))
                return isExpired ? Status.ERROR.name() : Status.PENDING.name();

            String status = this.mostRecentResponse.getData().getTransactionStatus();
            // The poller has sent the max number of requests and has not received a
            // terminal response
            if (isExpired && status.equals(Status.PENDING.name()))
                return Status.EXPIRED.name();
            // Otherwise, return the status from the most recent response
            return status;
        }

        public long getNextTimeout() {
            return TransactionStatusPoller.delayForRequest.get(this.numRequestsSent);
        }

        public boolean isExpired() {
            return this.numRequestsSent >= delayForRequest.size();
        }

        public boolean hasTerminalStatus() {
            return !this.getStatus().equals(Status.PENDING.name());
        }
    }

    /**
     * Poll transaction status by repeatedly calling getTranactionStatus with delays
     * until response is no longer pending
     * 
     * @param transactionId id of transaction whose status we are polling
     * @return TransactionStatusPoller which can check status of transaction
     * @throws ApiException
     */
    public TransactionStatusPoller pollTransactionStatus(String transactionId) throws ApiException {
        TransactionStatusPoller poller = new TransactionStatusPoller();
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        executor.schedule(() -> pollTransactionStatus(transactionId, poller, executor),
                poller.getNextTimeout(), TimeUnit.SECONDS);
        return poller;
    }

    /**
     * Private helper for pollTransactionStatus
     */
    private void pollTransactionStatus(String transactionId, TransactionStatusPoller poller,
            ScheduledExecutorService executor) {

        try {
            this.getTransactionStatus(transactionId).executeAsync(new ApiCallback<GetTransactionStatusResponse>() {

                @Override
                public void onSuccess(GetTransactionStatusResponse result, int statusCode,
                        Map<String, List<String>> responseHeaders) {
                    poller.mostRecentResponse = result;
                    poller.numRequestsSent++;
                    if (!poller.hasTerminalStatus())
                        executor.schedule(() -> pollTransactionStatus(transactionId, poller, executor),
                                poller.getNextTimeout(), TimeUnit.SECONDS);
                }

                @Override
                public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                    handleApiException(e);
                }
            });
        } catch (ApiException e) {
            handleApiException(e);
        }
    }

    private void handleApiException(ApiException e) {
        System.out.println("Encountered exception when polling: " + e.getMessage());
    }
}