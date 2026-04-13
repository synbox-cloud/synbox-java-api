# ServerManagementApi

All URIs are relative to *http://synbox.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createContainer**](ServerManagementApi.md#createContainer) | **POST** /api/containers/create | Create a new container |
| [**deleteContainer**](ServerManagementApi.md#deleteContainer) | **DELETE** /api/containers/{id}/delete | Delete a container |
| [**getContainer**](ServerManagementApi.md#getContainer) | **GET** /api/containers/{id} | Get container details |
| [**getContainers**](ServerManagementApi.md#getContainers) | **GET** /api/containers | Get all containers for a user |
| [**suspendContainer**](ServerManagementApi.md#suspendContainer) | **GET** /api/containers/{serverId}/suspend | Suspend a container |
| [**unsuspendContainer**](ServerManagementApi.md#unsuspendContainer) | **GET** /api/containers/{serverId}/unsuspend | Unsuspend a container |


<a id="createContainer"></a>
# **createContainer**
> String createContainer(cloudServerModel)

Create a new container

Creates a new container for the authenticated user.

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.ServerManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ServerManagementApi apiInstance = new ServerManagementApi(defaultClient);
    CloudServerModel cloudServerModel = new CloudServerModel(); // CloudServerModel | 
    try {
      String result = apiInstance.createContainer(cloudServerModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerManagementApi#createContainer");
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
| **cloudServerModel** | [**CloudServerModel**](CloudServerModel.md)|  | |

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
| **200** | Successfully created container |  -  |
| **500** | Internal server error |  -  |

<a id="deleteContainer"></a>
# **deleteContainer**
> CloudServerModel deleteContainer(id)

Delete a container

Deletes a specific container.

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.ServerManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ServerManagementApi apiInstance = new ServerManagementApi(defaultClient);
    String id = "id_example"; // String | ID of the container
    try {
      CloudServerModel result = apiInstance.deleteContainer(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerManagementApi#deleteContainer");
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

[**CloudServerModel**](CloudServerModel.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **404** | Container not found |  -  |
| **200** | Successfully deleted container |  -  |

<a id="getContainer"></a>
# **getContainer**
> CloudServerModel getContainer(id)

Get container details

Retrieves the details of a specific container.

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.ServerManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ServerManagementApi apiInstance = new ServerManagementApi(defaultClient);
    String id = "id_example"; // String | ID of the container
    try {
      CloudServerModel result = apiInstance.getContainer(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerManagementApi#getContainer");
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

[**CloudServerModel**](CloudServerModel.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **404** | Container not found |  -  |
| **200** | Successfully retrieved container details |  -  |

<a id="getContainers"></a>
# **getContainers**
> Object getContainers()

Get all containers for a user

Retrieves a list of all containers for the authenticated user.

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.ServerManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ServerManagementApi apiInstance = new ServerManagementApi(defaultClient);
    try {
      Object result = apiInstance.getContainers();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerManagementApi#getContainers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | Successfully retrieved containers |  -  |

<a id="suspendContainer"></a>
# **suspendContainer**
> Object suspendContainer(serverId)

Suspend a container

Suspends a specific container. (Testing endpoint)

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.ServerManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ServerManagementApi apiInstance = new ServerManagementApi(defaultClient);
    String serverId = "serverId_example"; // String | ID of the container
    try {
      Object result = apiInstance.suspendContainer(serverId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerManagementApi#suspendContainer");
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
| **serverId** | **String**| ID of the container | |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Bad request |  -  |
| **200** | Successfully suspended container |  -  |

<a id="unsuspendContainer"></a>
# **unsuspendContainer**
> Object unsuspendContainer(serverId)

Unsuspend a container

Unsuspends a specific container. (Testing endpoint)

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.ServerManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ServerManagementApi apiInstance = new ServerManagementApi(defaultClient);
    String serverId = "serverId_example"; // String | ID of the container
    try {
      Object result = apiInstance.unsuspendContainer(serverId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerManagementApi#unsuspendContainer");
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
| **serverId** | **String**| ID of the container | |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Bad request |  -  |
| **200** | Successfully unsuspended container |  -  |

