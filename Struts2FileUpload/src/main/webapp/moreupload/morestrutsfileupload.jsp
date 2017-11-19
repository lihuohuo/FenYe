<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Struts2文件上传</title>
</head>
<body>
<s:form action="moreuploadAction" enctype="multipart/form-data" method="post">
    <s:file name="upload" label="选择文件"/><br/>
    <s:file name="upload" label="选择文件"/><br/>
    <s:submit name="submit" value="文件上传"/>
</s:form>
</body>
</html>
