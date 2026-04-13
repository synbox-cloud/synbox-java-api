

# ContainerProvider


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**availablePowerLevels** | [**List&lt;AvailablePowerLevelsEnum&gt;**](#List&lt;AvailablePowerLevelsEnum&gt;) |  |  [optional] |
|**gameName** | **String** |  |  [optional] |
|**envs** | [**List&lt;V1EnvVar&gt;**](V1EnvVar.md) |  |  [optional] |
|**image** | **String** |  |  [optional] |
|**containerPort** | **Integer** |  |  [optional] |
|**mountPath** | **String** |  |  [optional] |
|**networkType** | [**NetworkTypeEnum**](#NetworkTypeEnum) |  |  [optional] |
|**stopCommand** | **String** |  |  [optional] |



## Enum: List&lt;AvailablePowerLevelsEnum&gt;

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



## Enum: NetworkTypeEnum

| Name | Value |
|---- | -----|
| TCP_ONLY | &quot;TCP_ONLY&quot; |
| UDP_ONLY | &quot;UDP_ONLY&quot; |
| TCP_AND_UDP | &quot;TCP_AND_UDP&quot; |



