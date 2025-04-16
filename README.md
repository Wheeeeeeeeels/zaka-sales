# Zaka 营销系统

## 项目概述
Zaka营销系统是一个企业级的营销管理平台，旨在帮助企业实现多平台广告投放、多样化营销策略管理和冷启动解决方案。系统采用微服务架构，支持高并发、高可用性，并提供完整的营销数据分析功能。

## 核心功能

### 1. 多平台广告投放
- 支持平台：
  - 国内：微信、微博、抖音、快手、小红书、B站
  - 国外：Facebook、Google、Twitter、Instagram、LinkedIn
- 功能特点：
  - 广告创意管理
  - 投放计划制定
  - 预算智能分配
  - 实时效果监控
  - 自动优化建议
  - 多维度数据分析

### 2. 多样化营销策略
- SEO优化
  - 关键词分析
  - 内容优化建议
  - 排名追踪
  - 竞争对手分析
- 社交媒体营销
  - 内容发布管理
  - 互动数据分析
  - 粉丝增长策略
  - 危机公关管理
- 内容营销
  - 内容规划
  - 创作工具
  - 分发渠道
  - 效果分析
- 邮件营销
  - 模板管理
  - 用户分组
  - 自动化流程
  - 转化追踪
- 活动营销
  - 活动策划
  - 报名管理
  - 现场互动
  - 效果评估

### 3. 冷启动解决方案
- 免费试用策略
  - 试用期设置
  - 功能限制
  - 转化追踪
  - 用户反馈
- 推荐计划
  - 奖励机制
  - 邀请管理
  - 数据统计
  - 效果分析
- 内容营销策略
  - 内容规划
  - 渠道选择
  - 效果追踪
  - ROI分析
- 目标用户群体定位
  - 用户画像
  - 行为分析
  - 精准营销
  - 转化优化

## 技术架构

### 后端架构
- 核心框架：Spring Boot 2.7.0
- 数据访问：Spring Data JPA + MyBatis
- 安全框架：Spring Security + JWT
- 缓存系统：Redis 6.0+
- 消息队列：RabbitMQ 3.8+
- 数据库：MySQL 8.0+
- 搜索引擎：Elasticsearch 7.0+
- 容器化：Docker + Kubernetes
- 监控系统：Prometheus + Grafana
- 日志系统：ELK Stack

### 前端架构
- 核心框架：React 18 + TypeScript
- UI组件：Ant Design Pro 5.0
- 状态管理：Redux + Redux Thunk
- 路由管理：React Router 6
- HTTP客户端：Axios
- 图表库：ECharts
- 构建工具：Webpack 5
- 代码规范：ESLint + Prettier
- 测试框架：Jest + React Testing Library

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
```sql
CREATE TABLE advertisements (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    content TEXT NOT NULL,
    platform VARCHAR(50) NOT NULL,
    target_audience VARCHAR(255) NOT NULL,
    budget DECIMAL(10,2) NOT NULL,
    status VARCHAR(20) NOT NULL,
    start_time DATETIME NOT NULL,
    end_time DATETIME NOT NULL,
    created_at DATETIME NOT NULL,
    updated_at DATETIME NOT NULL,
    INDEX idx_status (status),
    INDEX idx_platform (platform)
);
```

### 营销策略表 (marketing_strategies)
```sql
CREATE TABLE marketing_strategies (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    type VARCHAR(50) NOT NULL,
    description TEXT NOT NULL,
    target_platform VARCHAR(50) NOT NULL,
    budget DECIMAL(10,2) NOT NULL,
    status VARCHAR(20) NOT NULL,
    start_date DATE NOT NULL,
    end_date DATE NOT NULL,
    created_at DATETIME NOT NULL,
    updated_at DATETIME NOT NULL,
    INDEX idx_type (type),
    INDEX idx_status (status)
);
```

### 冷启动策略表 (cold_start_strategies)
```sql
CREATE TABLE cold_start_strategies (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    type VARCHAR(50) NOT NULL,
    description TEXT NOT NULL,
    target_audience VARCHAR(255) NOT NULL,
    expected_users INT NOT NULL,
    budget DECIMAL(10,2) NOT NULL,
    status VARCHAR(20) NOT NULL,
    start_date DATE NOT NULL,
    end_date DATE NOT NULL,
    created_at DATETIME NOT NULL,
    updated_at DATETIME NOT NULL,
    INDEX idx_type (type),
    INDEX idx_status (status)
);
```

## 部署要求

### 硬件要求
- CPU: 4核以上
- 内存: 8GB以上
- 存储: 100GB以上SSD
- 网络: 100Mbps以上带宽

### 软件要求
- 操作系统: CentOS 7+/Ubuntu 18.04+
- JDK: 11+
- MySQL: 8.0+
- Redis: 6.0+
- RabbitMQ: 3.8+
- Node.js: 16+
- npm: 8+
- Docker: 20.10+
- Kubernetes: 1.20+

## 开发环境搭建

### 后端环境
```bash
# 克隆项目
git clone https://github.com/Wheeeeeeeeels/zaka-sales.git

# 进入项目目录
cd zaka-sales

# 安装依赖
mvn clean install

# 启动服务
mvn spring-boot:run
```

### 前端环境
```bash
# 进入前端目录
cd frontend

# 安装依赖
npm install

# 启动开发服务器
npm start
```

## API文档
API文档使用Swagger实现，访问地址：`http://localhost:8080/swagger-ui.html`

### 主要API接口
1. 广告管理API
   - POST /api/v1/advertisements - 创建广告
   - GET /api/v1/advertisements - 获取广告列表
   - GET /api/v1/advertisements/{id} - 获取广告详情
   - PUT /api/v1/advertisements/{id} - 更新广告
   - DELETE /api/v1/advertisements/{id} - 删除广告

2. 营销策略API
   - POST /api/v1/strategies - 创建策略
   - GET /api/v1/strategies - 获取策略列表
   - GET /api/v1/strategies/{id} - 获取策略详情
   - PUT /api/v1/strategies/{id} - 更新策略
   - DELETE /api/v1/strategies/{id} - 删除策略

3. 冷启动策略API
   - POST /api/v1/cold-start - 创建冷启动策略
   - GET /api/v1/cold-start - 获取策略列表
   - GET /api/v1/cold-start/{id} - 获取策略详情
   - PUT /api/v1/cold-start/{id} - 更新策略
   - DELETE /api/v1/cold-start/{id} - 删除策略

## 项目进度
- [x] 项目初始化
- [x] 基础架构搭建
- [ ] 广告管理模块
  - [ ] 广告创建
  - [ ] 广告投放
  - [ ] 效果分析
- [ ] 营销策略模块
  - [ ] 策略制定
  - [ ] 执行管理
  - [ ] 效果评估
- [ ] 冷启动模块
  - [ ] 用户获取
  - [ ] 转化优化
  - [ ] 数据分析
- [ ] 数据分析模块
  - [ ] 数据采集
  - [ ] 数据清洗
  - [ ] 数据可视化
- [ ] 前端界面开发
  - [ ] 登录注册
  - [ ] 广告管理
  - [ ] 策略管理
  - [ ] 数据分析
- [ ] 系统测试
  - [ ] 单元测试
  - [ ] 集成测试
  - [ ] 性能测试
- [ ] 部署上线
  - [ ] 环境配置
  - [ ] 部署文档
  - [ ] 监控告警

## 贡献指南
1. Fork 项目
2. 创建特性分支 (`git checkout -b feature/AmazingFeature`)
3. 提交更改 (`git commit -m 'Add some AmazingFeature'`)
4. 推送到分支 (`git push origin feature/AmazingFeature`)
5. 创建Pull Request

## 开发规范
1. 代码规范
   - 后端遵循阿里巴巴Java开发手册
   - 前端遵循ESLint配置
   - 使用Prettier进行代码格式化

2. Git提交规范
   - feat: 新功能
   - fix: 修复bug
   - docs: 文档更新
   - style: 代码格式调整
   - refactor: 代码重构
   - test: 测试相关
   - chore: 构建过程或辅助工具的变动

3. 分支管理
   - master: 主分支
   - develop: 开发分支
   - feature/*: 功能分支
   - hotfix/*: 紧急修复分支
   - release/*: 发布分支

## 许可证
MIT License

## 联系方式
- 项目负责人：[负责人姓名]
- 邮箱：[邮箱地址]
- 电话：[联系电话]