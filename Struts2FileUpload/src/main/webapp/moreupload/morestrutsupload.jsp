<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Struts2多文件上传</title>
</head>
<body>
<s:iterator value="uploadFileName">
    文件:<s:property/> <br/>
</s:iterator>
<s:iterator value="uploadContentType">
    文件类型:<s:property/> <br/>
</s:iterator>
</body>
</html>
