package com.example.administrator.osdemo.blog;

import org.itheima.recycler.bean.BasePageBean;

import java.util.List;

public class BlogBean extends BasePageBean<BlogBean.ResultBean.ItemsBean> {

    /**
     * code : 1
     * message : success
     * result : {"items":[{"author":"violinux666","body":"原文 我们已经熟悉React 服务端渲染（SSR）的基本步骤，现在让我们更进一...","commentCount":0,"href":"https://my.oschina.net/u/988463/blog/2996828","id":2996828,"original":true,"pubDate":"2019-01-04 11:36:41","recommend":true,"title":"[译]利用React Router4实现的服务端直出渲染(SSR)","type":3,"viewCount":62},{"author":"TiDB","body":"作者：黄东旭 2018 年对于 TiDB 和 PingCAP 来说是一个由少年向成年的转...","commentCount":8,"href":"https://my.oschina.net/zhaiyuan/blog/2996383","id":2996383,"original":true,"pubDate":"2019-01-03 11:49:54","recommend":true,"title":"写给社区的回顾和展望：TiDB 2019, Level Up !","type":3,"viewCount":1355},{"author":"rock-man","body":"背景     生产环境有二台阿里云服务器，均为同一时期购买的，CPU、内...","commentCount":11,"href":"https://my.oschina.net/u/3627055/blog/2995973","id":2995973,"original":true,"pubDate":"2019-01-02 14:37:09","recommend":true,"title":"一次生产的JVM优化","type":3,"viewCount":1353},{"author":"crossoverJie","body":"前言 大家新年快乐！ 新的一年第一篇技术文章希望开个好头，所以元旦三天...","commentCount":7,"href":"https://my.oschina.net/crossoverjie/blog/2995826","id":2995826,"original":true,"pubDate":"2019-01-02 08:07:26","recommend":true,"title":"为自己搭建一个分布式 IM(即时通讯) 系统","type":3,"viewCount":4417},{"author":"Bd999","body":"欢迎！我们相信你来这里的目的就是为了解 Ale 与其他大型框架的区别，这...","commentCount":0,"href":"https://my.oschina.net/u/3994299/blog/2995695","id":2995695,"original":true,"pubDate":"2019-01-01 10:50:12","recommend":true,"title":"ale.js 对比其他框架","type":3,"viewCount":236},{"author":"后山悟道人","body":"    是这样的，之前买车送的垃圾记录仪不能用了，这两天狠心买了好点...","commentCount":25,"href":"https://my.oschina.net/gllfeixiang/blog/2995570","id":2995570,"original":true,"pubDate":"2018-12-31 15:09:57","recommend":true,"title":"java爬取并下载酷狗TOP500歌曲","type":3,"viewCount":2883},{"author":"编辑之路","body":"一、简单工厂模式 简单工厂的定义：提供一个创建对象实例的功能，而无须...","commentCount":0,"href":"https://my.oschina.net/u/4052893/blog/2995128","id":2995128,"original":true,"pubDate":"2018-12-29 14:11:19","recommend":true,"title":"深入理解Java的三种工厂模式","type":3,"viewCount":1283},{"author":"腾讯云加社区","body":"本文由云+社区发表 事件总线核心逻辑的实现。 &lt;!--more--&gt; EventBus的作...","commentCount":1,"href":"https://my.oschina.net/qcloudcommunity/blog/2995084","id":2995084,"original":true,"pubDate":"2018-12-29 12:06:39","recommend":true,"title":"自己动手写事件总线(EventBus)","type":3,"viewCount":791},{"author":"xiaolyuh","body":"我们使用缓存的主要目是提升查询速度和保护数据库等稀缺资源不被占满。而...","commentCount":3,"href":"https://my.oschina.net/u/3748347/blog/2995017","id":2995017,"original":true,"pubDate":"2018-12-29 10:25:26","recommend":true,"title":"缓存穿透、缓存击穿和缓存雪崩实践","type":3,"viewCount":1910},{"author":"强子1985","body":"毕业时写了一段时间的C，那时候调试使用gdb,后来转了java,当时就想java程...","commentCount":11,"href":"https://my.oschina.net/qiangzigege/blog/2994977","id":2994977,"original":true,"pubDate":"2018-12-29 08:59:03","recommend":true,"title":"如何使用加多宝(jdb)在linux下调试Java程序","type":3,"viewCount":1444},{"author":"Qiujuer","body":"「WTF系列」深入Java中的位操作 关于WTF系列 引 学完本章节你将学会位的...","commentCount":7,"href":"https://my.oschina.net/qiujuer/blog/2994957","id":2994957,"original":true,"pubDate":"2018-12-28 22:46:48","recommend":true,"title":"「WTF系列」深入Java中的位操作","type":3,"viewCount":2508},{"author":"前端小攻略","body":"虽然现代化的 web 开发更多地依赖各种 MVC 框架，但开发者仍需要熟练掌握...","commentCount":0,"href":"https://my.oschina.net/u/3972188/blog/2994947","id":2994947,"original":true,"pubDate":"2018-12-28 22:09:31","recommend":true,"title":"深入15个HTML元素方法，你见过吗？","type":3,"viewCount":713},{"author":"小刀爱编程","body":"Redis 集群的历史 Redis 在 3.0 前一般有两种集群方案，一是 proxy（Twe...","commentCount":3,"href":"https://my.oschina.net/u/3972077/blog/2994897","id":2994897,"original":true,"pubDate":"2018-12-28 19:48:04","recommend":true,"title":"来看看Redis 集群分布式锁与 API 网关分布式限流","type":3,"viewCount":723},{"author":"老虎是个蛋蛋","body":"之前一篇有讲过如何在spring boot中集成JPA和Mybatis，本篇就在此基础上...","commentCount":0,"href":"https://my.oschina.net/wangxincj/blog/2994867","id":2994867,"original":true,"pubDate":"2018-12-28 18:38:51","recommend":true,"title":"Spring Boot 中如何使用事务（十三）","type":3,"viewCount":934},{"author":"泥水佬","body":"XBlog是dotnet core平台下的个人博客开源系统，它只需要通过Copy的方式即...","commentCount":0,"href":"https://my.oschina.net/ikende/blog/2994720","id":2994720,"original":true,"pubDate":"2018-12-28 15:27:40","recommend":true,"title":"个人博客开源系统XBlog介绍和部署","type":3,"viewCount":476},{"author":"violinux666","body":"最近看到很多同学在实现鼠标hover弹出菜单的效果时都是用的js代码去实现...","commentCount":1,"href":"https://my.oschina.net/u/988463/blog/2994683","id":2994683,"original":true,"pubDate":"2018-12-28 14:51:27","recommend":true,"title":"如何不使用js实现鼠标hover弹出菜单效果","type":3,"viewCount":480},{"author":"明MikeWoo","body":"问题描述 在前后端分离的开发模式下，前后端交互通常采用JSON格式数据....","commentCount":2,"href":"https://my.oschina.net/MIKEWOO/blog/2994643","id":2994643,"original":true,"pubDate":"2018-12-28 14:10:51","recommend":true,"title":"Gson格式转换Integer变为Double类型问题解决","type":3,"viewCount":318},{"author":"编辑之路","body":"如果RabbitMQ集群只有一个broker节点，那么该节点的失效将导致整个服务临...","commentCount":0,"href":"https://my.oschina.net/u/4052893/blog/2994637","id":2994637,"original":true,"pubDate":"2018-12-28 14:02:14","recommend":true,"title":"RabbitMQ 高可用之镜像队列","type":3,"viewCount":463},{"author":"Sam哥哥聊技术","body":"概述 最近参与了几个需求开发，BUG很少，有些需求没BUG，有些才一个BUG...","commentCount":0,"href":"https://my.oschina.net/samgege/blog/2994588","id":2994588,"original":true,"pubDate":"2018-12-28 11:55:11","recommend":true,"title":"尽量避免bug的一些手法","type":3,"viewCount":906},{"author":"美团技术团队","body":"背景 对苹果开发者而言，由于平台审核周期较长，客户端代码导致的线上问...","commentCount":0,"href":"https://my.oschina.net/meituantech/blog/2994544","id":2994544,"original":true,"pubDate":"2018-12-28 11:07:12","recommend":true,"title":"iOS 覆盖率检测原理与增量代码测试覆盖率工具实现","type":3,"viewCount":144}],"nextPageToken":"DBA816934CD0AA59","prevPageToken":"0997C855C600E421","requestCount":20,"responseCount":20,"totalResults":1000}
     * time : 2019-01-04 17:22:14
     */

    private int code;
    private String message;
    private ResultBean result;
    private String time;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public List<ResultBean.ItemsBean> getItemDatas() {
        return result.items;
    }

    public static class ResultBean {
        /**
         * items : [{"author":"violinux666","body":"原文 我们已经熟悉React 服务端渲染（SSR）的基本步骤，现在让我们更进一...","commentCount":0,"href":"https://my.oschina.net/u/988463/blog/2996828","id":2996828,"original":true,"pubDate":"2019-01-04 11:36:41","recommend":true,"title":"[译]利用React Router4实现的服务端直出渲染(SSR)","type":3,"viewCount":62},{"author":"TiDB","body":"作者：黄东旭 2018 年对于 TiDB 和 PingCAP 来说是一个由少年向成年的转...","commentCount":8,"href":"https://my.oschina.net/zhaiyuan/blog/2996383","id":2996383,"original":true,"pubDate":"2019-01-03 11:49:54","recommend":true,"title":"写给社区的回顾和展望：TiDB 2019, Level Up !","type":3,"viewCount":1355},{"author":"rock-man","body":"背景     生产环境有二台阿里云服务器，均为同一时期购买的，CPU、内...","commentCount":11,"href":"https://my.oschina.net/u/3627055/blog/2995973","id":2995973,"original":true,"pubDate":"2019-01-02 14:37:09","recommend":true,"title":"一次生产的JVM优化","type":3,"viewCount":1353},{"author":"crossoverJie","body":"前言 大家新年快乐！ 新的一年第一篇技术文章希望开个好头，所以元旦三天...","commentCount":7,"href":"https://my.oschina.net/crossoverjie/blog/2995826","id":2995826,"original":true,"pubDate":"2019-01-02 08:07:26","recommend":true,"title":"为自己搭建一个分布式 IM(即时通讯) 系统","type":3,"viewCount":4417},{"author":"Bd999","body":"欢迎！我们相信你来这里的目的就是为了解 Ale 与其他大型框架的区别，这...","commentCount":0,"href":"https://my.oschina.net/u/3994299/blog/2995695","id":2995695,"original":true,"pubDate":"2019-01-01 10:50:12","recommend":true,"title":"ale.js 对比其他框架","type":3,"viewCount":236},{"author":"后山悟道人","body":"    是这样的，之前买车送的垃圾记录仪不能用了，这两天狠心买了好点...","commentCount":25,"href":"https://my.oschina.net/gllfeixiang/blog/2995570","id":2995570,"original":true,"pubDate":"2018-12-31 15:09:57","recommend":true,"title":"java爬取并下载酷狗TOP500歌曲","type":3,"viewCount":2883},{"author":"编辑之路","body":"一、简单工厂模式 简单工厂的定义：提供一个创建对象实例的功能，而无须...","commentCount":0,"href":"https://my.oschina.net/u/4052893/blog/2995128","id":2995128,"original":true,"pubDate":"2018-12-29 14:11:19","recommend":true,"title":"深入理解Java的三种工厂模式","type":3,"viewCount":1283},{"author":"腾讯云加社区","body":"本文由云+社区发表 事件总线核心逻辑的实现。 &lt;!--more--&gt; EventBus的作...","commentCount":1,"href":"https://my.oschina.net/qcloudcommunity/blog/2995084","id":2995084,"original":true,"pubDate":"2018-12-29 12:06:39","recommend":true,"title":"自己动手写事件总线(EventBus)","type":3,"viewCount":791},{"author":"xiaolyuh","body":"我们使用缓存的主要目是提升查询速度和保护数据库等稀缺资源不被占满。而...","commentCount":3,"href":"https://my.oschina.net/u/3748347/blog/2995017","id":2995017,"original":true,"pubDate":"2018-12-29 10:25:26","recommend":true,"title":"缓存穿透、缓存击穿和缓存雪崩实践","type":3,"viewCount":1910},{"author":"强子1985","body":"毕业时写了一段时间的C，那时候调试使用gdb,后来转了java,当时就想java程...","commentCount":11,"href":"https://my.oschina.net/qiangzigege/blog/2994977","id":2994977,"original":true,"pubDate":"2018-12-29 08:59:03","recommend":true,"title":"如何使用加多宝(jdb)在linux下调试Java程序","type":3,"viewCount":1444},{"author":"Qiujuer","body":"「WTF系列」深入Java中的位操作 关于WTF系列 引 学完本章节你将学会位的...","commentCount":7,"href":"https://my.oschina.net/qiujuer/blog/2994957","id":2994957,"original":true,"pubDate":"2018-12-28 22:46:48","recommend":true,"title":"「WTF系列」深入Java中的位操作","type":3,"viewCount":2508},{"author":"前端小攻略","body":"虽然现代化的 web 开发更多地依赖各种 MVC 框架，但开发者仍需要熟练掌握...","commentCount":0,"href":"https://my.oschina.net/u/3972188/blog/2994947","id":2994947,"original":true,"pubDate":"2018-12-28 22:09:31","recommend":true,"title":"深入15个HTML元素方法，你见过吗？","type":3,"viewCount":713},{"author":"小刀爱编程","body":"Redis 集群的历史 Redis 在 3.0 前一般有两种集群方案，一是 proxy（Twe...","commentCount":3,"href":"https://my.oschina.net/u/3972077/blog/2994897","id":2994897,"original":true,"pubDate":"2018-12-28 19:48:04","recommend":true,"title":"来看看Redis 集群分布式锁与 API 网关分布式限流","type":3,"viewCount":723},{"author":"老虎是个蛋蛋","body":"之前一篇有讲过如何在spring boot中集成JPA和Mybatis，本篇就在此基础上...","commentCount":0,"href":"https://my.oschina.net/wangxincj/blog/2994867","id":2994867,"original":true,"pubDate":"2018-12-28 18:38:51","recommend":true,"title":"Spring Boot 中如何使用事务（十三）","type":3,"viewCount":934},{"author":"泥水佬","body":"XBlog是dotnet core平台下的个人博客开源系统，它只需要通过Copy的方式即...","commentCount":0,"href":"https://my.oschina.net/ikende/blog/2994720","id":2994720,"original":true,"pubDate":"2018-12-28 15:27:40","recommend":true,"title":"个人博客开源系统XBlog介绍和部署","type":3,"viewCount":476},{"author":"violinux666","body":"最近看到很多同学在实现鼠标hover弹出菜单的效果时都是用的js代码去实现...","commentCount":1,"href":"https://my.oschina.net/u/988463/blog/2994683","id":2994683,"original":true,"pubDate":"2018-12-28 14:51:27","recommend":true,"title":"如何不使用js实现鼠标hover弹出菜单效果","type":3,"viewCount":480},{"author":"明MikeWoo","body":"问题描述 在前后端分离的开发模式下，前后端交互通常采用JSON格式数据....","commentCount":2,"href":"https://my.oschina.net/MIKEWOO/blog/2994643","id":2994643,"original":true,"pubDate":"2018-12-28 14:10:51","recommend":true,"title":"Gson格式转换Integer变为Double类型问题解决","type":3,"viewCount":318},{"author":"编辑之路","body":"如果RabbitMQ集群只有一个broker节点，那么该节点的失效将导致整个服务临...","commentCount":0,"href":"https://my.oschina.net/u/4052893/blog/2994637","id":2994637,"original":true,"pubDate":"2018-12-28 14:02:14","recommend":true,"title":"RabbitMQ 高可用之镜像队列","type":3,"viewCount":463},{"author":"Sam哥哥聊技术","body":"概述 最近参与了几个需求开发，BUG很少，有些需求没BUG，有些才一个BUG...","commentCount":0,"href":"https://my.oschina.net/samgege/blog/2994588","id":2994588,"original":true,"pubDate":"2018-12-28 11:55:11","recommend":true,"title":"尽量避免bug的一些手法","type":3,"viewCount":906},{"author":"美团技术团队","body":"背景 对苹果开发者而言，由于平台审核周期较长，客户端代码导致的线上问...","commentCount":0,"href":"https://my.oschina.net/meituantech/blog/2994544","id":2994544,"original":true,"pubDate":"2018-12-28 11:07:12","recommend":true,"title":"iOS 覆盖率检测原理与增量代码测试覆盖率工具实现","type":3,"viewCount":144}]
         * nextPageToken : DBA816934CD0AA59
         * prevPageToken : 0997C855C600E421
         * requestCount : 20
         * responseCount : 20
         * totalResults : 1000
         */

        private String nextPageToken;
        private String prevPageToken;
        private int requestCount;
        private int responseCount;
        private int totalResults;
        private List<ItemsBean> items;

        public String getNextPageToken() {
            return nextPageToken;
        }

        public void setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
        }

        public String getPrevPageToken() {
            return prevPageToken;
        }

        public void setPrevPageToken(String prevPageToken) {
            this.prevPageToken = prevPageToken;
        }

        public int getRequestCount() {
            return requestCount;
        }

        public void setRequestCount(int requestCount) {
            this.requestCount = requestCount;
        }

        public int getResponseCount() {
            return responseCount;
        }

        public void setResponseCount(int responseCount) {
            this.responseCount = responseCount;
        }

        public int getTotalResults() {
            return totalResults;
        }

        public void setTotalResults(int totalResults) {
            this.totalResults = totalResults;
        }

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }

        public static class ItemsBean {
            /**
             * author : violinux666
             * body : 原文 我们已经熟悉React 服务端渲染（SSR）的基本步骤，现在让我们更进一...
             * commentCount : 0
             * href : https://my.oschina.net/u/988463/blog/2996828
             * id : 2996828
             * original : true
             * pubDate : 2019-01-04 11:36:41
             * recommend : true
             * title : [译]利用React Router4实现的服务端直出渲染(SSR)
             * type : 3
             * viewCount : 62
             */

            private String author;
            private String body;
            private int commentCount;
            private String href;
            private int id;
            private boolean original;
            private String pubDate;
            private boolean recommend;
            private String title;
            private int type;
            private int viewCount;

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public String getBody() {
                return body;
            }

            public void setBody(String body) {
                this.body = body;
            }

            public int getCommentCount() {
                return commentCount;
            }

            public void setCommentCount(int commentCount) {
                this.commentCount = commentCount;
            }

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public boolean isOriginal() {
                return original;
            }

            public void setOriginal(boolean original) {
                this.original = original;
            }

            public String getPubDate() {
                return pubDate;
            }

            public void setPubDate(String pubDate) {
                this.pubDate = pubDate;
            }

            public boolean isRecommend() {
                return recommend;
            }

            public void setRecommend(boolean recommend) {
                this.recommend = recommend;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getViewCount() {
                return viewCount;
            }

            public void setViewCount(int viewCount) {
                this.viewCount = viewCount;
            }
        }
    }
}
