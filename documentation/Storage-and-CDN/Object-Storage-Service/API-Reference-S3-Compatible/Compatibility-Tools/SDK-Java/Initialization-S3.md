# 初始化

您可以创建S3Client，用于管理存储空间和文件等OSS资源。使用Java SDK发起OSS请求，您需要使用您的AccessKey和SecretKey初始化一个S3Client，并根据需要修改ClientConfig的默认配置项。

## 确定Endpoint

请先阅读“基本概念-[访问域名](https://docs.jdcloud.com/cn/object-storage-service/regions-and-endpoints)”部分，理解Endpoint相关的概念。

## 配置秘钥

要接入京东云OSS，需要拥有一对有效的Access Key(包括AccessKeyId和AccessKeySecretID)进行签名认证。可以通过如下步骤获得：

[注册京东云账号](https://uc.jdcloud.com/reg?returnUrl=http%3A%2F%2Fwww.jdcloud.com%2Findex)

[申请AccessKey](https://uc.jdcloud.com/accesskey/index)

获取AccessKeyId和secretAccessKeyId之后，您便可以按照以下步骤进行初始化。

## 新建S3Client
下面为创建client的例子，更多Java SDK示例请访问[京东云兼容S3 Java SDK示例](https://github.com/jdcloud-cmw/oss/tree/master/s3-java-sdk)
```Java
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.Protocol;
import com.amazonaws.SDKGlobalConfiguration;
 
public class S3SdkTest{
    public static void main(String[] args)  {
        final String accessKey = "<your accesskey>";
        final String secretKey = "<your secretkey>";
        final String endpoint = "https://s3.cn-north-1.jcloudcs.com";
        ClientConfiguration config = new ClientConfiguration();
 
        AwsClientBuilder.EndpointConfiguration endpointConfig =
                new AwsClientBuilder.EndpointConfiguration(endpoint, "cn-north-1");
 
        AWSCredentials awsCredentials = new BasicAWSCredentials(accessKey,secretKey);
        AWSCredentialsProvider awsCredentialsProvider = new AWSStaticCredentialsProvider(awsCredentials);
 
        AmazonS3 s3 = AmazonS3Client.builder()
                .withEndpointConfiguration(endpointConfig)
                .withClientConfiguration(config)
                .withCredentials(awsCredentialsProvider)
                .disableChunkedEncoding()
                .withPathStyleAccessEnabled(true)
                .build();
    }
}
```
