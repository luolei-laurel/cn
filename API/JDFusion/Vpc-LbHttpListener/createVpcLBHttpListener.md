# createVpcLBHttpListener


## 描述
创建HTTP监听器

## 请求方式
POST

## 请求地址
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vpc_lbHttpListener

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |地域ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**authorization**|String|True| |获取方式请参考签名算法指导文档|
|**httpListener**|CreateLoadBalancerHTTPListener|True| |创建HTTP监听器|
|**x-jdcloud-date**|String|True| |获取方式请参考签名算法指导文档|
|**x-jdcloud-fusion-cloudid**|String|True| |云注册信息ID|
|**x-jdcloud-nonce**|String|True| |获取方式请参考签名算法指导文档|

### CreateLoadBalancerHTTPListener
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**backendServerPort**|Integer|False| |是  负载均衡实例后端使用的端口|
|**bandwidth**|Integer|False| |是  监听的带宽峰值|
|**healthCheckConnectPort**|Integer|False| |否  健康检查使用的端口|
|**healthCheckHttpCode**|String|False| |否  健康检查正常的HTTP状态码，多个状态码用逗号分隔。取值：http_2xx（默认值） | http_3xx | http_4xx | http_5xx|
|**healthCheckInterval**|Integer|False| |否  健康检查的时间间隔。取值：1-50（秒）|
|**healthCheckTimeout**|Integer|False| |否  接收来自运行状况检查的响应需要等待的时间。如果后端ECS在指定的时间内没有正确响应，则判定为健康检查失败。取值：1-300（秒）|
|**healthyThreshold**|Integer|False| |否  健康检查连续成功多少次后，将后端服务器的健康检查状态由fail判定为success。取值：2-10|
|**listenerPort**|Integer|False| |是  负载均衡实例前端使用的端口|
|**loadBalancerId**|String|False| |是  负载均衡实例ID|
|**unhealthyThreshold**|Integer|False| |否  健康检查连续失败多少次后，将后端服务器的健康检查状态由success判定为fail。取值：2-10|
|**vserverGroupId**|String|False| |否  服务器组ID|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|请求ID|
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**task**|ResourceTFInfo| |
### ResourceTFInfo
|名称|类型|描述|
|---|---|---|
|**body**|String|请求体|
|**cloudId**|String|cloud ID|
|**createdTime**|String|创建时间|
|**provider**|String|cloud provider|
|**result**|String|执行结果|
|**status**|String|状态|
|**updateTime**|String|更新时间|
|**userId**|String|user ID|
|**uuid**|String|uuid|

## 返回码
|返回码|描述|
|---|---|
|**201**|CREATED|
