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

import tech.decentro.in.collections.client.ApiCallback;
import tech.decentro.in.collections.client.ApiClient;
import tech.decentro.in.collections.client.ApiException;
import tech.decentro.in.collections.client.ApiResponse;
import tech.decentro.in.collections.client.Configuration;
import tech.decentro.in.collections.client.Pair;
import tech.decentro.in.collections.client.ProgressRequestBody;
import tech.decentro.in.collections.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import tech.decentro.in.collections.client.model.GeneratePaymentLinkRequest;
import tech.decentro.in.collections.client.model.GeneratePaymentLinkResponse;
import tech.decentro.in.collections.client.model.GetTransactionStatusResponse;
import tech.decentro.in.collections.client.model.IssueCollectRequestRequest;
import tech.decentro.in.collections.client.model.IssueCollectRequestResponse;
import tech.decentro.in.collections.client.model.IssueUpiRefundRequest;
import tech.decentro.in.collections.client.model.IssueUpiRefundResponse;
import tech.decentro.in.collections.client.model.ValidateUpiHandleRequest;
import tech.decentro.in.collections.client.model.ValidateUpiHandleResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class CollectionsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CollectionsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public CollectionsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        if (apiClient.getClientId() == null) {
            throw new IllegalArgumentException("\"client_id\" is required but no API key was provided. Please set \"client_id\" with ApiClient#setClientId(String).");
        }
        if (apiClient.getClientSecret() == null) {
            throw new IllegalArgumentException("\"client_secret\" is required but no API key was provided. Please set \"client_secret\" with ApiClient#setClientSecret(String).");
        }
        if (apiClient.getModuleSecret() == null) {
            throw new IllegalArgumentException("\"module_secret\" is required but no API key was provided. Please set \"module_secret\" with ApiClient#setModuleSecret(String).");
        }
        if (apiClient.getProviderSecret() == null) {
            throw new IllegalArgumentException("\"provider_secret\" is required but no API key was provided. Please set \"provider_secret\" with ApiClient#setProviderSecret(String).");
        }
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call generatePaymentLinkCall(GeneratePaymentLinkRequest generatePaymentLinkRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = generatePaymentLinkRequest;

        // create path and map variables
        String localVarPath = "/v2/payments/upi/link";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "client_id", "client_secret", "module_secret", "provider_secret" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call generatePaymentLinkValidateBeforeCall(GeneratePaymentLinkRequest generatePaymentLinkRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'generatePaymentLinkRequest' is set
        if (generatePaymentLinkRequest == null) {
            throw new ApiException("Missing the required parameter 'generatePaymentLinkRequest' when calling generatePaymentLink(Async)");
        }

        return generatePaymentLinkCall(generatePaymentLinkRequest, _callback);

    }


    private ApiResponse<GeneratePaymentLinkResponse> generatePaymentLinkWithHttpInfo(GeneratePaymentLinkRequest generatePaymentLinkRequest) throws ApiException {
        okhttp3.Call localVarCall = generatePaymentLinkValidateBeforeCall(generatePaymentLinkRequest, null);
        Type localVarReturnType = new TypeToken<GeneratePaymentLinkResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call generatePaymentLinkAsync(GeneratePaymentLinkRequest generatePaymentLinkRequest, final ApiCallback<GeneratePaymentLinkResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = generatePaymentLinkValidateBeforeCall(generatePaymentLinkRequest, _callback);
        Type localVarReturnType = new TypeToken<GeneratePaymentLinkResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GeneratePaymentLinkRequestBuilder {
        private final String referenceId;
        private final String payeeAccount;
        private final double amount;
        private final String purposeMessage;
        private final Integer generateQr;
        private Integer expiryTime;
        private Integer customizedQrWithLogo;
        private Integer generateUri;

        private GeneratePaymentLinkRequestBuilder(String referenceId, String payeeAccount, double amount, String purposeMessage, Integer generateQr) {
            this.referenceId = referenceId;
            this.payeeAccount = payeeAccount;
            this.amount = amount;
            this.purposeMessage = purposeMessage;
            this.generateQr = generateQr;
        }

        /**
         * Set expiryTime
         * @param expiryTime  (optional)
         * @return GeneratePaymentLinkRequestBuilder
         */
        public GeneratePaymentLinkRequestBuilder expiryTime(Integer expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }
        
        /**
         * Set customizedQrWithLogo
         * @param customizedQrWithLogo  (optional)
         * @return GeneratePaymentLinkRequestBuilder
         */
        public GeneratePaymentLinkRequestBuilder customizedQrWithLogo(Integer customizedQrWithLogo) {
            this.customizedQrWithLogo = customizedQrWithLogo;
            return this;
        }
        
        /**
         * Set generateUri
         * @param generateUri  (optional)
         * @return GeneratePaymentLinkRequestBuilder
         */
        public GeneratePaymentLinkRequestBuilder generateUri(Integer generateUri) {
            this.generateUri = generateUri;
            return this;
        }
        
        /**
         * Build call for generatePaymentLink
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            GeneratePaymentLinkRequest generatePaymentLinkRequest = buildBodyParams();
            return generatePaymentLinkCall(generatePaymentLinkRequest, _callback);
        }

        private GeneratePaymentLinkRequest buildBodyParams() {
            GeneratePaymentLinkRequest generatePaymentLinkRequest = new GeneratePaymentLinkRequest();
            generatePaymentLinkRequest.referenceId(this.referenceId);
            generatePaymentLinkRequest.payeeAccount(this.payeeAccount);
            generatePaymentLinkRequest.amount(this.amount);
            generatePaymentLinkRequest.purposeMessage(this.purposeMessage);
            generatePaymentLinkRequest.generateQr(this.generateQr);
            generatePaymentLinkRequest.expiryTime(this.expiryTime);
            generatePaymentLinkRequest.customizedQrWithLogo(this.customizedQrWithLogo);
            generatePaymentLinkRequest.generateUri(this.generateUri);
            return generatePaymentLinkRequest;
        }

        /**
         * Execute generatePaymentLink request
         * @return GeneratePaymentLinkResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public GeneratePaymentLinkResponse execute() throws ApiException {
            GeneratePaymentLinkRequest generatePaymentLinkRequest = buildBodyParams();
            ApiResponse<GeneratePaymentLinkResponse> localVarResp = generatePaymentLinkWithHttpInfo(generatePaymentLinkRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute generatePaymentLink request with HTTP info returned
         * @return ApiResponse&lt;GeneratePaymentLinkResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<GeneratePaymentLinkResponse> executeWithHttpInfo() throws ApiException {
            GeneratePaymentLinkRequest generatePaymentLinkRequest = buildBodyParams();
            return generatePaymentLinkWithHttpInfo(generatePaymentLinkRequest);
        }

        /**
         * Execute generatePaymentLink request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<GeneratePaymentLinkResponse> _callback) throws ApiException {
            GeneratePaymentLinkRequest generatePaymentLinkRequest = buildBodyParams();
            return generatePaymentLinkAsync(generatePaymentLinkRequest, _callback);
        }
    }

    /**
     * Generate payment link
     * 
     * @param generatePaymentLinkRequest  (required)
     * @return GeneratePaymentLinkRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public GeneratePaymentLinkRequestBuilder generatePaymentLink(String referenceId, String payeeAccount, double amount, String purposeMessage, Integer generateQr) throws IllegalArgumentException {
        if (referenceId == null) throw new IllegalArgumentException("\"referenceId\" is required but got null");
            if (referenceId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for referenceId. Length must be greater than or equal to 1.");
    }

        if (payeeAccount == null) throw new IllegalArgumentException("\"payeeAccount\" is required but got null");
            if (payeeAccount.length() < 1) {
      throw new IllegalArgumentException("Invalid value for payeeAccount. Length must be greater than or equal to 1.");
    }

        
        if (purposeMessage == null) throw new IllegalArgumentException("\"purposeMessage\" is required but got null");
            if (purposeMessage.length() < 1) {
      throw new IllegalArgumentException("Invalid value for purposeMessage. Length must be greater than or equal to 1.");
    }

        if (generateQr == null) throw new IllegalArgumentException("\"generateQr\" is required but got null");
        return new GeneratePaymentLinkRequestBuilder(referenceId, payeeAccount, amount, purposeMessage, generateQr);
    }
    private okhttp3.Call getTransactionStatusCall(String transactionId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/payments/transaction/{transaction_id}/status"
            .replace("{" + "transaction_id" + "}", localVarApiClient.escapeString(transactionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "client_id", "client_secret", "module_secret", "provider_secret" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getTransactionStatusValidateBeforeCall(String transactionId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new ApiException("Missing the required parameter 'transactionId' when calling getTransactionStatus(Async)");
        }

        return getTransactionStatusCall(transactionId, _callback);

    }


    private ApiResponse<GetTransactionStatusResponse> getTransactionStatusWithHttpInfo(String transactionId) throws ApiException {
        okhttp3.Call localVarCall = getTransactionStatusValidateBeforeCall(transactionId, null);
        Type localVarReturnType = new TypeToken<GetTransactionStatusResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getTransactionStatusAsync(String transactionId, final ApiCallback<GetTransactionStatusResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTransactionStatusValidateBeforeCall(transactionId, _callback);
        Type localVarReturnType = new TypeToken<GetTransactionStatusResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetTransactionStatusRequestBuilder {
        private final String transactionId;

        private GetTransactionStatusRequestBuilder(String transactionId) {
            this.transactionId = transactionId;
        }

        /**
         * Build call for getTransactionStatus
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 0 </td><td> Failure </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getTransactionStatusCall(transactionId, _callback);
        }


        /**
         * Execute getTransactionStatus request
         * @return GetTransactionStatusResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 0 </td><td> Failure </td><td>  -  </td></tr>
         </table>
         */
        public GetTransactionStatusResponse execute() throws ApiException {
            ApiResponse<GetTransactionStatusResponse> localVarResp = getTransactionStatusWithHttpInfo(transactionId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getTransactionStatus request with HTTP info returned
         * @return ApiResponse&lt;GetTransactionStatusResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 0 </td><td> Failure </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<GetTransactionStatusResponse> executeWithHttpInfo() throws ApiException {
            return getTransactionStatusWithHttpInfo(transactionId);
        }

        /**
         * Execute getTransactionStatus request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 0 </td><td> Failure </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<GetTransactionStatusResponse> _callback) throws ApiException {
            return getTransactionStatusAsync(transactionId, _callback);
        }
    }

    /**
     * Get transaction status
     * 
     * @param transactionId  (required)
     * @return GetTransactionStatusRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Failure </td><td>  -  </td></tr>
     </table>
     */
    public GetTransactionStatusRequestBuilder getTransactionStatus(String transactionId) throws IllegalArgumentException {
        if (transactionId == null) throw new IllegalArgumentException("\"transactionId\" is required but got null");
            if (transactionId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for transactionId. Length must be greater than or equal to 1.");
    }

        return new GetTransactionStatusRequestBuilder(transactionId);
    }
    private okhttp3.Call issueCollectRequestCall(IssueCollectRequestRequest issueCollectRequestRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = issueCollectRequestRequest;

        // create path and map variables
        String localVarPath = "/v2/payments/collection";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "client_id", "client_secret", "module_secret", "provider_secret" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call issueCollectRequestValidateBeforeCall(IssueCollectRequestRequest issueCollectRequestRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'issueCollectRequestRequest' is set
        if (issueCollectRequestRequest == null) {
            throw new ApiException("Missing the required parameter 'issueCollectRequestRequest' when calling issueCollectRequest(Async)");
        }

        return issueCollectRequestCall(issueCollectRequestRequest, _callback);

    }


    private ApiResponse<IssueCollectRequestResponse> issueCollectRequestWithHttpInfo(IssueCollectRequestRequest issueCollectRequestRequest) throws ApiException {
        okhttp3.Call localVarCall = issueCollectRequestValidateBeforeCall(issueCollectRequestRequest, null);
        Type localVarReturnType = new TypeToken<IssueCollectRequestResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call issueCollectRequestAsync(IssueCollectRequestRequest issueCollectRequestRequest, final ApiCallback<IssueCollectRequestResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = issueCollectRequestValidateBeforeCall(issueCollectRequestRequest, _callback);
        Type localVarReturnType = new TypeToken<IssueCollectRequestResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class IssueCollectRequestRequestBuilder {
        private final String referenceId;
        private final String payerUpi;
        private final String payeeAccount;
        private final double amount;
        private final String purposeMessage;
        private Integer expiryTime;

        private IssueCollectRequestRequestBuilder(String referenceId, String payerUpi, String payeeAccount, double amount, String purposeMessage) {
            this.referenceId = referenceId;
            this.payerUpi = payerUpi;
            this.payeeAccount = payeeAccount;
            this.amount = amount;
            this.purposeMessage = purposeMessage;
        }

        /**
         * Set expiryTime
         * @param expiryTime  (optional)
         * @return IssueCollectRequestRequestBuilder
         */
        public IssueCollectRequestRequestBuilder expiryTime(Integer expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }
        
        /**
         * Build call for issueCollectRequest
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            IssueCollectRequestRequest issueCollectRequestRequest = buildBodyParams();
            return issueCollectRequestCall(issueCollectRequestRequest, _callback);
        }

        private IssueCollectRequestRequest buildBodyParams() {
            IssueCollectRequestRequest issueCollectRequestRequest = new IssueCollectRequestRequest();
            issueCollectRequestRequest.referenceId(this.referenceId);
            issueCollectRequestRequest.payerUpi(this.payerUpi);
            issueCollectRequestRequest.payeeAccount(this.payeeAccount);
            issueCollectRequestRequest.amount(this.amount);
            issueCollectRequestRequest.purposeMessage(this.purposeMessage);
            issueCollectRequestRequest.expiryTime(this.expiryTime);
            return issueCollectRequestRequest;
        }

        /**
         * Execute issueCollectRequest request
         * @return IssueCollectRequestResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public IssueCollectRequestResponse execute() throws ApiException {
            IssueCollectRequestRequest issueCollectRequestRequest = buildBodyParams();
            ApiResponse<IssueCollectRequestResponse> localVarResp = issueCollectRequestWithHttpInfo(issueCollectRequestRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute issueCollectRequest request with HTTP info returned
         * @return ApiResponse&lt;IssueCollectRequestResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<IssueCollectRequestResponse> executeWithHttpInfo() throws ApiException {
            IssueCollectRequestRequest issueCollectRequestRequest = buildBodyParams();
            return issueCollectRequestWithHttpInfo(issueCollectRequestRequest);
        }

        /**
         * Execute issueCollectRequest request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<IssueCollectRequestResponse> _callback) throws ApiException {
            IssueCollectRequestRequest issueCollectRequestRequest = buildBodyParams();
            return issueCollectRequestAsync(issueCollectRequestRequest, _callback);
        }
    }

    /**
     * Issue collect request
     * 
     * @param issueCollectRequestRequest  (required)
     * @return IssueCollectRequestRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public IssueCollectRequestRequestBuilder issueCollectRequest(String referenceId, String payerUpi, String payeeAccount, double amount, String purposeMessage) throws IllegalArgumentException {
        if (referenceId == null) throw new IllegalArgumentException("\"referenceId\" is required but got null");
            if (referenceId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for referenceId. Length must be greater than or equal to 1.");
    }

        if (payerUpi == null) throw new IllegalArgumentException("\"payerUpi\" is required but got null");
            if (payerUpi.length() < 1) {
      throw new IllegalArgumentException("Invalid value for payerUpi. Length must be greater than or equal to 1.");
    }

        if (payeeAccount == null) throw new IllegalArgumentException("\"payeeAccount\" is required but got null");
            if (payeeAccount.length() < 1) {
      throw new IllegalArgumentException("Invalid value for payeeAccount. Length must be greater than or equal to 1.");
    }

        
        if (purposeMessage == null) throw new IllegalArgumentException("\"purposeMessage\" is required but got null");
            if (purposeMessage.length() < 1) {
      throw new IllegalArgumentException("Invalid value for purposeMessage. Length must be greater than or equal to 1.");
    }

        return new IssueCollectRequestRequestBuilder(referenceId, payerUpi, payeeAccount, amount, purposeMessage);
    }
    private okhttp3.Call issueUpiRefundCall(IssueUpiRefundRequest issueUpiRefundRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = issueUpiRefundRequest;

        // create path and map variables
        String localVarPath = "/v2/payments/upi/refund";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "client_id", "client_secret", "module_secret", "provider_secret" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call issueUpiRefundValidateBeforeCall(IssueUpiRefundRequest issueUpiRefundRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'issueUpiRefundRequest' is set
        if (issueUpiRefundRequest == null) {
            throw new ApiException("Missing the required parameter 'issueUpiRefundRequest' when calling issueUpiRefund(Async)");
        }

        return issueUpiRefundCall(issueUpiRefundRequest, _callback);

    }


    private ApiResponse<IssueUpiRefundResponse> issueUpiRefundWithHttpInfo(IssueUpiRefundRequest issueUpiRefundRequest) throws ApiException {
        okhttp3.Call localVarCall = issueUpiRefundValidateBeforeCall(issueUpiRefundRequest, null);
        Type localVarReturnType = new TypeToken<IssueUpiRefundResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call issueUpiRefundAsync(IssueUpiRefundRequest issueUpiRefundRequest, final ApiCallback<IssueUpiRefundResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = issueUpiRefundValidateBeforeCall(issueUpiRefundRequest, _callback);
        Type localVarReturnType = new TypeToken<IssueUpiRefundResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class IssueUpiRefundRequestBuilder {
        private final String referenceId;
        private String transactionId;
        private String bankReferenceNumber;
        private String purposeMessage;

        private IssueUpiRefundRequestBuilder(String referenceId) {
            this.referenceId = referenceId;
        }

        /**
         * Set transactionId
         * @param transactionId  (optional)
         * @return IssueUpiRefundRequestBuilder
         */
        public IssueUpiRefundRequestBuilder transactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }
        
        /**
         * Set bankReferenceNumber
         * @param bankReferenceNumber  (optional)
         * @return IssueUpiRefundRequestBuilder
         */
        public IssueUpiRefundRequestBuilder bankReferenceNumber(String bankReferenceNumber) {
            this.bankReferenceNumber = bankReferenceNumber;
            return this;
        }
        
        /**
         * Set purposeMessage
         * @param purposeMessage  (optional)
         * @return IssueUpiRefundRequestBuilder
         */
        public IssueUpiRefundRequestBuilder purposeMessage(String purposeMessage) {
            this.purposeMessage = purposeMessage;
            return this;
        }
        
        /**
         * Build call for issueUpiRefund
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            IssueUpiRefundRequest issueUpiRefundRequest = buildBodyParams();
            return issueUpiRefundCall(issueUpiRefundRequest, _callback);
        }

        private IssueUpiRefundRequest buildBodyParams() {
            IssueUpiRefundRequest issueUpiRefundRequest = new IssueUpiRefundRequest();
            issueUpiRefundRequest.referenceId(this.referenceId);
            issueUpiRefundRequest.transactionId(this.transactionId);
            issueUpiRefundRequest.bankReferenceNumber(this.bankReferenceNumber);
            issueUpiRefundRequest.purposeMessage(this.purposeMessage);
            return issueUpiRefundRequest;
        }

        /**
         * Execute issueUpiRefund request
         * @return IssueUpiRefundResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public IssueUpiRefundResponse execute() throws ApiException {
            IssueUpiRefundRequest issueUpiRefundRequest = buildBodyParams();
            ApiResponse<IssueUpiRefundResponse> localVarResp = issueUpiRefundWithHttpInfo(issueUpiRefundRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute issueUpiRefund request with HTTP info returned
         * @return ApiResponse&lt;IssueUpiRefundResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<IssueUpiRefundResponse> executeWithHttpInfo() throws ApiException {
            IssueUpiRefundRequest issueUpiRefundRequest = buildBodyParams();
            return issueUpiRefundWithHttpInfo(issueUpiRefundRequest);
        }

        /**
         * Execute issueUpiRefund request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<IssueUpiRefundResponse> _callback) throws ApiException {
            IssueUpiRefundRequest issueUpiRefundRequest = buildBodyParams();
            return issueUpiRefundAsync(issueUpiRefundRequest, _callback);
        }
    }

    /**
     * Issue UPI Refund
     * 
     * @param issueUpiRefundRequest  (required)
     * @return IssueUpiRefundRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public IssueUpiRefundRequestBuilder issueUpiRefund(String referenceId) throws IllegalArgumentException {
        if (referenceId == null) throw new IllegalArgumentException("\"referenceId\" is required but got null");
            if (referenceId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for referenceId. Length must be greater than or equal to 1.");
    }

        return new IssueUpiRefundRequestBuilder(referenceId);
    }
    private okhttp3.Call validateUpiHandleCall(ValidateUpiHandleRequest validateUpiHandleRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = validateUpiHandleRequest;

        // create path and map variables
        String localVarPath = "/v2/payments/vpa/validate";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "client_id", "client_secret", "module_secret", "provider_secret" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call validateUpiHandleValidateBeforeCall(ValidateUpiHandleRequest validateUpiHandleRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'validateUpiHandleRequest' is set
        if (validateUpiHandleRequest == null) {
            throw new ApiException("Missing the required parameter 'validateUpiHandleRequest' when calling validateUpiHandle(Async)");
        }

        return validateUpiHandleCall(validateUpiHandleRequest, _callback);

    }


    private ApiResponse<ValidateUpiHandleResponse> validateUpiHandleWithHttpInfo(ValidateUpiHandleRequest validateUpiHandleRequest) throws ApiException {
        okhttp3.Call localVarCall = validateUpiHandleValidateBeforeCall(validateUpiHandleRequest, null);
        Type localVarReturnType = new TypeToken<ValidateUpiHandleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call validateUpiHandleAsync(ValidateUpiHandleRequest validateUpiHandleRequest, final ApiCallback<ValidateUpiHandleResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = validateUpiHandleValidateBeforeCall(validateUpiHandleRequest, _callback);
        Type localVarReturnType = new TypeToken<ValidateUpiHandleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ValidateUpiHandleRequestBuilder {
        private final String referenceId;
        private final String upiId;
        private String type;

        private ValidateUpiHandleRequestBuilder(String referenceId, String upiId) {
            this.referenceId = referenceId;
            this.upiId = upiId;
        }

        /**
         * Set type
         * @param type  (optional)
         * @return ValidateUpiHandleRequestBuilder
         */
        public ValidateUpiHandleRequestBuilder type(String type) {
            this.type = type;
            return this;
        }
        
        /**
         * Build call for validateUpiHandle
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            ValidateUpiHandleRequest validateUpiHandleRequest = buildBodyParams();
            return validateUpiHandleCall(validateUpiHandleRequest, _callback);
        }

        private ValidateUpiHandleRequest buildBodyParams() {
            ValidateUpiHandleRequest validateUpiHandleRequest = new ValidateUpiHandleRequest();
            validateUpiHandleRequest.referenceId(this.referenceId);
            validateUpiHandleRequest.upiId(this.upiId);
            validateUpiHandleRequest.type(this.type);
            return validateUpiHandleRequest;
        }

        /**
         * Execute validateUpiHandle request
         * @return ValidateUpiHandleResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ValidateUpiHandleResponse execute() throws ApiException {
            ValidateUpiHandleRequest validateUpiHandleRequest = buildBodyParams();
            ApiResponse<ValidateUpiHandleResponse> localVarResp = validateUpiHandleWithHttpInfo(validateUpiHandleRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute validateUpiHandle request with HTTP info returned
         * @return ApiResponse&lt;ValidateUpiHandleResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ValidateUpiHandleResponse> executeWithHttpInfo() throws ApiException {
            ValidateUpiHandleRequest validateUpiHandleRequest = buildBodyParams();
            return validateUpiHandleWithHttpInfo(validateUpiHandleRequest);
        }

        /**
         * Execute validateUpiHandle request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ValidateUpiHandleResponse> _callback) throws ApiException {
            ValidateUpiHandleRequest validateUpiHandleRequest = buildBodyParams();
            return validateUpiHandleAsync(validateUpiHandleRequest, _callback);
        }
    }

    /**
     * Validate UPI handle
     * 
     * @param validateUpiHandleRequest  (required)
     * @return ValidateUpiHandleRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ValidateUpiHandleRequestBuilder validateUpiHandle(String referenceId, String upiId) throws IllegalArgumentException {
        if (referenceId == null) throw new IllegalArgumentException("\"referenceId\" is required but got null");
            if (referenceId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for referenceId. Length must be greater than or equal to 1.");
    }

        if (upiId == null) throw new IllegalArgumentException("\"upiId\" is required but got null");
            if (upiId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for upiId. Length must be greater than or equal to 1.");
    }

        return new ValidateUpiHandleRequestBuilder(referenceId, upiId);
    }
}
