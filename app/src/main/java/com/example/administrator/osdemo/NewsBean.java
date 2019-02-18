package com.example.administrator.osdemo;

import org.itheima.recycler.bean.BasePageBean;

import java.util.List;

public class NewsBean extends BasePageBean<NewsBean.ResultBean.ItemsBean> {

    /**
     * code : 1
     * message : success
     * result : {"items":[{"author":"xuri","body":"Excelize 是 Go 语言编写的用于操作 Office Excel 文档类库，基于 ECMA-376 Office OpenXML 标准。可以使用它来读取、写入由 Microsoft Excel&trad...","commentCount":1,"href":"https://www.oschina.net/news/103280/excelize-1-4-1-released","id":103280,"pubDate":"2019-01-03 12:23:35","recommend":true,"title":"Go 语言 Excel 类库 Excelize 1.4.1 版本发布","type":6,"viewCount":131},{"author":"漆工","body":"React Suite 是一套 React 组件库，为后台产品而生。 文档: https://rsuite.gitee.io 设计: https://rsuite.gitee.io/design/ V3.5.2 版本发布，...","commentCount":0,"href":"https://www.oschina.net/news/103279/react-suite-3-5-2-released","id":103279,"pubDate":"2019-01-03 11:58:39","recommend":true,"title":"React UI 库：React Suite 3.5.2 版本更新","type":6,"viewCount":1},{"author":"静静的风","body":"DBShop 电子商务网店系统，采用PHP官方框架 ZendFramework 2 开发而成。在网上建立自己的店铺、自己的销售网站的不二之选。强大的后台管理及简单的...","commentCount":0,"href":"https://www.oschina.net/news/103277/dbshop-1-3-20181230-released","id":103277,"pubDate":"2019-01-03 11:01:12","recommend":true,"title":"商城系统 DBShop V1.3 20181230 正式发布","type":6,"viewCount":72},{"author":"淡漠悠然","body":"Gradle 5.1 已发布，更新内容如下 Fixed issues 30 issues have been fixed in Gradle 5.1. [#7961] - Gradle 5 fails for manually added ListPr...","commentCount":4,"href":"https://www.oschina.net/news/103276/gradle-5-1-released","id":103276,"pubDate":"2019-01-03 10:04:22","recommend":true,"title":"Gradle 5.1 发布，项目自动化构建工具","type":6,"viewCount":744},{"author":"左华栋","body":"功能 支持虚拟列表（10万级别+） 技术栈 Typescript Angular Material2 rxjs Graphql 相关链接 项目地址 DEMO ng-notadd-mock-server Quick start...","commentCount":0,"href":"https://www.oschina.net/news/103275/ng-notadd-0-14-5-released","id":103275,"pubDate":"2019-01-03 09:36:04","recommend":true,"title":"ng-notadd 0.14.5 发布，支持10万级别+的虚拟列表","type":6,"viewCount":432},{"author":"好雨云帮","body":"很高兴向大家宣布Rainbond v5.0正式发布！ Rainbond是开源的企业应用云操作系统，支撑企业应用开发、架构、交付和运维的全流程，通过无侵入架构，无...","commentCount":4,"href":"https://www.oschina.net/news/103274/rainbond-5-0-0-released","id":103274,"pubDate":"2019-01-03 09:03:00","recommend":false,"title":"Rainbond 5.0 正式发布，支持对接管理已有 Kubernetes 集群","type":6,"viewCount":595},{"author":"有理想的鱼","body":"YMP v2.0.6 发布了！本次版本更新主要新增若干新特性并针对一些已知问题进行修复及性能优化。 为了让YMP框架能够在Android环境中使用，本次更新已支...","commentCount":2,"href":"https://www.oschina.net/news/103273/ymp-2-0-6-released","id":103273,"pubDate":"2019-01-03 08:51:43","recommend":false,"title":"YMP v2.0.6 发布，轻量级 Java 应用开发框架","type":6,"viewCount":652},{"author":"局长","body":"Trill 是 Microsoft Research 开源的高性能单通道内存流分析引擎，它基于时态数据（temporal data）和查询模型（query model），可处理实时和离线数...","commentCount":2,"href":"https://www.oschina.net/p/trill","id":48195,"pubDate":"2019-01-03 08:36:51","recommend":false,"title":"Trill \u2014\u2014 微软开源的高性能流分析引擎","type":1,"viewCount":1766},{"author":"局长","body":"CIM(CROSS-IM) 一款面向开发者的 IM(即时通讯)系统；同时提供了一些组件帮助开发者构建一款属于自己可水平扩展的 IM 。","commentCount":3,"href":"https://my.oschina.net/crossoverjie/blog/2995826","id":2995826,"pubDate":"2019-01-03 08:35:55","recommend":false,"title":"每日一博 | 为自己搭建一个分布式 IM(即时通讯) 系统","type":3,"viewCount":2352},{"author":"局长","body":"在本文中，我将分享一些常见的编程面试问题，这些问题来自于不同经验水平的程序员，囊括从刚大学毕业的人到具有一到两年经验的程序员。","commentCount":4,"href":"https://www.oschina.net/translate/50-data-structure-and-algorithms-interview-questions","id":10004469,"pubDate":"2019-01-03 08:34:55","recommend":false,"title":"协作翻译 | 为工程师准备的 50 道数据结构和算法面试题","type":4,"viewCount":1347},{"author":"局长","body":"godbart/god-bart/是一个go写的基于SQL的RDBMS运维CLI，特点：多库执行SQL，DB版本管理；比较结构差异，生成原始DDL；提取业务逻辑关联的`数据树`...","commentCount":0,"href":"https://gitee.com/trydofor/godbart","id":103269,"pubDate":"2019-01-03 08:33:58","recommend":false,"title":"码云推荐 | Go 实现基于 SQL 的 RDBMS 运维 CLI godbart","type":0,"viewCount":1},{"author":"局长","body":"美国马里兰大学的四位研究员开源了一个名为UnCaptcha的工具，能够破解谷歌的验证码系统ReCaptcha，其进行语音验证的准确率高达85%。与众多验证机制...","commentCount":3,"href":"https://www.oschina.net/news/103268/recaptcha-break","id":103268,"pubDate":"2019-01-03 08:31:53","recommend":false,"title":"谷歌 ReCaptcha 系统被破解，机器语音验证准确率高达 85%","type":6,"viewCount":1034},{"author":"局长","body":"全球知名的数据库流行度排行榜网站 DB-Engines 于今日宣布：PostgreSQL 为 2018 年度数据库管理系统。理由如下： 根据 PostgreSQL 在 2018 年的数...","commentCount":14,"href":"https://www.oschina.net/news/103267/postgresql-is-the-dbms-of-the-year-2018","id":103267,"pubDate":"2019-01-03 08:27:26","recommend":false,"title":"DB-Engines 2018：PostgreSQL 蝉联\u201c年度数据库\u201d称号","type":6,"viewCount":2895},{"author":"局长","body":"近日，我们发现 Python 3.7 官方应用已悄然上架微软商店，这应该也是首个入驻微软商店的主流开发语言，被归类到了 开发者工具>开发套件 分类下。根...","commentCount":9,"href":"https://www.oschina.net/news/103266/using-python-on-windows","id":103266,"pubDate":"2019-01-03 08:26:31","recommend":false,"title":"Python 3.7 上架微软商店，尚处于评估阶段","type":6,"viewCount":1548},{"author":"局长","body":"我打电话给ofo总部。\u201c你好，我要退押金。\u201d\u201c你好，退押金你得去天津。\u201d\u201c为啥？在天津分部才能退款吗？\u201d\u201c不是，队排到天津了。\u201d","commentCount":24,"href":"https://my.oschina.net/xxiaobian/blog/2996257","id":2996257,"pubDate":"2019-01-03 08:17:38","recommend":false,"title":"OSChina 周四乱弹 \u2014\u2014 何以解忧，唯有暴富","type":3,"viewCount":2827},{"author":"局长","body":"过去的 2018 年，Linux Kernel 发布了 6 个版本，从年初的 Linux 4.15 到圣诞节前夕的 4.20，共有 74,974 个 commits，增加了 3,385,121 行代码，移...","commentCount":3,"href":"https://www.oschina.net/news/103264/linux-eoy-2018-kernel-stats","id":103264,"pubDate":"2019-01-03 08:14:39","recommend":false,"title":"Linux Kernel 去年净增 87 万行代码，共有近 75000 个提交","type":6,"viewCount":1783},{"author":"局长","body":"据外媒报道，微软旗下风险投资部门 M12，刚刚参与了对开源数字资产管理平台 Bakkt 的 1.825 亿美元融资。 Bakkt 旨在建立一个开放性的全球网络，以...","commentCount":1,"href":"https://www.oschina.net/news/103263/microsofts-venture-capital-arm-m12-invests-in-bakkt","id":103263,"pubDate":"2019-01-03 08:09:23","recommend":false,"title":"微软参投开源数字资产管理平台 Bakkt，首轮融资过亿美元","type":6,"viewCount":676},{"author":"h4cd","body":"UltraViewPager 1.0.7.8 发布了，UltraViewPager 是阿里开源的一个封装多种特性的 ViewPager ，主要是为多页面切换场景提供统一解决方案。 此版本移...","commentCount":0,"href":"https://www.oschina.net/news/103262/ultraviewpager-1-0-7-8-released","id":103262,"pubDate":"2019-01-03 08:02:28","recommend":false,"title":"UltraViewPager 1.0.7.8 发布，封装多种特性的 ViewPager","type":6,"viewCount":683},{"author":"h4cd","body":"Scratch 3.0 发布了，Scratch 是 MIT Media 实验室 Lifelong 幼儿园团队的一个项目，它通过点击并拖拽的方式可视化完成编程，帮助人们学会创造性地...","commentCount":5,"href":"https://www.oschina.net/news/103261/scratch-3-0-released","id":103261,"pubDate":"2019-01-03 07:56:41","recommend":false,"title":"Scratch 3.0 发布，用搭积木的方式编程","type":6,"viewCount":1645},{"author":"h4cd","body":"Q4OS 2.7 Scorpion 稳定版发布了，Q4OS 是基于 Debian 的桌面 Linux 发行版，它被设计为提供传统样式的用户界面(Trinity)及简单的附件，并提供稳定...","commentCount":3,"href":"https://www.oschina.net/news/103260/q4os-2-7-released","id":103260,"pubDate":"2019-01-03 07:41:22","recommend":false,"title":"Q4OS 2.7 稳定版发布，基于 Debian 的 Linux 发行版","type":6,"viewCount":516}],"nextPageToken":"DBA816934CD0AA59","prevPageToken":"0997C855C600E421","requestCount":20,"responseCount":20,"totalResults":94854}
     * time : 2019-01-03 15:03:36
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
    public List getItemDatas() {
        return result.items;
    }

    public static class ResultBean {
        /**
         * items : [{"author":"xuri","body":"Excelize 是 Go 语言编写的用于操作 Office Excel 文档类库，基于 ECMA-376 Office OpenXML 标准。可以使用它来读取、写入由 Microsoft Excel&trad...","commentCount":1,"href":"https://www.oschina.net/news/103280/excelize-1-4-1-released","id":103280,"pubDate":"2019-01-03 12:23:35","recommend":true,"title":"Go 语言 Excel 类库 Excelize 1.4.1 版本发布","type":6,"viewCount":131},{"author":"漆工","body":"React Suite 是一套 React 组件库，为后台产品而生。 文档: https://rsuite.gitee.io 设计: https://rsuite.gitee.io/design/ V3.5.2 版本发布，...","commentCount":0,"href":"https://www.oschina.net/news/103279/react-suite-3-5-2-released","id":103279,"pubDate":"2019-01-03 11:58:39","recommend":true,"title":"React UI 库：React Suite 3.5.2 版本更新","type":6,"viewCount":1},{"author":"静静的风","body":"DBShop 电子商务网店系统，采用PHP官方框架 ZendFramework 2 开发而成。在网上建立自己的店铺、自己的销售网站的不二之选。强大的后台管理及简单的...","commentCount":0,"href":"https://www.oschina.net/news/103277/dbshop-1-3-20181230-released","id":103277,"pubDate":"2019-01-03 11:01:12","recommend":true,"title":"商城系统 DBShop V1.3 20181230 正式发布","type":6,"viewCount":72},{"author":"淡漠悠然","body":"Gradle 5.1 已发布，更新内容如下 Fixed issues 30 issues have been fixed in Gradle 5.1. [#7961] - Gradle 5 fails for manually added ListPr...","commentCount":4,"href":"https://www.oschina.net/news/103276/gradle-5-1-released","id":103276,"pubDate":"2019-01-03 10:04:22","recommend":true,"title":"Gradle 5.1 发布，项目自动化构建工具","type":6,"viewCount":744},{"author":"左华栋","body":"功能 支持虚拟列表（10万级别+） 技术栈 Typescript Angular Material2 rxjs Graphql 相关链接 项目地址 DEMO ng-notadd-mock-server Quick start...","commentCount":0,"href":"https://www.oschina.net/news/103275/ng-notadd-0-14-5-released","id":103275,"pubDate":"2019-01-03 09:36:04","recommend":true,"title":"ng-notadd 0.14.5 发布，支持10万级别+的虚拟列表","type":6,"viewCount":432},{"author":"好雨云帮","body":"很高兴向大家宣布Rainbond v5.0正式发布！ Rainbond是开源的企业应用云操作系统，支撑企业应用开发、架构、交付和运维的全流程，通过无侵入架构，无...","commentCount":4,"href":"https://www.oschina.net/news/103274/rainbond-5-0-0-released","id":103274,"pubDate":"2019-01-03 09:03:00","recommend":false,"title":"Rainbond 5.0 正式发布，支持对接管理已有 Kubernetes 集群","type":6,"viewCount":595},{"author":"有理想的鱼","body":"YMP v2.0.6 发布了！本次版本更新主要新增若干新特性并针对一些已知问题进行修复及性能优化。 为了让YMP框架能够在Android环境中使用，本次更新已支...","commentCount":2,"href":"https://www.oschina.net/news/103273/ymp-2-0-6-released","id":103273,"pubDate":"2019-01-03 08:51:43","recommend":false,"title":"YMP v2.0.6 发布，轻量级 Java 应用开发框架","type":6,"viewCount":652},{"author":"局长","body":"Trill 是 Microsoft Research 开源的高性能单通道内存流分析引擎，它基于时态数据（temporal data）和查询模型（query model），可处理实时和离线数...","commentCount":2,"href":"https://www.oschina.net/p/trill","id":48195,"pubDate":"2019-01-03 08:36:51","recommend":false,"title":"Trill \u2014\u2014 微软开源的高性能流分析引擎","type":1,"viewCount":1766},{"author":"局长","body":"CIM(CROSS-IM) 一款面向开发者的 IM(即时通讯)系统；同时提供了一些组件帮助开发者构建一款属于自己可水平扩展的 IM 。","commentCount":3,"href":"https://my.oschina.net/crossoverjie/blog/2995826","id":2995826,"pubDate":"2019-01-03 08:35:55","recommend":false,"title":"每日一博 | 为自己搭建一个分布式 IM(即时通讯) 系统","type":3,"viewCount":2352},{"author":"局长","body":"在本文中，我将分享一些常见的编程面试问题，这些问题来自于不同经验水平的程序员，囊括从刚大学毕业的人到具有一到两年经验的程序员。","commentCount":4,"href":"https://www.oschina.net/translate/50-data-structure-and-algorithms-interview-questions","id":10004469,"pubDate":"2019-01-03 08:34:55","recommend":false,"title":"协作翻译 | 为工程师准备的 50 道数据结构和算法面试题","type":4,"viewCount":1347},{"author":"局长","body":"godbart/god-bart/是一个go写的基于SQL的RDBMS运维CLI，特点：多库执行SQL，DB版本管理；比较结构差异，生成原始DDL；提取业务逻辑关联的`数据树`...","commentCount":0,"href":"https://gitee.com/trydofor/godbart","id":103269,"pubDate":"2019-01-03 08:33:58","recommend":false,"title":"码云推荐 | Go 实现基于 SQL 的 RDBMS 运维 CLI godbart","type":0,"viewCount":1},{"author":"局长","body":"美国马里兰大学的四位研究员开源了一个名为UnCaptcha的工具，能够破解谷歌的验证码系统ReCaptcha，其进行语音验证的准确率高达85%。与众多验证机制...","commentCount":3,"href":"https://www.oschina.net/news/103268/recaptcha-break","id":103268,"pubDate":"2019-01-03 08:31:53","recommend":false,"title":"谷歌 ReCaptcha 系统被破解，机器语音验证准确率高达 85%","type":6,"viewCount":1034},{"author":"局长","body":"全球知名的数据库流行度排行榜网站 DB-Engines 于今日宣布：PostgreSQL 为 2018 年度数据库管理系统。理由如下： 根据 PostgreSQL 在 2018 年的数...","commentCount":14,"href":"https://www.oschina.net/news/103267/postgresql-is-the-dbms-of-the-year-2018","id":103267,"pubDate":"2019-01-03 08:27:26","recommend":false,"title":"DB-Engines 2018：PostgreSQL 蝉联\u201c年度数据库\u201d称号","type":6,"viewCount":2895},{"author":"局长","body":"近日，我们发现 Python 3.7 官方应用已悄然上架微软商店，这应该也是首个入驻微软商店的主流开发语言，被归类到了 开发者工具>开发套件 分类下。根...","commentCount":9,"href":"https://www.oschina.net/news/103266/using-python-on-windows","id":103266,"pubDate":"2019-01-03 08:26:31","recommend":false,"title":"Python 3.7 上架微软商店，尚处于评估阶段","type":6,"viewCount":1548},{"author":"局长","body":"我打电话给ofo总部。\u201c你好，我要退押金。\u201d\u201c你好，退押金你得去天津。\u201d\u201c为啥？在天津分部才能退款吗？\u201d\u201c不是，队排到天津了。\u201d","commentCount":24,"href":"https://my.oschina.net/xxiaobian/blog/2996257","id":2996257,"pubDate":"2019-01-03 08:17:38","recommend":false,"title":"OSChina 周四乱弹 \u2014\u2014 何以解忧，唯有暴富","type":3,"viewCount":2827},{"author":"局长","body":"过去的 2018 年，Linux Kernel 发布了 6 个版本，从年初的 Linux 4.15 到圣诞节前夕的 4.20，共有 74,974 个 commits，增加了 3,385,121 行代码，移...","commentCount":3,"href":"https://www.oschina.net/news/103264/linux-eoy-2018-kernel-stats","id":103264,"pubDate":"2019-01-03 08:14:39","recommend":false,"title":"Linux Kernel 去年净增 87 万行代码，共有近 75000 个提交","type":6,"viewCount":1783},{"author":"局长","body":"据外媒报道，微软旗下风险投资部门 M12，刚刚参与了对开源数字资产管理平台 Bakkt 的 1.825 亿美元融资。 Bakkt 旨在建立一个开放性的全球网络，以...","commentCount":1,"href":"https://www.oschina.net/news/103263/microsofts-venture-capital-arm-m12-invests-in-bakkt","id":103263,"pubDate":"2019-01-03 08:09:23","recommend":false,"title":"微软参投开源数字资产管理平台 Bakkt，首轮融资过亿美元","type":6,"viewCount":676},{"author":"h4cd","body":"UltraViewPager 1.0.7.8 发布了，UltraViewPager 是阿里开源的一个封装多种特性的 ViewPager ，主要是为多页面切换场景提供统一解决方案。 此版本移...","commentCount":0,"href":"https://www.oschina.net/news/103262/ultraviewpager-1-0-7-8-released","id":103262,"pubDate":"2019-01-03 08:02:28","recommend":false,"title":"UltraViewPager 1.0.7.8 发布，封装多种特性的 ViewPager","type":6,"viewCount":683},{"author":"h4cd","body":"Scratch 3.0 发布了，Scratch 是 MIT Media 实验室 Lifelong 幼儿园团队的一个项目，它通过点击并拖拽的方式可视化完成编程，帮助人们学会创造性地...","commentCount":5,"href":"https://www.oschina.net/news/103261/scratch-3-0-released","id":103261,"pubDate":"2019-01-03 07:56:41","recommend":false,"title":"Scratch 3.0 发布，用搭积木的方式编程","type":6,"viewCount":1645},{"author":"h4cd","body":"Q4OS 2.7 Scorpion 稳定版发布了，Q4OS 是基于 Debian 的桌面 Linux 发行版，它被设计为提供传统样式的用户界面(Trinity)及简单的附件，并提供稳定...","commentCount":3,"href":"https://www.oschina.net/news/103260/q4os-2-7-released","id":103260,"pubDate":"2019-01-03 07:41:22","recommend":false,"title":"Q4OS 2.7 稳定版发布，基于 Debian 的 Linux 发行版","type":6,"viewCount":516}]
         * nextPageToken : DBA816934CD0AA59
         * prevPageToken : 0997C855C600E421
         * requestCount : 20
         * responseCount : 20
         * totalResults : 94854
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
             * author : xuri
             * body : Excelize 是 Go 语言编写的用于操作 Office Excel 文档类库，基于 ECMA-376 Office OpenXML 标准。可以使用它来读取、写入由 Microsoft Excel&trad...
             * commentCount : 1
             * href : https://www.oschina.net/news/103280/excelize-1-4-1-released
             * id : 103280
             * pubDate : 2019-01-03 12:23:35
             * recommend : true
             * title : Go 语言 Excel 类库 Excelize 1.4.1 版本发布
             * type : 6
             * viewCount : 131
             */

            private String author;
            private String body;
            private int commentCount;
            private String href;
            private int id;
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
