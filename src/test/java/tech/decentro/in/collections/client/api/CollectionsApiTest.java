/*
 * decentro-in-collections
 * Collections
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: admin@decentro.tech
 *
 * Do not edit the class manually.
 */


package tech.decentro.in.collections.client.api;

import tech.decentro.in.collections.client.ApiException;
import tech.decentro.in.collections.client.ApiClient;
import tech.decentro.in.collections.client.ApiException;
import tech.decentro.in.collections.client.Configuration;
import tech.decentro.in.collections.client.model.GeneratePaymentLinkRequest;
import tech.decentro.in.collections.client.model.GeneratePaymentLinkResponse;
import tech.decentro.in.collections.client.model.GetTransactionStatusResponse;
import tech.decentro.in.collections.client.model.IssueCollectRequestRequest;
import tech.decentro.in.collections.client.model.IssueCollectRequestResponse;
import tech.decentro.in.collections.client.model.IssueUpiRefundRequest;
import tech.decentro.in.collections.client.model.IssueUpiRefundResponse;
import tech.decentro.in.collections.client.model.ValidateUpiHandleRequest;
import tech.decentro.in.collections.client.model.ValidateUpiHandleResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CollectionsApi
 */
@Disabled
public class CollectionsApiTest {

    private static CollectionsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new CollectionsApi(apiClient);
    }

    /**
     * Generate payment link
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generatePaymentLinkTest() throws ApiException {
        String referenceId = null;
        String payeeAccount = null;
        Double amount = null;
        String purposeMessage = null;
        Integer generateQr = null;
        Integer expiryTime = null;
        Integer customizedQrWithLogo = null;
        Integer generateUri = null;
        GeneratePaymentLinkResponse response = api.generatePaymentLink(referenceId, payeeAccount, amount, purposeMessage, generateQr)
                .expiryTime(expiryTime)
                .customizedQrWithLogo(customizedQrWithLogo)
                .generateUri(generateUri)
                .execute();
        // TODO: test validations
    }

    /**
     * Get transaction status
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTransactionStatusTest() throws ApiException {
        String transactionId = null;
        GetTransactionStatusResponse response = api.getTransactionStatus(transactionId)
                .execute();
        // TODO: test validations
    }

    /**
     * Issue collect request
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void issueCollectRequestTest() throws ApiException {
        String referenceId = null;
        String payerUpi = null;
        String payeeAccount = null;
        Double amount = null;
        String purposeMessage = null;
        Integer expiryTime = null;
        IssueCollectRequestResponse response = api.issueCollectRequest(referenceId, payerUpi, payeeAccount, amount, purposeMessage)
                .expiryTime(expiryTime)
                .execute();
        // TODO: test validations
    }

    /**
     * Issue UPI Refund
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void issueUpiRefundTest() throws ApiException {
        String referenceId = null;
        String transactionId = null;
        String bankReferenceNumber = null;
        String purposeMessage = null;
        IssueUpiRefundResponse response = api.issueUpiRefund(referenceId)
                .transactionId(transactionId)
                .bankReferenceNumber(bankReferenceNumber)
                .purposeMessage(purposeMessage)
                .execute();
        // TODO: test validations
    }

    /**
     * Validate UPI handle
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void validateUpiHandleTest() throws ApiException {
        String referenceId = null;
        String upiId = null;
        String type = null;
        ValidateUpiHandleResponse response = api.validateUpiHandle(referenceId, upiId)
                .type(type)
                .execute();
        // TODO: test validations
    }

}
