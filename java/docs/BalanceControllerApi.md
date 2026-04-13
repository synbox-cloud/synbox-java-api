# BalanceControllerApi

All URIs are relative to *http://synbox.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBalanceInvoice**](BalanceControllerApi.md#createBalanceInvoice) | **POST** /api/billing/balance/invoice/create |  |


<a id="createBalanceInvoice"></a>
# **createBalanceInvoice**
> BalanceInvoiceModel createBalanceInvoice(balanceInvoiceModel)



### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.BalanceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    BalanceControllerApi apiInstance = new BalanceControllerApi(defaultClient);
    BalanceInvoiceModel balanceInvoiceModel = new BalanceInvoiceModel(); // BalanceInvoiceModel | 
    try {
      BalanceInvoiceModel result = apiInstance.createBalanceInvoice(balanceInvoiceModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BalanceControllerApi#createBalanceInvoice");
      System.err.println("Status code: " + e.getCode());
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
| **balanceInvoiceModel** | [**BalanceInvoiceModel**](BalanceInvoiceModel.md)|  | |

### Return type

[**BalanceInvoiceModel**](BalanceInvoiceModel.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

