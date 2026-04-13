# ConsoleAuthApi

All URIs are relative to *http://synbox.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAuthToken**](ConsoleAuthApi.md#getAuthToken) | **GET** /api/containers/{server_id}/auth | Get console auth token |


<a id="getAuthToken"></a>
# **getAuthToken**
> String getAuthToken(serverId)

Get console auth token

Retrieves an authentication token for the console.

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.ConsoleAuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ConsoleAuthApi apiInstance = new ConsoleAuthApi(defaultClient);
    String serverId = "serverId_example"; // String | ID of the server
    try {
      String result = apiInstance.getAuthToken(serverId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsoleAuthApi#getAuthToken");
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
| **serverId** | **String**| ID of the server | |

### Return type

**String**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved auth token |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

