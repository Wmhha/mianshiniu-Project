# 智能面试刷题平台
> <font style="color:rgb(31, 35, 40);">深入业务场景的项目</font>
>
> <font style="color:rgb(31, 35, 40);">项目基于 Spring Boot + Redis + MySQL + Elasticsearch + Sa-Token + HotKey + DeepSeek，管理员可以创建题库、题目并批量操作题目题库；用户可以分词检索题目、在线刷题并查看刷题记录日历等。并使用数据库连接池、热Key缓存、动态 IP 黑白名单过滤、同端登录冲突检测等来提升系统性能及安全性。</font>
>

## 技术选型
### 后端
+ <font style="color:rgb(31, 35, 40);">Java Spring Boot 框架 + Maven 多模块构建</font>
+ <font style="color:rgb(31, 35, 40);">MySQL 数据库 + MyBatis-Plus 框架 + MyBatis X</font>
+ <font style="color:rgb(31, 35, 40);">Redis 分布式缓存 + Caffeine 本地缓存</font>
+ <font style="color:rgb(31, 35, 40);">Redission 分布式锁 + BitMap + BloomFilter</font>
+ <font style="color:rgb(31, 35, 40);">⭐</font><font style="color:rgb(31, 35, 40);">️ Elasticsearch 搜索引擎</font>
+ <font style="color:rgb(31, 35, 40);">⭐</font><font style="color:rgb(31, 35, 40);">️ Druid 数据库连接池 + 并发编程</font>
+ <font style="color:rgb(31, 35, 40);">⭐</font><font style="color:rgb(31, 35, 40);">️ Sa-Token 权限控制</font>
+ <font style="color:rgb(31, 35, 40);">⭐</font><font style="color:rgb(31, 35, 40);">️ HotKey 热点探测</font>
+ <font style="color:rgb(31, 35, 40);">⭐</font><font style="color:rgb(31, 35, 40);">️ Nacos 配置中心</font>
+ <font style="color:rgb(31, 35, 40);">⭐</font><font style="color:rgb(31, 35, 40);">️ 接入DeepSeekV3</font>



## 项目功能展示
主页

![](https://cdn.nlark.com/yuque/0/2025/png/39167620/1742661274215-76f3dee4-6b44-4d8b-9b61-fcdb0c7744c3.png)



管理员可对题库题目进行管理，并接入DeepSeek-V3，提供AI生成题目功能

![](https://cdn.nlark.com/yuque/0/2025/png/39167620/1742661393660-90b49fa9-c40e-4329-8b17-8bad04902766.png)



ES实现分词搜索

![](https://cdn.nlark.com/yuque/0/2025/png/39167620/1742662548315-bf13dc96-a2e2-4d01-8744-8a4967348551.png)

个人中心展示刷题记录

![](https://cdn.nlark.com/yuque/0/2025/png/39167620/1742662626998-85bc89ab-5150-482a-82d0-1e6810383105.png)

并对系统进行了热Key探测、黑名单过滤、同端登录监测等性能及安全性的优化。

