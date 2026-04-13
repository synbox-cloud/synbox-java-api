# StartStopManagementApi

All URIs are relative to *http://synbox.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getStart**](StartStopManagementApi.md#getStart) | **GET** /api/server/containers/{id}/startstop | Get start and stop times |
| [**putStart**](StartStopManagementApi.md#putStart) | **PUT** /api/server/containers/{id}/startstop | Update start and stop times |


<a id="getStart"></a>
# **getStart**
> StartStopTimeDTO getStart(id)

Get start and stop times

Retrieves the start and stop times for a specific container.

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.StartStopManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    StartStopManagementApi apiInstance = new StartStopManagementApi(defaultClient);
    String id = "id_example"; // String | ID of the container
    try {
      StartStopTimeDTO result = apiInstance.getStart(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StartStopManagementApi#getStart");
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
| **id** | **String**| ID of the container | |

### Return type

[**StartStopTimeDTO**](StartStopTimeDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Bad request |  -  |
| **200** | Successfully retrieved start and stop times |  -  |
| **403** | Forbidden |  -  |
| **404** | Container not found |  -  |

<a id="putStart"></a>
# **putStart**
> StartStopTimeDTO putStart(id, body)

Update start and stop times

Updates the start and stop times for a specific container.

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.StartStopManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    StartStopManagementApi apiInstance = new StartStopManagementApi(defaultClient);
    String id = "id_example"; // String | ID of the container
    String body = "body_example"; // String | 
    try {
      StartStopTimeDTO result = apiInstance.putStart(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StartStopManagementApi#putStart");
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
| **id** | **String**| ID of the container | |
| **body** | **String**|  | |

### Return type

[**StartStopTimeDTO**](StartStopTimeDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Container not found |  -  |
| **200** | Successfully updated start and stop times |  -  |

