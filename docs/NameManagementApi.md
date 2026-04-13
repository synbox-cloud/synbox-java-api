# NameManagementApi

All URIs are relative to *http://synbox.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**changeVersion1**](NameManagementApi.md#changeVersion1) | **POST** /api/containers/{server_id}/settings/changeName | Change server name |


<a id="changeVersion1"></a>
# **changeVersion1**
> Object changeVersion1(serverId, body)

Change server name

Changes the name of a specific server.

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.NameManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    NameManagementApi apiInstance = new NameManagementApi(defaultClient);
    String serverId = "serverId_example"; // String | ID of the server
    String body = "body_example"; // String | 
    try {
      Object result = apiInstance.changeVersion1(serverId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NameManagementApi#changeVersion1");
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
| **body** | **String**|  | |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Invalid name format |  -  |
| **200** | Successfully changed server name |  -  |
| **403** | Forbidden |  -  |

