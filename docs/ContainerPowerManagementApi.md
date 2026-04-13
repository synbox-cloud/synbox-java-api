# ContainerPowerManagementApi

All URIs are relative to *http://synbox.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**killContainer**](ContainerPowerManagementApi.md#killContainer) | **GET** /api/containers/{id}/kill | Kill a container |
| [**restartContainer**](ContainerPowerManagementApi.md#restartContainer) | **GET** /api/containers/{id}/restart | Restart a container |
| [**startContainer**](ContainerPowerManagementApi.md#startContainer) | **GET** /api/containers/{id}/start | Start a container |
| [**stopContainer**](ContainerPowerManagementApi.md#stopContainer) | **GET** /api/containers/{id}/stop | Stop a container |


<a id="killContainer"></a>
# **killContainer**
> PowerStatusDTO killContainer(id)

Kill a container

Forcefully stops a specific container.

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.ContainerPowerManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ContainerPowerManagementApi apiInstance = new ContainerPowerManagementApi(defaultClient);
    String id = "id_example"; // String | ID of the container
    try {
      PowerStatusDTO result = apiInstance.killContainer(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainerPowerManagementApi#killContainer");
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

[**PowerStatusDTO**](PowerStatusDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **412** | Precondition Failed - Server is suspended |  -  |
| **200** | Successfully killed container |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

<a id="restartContainer"></a>
# **restartContainer**
> PowerStatusDTO restartContainer(id)

Restart a container

Restarts a specific container.

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.ContainerPowerManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ContainerPowerManagementApi apiInstance = new ContainerPowerManagementApi(defaultClient);
    String id = "id_example"; // String | ID of the container
    try {
      PowerStatusDTO result = apiInstance.restartContainer(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainerPowerManagementApi#restartContainer");
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

[**PowerStatusDTO**](PowerStatusDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully restarted container |  -  |
| **403** | Forbidden |  -  |
| **412** | Precondition Failed - Server is suspended or user is in queue |  -  |

<a id="startContainer"></a>
# **startContainer**
> PowerStatusDTO startContainer(id)

Start a container

Starts a specific container.

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.ContainerPowerManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ContainerPowerManagementApi apiInstance = new ContainerPowerManagementApi(defaultClient);
    String id = "id_example"; // String | ID of the container
    try {
      PowerStatusDTO result = apiInstance.startContainer(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainerPowerManagementApi#startContainer");
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

[**PowerStatusDTO**](PowerStatusDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully started container |  -  |
| **403** | Forbidden |  -  |
| **412** | Precondition Failed - Server is suspended or user is in queue |  -  |

<a id="stopContainer"></a>
# **stopContainer**
> PowerStatusDTO stopContainer(id)

Stop a container

Stops a specific container.

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.ContainerPowerManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ContainerPowerManagementApi apiInstance = new ContainerPowerManagementApi(defaultClient);
    String id = "id_example"; // String | ID of the container
    try {
      PowerStatusDTO result = apiInstance.stopContainer(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainerPowerManagementApi#stopContainer");
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

[**PowerStatusDTO**](PowerStatusDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **412** | Precondition Failed - Server is suspended |  -  |
| **200** | Successfully stopped container |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

