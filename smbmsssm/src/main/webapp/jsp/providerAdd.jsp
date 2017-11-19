<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>超市账单管理系统</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/jsp/css/public.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/jsp/css/style.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
</head>
    <script type="text/javascript  ">
        function add() {
            var provider=$("#myfrom").serialize();
            $.ajax({
                url:"${pageContext.request.contextPath}/add",
                type:"post",
                date:provider,
                success:function (data) {
                    if (data>1){
                        alert("添加成功！！")
                    }else {
                        alert("添加失败！")
                    }
                }


            });
        }



    </script>




<body>
<!--头部-->
<header class="publicHeader">
    <h1>超市账单管理系统</h1>

    <div class="publicHeaderR">
        <p><span>下午好！</span><span style="color: #fff21b"> Admin</span> , 欢迎你！</p>
        <a href="login.html">退出</a>
    </div>
</header>
<!--时间-->
<section class="publicTime">
    <span id="time">2015年1月1日 11:11  星期一</span>
    <a href="#">温馨提示：为了能正常浏览，请使用高版本浏览器！（IE10+）</a>
</section>
<!--主体内容-->
<section class="publicMian ">
    <div class="left">
        <h2 class="leftH2"><span class="span1"></span>功能列表 <span></span></h2>
        <nav>
            <ul class="list">
                <li><a href="billList.html">账单管理</a></li>
                <li id="active"><a href="providerList.html">供应商管理</a></li>
                <li><a href="userList.html">用户管理</a></li>
                <li><a href="password.html">密码修改</a></li>
                <li><a href="login.html">退出系统</a></li>
            </ul>
        </nav>
    </div>
    <div class="right">
        <div class="location">
            <strong>你现在所在的位置是:</strong>
            <span>供应商管理页面 >> 供应商添加页面</span>
        </div>
        <div class="providerAdd">
            <form action="#" id="myfrom">
                <!--div的class 为error是验证错误，ok是验证成功-->
                <div class="">
                    <label for="providerId">供应商编码：</label>
                    <input type="text" name="providercode" id="providerId"/>
                    <span>*请输入供应商编码</span>
                </div>
                <div>
                    <label for="providerName">供应商名称：</label>
                    <input type="text" name="providername" id="providerName"/>
                    <span >*请输入供应商名称</span>
                </div>
                <div>
                    <label for="people">联系人：</label>
                    <input type="text" name="provideruser" id="people"/>
                    <span>*请输入联系人</span>

                </div>
                <div>
                    <label for="phone">联系电话：</label>
                    <input type="text" name="providerphone" id="phone"/>
                    <span>*请输入联系电话</span>
                </div>
                <div>
                    <label for="address">联系地址：</label>
                    <input type="text" name="provideraddress" id="address"/>
                    <span></span>
                </div>
                <div>
                    <label for="fax">传真：</label>
                    <input type="text" name="providerFax" id="fax"/>
                    <span></span>
                </div>
                <div>
                    <label for="describe">描述：</label>
                    <input type="text" name="providerabout" id="describe"/>
                </div>
                <div class="providerAddBtn">
                    <!--<a href="#">保存</a>-->
                    <!--<a href="providerList.jsp">返回</a>-->
                    <input type="button" value="保存" onclick="add()"/>
                    <input type="button" value="返回" onclick="history.back(-1)"/>
                </div>
            </form>
        </div>

    </div>
</section>
<footer class="footer">
    版权归北大青鸟
</footer>
<script src="js/time.js"></script>

</body>
</html>