# Zaka 营销系统

## 项目概述
Zaka营销系统是一个企业级的营销管理平台，旨在帮助企业实现多平台广告投放、多样化营销策略管理和冷启动解决方案。

## 核心功能
1. 多平台广告投放
   - 支持国内外主流平台（微信、微博、抖音、Facebook、Google等）
   - 广告投放管理
   - 预算控制
   - 效果追踪

2. 多样化营销策略
   - SEO优化
   - 社交媒体营销
   - 内容营销
   - 邮件营销
   - 活动营销
   - 数据分析和报告

3. 冷启动解决方案
   - 免费试用策略
   - 推荐计划
   - 内容营销策略
   - 目标用户群体定位
   - 用户增长计划

## 技术架构

### 后端架构
- Spring Boot 2.7.0
- Spring Data JPA
- Spring Security
- Redis缓存
- RabbitMQ消息队列
- MySQL数据库

### 前端架构
- React 18
- TypeScript
- Ant Design Pro
- Redux状态管理
- Axios HTTP客户端

### 系统架构图
```
+------------------+     +------------------+     +------------------+
|                  |     |                  |     |                  |
|  前端展示层      |<--->|  业务逻辑层      |<--->|  数据访问层      |
|  (React)         |     |  (Spring Boot)   |     |  (JPA)           |
|                  |     |                  |     |                  |
+------------------+     +------------------+     +------------------+
        ^                        ^                        ^
        |                        |                        |
+------------------+     +------------------+     +------------------+
|                  |     |                  |     |                  |
|  缓存层          |     |  消息队列        |     |  数据库          |
|  (Redis)         |     |  (RabbitMQ)      |     |  (MySQL)         |
|                  |     |                  |     |                  |
+------------------+     +------------------+     +------------------+
```

## 数据库设计

### 广告投放表 (advertisements)
- id: 主键
- title: 广告标题
- content: 广告内容
- platform: 投放平台
- targetAudience: 目标受众
- budget: 预算
- status: 状态
- startTime: 开始时间
- endTime: 结束时间
- createdAt: 创建时间
- updatedAt: 更新时间

### 营销策略表 (marketing_strategies)
- id: 主键
- name: 策略名称
- type: 营销类型
- description: 描述
- targetPlatform: 目标平台
- budget: 预算
- status: 状态
- startDate: 开始日期
- endDate: 结束日期
- createdAt: 创建时间
- updatedAt: 更新时间

### 冷启动策略表 (cold_start_strategies)
- id: 主键
- name: 策略名称
- type: 冷启动类型
- description: 描述
- targetAudience: 目标用户群体
- expectedUsers: 预期用户数
- budget: 预算
- status: 状态
- startDate: 开始日期
- endDate: 结束日期
- createdAt: 创建时间
- updatedAt: 更新时间

## 部署要求
- JDK 11+
- MySQL 8.0+
- Redis 6.0+
- RabbitMQ 3.8+
- Node.js 16+
- npm 8+

## 开发环境搭建
1. 克隆项目
```bash
git clone https://github.com/Wheeeeeeeeels/zaka-sales.git
```

2. 后端配置
```bash
cd zaka-sales
mvn clean install
```

3. 前端配置
```bash
cd frontend
npm install
npm start
```

## API文档
API文档将在项目启动后提供，包含：
- 广告管理API
- 营销策略API
- 冷启动策略API
- 数据分析API

## 项目进度
- [x] 项目初始化
- [x] 基础架构搭建
- [ ] 广告管理模块
- [ ] 营销策略模块
- [ ] 冷启动模块
- [ ] 数据分析模块
- [ ] 前端界面开发
- [ ] 系统测试
- [ ] 部署上线

## 贡献指南
1. Fork 项目
2. 创建特性分支
3. 提交更改
4. 推送到分支
5. 创建Pull Request

## 许可证
MIT License