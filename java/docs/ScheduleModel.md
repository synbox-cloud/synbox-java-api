

# ScheduleModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**dayModel** | [**DayModelEnum**](#DayModelEnum) |  |  [optional] |
|**action** | [**ActionEnum**](#ActionEnum) |  |  [optional] |
|**time** | **String** |  |  [optional] |
|**data** | **String** |  |  [optional] |
|**lastRun** | **Long** |  |  [optional] |



## Enum: DayModelEnum

| Name | Value |
|---- | -----|
| MONDAY | &quot;MONDAY&quot; |
| TUESDAY | &quot;TUESDAY&quot; |
| WEDNESDAY | &quot;WEDNESDAY&quot; |
| THURSDAY | &quot;THURSDAY&quot; |
| FRIDAY | &quot;FRIDAY&quot; |
| SATURDAY | &quot;SATURDAY&quot; |
| SUNDAY | &quot;SUNDAY&quot; |
| EVERY_DAY | &quot;EVERY_DAY&quot; |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| START | &quot;START&quot; |
| STOP | &quot;STOP&quot; |
| RESTART | &quot;RESTART&quot; |
| BACKUP | &quot;BACKUP&quot; |



