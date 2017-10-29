<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/10
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
    request.setAttribute("basePath", basePath);
%>
