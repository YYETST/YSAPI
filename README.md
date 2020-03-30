<<<<<<< HEAD
# 开放平台YS Api Demo

## 文档地址

https://open.diwork.com/#/doc-center

### 目前支持内容

- ISV验证方式
- 自建应用验证方式
- 基本档案的单元测试（人员、组织、供应商、物料等）
- 采购订单的单元测试
- MainTest可以走通采购订单的流程


### 注意事项

application.properties

需要配置
 
spring.redis.host=127.0.0.1

isv.suiteKey=<Your AppKey>

isv.suiteSecret=<Your AppSecret>

isv.EncodingAESKey=<Your EncodingAESKey>
