package com.example.administrator.osdemo.details;

import org.itheima.recycler.bean.BasePageBean;

import java.util.List;

public class detailsBean extends BasePageBean<detailsBean.ResultBean.AboutsBean> {

    /**
     * code : 1
     * message : success
     * result : {"abouts":[{"commentCount":0,"content":"ngx-neditor 1.0.1 发布： 首个版本，封装为 Angular 插件。 支持 Angular 4+     neditor demo:  https://demo.neditor.notadd.com/ 下载地址 码云： http://gitee.com/notadd/ngx-neditor github ：http://github.com/notadd/ngx-neditor","href":"https://www.oschina.net/news/99089/ngx-neditor-1-0-1-released","id":99089,"statistics":{"comment":0,"favCount":0,"like":0,"transmit":0,"view":1031},"title":"ngx-neditor 1.0.1 发布，更现代化的富文本编辑器 angular 组件","type":6,"viewCount":1031},{"commentCount":2,"content":"此版本已经将上传接口封装为 service ，只需少量修改就能支持各类后端及云存储。 新功能 将上传服务重写为 service ，支持各类接口及云存储。 删除编译后的 utf8-php 文件夹 BUG 修复 修复视频插入无代码 修复音乐插入无代码 修复锚点插入的BUG 固定高度下，修复高度自动撑开问题 修复 iframe 无法引入的问题 修复图片搜索后，插入图片变小的问题 修复附件无法上传的问题 修复草稿箱无法正常使用的问题 Demo:  https://demo.n...","href":"https://www.oschina.net/news/99053/neditor-2-1-0-released","id":99053,"statistics":{"comment":2,"favCount":0,"like":0,"transmit":0,"view":2328},"title":"Neditor 2.1.0 发布，更好用的中文 Web 编辑器","type":6,"viewCount":2328},{"commentCount":13,"content":"此次变动较大，移除了后端相关代码，纯 ajax 提交，请配置 neditor.config.js ，默认配置支持又拍云，可自行修改支持其他后端或者云存储。 新功能 移除了所有后端代码，重写了上传逻辑 图片/视频/涂鸦板 支持 ajax 提交 发布了 npm 包 @notadd/neditor 移除 test 测试 BUG 修复 修复图片无法搜索 修复涂鸦板 修复视频对齐按钮的图标问题 下载地址 Neditor 码云： http://gitee.com/notadd/neditor Neditor github 地址：htt...","href":"https://www.oschina.net/news/98988/neditor-2-0-0-released","id":98988,"statistics":{"comment":13,"favCount":0,"like":0,"transmit":0,"view":844},"title":"Neditor 2.0.0 发布，移除后端代码，重写上传逻辑（ajax）","type":6,"viewCount":844},{"commentCount":12,"content":"更新内容 修复静态地图无法插入的问题 其他细节优化   本次更新内容较少，这是 1.x 系列的最后一个版本了。 2.x 将移除所有后端代码，纯 ajax 请求，兼容所有后端，并支持 Form表单云存储（无需经过后端服务器）。 欢迎提交 PR 当然，如果有捐赠的话，3.x 我们将考虑用 ts 重写所有代码。   下载地址 Neditor 码云： http://gitee.com/notadd/neditor Neditor github 地址：http://github.com/notadd/neditor...","href":"https://www.oschina.net/news/98986/neditor-1-5-6-released","id":98986,"statistics":{"comment":12,"favCount":0,"like":0,"transmit":1,"view":1641},"title":"Neditor 1.5.6 发布，更现代化的中文编辑器","type":6,"viewCount":1641},{"commentCount":5,"content":"Neditor 基于 Ueditor ，修复了大量BUG，优化了界面。 - 升级 apache commons-fileupload jar 修复旧版本BUG - 修复 make image uploader通过拖放上传发送相同的标题 - 修复chrome下scrollTop获取错误导致图片缩放框错位的问题 - 更新.net核心服务uri - 修复了domUtils.on事件列表首先为null - 使用lang名称修复构建i18n路径 - 修复不使用args code perter - 修复编辑源码状态下，`.focus（）``和.blur（）`失效的问题 - 修正大...","href":"https://www.oschina.net/news/98744/neditor-1-5-5-released","id":98744,"statistics":{"comment":5,"favCount":0,"like":0,"transmit":0,"view":2118},"title":"Neditor 更现代化的中文编辑器 1.5.5 发布","type":6,"viewCount":2118}],"author":"左华栋","authorId":2352515,"authorPortrait":"https://static.oschina.net/uploads/user/1176/2352515_50.jpg?t=1470190675000","authorRelation":4,"body":"<p>Neditor 2.1.14 发布了，主要改进内容包括：<\/p> \n<ul> \n <li><p>修复了列表图标无效的问题和uParse的列表路径配置问题<\/p><\/li> \n <li><p><img src=\"https://static.oschina.net/uploads/img/201810/11175918_0WHp.jpg\"><\/p><\/li> \n<\/ul> \n<ul><\/ul> \n<p>Demo:&nbsp;&nbsp;<a href=\"https://demo.neditor.notadd.com/\" target=\"_blank\" rel=\"nofollow\">https://demo.neditor.notadd.com/<\/a><\/p> \n<p>Neditor 是基于 ueditor 的更现代化的富文本编辑器，支持HTTPS。<\/p> \n<h4>下载地址<\/h4> \n<ul> \n <li><p>Neditor 码云：&nbsp;<a href=\"http://gitee.com/notadd/neditor\" rel=\"nofollow\">http://gitee.com/notadd/neditor<\/a><\/p><\/li> \n <li><p>Neditor github 地址：<a href=\"http://github.com/notadd/neditor\" rel=\"nofollow\">http://github.com/notadd/neditor<\/a><\/p><\/li> \n<\/ul>","commentCount":0,"favorite":false,"href":"https://www.oschina.net/news/103414/neditor-2-1-14-released","id":103414,"pubDate":"2019-01-08 09:16:00","software":{"href":"https://www.oschina.net/p/neditor","id":45366,"name":"Neditor"},"title":"Neditor 2.1.14 发布，修复了列表图标无效的问题","viewCount":3}
     * time : 2019-01-08 10:04:04
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
        return result.abouts;
    }

    public static class ResultBean {
        /**
         * abouts : [{"commentCount":0,"content":"ngx-neditor 1.0.1 发布： 首个版本，封装为 Angular 插件。 支持 Angular 4+     neditor demo:  https://demo.neditor.notadd.com/ 下载地址 码云： http://gitee.com/notadd/ngx-neditor github ：http://github.com/notadd/ngx-neditor","href":"https://www.oschina.net/news/99089/ngx-neditor-1-0-1-released","id":99089,"statistics":{"comment":0,"favCount":0,"like":0,"transmit":0,"view":1031},"title":"ngx-neditor 1.0.1 发布，更现代化的富文本编辑器 angular 组件","type":6,"viewCount":1031},{"commentCount":2,"content":"此版本已经将上传接口封装为 service ，只需少量修改就能支持各类后端及云存储。 新功能 将上传服务重写为 service ，支持各类接口及云存储。 删除编译后的 utf8-php 文件夹 BUG 修复 修复视频插入无代码 修复音乐插入无代码 修复锚点插入的BUG 固定高度下，修复高度自动撑开问题 修复 iframe 无法引入的问题 修复图片搜索后，插入图片变小的问题 修复附件无法上传的问题 修复草稿箱无法正常使用的问题 Demo:  https://demo.n...","href":"https://www.oschina.net/news/99053/neditor-2-1-0-released","id":99053,"statistics":{"comment":2,"favCount":0,"like":0,"transmit":0,"view":2328},"title":"Neditor 2.1.0 发布，更好用的中文 Web 编辑器","type":6,"viewCount":2328},{"commentCount":13,"content":"此次变动较大，移除了后端相关代码，纯 ajax 提交，请配置 neditor.config.js ，默认配置支持又拍云，可自行修改支持其他后端或者云存储。 新功能 移除了所有后端代码，重写了上传逻辑 图片/视频/涂鸦板 支持 ajax 提交 发布了 npm 包 @notadd/neditor 移除 test 测试 BUG 修复 修复图片无法搜索 修复涂鸦板 修复视频对齐按钮的图标问题 下载地址 Neditor 码云： http://gitee.com/notadd/neditor Neditor github 地址：htt...","href":"https://www.oschina.net/news/98988/neditor-2-0-0-released","id":98988,"statistics":{"comment":13,"favCount":0,"like":0,"transmit":0,"view":844},"title":"Neditor 2.0.0 发布，移除后端代码，重写上传逻辑（ajax）","type":6,"viewCount":844},{"commentCount":12,"content":"更新内容 修复静态地图无法插入的问题 其他细节优化   本次更新内容较少，这是 1.x 系列的最后一个版本了。 2.x 将移除所有后端代码，纯 ajax 请求，兼容所有后端，并支持 Form表单云存储（无需经过后端服务器）。 欢迎提交 PR 当然，如果有捐赠的话，3.x 我们将考虑用 ts 重写所有代码。   下载地址 Neditor 码云： http://gitee.com/notadd/neditor Neditor github 地址：http://github.com/notadd/neditor...","href":"https://www.oschina.net/news/98986/neditor-1-5-6-released","id":98986,"statistics":{"comment":12,"favCount":0,"like":0,"transmit":1,"view":1641},"title":"Neditor 1.5.6 发布，更现代化的中文编辑器","type":6,"viewCount":1641},{"commentCount":5,"content":"Neditor 基于 Ueditor ，修复了大量BUG，优化了界面。 - 升级 apache commons-fileupload jar 修复旧版本BUG - 修复 make image uploader通过拖放上传发送相同的标题 - 修复chrome下scrollTop获取错误导致图片缩放框错位的问题 - 更新.net核心服务uri - 修复了domUtils.on事件列表首先为null - 使用lang名称修复构建i18n路径 - 修复不使用args code perter - 修复编辑源码状态下，`.focus（）``和.blur（）`失效的问题 - 修正大...","href":"https://www.oschina.net/news/98744/neditor-1-5-5-released","id":98744,"statistics":{"comment":5,"favCount":0,"like":0,"transmit":0,"view":2118},"title":"Neditor 更现代化的中文编辑器 1.5.5 发布","type":6,"viewCount":2118}]
         * author : 左华栋
         * authorId : 2352515
         * authorPortrait : https://static.oschina.net/uploads/user/1176/2352515_50.jpg?t=1470190675000
         * authorRelation : 4
         * body : <p>Neditor 2.1.14 发布了，主要改进内容包括：</p>
         <ul>
         <li><p>修复了列表图标无效的问题和uParse的列表路径配置问题</p></li>
         <li><p><img src="https://static.oschina.net/uploads/img/201810/11175918_0WHp.jpg"></p></li>
         </ul>
         <ul></ul>
         <p>Demo:&nbsp;&nbsp;<a href="https://demo.neditor.notadd.com/" target="_blank" rel="nofollow">https://demo.neditor.notadd.com/</a></p>
         <p>Neditor 是基于 ueditor 的更现代化的富文本编辑器，支持HTTPS。</p>
         <h4>下载地址</h4>
         <ul>
         <li><p>Neditor 码云：&nbsp;<a href="http://gitee.com/notadd/neditor" rel="nofollow">http://gitee.com/notadd/neditor</a></p></li>
         <li><p>Neditor github 地址：<a href="http://github.com/notadd/neditor" rel="nofollow">http://github.com/notadd/neditor</a></p></li>
         </ul>
         * commentCount : 0
         * favorite : false
         * href : https://www.oschina.net/news/103414/neditor-2-1-14-released
         * id : 103414
         * pubDate : 2019-01-08 09:16:00
         * software : {"href":"https://www.oschina.net/p/neditor","id":45366,"name":"Neditor"}
         * title : Neditor 2.1.14 发布，修复了列表图标无效的问题
         * viewCount : 3
         */

        private String author;
        private int authorId;
        private String authorPortrait;
        private int authorRelation;
        private String body;
        private int commentCount;
        private boolean favorite;
        private String href;
        private int id;
        private String pubDate;
        private SoftwareBean software;
        private String title;
        private int viewCount;
        private List<AboutsBean> abouts;

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public int getAuthorId() {
            return authorId;
        }

        public void setAuthorId(int authorId) {
            this.authorId = authorId;
        }

        public String getAuthorPortrait() {
            return authorPortrait;
        }

        public void setAuthorPortrait(String authorPortrait) {
            this.authorPortrait = authorPortrait;
        }

        public int getAuthorRelation() {
            return authorRelation;
        }

        public void setAuthorRelation(int authorRelation) {
            this.authorRelation = authorRelation;
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

        public boolean isFavorite() {
            return favorite;
        }

        public void setFavorite(boolean favorite) {
            this.favorite = favorite;
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

        public SoftwareBean getSoftware() {
            return software;
        }

        public void setSoftware(SoftwareBean software) {
            this.software = software;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getViewCount() {
            return viewCount;
        }

        public void setViewCount(int viewCount) {
            this.viewCount = viewCount;
        }

        public List<AboutsBean> getAbouts(int i) {
            return abouts;
        }

        public void setAbouts(List<AboutsBean> abouts) {
            this.abouts = abouts;
        }

        public static class SoftwareBean {
            /**
             * href : https://www.oschina.net/p/neditor
             * id : 45366
             * name : Neditor
             */

            private String href;
            private int id;
            private String name;

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

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        public static class AboutsBean {
            /**
             * commentCount : 0
             * content : ngx-neditor 1.0.1 发布： 首个版本，封装为 Angular 插件。 支持 Angular 4+     neditor demo:  https://demo.neditor.notadd.com/ 下载地址 码云： http://gitee.com/notadd/ngx-neditor github ：http://github.com/notadd/ngx-neditor
             * href : https://www.oschina.net/news/99089/ngx-neditor-1-0-1-released
             * id : 99089
             * statistics : {"comment":0,"favCount":0,"like":0,"transmit":0,"view":1031}
             * title : ngx-neditor 1.0.1 发布，更现代化的富文本编辑器 angular 组件
             * type : 6
             * viewCount : 1031
             */

            private int commentCount;
            private String content;
            private String href;
            private int id;
            private StatisticsBean statistics;
            private String title;
            private int type;
            private int viewCount;

            public int getCommentCount() {
                return commentCount;
            }

            public void setCommentCount(int commentCount) {
                this.commentCount = commentCount;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
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

            public StatisticsBean getStatistics() {
                return statistics;
            }

            public void setStatistics(StatisticsBean statistics) {
                this.statistics = statistics;
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

            public static class StatisticsBean {
                /**
                 * comment : 0
                 * favCount : 0
                 * like : 0
                 * transmit : 0
                 * view : 1031
                 */

                private int comment;
                private int favCount;
                private int like;
                private int transmit;
                private int view;

                public int getComment() {
                    return comment;
                }

                public void setComment(int comment) {
                    this.comment = comment;
                }

                public int getFavCount() {
                    return favCount;
                }

                public void setFavCount(int favCount) {
                    this.favCount = favCount;
                }

                public int getLike() {
                    return like;
                }

                public void setLike(int like) {
                    this.like = like;
                }

                public int getTransmit() {
                    return transmit;
                }

                public void setTransmit(int transmit) {
                    this.transmit = transmit;
                }

                public int getView() {
                    return view;
                }

                public void setView(int view) {
                    this.view = view;
                }
            }
        }
    }
}
