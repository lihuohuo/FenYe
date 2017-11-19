<%@page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<head>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/jquery-easyui-1.3.3/jquery.min.js"></script>
    <script type="text/javascript">
        window.onload = function() {
            var input = document.getElementById("file_input");
            var result, div;

            if (typeof FileReader === 'undefined') {
                result.innerHTML = "你的浏览器不支持 FileReader";
                input.setAttribute('disabled', 'disabled');
            } else {
                input.addEventListener('change', readFile, false);
            }　　　　//handler
            function readFile() {
                for (var i = 0; i < this.files.length; i++) {
                    if (!input['value'].match(/.jpg|.gif|.png|.bmp/i)) {　　//判断上传文件格式
                        return alert("上传的图片格式不正确，请重新选择")
                    }
                    var reader = new FileReader();
                    reader.readAsDataURL(this.files[i]);
                    reader.onload = function (e) {
                        result = '<div id="result"><img src="' + this.result + '" alt=""/></div>';
                        div = document.createElement('div');
                        div.innerHTML = result;
                        document.getElementById('body').appendChild(div); 　　//插入dom树       　　　　　　　　}
                    }
                }
            }
        }

    </script>
</head>
<body>
<h2>跳转</h2>
  <%--  <div class="container">
        <label>请选择一个图像文件：</label>
        <input type="file" id="file_input" multiple/>
    </div>--%>
</body>
</html>
