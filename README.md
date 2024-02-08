# decentro-in-collections-java-sdk

decentro-in-collections
- API version: 1.0.0

Collections

For more information, please visit [https://decentro.tech](https://decentro.tech)


## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>tech.decentro.in.collections</groupId>
  <artifactId>decentro-in-collections-java-sdk</artifactId>
  <version>2.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "tech.decentro.in.collections:decentro-in-collections-java-sdk:2.1.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/decentro-in-collections-java-sdk-2.1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://in.staging.decentro.tech*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CollectionsApi* | [**generatePaymentLink**](docs/CollectionsApi.md#generatePaymentLink) | **POST** /v2/payments/upi/link | Generate payment link
*CollectionsApi* | [**getTransactionStatus**](docs/CollectionsApi.md#getTransactionStatus) | **GET** /v2/payments/transaction/{transaction_id}/status | Get transaction status
*CollectionsApi* | [**issueCollectRequest**](docs/CollectionsApi.md#issueCollectRequest) | **POST** /v2/payments/collection | Issue collect request
*CollectionsApi* | [**issueUpiRefund**](docs/CollectionsApi.md#issueUpiRefund) | **POST** /v2/payments/upi/refund | Issue UPI Refund
*CollectionsApi* | [**validateUpiHandle**](docs/CollectionsApi.md#validateUpiHandle) | **POST** /v2/payments/vpa/validate | Validate UPI handle


## Documentation for Models

 - [GeneratePaymentLinkRequest](docs/GeneratePaymentLinkRequest.md)
 - [GeneratePaymentLinkResponse](docs/GeneratePaymentLinkResponse.md)
 - [GeneratePaymentLinkResponseData](docs/GeneratePaymentLinkResponseData.md)
 - [GeneratePaymentLinkResponseDataPspUri](docs/GeneratePaymentLinkResponseDataPspUri.md)
 - [GetTransactionStatusResponse](docs/GetTransactionStatusResponse.md)
 - [GetTransactionStatusResponseData](docs/GetTransactionStatusResponseData.md)
 - [GetTransactionStatusResponseError](docs/GetTransactionStatusResponseError.md)
 - [IssueCollectRequestRequest](docs/IssueCollectRequestRequest.md)
 - [IssueCollectRequestResponse](docs/IssueCollectRequestResponse.md)
 - [IssueCollectRequestResponseData](docs/IssueCollectRequestResponseData.md)
 - [IssueUpiRefundRequest](docs/IssueUpiRefundRequest.md)
 - [IssueUpiRefundResponse](docs/IssueUpiRefundResponse.md)
 - [IssueUpiRefundResponseData](docs/IssueUpiRefundResponseData.md)
 - [ValidateUpiHandleRequest](docs/ValidateUpiHandleRequest.md)
 - [ValidateUpiHandleResponse](docs/ValidateUpiHandleResponse.md)
 - [ValidateUpiHandleResponseData](docs/ValidateUpiHandleResponseData.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### client_id

- **Type**: API key
- **API key parameter name**: client_id
- **Location**: HTTP header

### client_secret

- **Type**: API key
- **API key parameter name**: client_secret
- **Location**: HTTP header

### module_secret

- **Type**: API key
- **API key parameter name**: module_secret
- **Location**: HTTP header

### provider_secret

- **Type**: API key
- **API key parameter name**: provider_secret
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.
