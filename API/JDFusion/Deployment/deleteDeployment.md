# deleteDeployment


## 描述
删除部署信息

## 请求方式
DELETE

## 请求地址
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/deployments/{id}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**id**|String|True| |Deployment ID|
|**regionId**|String|True| |地域ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**x-jdcloud-fusion-cloudid**|String|False| |云注册信息ID|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|请求ID|


## 返回码
|返回码|描述|
|---|---|
|**204**|OK|
|**404**|not found|
