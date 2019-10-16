# getLargeScreenData


## 描述
根据区域、行业、一级指标、二级指标、起始时间等条件查询数据

## 请求方式
GET

## 请求地址
https://datastar.cn-south-1.jdcloud-api.com/v1/regions/{regionId}/largeScreen/getData

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |地域ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**endDate**|String|True| |查询结束时间，格式如下：yyyy-MM-dd|
|**firstIndex**|String|True| |数据对应的第一级分析指标（可选一级指标以最终授权为准）|
|**industry**|String|True| |查询行业，比如某个水果或者农作物（可选行业以最终授权为准）|
|**region**|String|True| |查询区域，比如某某省或某某市（可选区域以最终授权为准）|
|**secondIndex**|String|False| |数据对应的第二级分析指标，如不填写，则默认把一级指标下的所有二级指标都查询出来（可选二级指标以最终授权为准）|
|**startDate**|String|True| |查询起始时间，格式如下：yyyy-MM-dd|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|请求ID，每次请求都不一样|
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**data**|RegionIndustryDataList|查询数据结果|
|**message**|String|描述信息|
|**status**|Boolean|true为成功，false为失败|
### RegionIndustryDataList
|名称|类型|描述|
|---|---|---|
|**dataList**|RegionIndustryData[]|查询结果的数组类型|
### RegionIndustryData
|名称|类型|描述|
|---|---|---|
|**attrType**|String|属性类别|
|**attrValue**|String|属性值|
|**attrValueExt**|String|属性值扩展内容|
|**dateTime**|String|日期|
|**dateType**|String|日期类型（月、天）|
|**firstIndex**|String|一级指标|
|**indexValue**|String|指标数值|
|**industry**|String|行业|
|**region**|String|区域|
|**secondIndex**|String|二级指标|
|**valueUnit**|String|数值单位|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
