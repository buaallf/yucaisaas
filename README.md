# YucaiSaaS 平台业务模块

本仓库包含一个 SaaS 平台的部分业务模块代码，包括 **会员管理** 和 **活动促销** 两大核心功能。

## 一、项目介绍

该平台致力于为中小型企业提供灵活、高效的业务支撑服务。本仓库包括以下两个独立模块：

- `yucaisaas-member`：会员管理模块，支持会员注册、登录、信息维护、等级管理等功能。
- `yucaisaas-promotion`：活动促销模块，支持营销活动配置、优惠规则管理、活动投放与统计分析等功能。

## 二、开发方法

### 2.1 使用技术

项目使用 [IntelliJ IDEA](https://www.jetbrains.com/idea/) 开发，采用以下主流技术：

- 后端：Spring Boot、Spring Cloud、MyBatis、MySQL、Redis
- 前端：JavaScript、jQuery、HTML5、CSS3
- 部署与运维：Docker、Nginx

### 2.2 工程结构

- `yucaisaas-member`：会员管理模块
- `yucaisaas-promotion`：活动促销模块

每个模块为独立 Spring Boot 项目，可独立部署或集成部署。

### 2.3 运行方法（以 yucaisaas 示例服务为例）

> ⚠️ 注意：以下为平台内的演示服务模块说明（yucaisaas），可作为参考测试流程。

A. 确保本地已安装 **Microsoft .NET 5.0 SDK**  
B. 首次运行 `yucaisaas.API` 项目时，系统会通过 **EF Core Code First** 自动创建数据库，并插入部分示例数据  
C. 数据库连接配置位于：  
```
yucaisaas.API/appsettings.json
```
请根据本地环境修改数据库连接字符串  
D. 同时运行 `yucaisaas.API` 和 `GenerateMonthlyyucaisaas` 项目  
E. 可使用 Postman 或 Swagger 测试 `yucaisaas.API` 接口功能  

## 三、解决方案设计

本系统遵循经典的 **SOLID 软件设计原则**，以提升可维护性与可扩展性。

### 3.1 yucaisaas.API 项目说明（示例）

- `yucaisaas.API` 提供月薪单生成 API
- 提供基于应税收入与税率类型生成薪资明细（当前支持 TaxRateType: `ResidentTaxRate=1`）

#### 3.1.1 数据库设计

考虑到多种税率类型的需求，系统中已定义枚举类：  
```
yucaisaas.API/Enums/TaxRateType.cs
```

可根据不同国家或地区需求进行拓展。

---

如需更多功能支持或业务模块扩展，请提交 issue 或 pull request。欢迎贡献代码！