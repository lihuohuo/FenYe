<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>



<html>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery1.11.1.js"></script>
<script type="text/javascript">
    $(function () {
        $("#btn").click(function () {
            $.ajax({
                url: "${pageContext.request.contextPath}/five",
                success: function (data) { //data指的是从server打印到浏览器的数据
               /*   $.each(data,function (i,dom) {
                      alert(data.uname+"\t"+dom.book);
                  })*/
                       $.each(data,function (i,dom) {
                     alert(data.uname+"\t"+dom.book);
                     })

                }
            });
        });
    });

</script>


<body>
<h2>ResponseBody</h2>
<input type="button" id="btn" value="Ajax"/>
</body>

</html>
