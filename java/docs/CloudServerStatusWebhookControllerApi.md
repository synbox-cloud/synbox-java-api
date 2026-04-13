# CloudServerStatusWebhookControllerApi

All URIs are relative to *http://synbox.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**receive1**](CloudServerStatusWebhookControllerApi.md#receive1) | **POST** /webhook/cloudserver |  |


<a id="receive1"></a>
# **receive1**
> receive1(body)



### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.CloudServerStatusWebhookControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    CloudServerStatusWebhookControllerApi apiInstance = new CloudServerStatusWebhookControllerApi(defaultClient);
    String body = "body_example"; // String | 
    try {
      apiInstance.receive1(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudServerStatusWebhookControllerApi#receive1");
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
| **body** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

