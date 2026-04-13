

# CloudServerModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**provider** | **String** |  |  [optional] |
|**metrics** | **String** |  |  [optional] |
|**start** | **String** |  |  [optional] |
|**stop** | **String** |  |  [optional] |
|**enableAutoPowerControl** | **Boolean** |  |  [optional] |
|**owner** | **String** |  |  [optional] |
|**displayName** | **String** |  |  [optional] |
|**accountId** | **String** |  |  [optional] |
|**ip** | **String** |  |  [optional] |
|**suspended** | **String** |  |  [optional] |
|**cpuType** | **String** |  |  [optional] |
|**powerLevel** | [**PowerLevelEnum**](#PowerLevelEnum) |  |  [optional] |
|**scheduleModels** | [**List&lt;ScheduleModel&gt;**](ScheduleModel.md) |  |  [optional] |
|**backups** | [**List&lt;BackupModel&gt;**](BackupModel.md) |  |  [optional] |
|**watching** | **Boolean** |  |  [optional] |
|**startVolume** | **String** |  |  [optional] |
|**serverId** | **String** |  |  [optional] |
|**moneyPoolId** | **String** |  |  [optional] |
|**volumes** | **List&lt;String&gt;** |  |  [optional] |
|**envs** | **CloudServerModelEnvs** |  |  [optional] |
|**permissions** | **Document** |  |  [optional] |
|**port** | **Integer** |  |  [optional] |
|**publicIp** | **String** |  |  [optional] |
|**oneTmePassword** | **String** |  |  [optional] |
|**containerProvider** | [**ContainerProvider**](ContainerProvider.md) |  |  [optional] |
|**deltaTillStart** | **Long** |  |  [optional] |



## Enum: PowerLevelEnum

| Name | Value |
|---- | -----|
| SMALL_COMPUTE | &quot;SMALL_COMPUTE&quot; |
| MEDIUM_COMPUTE | &quot;MEDIUM_COMPUTE&quot; |
| LARGE_COMPUTE | &quot;LARGE_COMPUTE&quot; |
| HEAVY_COMPUTE | &quot;HEAVY_COMPUTE&quot; |
| HYTALE_FREE | &quot;HYTALE_FREE&quot; |
| SMALL_RAM | &quot;SMALL_RAM&quot; |
| MEDIUM_RAM | &quot;MEDIUM_RAM&quot; |
| LARGE_RAM | &quot;LARGE_RAM&quot; |
| SMALL_PREMIUM | &quot;SMALL_PREMIUM&quot; |
| MEDIUM_PREMIUM | &quot;MEDIUM_PREMIUM&quot; |



