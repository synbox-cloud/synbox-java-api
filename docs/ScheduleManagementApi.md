# ScheduleManagementApi

All URIs are relative to *http://synbox.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSchedules**](ScheduleManagementApi.md#createSchedules) | **POST** /api/containers/{server_id}/schedules/create | Create a schedule |
| [**deleteSchedule**](ScheduleManagementApi.md#deleteSchedule) | **DELETE** /api/containers/{server_id}/schedules/delete | Delete a schedule |
| [**getSchedules**](ScheduleManagementApi.md#getSchedules) | **GET** /api/containers/{server_id}/schedules | Get schedules |
| [**updateSchedules**](ScheduleManagementApi.md#updateSchedules) | **PUT** /api/containers/{server_id}/schedules/update | Update a schedule |


<a id="createSchedules"></a>
# **createSchedules**
> String createSchedules(serverId, scheduleModel)

Create a schedule

Creates a new schedule for a specific server.

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.ScheduleManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ScheduleManagementApi apiInstance = new ScheduleManagementApi(defaultClient);
    String serverId = "serverId_example"; // String | ID of the server
    ScheduleModel scheduleModel = new ScheduleModel(); // ScheduleModel | 
    try {
      String result = apiInstance.createSchedules(serverId, scheduleModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScheduleManagementApi#createSchedules");
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
| **scheduleModel** | [**ScheduleModel**](ScheduleModel.md)|  | |

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
| **403** | Forbidden |  -  |
| **200** | Successfully created schedule |  -  |

<a id="deleteSchedule"></a>
# **deleteSchedule**
> String deleteSchedule(serverId, body)

Delete a schedule

Deletes a schedule for a specific server.

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.ScheduleManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ScheduleManagementApi apiInstance = new ScheduleManagementApi(defaultClient);
    String serverId = "serverId_example"; // String | ID of the server
    String body = "body_example"; // String | 
    try {
      String result = apiInstance.deleteSchedule(serverId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScheduleManagementApi#deleteSchedule");
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
| **200** | Successfully deleted schedule |  -  |
| **403** | Forbidden |  -  |

<a id="getSchedules"></a>
# **getSchedules**
> String getSchedules(serverId)

Get schedules

Retrieves all schedules for a specific server.

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.ScheduleManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ScheduleManagementApi apiInstance = new ScheduleManagementApi(defaultClient);
    String serverId = "serverId_example"; // String | ID of the server
    try {
      String result = apiInstance.getSchedules(serverId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScheduleManagementApi#getSchedules");
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
| **200** | Successfully retrieved schedules |  -  |
| **403** | Forbidden |  -  |

<a id="updateSchedules"></a>
# **updateSchedules**
> String updateSchedules(serverId, scheduleModel)

Update a schedule

Updates an existing schedule for a specific server.

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.ScheduleManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ScheduleManagementApi apiInstance = new ScheduleManagementApi(defaultClient);
    String serverId = "serverId_example"; // String | ID of the server
    ScheduleModel scheduleModel = new ScheduleModel(); // ScheduleModel | 
    try {
      String result = apiInstance.updateSchedules(serverId, scheduleModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScheduleManagementApi#updateSchedules");
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
| **scheduleModel** | [**ScheduleModel**](ScheduleModel.md)|  | |

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
| **403** | Forbidden |  -  |
| **200** | Successfully updated schedule |  -  |

