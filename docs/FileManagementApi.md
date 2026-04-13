# FileManagementApi

All URIs are relative to *http://synbox.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**chmod**](FileManagementApi.md#chmod) | **POST** /api/containers/{serverId}/files/chmod | Change file permissions |
| [**compressFile**](FileManagementApi.md#compressFile) | **POST** /api/containers/{serverId}/files/compress | Compress files |
| [**copyFile**](FileManagementApi.md#copyFile) | **POST** /api/containers/{serverId}/files/copy | Copy a file |
| [**createDirectory**](FileManagementApi.md#createDirectory) | **POST** /api/containers/{serverId}/files/create-directory | Create a directory |
| [**createFile**](FileManagementApi.md#createFile) | **POST** /api/containers/{serverId}/files/create-file | Create a File |
| [**decompressFile**](FileManagementApi.md#decompressFile) | **POST** /api/containers/{serverId}/files/decompress | Decompress a file |
| [**deleteFile**](FileManagementApi.md#deleteFile) | **POST** /api/containers/{serverId}/files/delete | Delete files |
| [**downloadFile**](FileManagementApi.md#downloadFile) | **POST** /api/containers/{serverId}/download | Download a file |
| [**getFileContents**](FileManagementApi.md#getFileContents) | **GET** /api/containers/{serverId}/files/contents | Get file contents |
| [**listDirectory**](FileManagementApi.md#listDirectory) | **GET** /api/containers/{serverId}/files/list-directory | List directory contents |
| [**renameFile**](FileManagementApi.md#renameFile) | **PUT** /api/containers/{serverId}/files/rename | Rename a file |
| [**saveFile**](FileManagementApi.md#saveFile) | **POST** /api/containers/{serverId}/files/write | Write to a file |
| [**uploadFile**](FileManagementApi.md#uploadFile) | **POST** /api/containers/{serverId}/files/upload | Upload a file |


<a id="chmod"></a>
# **chmod**
> String chmod(serverId, body)

Change file permissions

Changes the permissions of a file in a container.

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.FileManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    FileManagementApi apiInstance = new FileManagementApi(defaultClient);
    String serverId = "serverId_example"; // String | ID of the container
    String body = "body_example"; // String | 
    try {
      String result = apiInstance.chmod(serverId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FileManagementApi#chmod");
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
| **412** | Precondition Failed - Server is suspended |  -  |
| **200** | Successfully changed file permissions |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

<a id="compressFile"></a>
# **compressFile**
> String compressFile(serverId, body)

Compress files

Compresses files in a container.

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.FileManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    FileManagementApi apiInstance = new FileManagementApi(defaultClient);
    String serverId = "serverId_example"; // String | ID of the container
    String body = "body_example"; // String | 
    try {
      String result = apiInstance.compressFile(serverId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FileManagementApi#compressFile");
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
| **412** | Precondition Failed - Server is suspended |  -  |
| **200** | Successfully compressed files |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

<a id="copyFile"></a>
# **copyFile**
> String copyFile(serverId, body)

Copy a file

Copies a file in a container.

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.FileManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    FileManagementApi apiInstance = new FileManagementApi(defaultClient);
    String serverId = "serverId_example"; // String | ID of the container
    String body = "body_example"; // String | 
    try {
      String result = apiInstance.copyFile(serverId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FileManagementApi#copyFile");
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
| **412** | Precondition Failed - Server is suspended |  -  |
| **200** | Successfully copied file |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

<a id="createDirectory"></a>
# **createDirectory**
> String createDirectory(serverId, body)

Create a directory

Creates a directory in a container.

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.FileManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    FileManagementApi apiInstance = new FileManagementApi(defaultClient);
    String serverId = "serverId_example"; // String | ID of the container
    String body = "body_example"; // String | 
    try {
      String result = apiInstance.createDirectory(serverId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FileManagementApi#createDirectory");
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
| **412** | Precondition Failed - Server is suspended |  -  |
| **200** | Successfully created directory |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

<a id="createFile"></a>
# **createFile**
> String createFile(serverId, body)

Create a File

Creates a File in a container.

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.FileManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    FileManagementApi apiInstance = new FileManagementApi(defaultClient);
    String serverId = "serverId_example"; // String | ID of the container
    String body = "body_example"; // String | 
    try {
      String result = apiInstance.createFile(serverId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FileManagementApi#createFile");
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
| **412** | Precondition Failed - Server is suspended |  -  |
| **200** | Successfully created File |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

<a id="decompressFile"></a>
# **decompressFile**
> String decompressFile(serverId, body)

Decompress a file

Decompresses a file in a container.

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.FileManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    FileManagementApi apiInstance = new FileManagementApi(defaultClient);
    String serverId = "serverId_example"; // String | ID of the container
    String body = "body_example"; // String | 
    try {
      String result = apiInstance.decompressFile(serverId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FileManagementApi#decompressFile");
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
| **412** | Precondition Failed - Server is suspended |  -  |
| **200** | Successfully decompressed file |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

<a id="deleteFile"></a>
# **deleteFile**
> String deleteFile(serverId, remoteFiles)

Delete files

Deletes files in a container.

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.FileManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    FileManagementApi apiInstance = new FileManagementApi(defaultClient);
    String serverId = "serverId_example"; // String | ID of the container
    RemoteFiles remoteFiles = new RemoteFiles(); // RemoteFiles | 
    try {
      String result = apiInstance.deleteFile(serverId, remoteFiles);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FileManagementApi#deleteFile");
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
| **remoteFiles** | [**RemoteFiles**](RemoteFiles.md)|  | |

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
| **412** | Precondition Failed - Server is suspended |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **200** | Successfully deleted files |  -  |

<a id="downloadFile"></a>
# **downloadFile**
> String downloadFile(serverId, body)

Download a file

Downloads a file from a container.

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.FileManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    FileManagementApi apiInstance = new FileManagementApi(defaultClient);
    String serverId = "serverId_example"; // String | ID of the container
    String body = "body_example"; // String | 
    try {
      String result = apiInstance.downloadFile(serverId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FileManagementApi#downloadFile");
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
| **412** | Precondition Failed - Server is suspended |  -  |
| **400** | Bad request |  -  |
| **200** | Successfully downloaded file |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **404** | File not found |  -  |

<a id="getFileContents"></a>
# **getFileContents**
> String getFileContents(serverId, _file)

Get file contents

Gets the contents of a file in a container.

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.FileManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    FileManagementApi apiInstance = new FileManagementApi(defaultClient);
    String serverId = "serverId_example"; // String | ID of the container
    String _file = "_file_example"; // String | File to read
    try {
      String result = apiInstance.getFileContents(serverId, _file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FileManagementApi#getFileContents");
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
| **_file** | **String**| File to read | |

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
| **412** | Precondition Failed - Server is suspended |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **200** | Successfully retrieved file contents |  -  |

<a id="listDirectory"></a>
# **listDirectory**
> String listDirectory(serverId, directory)

List directory contents

Lists the contents of a directory in a container.

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.FileManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    FileManagementApi apiInstance = new FileManagementApi(defaultClient);
    String serverId = "serverId_example"; // String | ID of the container
    String directory = "directory_example"; // String | Directory to list
    try {
      String result = apiInstance.listDirectory(serverId, directory);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FileManagementApi#listDirectory");
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
| **directory** | **String**| Directory to list | |

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
| **412** | Precondition Failed - Server is suspended |  -  |
| **200** | Successfully listed directory contents |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

<a id="renameFile"></a>
# **renameFile**
> String renameFile(serverId, body)

Rename a file

Renames a file in a container.

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.FileManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    FileManagementApi apiInstance = new FileManagementApi(defaultClient);
    String serverId = "serverId_example"; // String | ID of the container
    String body = "body_example"; // String | 
    try {
      String result = apiInstance.renameFile(serverId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FileManagementApi#renameFile");
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
| **412** | Precondition Failed - Server is suspended |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **200** | Successfully renamed file |  -  |

<a id="saveFile"></a>
# **saveFile**
> String saveFile(serverId, fileBodyModel)

Write to a file

Writes content to a file in a container.

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.FileManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    FileManagementApi apiInstance = new FileManagementApi(defaultClient);
    String serverId = "serverId_example"; // String | ID of the container
    FileBodyModel fileBodyModel = new FileBodyModel(); // FileBodyModel | 
    try {
      String result = apiInstance.saveFile(serverId, fileBodyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FileManagementApi#saveFile");
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
| **fileBodyModel** | [**FileBodyModel**](FileBodyModel.md)|  | |

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
| **412** | Precondition Failed - Server is suspended |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **200** | Successfully wrote to file |  -  |

<a id="uploadFile"></a>
# **uploadFile**
> String uploadFile(serverId, directory, uploadFileRequest)

Upload a file

Uploads a file to a container.

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.FileManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    FileManagementApi apiInstance = new FileManagementApi(defaultClient);
    String serverId = "serverId_example"; // String | ID of the container
    String directory = "directory_example"; // String | Directory to upload to
    UploadFileRequest uploadFileRequest = new UploadFileRequest(); // UploadFileRequest | 
    try {
      String result = apiInstance.uploadFile(serverId, directory, uploadFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FileManagementApi#uploadFile");
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
| **directory** | **String**| Directory to upload to | |
| **uploadFileRequest** | [**UploadFileRequest**](UploadFileRequest.md)|  | [optional] |

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
| **412** | Precondition Failed - Server is suspended |  -  |
| **200** | Successfully uploaded file |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

