# ContainerVolumesApi

All URIs are relative to *http://synbox.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getVolumes**](ContainerVolumesApi.md#getVolumes) | **GET** /api/containers/{server_id}/volumes/ | Get volumes for a server |
| [**selectVolume**](ContainerVolumesApi.md#selectVolume) | **GET** /api/containers/{server_id}/volumes/select/{id} | Select a volume for a server |


<a id="getVolumes"></a>
# **getVolumes**
> String getVolumes(serverId)

Get volumes for a server

Returns a list of available volumes for a server.

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.ContainerVolumesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ContainerVolumesApi apiInstance = new ContainerVolumesApi(defaultClient);
    String serverId = "serverId_example"; // String | ID of the server
    try {
      String result = apiInstance.getVolumes(serverId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainerVolumesApi#getVolumes");
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
| **403** | Forbidden |  -  |
| **200** | Volumes retrieved successfully |  -  |

<a id="selectVolume"></a>
# **selectVolume**
> String selectVolume(serverId, id)

Select a volume for a server

Sets the volume to be used when the server starts.

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.ContainerVolumesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ContainerVolumesApi apiInstance = new ContainerVolumesApi(defaultClient);
    String serverId = "serverId_example"; // String | ID of the server
    String id = "id_example"; // String | ID of the volume
    try {
      String result = apiInstance.selectVolume(serverId, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainerVolumesApi#selectVolume");
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
| **id** | **String**| ID of the volume | |

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
| **403** | Forbidden |  -  |
| **200** | Volume selected successfully |  -  |

