<%--
  Created by IntelliJ IDEA.
  User: samsung
  Date: 5/29/20
  Time: 10:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport"
        content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Document</title>
</head>
<body>
<form action="/email/register" method="post">
  <h1>Validate Email</h1>
  <input type="text" name="email"><br>
  <button type="submit">check</button>
</form>
<div>${message}</div>
</body>
</html>