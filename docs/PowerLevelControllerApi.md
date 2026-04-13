# PowerLevelControllerApi

All URIs are relative to *http://synbox.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**changePowerLevel**](PowerLevelControllerApi.md#changePowerLevel) | **POST** /api/billing/powerlevel/{serverId} |  |
| [**getCurrentPowerLevel**](PowerLevelControllerApi.md#getCurrentPowerLevel) | **GET** /api/billing/powerlevel/{serverId} |  |


<a id="changePowerLevel"></a>
# **changePowerLevel**
> String changePowerLevel(serverId, body)



### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.PowerLevelControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PowerLevelControllerApi apiInstance = new PowerLevelControllerApi(defaultClient);
    String serverId = "serverId_example"; // String | 
    String body = "body_example"; // String | 
    try {
      String result = apiInstance.changePowerLevel(serverId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PowerLevelControllerApi#changePowerLevel");
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
| **serverId** | **String**|  | |
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
| **200** | OK |  -  |

<a id="getCurrentPowerLevel"></a>
# **getCurrentPowerLevel**
> String getCurrentPowerLevel(serverId)



### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.PowerLevelControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PowerLevelControllerApi apiInstance = new PowerLevelControllerApi(defaultClient);
    String serverId = "serverId_example"; // String | 
    try {
      String result = apiInstance.getCurrentPowerLevel(serverId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PowerLevelControllerApi#getCurrentPowerLevel");
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
| **serverId** | **String**|  | |

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
| **200** | OK |  -  |

