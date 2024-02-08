# CollectionsApi

All URIs are relative to *https://in.staging.decentro.tech*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generatePaymentLink**](CollectionsApi.md#generatePaymentLink) | **POST** /v2/payments/upi/link | Generate payment link |
| [**getTransactionStatus**](CollectionsApi.md#getTransactionStatus) | **GET** /v2/payments/transaction/{transaction_id}/status | Get transaction status |
| [**issueCollectRequest**](CollectionsApi.md#issueCollectRequest) | **POST** /v2/payments/collection | Issue collect request |
| [**issueUpiRefund**](CollectionsApi.md#issueUpiRefund) | **POST** /v2/payments/upi/refund | Issue UPI Refund |
| [**validateUpiHandle**](CollectionsApi.md#validateUpiHandle) | **POST** /v2/payments/vpa/validate | Validate UPI handle |


<a name="generatePaymentLink"></a>
# **generatePaymentLink**
> GeneratePaymentLinkResponse generatePaymentLink(generatePaymentLinkRequest).execute();

Generate payment link

### Example
```java
import tech.decentro.in.collections.client.ApiClient;
import tech.decentro.in.collections.client.ApiException;
import tech.decentro.in.collections.client.ApiResponse;
import tech.decentro.in.collections.client.Decentro;
import tech.decentro.in.collections.client.Configuration;
import tech.decentro.in.collections.client.auth.*;
import tech.decentro.in.collections.client.model.*;
import tech.decentro.in.collections.client.api.CollectionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://in.staging.decentro.tech";
    
    // Configure API key authorization: client_id
    configuration.client_id  = "YOUR API KEY";

    // Configure API key authorization: client_secret
    configuration.client_secret  = "YOUR API KEY";

    // Configure API key authorization: module_secret
    configuration.module_secret  = "YOUR API KEY";

    // Configure API key authorization: provider_secret
    configuration.provider_secret  = "YOUR API KEY";

    Decentro client = new Decentro(configuration);
    String referenceId = "referenceId_example";
    String payeeAccount = "payeeAccount_example";
    Double amount = 3.4D;
    String purposeMessage = "purposeMessage_example";
    Integer generateQr = 56;
    Integer expiryTime = 56;
    Integer customizedQrWithLogo = 56;
    Integer generateUri = 56;
    try {
      GeneratePaymentLinkResponse result = client
              .collections
              .generatePaymentLink(referenceId, payeeAccount, amount, purposeMessage, generateQr)
              .expiryTime(expiryTime)
              .customizedQrWithLogo(customizedQrWithLogo)
              .generateUri(generateUri)
              .execute();
      System.out.println(result);

      System.out.println(result.getDecentroTxnId());

      System.out.println(result.getStatus());

      System.out.println(result.getResponseCode());

      System.out.println(result.getMessage());

      System.out.println(result.getData());

      System.out.println(result.getResponseKey());

    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#generatePaymentLink");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GeneratePaymentLinkResponse> response = client
              .collections
              .generatePaymentLink(referenceId, payeeAccount, amount, purposeMessage, generateQr)
              .expiryTime(expiryTime)
              .customizedQrWithLogo(customizedQrWithLogo)
              .generateUri(generateUri)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#generatePaymentLink");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **generatePaymentLinkRequest** | [**GeneratePaymentLinkRequest**](GeneratePaymentLinkRequest.md)|  | |

### Return type

[**GeneratePaymentLinkResponse**](GeneratePaymentLinkResponse.md)

### Authorization

[client_id](../README.md#client_id), [client_secret](../README.md#client_secret), [module_secret](../README.md#module_secret), [provider_secret](../README.md#provider_secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getTransactionStatus"></a>
# **getTransactionStatus**
> GetTransactionStatusResponse getTransactionStatus(transactionId).execute();

Get transaction status

### Example
```java
import tech.decentro.in.collections.client.ApiClient;
import tech.decentro.in.collections.client.ApiException;
import tech.decentro.in.collections.client.ApiResponse;
import tech.decentro.in.collections.client.Decentro;
import tech.decentro.in.collections.client.Configuration;
import tech.decentro.in.collections.client.auth.*;
import tech.decentro.in.collections.client.model.*;
import tech.decentro.in.collections.client.api.CollectionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://in.staging.decentro.tech";
    
    // Configure API key authorization: client_id
    configuration.client_id  = "YOUR API KEY";

    // Configure API key authorization: client_secret
    configuration.client_secret  = "YOUR API KEY";

    // Configure API key authorization: module_secret
    configuration.module_secret  = "YOUR API KEY";

    // Configure API key authorization: provider_secret
    configuration.provider_secret  = "YOUR API KEY";

    Decentro client = new Decentro(configuration);
    String transactionId = "transactionId_example";
    try {
      GetTransactionStatusResponse result = client
              .collections
              .getTransactionStatus(transactionId)
              .execute();
      System.out.println(result);

      System.out.println(result.getDecentroTxnId());

      System.out.println(result.getStatus());

      System.out.println(result.getResponseCode());

      System.out.println(result.getMessage());

      System.out.println(result.getData());

      System.out.println(result.getError());

    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#getTransactionStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetTransactionStatusResponse> response = client
              .collections
              .getTransactionStatus(transactionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#getTransactionStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **transactionId** | **String**|  | |

### Return type

[**GetTransactionStatusResponse**](GetTransactionStatusResponse.md)

### Authorization

[client_id](../README.md#client_id), [client_secret](../README.md#client_secret), [module_secret](../README.md#module_secret), [provider_secret](../README.md#provider_secret)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Failure |  -  |

<a name="issueCollectRequest"></a>
# **issueCollectRequest**
> IssueCollectRequestResponse issueCollectRequest(issueCollectRequestRequest).execute();

Issue collect request

### Example
```java
import tech.decentro.in.collections.client.ApiClient;
import tech.decentro.in.collections.client.ApiException;
import tech.decentro.in.collections.client.ApiResponse;
import tech.decentro.in.collections.client.Decentro;
import tech.decentro.in.collections.client.Configuration;
import tech.decentro.in.collections.client.auth.*;
import tech.decentro.in.collections.client.model.*;
import tech.decentro.in.collections.client.api.CollectionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://in.staging.decentro.tech";
    
    // Configure API key authorization: client_id
    configuration.client_id  = "YOUR API KEY";

    // Configure API key authorization: client_secret
    configuration.client_secret  = "YOUR API KEY";

    // Configure API key authorization: module_secret
    configuration.module_secret  = "YOUR API KEY";

    // Configure API key authorization: provider_secret
    configuration.provider_secret  = "YOUR API KEY";

    Decentro client = new Decentro(configuration);
    String referenceId = "referenceId_example";
    String payerUpi = "payerUpi_example";
    String payeeAccount = "payeeAccount_example";
    Double amount = 3.4D;
    String purposeMessage = "purposeMessage_example";
    Integer expiryTime = 56;
    try {
      IssueCollectRequestResponse result = client
              .collections
              .issueCollectRequest(referenceId, payerUpi, payeeAccount, amount, purposeMessage)
              .expiryTime(expiryTime)
              .execute();
      System.out.println(result);

      System.out.println(result.getDecentroTxnId());

      System.out.println(result.getStatus());

      System.out.println(result.getResponseCode());

      System.out.println(result.getMessage());

      System.out.println(result.getData());

    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#issueCollectRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IssueCollectRequestResponse> response = client
              .collections
              .issueCollectRequest(referenceId, payerUpi, payeeAccount, amount, purposeMessage)
              .expiryTime(expiryTime)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#issueCollectRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **issueCollectRequestRequest** | [**IssueCollectRequestRequest**](IssueCollectRequestRequest.md)|  | |

### Return type

[**IssueCollectRequestResponse**](IssueCollectRequestResponse.md)

### Authorization

[client_id](../README.md#client_id), [client_secret](../README.md#client_secret), [module_secret](../README.md#module_secret), [provider_secret](../README.md#provider_secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="issueUpiRefund"></a>
# **issueUpiRefund**
> IssueUpiRefundResponse issueUpiRefund(issueUpiRefundRequest).execute();

Issue UPI Refund

### Example
```java
import tech.decentro.in.collections.client.ApiClient;
import tech.decentro.in.collections.client.ApiException;
import tech.decentro.in.collections.client.ApiResponse;
import tech.decentro.in.collections.client.Decentro;
import tech.decentro.in.collections.client.Configuration;
import tech.decentro.in.collections.client.auth.*;
import tech.decentro.in.collections.client.model.*;
import tech.decentro.in.collections.client.api.CollectionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://in.staging.decentro.tech";
    
    // Configure API key authorization: client_id
    configuration.client_id  = "YOUR API KEY";

    // Configure API key authorization: client_secret
    configuration.client_secret  = "YOUR API KEY";

    // Configure API key authorization: module_secret
    configuration.module_secret  = "YOUR API KEY";

    // Configure API key authorization: provider_secret
    configuration.provider_secret  = "YOUR API KEY";

    Decentro client = new Decentro(configuration);
    String referenceId = "referenceId_example";
    String transactionId = "transactionId_example";
    String bankReferenceNumber = "bankReferenceNumber_example";
    String purposeMessage = "purposeMessage_example";
    try {
      IssueUpiRefundResponse result = client
              .collections
              .issueUpiRefund(referenceId)
              .transactionId(transactionId)
              .bankReferenceNumber(bankReferenceNumber)
              .purposeMessage(purposeMessage)
              .execute();
      System.out.println(result);

      System.out.println(result.getDecentroTxnId());

      System.out.println(result.getStatus());

      System.out.println(result.getResponseCode());

      System.out.println(result.getMessage());

      System.out.println(result.getData());

    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#issueUpiRefund");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IssueUpiRefundResponse> response = client
              .collections
              .issueUpiRefund(referenceId)
              .transactionId(transactionId)
              .bankReferenceNumber(bankReferenceNumber)
              .purposeMessage(purposeMessage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#issueUpiRefund");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **issueUpiRefundRequest** | [**IssueUpiRefundRequest**](IssueUpiRefundRequest.md)|  | |

### Return type

[**IssueUpiRefundResponse**](IssueUpiRefundResponse.md)

### Authorization

[client_id](../README.md#client_id), [client_secret](../README.md#client_secret), [module_secret](../README.md#module_secret), [provider_secret](../README.md#provider_secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="validateUpiHandle"></a>
# **validateUpiHandle**
> ValidateUpiHandleResponse validateUpiHandle(validateUpiHandleRequest).execute();

Validate UPI handle

### Example
```java
import tech.decentro.in.collections.client.ApiClient;
import tech.decentro.in.collections.client.ApiException;
import tech.decentro.in.collections.client.ApiResponse;
import tech.decentro.in.collections.client.Decentro;
import tech.decentro.in.collections.client.Configuration;
import tech.decentro.in.collections.client.auth.*;
import tech.decentro.in.collections.client.model.*;
import tech.decentro.in.collections.client.api.CollectionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://in.staging.decentro.tech";
    
    // Configure API key authorization: client_id
    configuration.client_id  = "YOUR API KEY";

    // Configure API key authorization: client_secret
    configuration.client_secret  = "YOUR API KEY";

    // Configure API key authorization: module_secret
    configuration.module_secret  = "YOUR API KEY";

    // Configure API key authorization: provider_secret
    configuration.provider_secret  = "YOUR API KEY";

    Decentro client = new Decentro(configuration);
    String referenceId = "referenceId_example";
    String upiId = "upiId_example";
    String type = "type_example";
    try {
      ValidateUpiHandleResponse result = client
              .collections
              .validateUpiHandle(referenceId, upiId)
              .type(type)
              .execute();
      System.out.println(result);

      System.out.println(result.getDecentroTxnId());

      System.out.println(result.getStatus());

      System.out.println(result.getResponseCode());

      System.out.println(result.getMessage());

      System.out.println(result.getData());

    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#validateUpiHandle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ValidateUpiHandleResponse> response = client
              .collections
              .validateUpiHandle(referenceId, upiId)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#validateUpiHandle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **validateUpiHandleRequest** | [**ValidateUpiHandleRequest**](ValidateUpiHandleRequest.md)|  | |

### Return type

[**ValidateUpiHandleResponse**](ValidateUpiHandleResponse.md)

### Authorization

[client_id](../README.md#client_id), [client_secret](../README.md#client_secret), [module_secret](../README.md#module_secret), [provider_secret](../README.md#provider_secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

