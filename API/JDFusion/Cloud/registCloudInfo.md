# registCloudInfo


## 描述
为指定用户关联云

## 请求方式
POST

## 请求地址
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/cloud_info

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |地域ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**cloud**|CloudInfo|True| | |

### CloudInfo
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**id**|String|False| | |
|**info**|Object|True| | |
|**metadata**|Object|False| | |
|**name**|String|True| | |
|**vendor**|String|True| | |

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|请求ID|
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**cloud**|CloudInfo| |
### CloudInfo
|名称|类型|描述|
|---|---|---|
|**id**|String| |
|**info**|Object| |
|**metadata**|Object| |
|**name**|String| |
|**vendor**|String| |

## 返回码
|返回码|描述|
|---|---|
|**201**|Created|
|**404**|User not found|
