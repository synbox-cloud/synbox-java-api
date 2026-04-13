# UserShareManagementApi

All URIs are relative to *http://synbox.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getUsers1**](UserShareManagementApi.md#getUsers1) | **GET** /api/containers/{server_id}/permission/share/user | Get users with permissions |
| [**updateUserPermissions**](UserShareManagementApi.md#updateUserPermissions) | **POST** /api/containers/{server_id}/permission/share/user | Update user permissions |


<a id="getUsers1"></a>
# **getUsers1**
> String getUsers1(serverId)

Get users with permissions

Retrieves a list of users and their permissions for a specific server.

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.UserShareManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    UserShareManagementApi apiInstance = new UserShareManagementApi(defaultClient);
    String serverId = "serverId_example"; // String | ID of the server
    try {
      String result = apiInstance.getUsers1(serverId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserShareManagementApi#getUsers1");
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
| **404** | Server not found |  -  |
| **200** | Successfully retrieved users and permissions |  -  |
| **403** | Forbidden |  -  |

<a id="updateUserPermissions"></a>
# **updateUserPermissions**
> String updateUserPermissions(serverId, body)

Update user permissions

Updates the permissions for a user on a specific server.

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.UserShareManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    UserShareManagementApi apiInstance = new UserShareManagementApi(defaultClient);
    String serverId = "serverId_example"; // String | ID of the server
    String body = "body_example"; // String | 
    try {
      String result = apiInstance.updateUserPermissions(serverId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserShareManagementApi#updateUserPermissions");
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

**String**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated user permissions |  -  |
| **404** | Server not found |  -  |
| **403** | Forbidden |  -  |

