<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="true" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <!--通用-->
    <meta name="format-detection" content="telephone=no">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="viewport" content="width=device-width,minimum-scale=1.0,maximum-scale=1.0">
    <title>常用语句收藏列表页</title>
    <meta name="keywords" content="" />
    <meta name="description" content="" />
    <link rel="stylesheet" href="../../layui/css/layui.css">
    <link rel="stylesheet" href="../../xznstatic/css/aos.css" />
    <link rel="stylesheet" href="../../xznstatic/css/bootstrap.min.css" />
    <link rel="stylesheet" href="../../xznstatic/css/idangerous.swiper.css" />
    <link rel="stylesheet" href="../../xznstatic/css/lightbox.css">
    <link rel="stylesheet" href="../../xznstatic/css/app.css" />
    <link rel="stylesheet" href="../../xznstatic/css/apmin.css"/>
    <link rel="stylesheet" type="text/css" href="../../xznstatic/css/iconfont.css">
    <link rel="stylesheet" type="text/css" href="../../xznstatic/css/color.css">
    <link rel="stylesheet" type="text/css" href="../../xznstatic/css/global.css">
    <link rel="stylesheet" type="text/css" href="../../xznstatic/css/page.css">
    <link rel="stylesheet" type="text/css" href="../../xznstatic/css/uzlist.css">
    <link rel="stylesheet" type="text/css" href="../../xznstatic/css/animate.min.css">
    <link rel="stylesheet" type="text/css" href="../../xznstatic/css/fancybox.css" />
    <script type="text/javascript" src="../../xznstatic/js/jquery.min.js"></script>
    <script type="text/javascript" src="../../xznstatic/js/superslide.2.1.1.min.js"></script>
    <script type="text/javascript" src="../../xznstatic/js/wow.min.js"></script>
    <script type="text/javascript" src="../../xznstatic/js/fancybox.js"></script>
    <!-- 样式 -->
    <link rel="stylesheet" href="../../css/style.css"/>
    <!-- 主题（主要颜色设置） -->
    <link rel="stylesheet" href="../../css/theme.css"/>
    <!-- 通用的css -->
    <link rel="stylesheet" href="../../css/common.css"/>
    <script type="text/javascript" charset="utf-8">
        window.UEDITOR_HOME_URL = "../../../resources/ueditor/"; //UEDITOR_HOME_URL、config、all这三个顺序不能改变
    </script>
    <script type="text/javascript" charset="utf-8"
            src="../../../resources/ueditor/ueditor.config.js"></script>
    <script type="text/javascript" charset="utf-8"
            src="../../../resources/ueditor/ueditor.all.min.js"></script>
    <script type="text/javascript" charset="utf-8"
            src="../../../resources/ueditor/lang/zh-cn/zh-cn.js"></script>
    <script type="text/javascript">
        var CATID = "0",
                BCID = "0",
                NAVCHILDER = "",
                ONCONTEXT = 0,
                ONCOPY = 0,
                ONSELECT = 0;
    </script>
    <style>
        .ng-djn-txt {
            text-align: justify;
            text-justify: inter-ideograph;
            word-wrap: break-word;
            word-break: break-all;
        }
        .ng-inpusbox {
            text-indent:0px;
        }
        .am-inside-adv{
            height:auto;
        }
        .am-inside-adv img {
            width:100%;
        }
        .ng-oa a .small {
            display:none;
        }
        .ng-oa a:hover .small {
            display:block;
        }
        .ng-oa a:hover .image {
            display:none;
        }
        .pos-a {
            height:30px;
            line-height:30px;
            margin:0 5px;
        }
        .pos-a a {
            margin:0 5px;
        }
        .layui-laypage .layui-laypage-curr .layui-laypage-em {
            background-color: var(--publicMainColor,orange);
        }
        .jishuzichis a {
            font-size: 12px;
            color: #878787;
        }
        .ng-siotext {
            line-height: 50px;
        }

        @media screen and (max-width: 992px) {
            .ng-zein-iten-link li {
                width: 50%;
                text-align: center;
            }
            .ng-zein-iten-link li.li {
                width: 100%;
            }
            .bdshare-button-style2-16 a, .bdshare-button-style2-16 .bds_more {
                float: initial;
            }
            .ng-zein-code {
                width: 100%;
            }
            .ng-zein-code-tit {
                width: 100%;
                text-align: center;
            }
        }

        /* 前台模态框使用集成tinymce富文本框会导致页面做下角出现上传图片和添加表格功能，由于处理不了，把它z-index属性设置为负的，不能让页面上可以点*/
        .tox-pop{
            z-index: -99999;
        }
    </style>
</head>
<body >
<div id="app">
    <div class="ng-container ng-fault">
        <div class="ng-inmod ng-fault ng-paddor ng-bg-fff">
            <div class="ng-inmod-ini">
                    <div class="index_titlebox">
                        <h3 class="index_title">常用语句收藏展示</h3>
                        <p class="index_intro">DATA SHOW</p>
                    </div>                <fieldset class="search-container" style="text-align: center;">
                    <form class="layui-form" lay-filter="myForm">

                                         
                          <div class="layui-inline" style="margin-bottom: 10px;">
                              <label class="layui-form-label">常用语句编号</label>
                              <div class="layui-input-inline">
                                  <input type="text" name="changyongyujuUuidNumber" id="changyongyujuUuidNumber" placeholder="常用语句编号" autocomplete="off" class="layui-input">
                              </div>
                          </div>
                     
                          <div class="layui-inline" style="margin-bottom: 10px;">
                              <label class="layui-form-label">常用语句名称</label>
                              <div class="layui-input-inline">
                                  <input type="text" name="changyongyujuName" id="changyongyujuName" placeholder="常用语句名称" autocomplete="off" class="layui-input">
                              </div>
                          </div>
                                                                                                     
                          <div class="layui-inline" style="margin-bottom: 10px;">
                              <label class="layui-form-label">常用语句类型</label>
                              <div class="layui-input-inline">
                                  <select name="changyongyujuTypes" id="changyongyujuTypes" lay-filter="changyongyujuTypes">
                                      <option value="">--请选择--</option>
                                      <option v-for="item in changyongyujuTypesList" :value="item.codeIndex" :key="item.codeIndex">{{ item.indexName }}</option>
                                  </select>
                              </div>
                          </div>
                                                                                                                            
                      <div class="layui-inline" style="margin-left: 30px;margin-bottom: 10px;">
                          <button id="btn-search" type="button" class="layui-btn" style="background-color: var(--publicMainColor,orange);">
                              搜索
                          </button>
                          <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                      </div>
                    </form>
                </fieldset>

                <div class="ng-inside-box ng-fault ng-container" aos="fade-up">
                    <section style="margin: 10px">
                        <div class="row">
                            <div v-for="(item,index) in dataList" class="col-md-3">
                                <i @click="deleteChangyongyujuCollection(item.id)" class="layui-icon" style="float:right;color:red;margin-top: 0px;margin-right: 3px;font-size:20px">&#xe640;</i>
                                <div class="gallery-demo" @click="jumpCheck('../changyongyuju/detail.jsp?id='+item.changyongyujuId , item.changyongyujuDelete == null?'':item.changyongyujuDelete , item.shangxiaTypes == null?'':item.shangxiaTypes)">
                                    <img :src="item.changyongyujuPhoto?item.changyongyujuPhoto.split(',')[0]:''" style="height: 350px;width:100%;"/>
                                    <h4 class="p-mask">{{item.changyongyujuName}}
                                        <span v-if="item.changyongyujuNewMoney"> - ￥{{item.changyongyujuNewMoney}}</span>
                                        <span v-else> - {{item.changyongyujuValue}}</span>
                                    </h4>
                                </div>
                            </div>
                        </div>
                    </section>
                    <nav class="pages">
                        <div class="pager" id="pager"></div>
                    </nav>
                </div>
            </div>
        </div>
    </div>

    <div class="am-end">
        <div class="ng-siobox ng-fault ng-paddor">
            <div class="am-end-ini">
                <div class="ng-siotext" aos="fade-up" aos-delay="400" aos-anchor-placement="top-bottom">
                    <p>欢迎访问<span v-text="projectName"></span>！</p>
                </div>
            </div>
        </div>
    </div>
</div>


<script src="../../xznstatic/js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
<script src="../../layui/layui.js"></script>
<script src="../../js/vue.js"></script>
<!-- 引入element组件库 -->
<script src="../../xznstatic/js/element.min.js"></script>
<!-- 引入element样式 -->
<link rel="stylesheet" href="../../xznstatic/css/element.min.css">
<script src="../../js/config.js"></script>
<script src="../../modules/config.js"></script>
<script src="../../js/utils.js"></script>

<script>
    var vue = new Vue({
        el: '#app',
        data: {
            id:null,
            detail: {},
            swiperList: [],//轮播图
            dataList: [],//数据
        // 当前表字典表数据
            changyongyujuCollectionTypesList : [],
        // 级联表字典表数据
            changyongyujuTypesList : [],
            shangxiaTypesList : [],
            changyongyujuCollectionTypes: 0,//类型
            limit: 8,
            projectName: projectName,//项目名
            centerMenu: centerMenu

        },
        updated: function() {
            layui.form.render(null, 'myForm');
        },
        filters: {
            //把字符串去除无用字符 如果字段长度大于60  就截取到60
            subString: function(val) {
                if (val) {
                    val = val.replace(/<[^<>]+>/g, '').replace(/undefined/g, '');
                    if (val.length > 60) {
                        val = val.substring(0, 60);
                        val+='...';
                    }

                    return val;
                }
                return '';
            }
        },
        computed: {
        },
        methods: {
            jump(url) {
                jump(url);
            }
            ,jumpCheck(url,check1,check2) {
                if(check1 == "2" || check1 == 2){//级联表的逻辑删除字段[1:未删除 2:已删除]
                    layui.layer.msg("已经被删除", {
                        time: 2000,
                        icon: 2
                    });
                    return false;
                }
                if(check2 == "2"  || check2 == 2){//是否下架[1:上架 2:下架]
                    layui.layer.msg("已经下架", {
                        time: 2000,
                        icon: 2
                    });
                    return false;
                }
                this.jump(url);
            }
            ,deleteChangyongyujuCollection(id){
                layui.layer.confirm('确认要删除这个收藏吗？', {
                    btn : [ '确定', '取消' ]//按钮
                }, function(index) {
                    var paramArray = [];
                    paramArray.push(id);
                    layui.http.requestJson('changyongyujuCollection/delete', 'post',paramArray, function (res) {
                        if (res.code == 0) {
                            layer.msg('删除成功', {
                                time: 2000,
                                icon: 6
                            });
                            location.reload();
                        } else {
                            layer.msg(res.msg, {
                                time: 2000,
                                icon: 2
                            });
                        }
                    });
                });
            }

        }
    });

    layui.use(['layer', 'element', 'carousel', 'laypage','form', 'http', 'jquery', 'laydate', 'tinymce'], function() {
        var layer = layui.layer;
        var element = layui.element;
        var carousel = layui.carousel;
        var laypage = layui.laypage;
        var http = layui.http;
        var form = layui.form;
        var laydate = layui.laydate;
        var tinymce = layui.tinymce;
        window.jQuery = window.$ = jquery = layui.jquery;

        var limit = 8;

        // 获取轮播图 数据
        http.request('config/list', 'get', {
            page: 1,
            limit: 5
        }, function(res) {
            if (res.data.list.length > 0) {
                let swiperList = [];
                res.data.list.forEach(element => {
                    if (element.value != null) {
                        swiperList.push({
                            img: element.value
                        });
                    }
                });
                vue.swiperList = swiperList;
                vue.$nextTick(()=>{
                    var mySwiper = new Swiper('.ng-swiper', {
                        speed: 400,
                        spaceBetween: 100,
                        pagination: '.ng-swiper .swiper-pagination',
                        autoplay : 5000,
                        loop : true,
                        autoplayDisableOnInteraction : false,
                        calculateHeight : true
                    });
                    $(".ng-swiper-ovleft").bind("click",function (){ mySwiper.swipePrev();});
                    $(".ng-swiper-ovright").bind("click",function (){ mySwiper.swipeNext();});
                });
            }
        });
        // 查询当前字典表相关
            // 类型的查询和初始化
        changyongyujuCollectionTypesSelect();
    // 当前表的字典表
        // 类型的查询
        function changyongyujuCollectionTypesSelect() {
            http.request("dictionary/page?page=1&limit=100&sort=&order=&dicCode=changyongyuju_collection_types", 'get', {}, function (res) {
                if(res.code == 0){
                    vue.changyongyujuCollectionTypesList = res.data.list;
                }
            });
        }



    // 级联表的字段数据
        changyongyujuTypesSelect();
        // 级联表的字典表

        // 常用语句类型的查询
        function changyongyujuTypesSelect() {
            http.request("dictionary/page?page=1&limit=100&sort=&order=&dicCode=changyongyuju_types", 'get', {}, function (res) {
                if(res.code == 0){
                    vue.changyongyujuTypesList = res.data.list;
                }
            });
        }

        // 是否上架的查询
        function shangxiaTypesSelect() {
            http.request("dictionary/page?page=1&limit=100&sort=&order=&dicCode=shangxia_types", 'get', {}, function (res) {
                if(res.code == 0){
                    vue.shangxiaTypesList = res.data.list;
                }
            });
        }




        // 日期效验规则及格式
        dateTimePick();
        // 表单效验规则
        form.verify({
            // 正整数效验规则
            integer: [
                /^[1-9][0-9]*$/
                ,'必须是正整数'
            ]
            // 小数效验规则
            ,double: [
                /^[1-9][0-9]{0,5}(\.[0-9]{1,2})?$/
                ,'最大整数位为6为,小数最大两位'
            ]
                                                
            // 级联表的数字限制
                                         
                     
                                                                                                     
                                                                                                    
        });


        // 分页列表
        pageList();

        // 搜索按钮
        jquery('#btn-search').click(function(e) {
            pageList();
        });

        function pageList() {
            var param = {
                page: 1
                ,limit: limit
            };


            // 级联表
                                         
            if (jquery('#changyongyujuUuidNumber').val() != null && jquery('#changyongyujuUuidNumber').val() != "" && jquery('#changyongyujuUuidNumber').val() != "null" ) {
                param['changyongyujuUuidNumber'] = jquery('#changyongyujuUuidNumber').val();
            }
                     
            if (jquery('#changyongyujuName').val() != null && jquery('#changyongyujuName').val() != "" && jquery('#changyongyujuName').val() != "null" ) {
                param['changyongyujuName'] = jquery('#changyongyujuName').val();
            }
                                                                                                     
            var changyongyujuTypes = $("#changyongyujuTypes").find("option:selected").val();
            if (changyongyujuTypes != null && changyongyujuTypes != "" && changyongyujuTypes != "null") {
                            param['changyongyujuTypes'] = changyongyujuTypes;
                        }
                                                                                                    
            // 当前表
                                                
            //收藏只能查类型为1的
            param['changyongyujuCollectionTypes'] = 1;

            // 获取列表数据
            http.request('changyongyujuCollection/page', 'get', param, function(res) {
                vue.dataList = res.data.list;
                // 分页
                laypage.render({
                    elem: 'pager',
                    count: res.data.total,
                    limit: limit,
                    jump: function(obj, first) {
                        param.page = obj.curr;
                        //首次不执行
                        if (!first) {
                            http.request('changyongyujuCollection/page', 'get', param, function(res) {
                                vue.dataList = res.data.list;
                                vue.$nextTick(()=>{
                                    window.xznResize();
                            });
                            })
                        }
                    }
                });
                vue.$nextTick(()=>{
                    window.xznResize();
                });
            });
        }


        // 日期框初始化
        function dateTimePick(){
            /*
                ,change: function(value, date, endDate){
                    value       得到日期生成的值，如：2017-08-18
                    date        得到日期时间对象：{year: 2017, month: 8, date: 18, hours: 0, minutes: 0, seconds: 0}
                    endDate     得结束的日期时间对象，开启范围选择（range: true）才会返回。对象成员同上。
            */
        }




    });
</script>

<script src="../../xznstatic/js/idangerous.swiper.min.js"></script>
<script src="../../xznstatic/js/aos.js" type="text/javascript" charset="utf-8"></script>
<script src="../../xznstatic/js/jquery.superslide.2.1.1.js"></script>
<script src="../../xznstatic/js/app.js"></script>
<script src="../../xznstatic/js/lightbox.js"></script>

<script>
    window.xznResize = function() {
        var mySwiper2 = new Swiper('.ng-inzep',{
            calculateHeight : true,
            loop : true,
            paginationClickable :true,
            pagination: ".ng-inzep .swiper-pagination"
        });

        $(document).bind("scroll",function (){
            if($(".ng-swip-porlist").length > 0){
                if($(window).width() > 769){
                    mySwiper2.params.slidesPerView = 4;
                    mySwiper3.params.slidesPerView = 4;
                }else if($(window).width() < 769){
                    if($(window).width() < 480){
                        mySwiper2.params.slidesPerView = 2;
                        mySwiper3.params.slidesPerView = 2;
                    }else{
                        mySwiper2.params.slidesPerView = 3;
                        mySwiper3.params.slidesPerView = 3;
                    }
                }
            }
        });

        $(window).bind("resize", function () {
            // 强制关闭导航
            if ($(window).width() > 992) { $(".ipad-nav").slideUp(); };

            if ($(".ng-swip-porlist").length > 0) {
                if ($(window).width() > 769) {
                    mySwiper2.params.slidesPerView = 4;
                    mySwiper3.params.slidesPerView = 4;
                } else if ($(window).width() < 769) {
                    if ($(window).width() < 480) {
                        mySwiper2.params.slidesPerView = 2;
                        mySwiper3.params.slidesPerView = 2;
                    } else {
                        mySwiper2.params.slidesPerView = 3;
                        mySwiper3.params.slidesPerView = 3;
                    }
                }
            }

            Spirit_dynamicBG($(".ng-inswbg"), 1600, 616, $(".ng-inswbg"));
            Spirit_CallBack($(".ng-porlist-doc>a"), 280, 200);
            Spirit_CallBack($(".ng-incontlst-img"), 368, 240);
            Spirit_CallBack($(".ng-inzep-ims"), 400, 270);
            Spirit_CallBack($(".ng-isenst-img"), 368, 240);
            Spirit_CallBack($(".ng-prslist-img"), 100, 100);
            Spirit_CallBack($(".ng-vrslist-img"), 260, 170);
            Spirit_CallBack($(".ng-newbve-img-ikk"), 368, 240);

            $(".ng-subc-swiper").css({ "height": $(".ng-subc-swiper").width() });

            if ($(window).width() < 640) {
                $(".am-inside-swf").css({
                    "min-height": $(window).height() - 60
                });
            } else {
                $(".am-inside-swf").css({
                    "min-height": "auto"
                });
            }
        }).resize();
    }
</script>
</body>
</html>
