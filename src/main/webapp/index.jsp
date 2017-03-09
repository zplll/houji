<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/6
  Time: 13:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
      <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
      <script src="http://cdn.static.runoob.com/libs/angular.js/1.4.6/angular.min.js"></script>
      <script src="resources/js/app.js"></script>
  </head>
  <body>
    <div>
    <%! String username = null;%>

    <%
        username = (String) session.getAttribute("username");;
        if (username==null){
            response.sendRedirect(request.getContextPath()+"login.jsp");//"../resources/jsp/login.jsp");
        }else {
            out.println(username+",欢迎你！");
        }
    %>
    </div>
  </body>
</html>
