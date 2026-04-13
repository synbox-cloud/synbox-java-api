# BackupManagementApi

All URIs are relative to *http://synbox.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**backupContainer**](BackupManagementApi.md#backupContainer) | **POST** /api/containers/{id}/backup/{volume}/create | Backup erstellen |
| [**deleteBackup**](BackupManagementApi.md#deleteBackup) | **DELETE** /api/containers/{id}/backup/{backup_id}/delete | Backup löschen |
| [**downloadBackUp**](BackupManagementApi.md#downloadBackUp) | **GET** /api/containers/{id}/backup/{download_id}/download | Backup herunterladen |
| [**listAllBackups**](BackupManagementApi.md#listAllBackups) | **GET** /api/containers/{id}/backup/ | Alle Backups auflisten |
| [**requestBackup**](BackupManagementApi.md#requestBackup) | **GET** /api/containers/{id}/backup/{backup_id}/request | Backup-Download anfordern |
| [**restoreBackup**](BackupManagementApi.md#restoreBackup) | **GET** /api/containers/{id}/backup/{backupid}/restore/{volumeReplace} | Backup wiederherstellen |


<a id="backupContainer"></a>
# **backupContainer**
> String backupContainer(id, volume)

Backup erstellen

Erstellt ein neues Backup eines bestimmten Volumes

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.BackupManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    BackupManagementApi apiInstance = new BackupManagementApi(defaultClient);
    String id = "id_example"; // String | Server-ID
    String volume = "volume_example"; // String | Volume-Name
    try {
      String result = apiInstance.backupContainer(id, volume);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupManagementApi#backupContainer");
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
| **id** | **String**| Server-ID | |
| **volume** | **String**| Volume-Name | |

### Return type

**String**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Backup konnte nicht gestartet werden oder Server ist gesperrt |  -  |
| **403** | Keine Berechtigung zum Erstellen von Backups |  -  |
| **200** | Backup-Erstellung gestartet |  -  |

<a id="deleteBackup"></a>
# **deleteBackup**
> Object deleteBackup(backupId, id)

Backup löschen

Löscht ein vorhandenes Backup

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.BackupManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    BackupManagementApi apiInstance = new BackupManagementApi(defaultClient);
    String backupId = "backupId_example"; // String | Backup-ID
    String id = "id_example"; // String | Server-ID
    try {
      Object result = apiInstance.deleteBackup(backupId, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupManagementApi#deleteBackup");
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
| **backupId** | **String**| Backup-ID | |
| **id** | **String**| Server-ID | |

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
| **200** | Backup erfolgreich gelöscht |  -  |
| **403** | Keine Berechtigung zum Löschen von Backups |  -  |

<a id="downloadBackUp"></a>
# **downloadBackUp**
> downloadBackUp(id, downloadId)

Backup herunterladen

Lädt ein Backup als ZIP-Datei herunter

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.BackupManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    BackupManagementApi apiInstance = new BackupManagementApi(defaultClient);
    String id = "id_example"; // String | Server-ID
    String downloadId = "downloadId_example"; // String | Download-ID
    try {
      apiInstance.downloadBackUp(id, downloadId);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupManagementApi#downloadBackUp");
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
| **id** | **String**| Server-ID | |
| **downloadId** | **String**| Download-ID | |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Ungültige Download-ID oder keine Berechtigung |  -  |
| **200** | Backup-Download gestartet |  -  |
| **400** | Backup existiert nicht oder Server ist gesperrt |  -  |

<a id="listAllBackups"></a>
# **listAllBackups**
> listAllBackups(id)

Alle Backups auflisten

Gibt eine Liste aller verfügbaren Backups für einen Server zurück

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.BackupManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    BackupManagementApi apiInstance = new BackupManagementApi(defaultClient);
    String id = "id_example"; // String | Server-ID
    try {
      apiInstance.listAllBackups(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupManagementApi#listAllBackups");
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
| **id** | **String**| Server-ID | |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Keine Berechtigung zum Anzeigen von Backups |  -  |
| **200** | Liste der Backups |  -  |

<a id="requestBackup"></a>
# **requestBackup**
> String requestBackup(id, backupId)

Backup-Download anfordern

Generiert eine temporäre Download-ID für den Zugriff auf ein bestimmtes Backup

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.BackupManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    BackupManagementApi apiInstance = new BackupManagementApi(defaultClient);
    String id = "id_example"; // String | Server-ID
    String backupId = "backupId_example"; // String | Backup-ID
    try {
      String result = apiInstance.requestBackup(id, backupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupManagementApi#requestBackup");
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
| **id** | **String**| Server-ID | |
| **backupId** | **String**| Backup-ID | |

### Return type

**String**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Download-ID erfolgreich generiert |  -  |
| **400** | Backup existiert nicht oder Server ist gesperrt |  -  |
| **403** | Keine Berechtigung zum Zugriff auf Backups |  -  |

<a id="restoreBackup"></a>
# **restoreBackup**
> String restoreBackup(id, backupid, volumeReplace)

Backup wiederherstellen

Stellt ein Backup auf einem bestimmten Volume wieder her

### Example
```java
// Import classes:
import de.synbox.invoker.ApiClient;
import de.synbox.invoker.ApiException;
import de.synbox.invoker.Configuration;
import de.synbox.invoker.auth.*;
import de.synbox.invoker.models.*;
import de.synbox.api.BackupManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://synbox.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    BackupManagementApi apiInstance = new BackupManagementApi(defaultClient);
    String id = "id_example"; // String | Server-ID
    String backupid = "backupid_example"; // String | Backup-ID
    String volumeReplace = "volumeReplace_example"; // String | Ziel-Volume
    try {
      String result = apiInstance.restoreBackup(id, backupid, volumeReplace);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupManagementApi#restoreBackup");
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
| **id** | **String**| Server-ID | |
| **backupid** | **String**| Backup-ID | |
| **volumeReplace** | **String**| Ziel-Volume | |

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
| **403** | Keine Berechtigung zum Wiederherstellen von Backups |  -  |
| **400** | Server ist gesperrt oder Wiederherstellung fehlgeschlagen |  -  |
| **500** | Interner Serverfehler bei der Wiederherstellung |  -  |
| **200** | Backup erfolgreich wiederhergestellt |  -  |
| **404** | Backup nicht gefunden |  -  |

