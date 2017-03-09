<%--
  Created by IntelliJ IDEA.
  User: zipon
  Date: 2017/3/9
  Time: 12:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://cdn.static.runoob.com/libs/angular.js/1.4.6/angular.min.js"></script>
    <script src="resources/js/app.js"></script>
</head>
<body ng-app = "myapp">
<div  ng-controller = "login">
    <input type="text" name="username" ng-model = "formData.username"/>
    <input type="password" name="password" ng-model = "formData.password" />
    <button ng-click = "processForm()" >登陆</button>
    <div ng-bind = "message">1</div>
</div>
</body>
</html>
