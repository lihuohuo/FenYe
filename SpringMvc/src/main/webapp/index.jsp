
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery1.11.1.js"></script>
<script type="text/javascript">
    $(function () {
        $("#btn").click(function () {
            $.post('${pageContext.request.contextPath}/doFirst', {}, function (data) {
                alert(data);
            });
        });
    });
</script>
<body>
<h2>Void Ajax</h2>
<input type="button" id="btn" value="Ajax"/>
</body>
</html>

