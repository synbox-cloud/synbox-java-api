# SftpManagementApi

All URIs are relative to *http://synbox.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generatePassword**](SftpManagementApi.md#generatePassword) | **GET** /api/containers/{server_id}/sftp/generateOTP | Generate SFTP one-time password |


<a id="generatePassword"></a>
# **generatePassword**
> String generatePassword(serverId)

Generate SFTP one-time password

Generates a one-time password for SFTP access to a specific server.

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.SftpManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    SftpManagementApi apiInstance = new SftpManagementApi(defaultClient);
    String serverId = "serverId_example"; // String | ID of the server
    try {
      String result = apiInstance.generatePassword(serverId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SftpManagementApi#generatePassword");
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
| **200** | Successfully generated one-time password |  -  |

