<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <link href="css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body style="background-color: grey">
<div class="container" style="background-color: white; margin-top: 200px;width: 500px;">
    <div class="text-center" style="margin: 50px;">
        <h1 class="h1">注册界面</h1>
        <form action="/register" method="post">
            <div class="form-group input-group">
                <label class="input-group-addon" for="username">用户名</label>
                <input type="text" class="form-control" id="username" name="username" placeholder="请输入用户名">
            </div>
            <div class="form-group input-group">
                <label class="input-group-addon" for="password">密码</label>
                <input type="password" class="form-control" id="password" name="password" placeholder="请输入密码">
            </div>
            <div class="form-group input-group">
                <label class="input-group-addon" for="password">确认密码</label>
                <input type="password" class="form-control" id="password2"  placeholder="请输入密码">
            </div>
            <div class="form-group input-group">
                <label class="input-group-addon">性别</label>
                <div class="radio">
                    <label class="radio-inline">
                        <input type="radio" value="男" name="sex" checked>男
                    </label>
                    <label class="radio-inline">
                        <input type="radio" value="女"name="sex" >女
                    </label>
                </div>
            </div>
            <button type="submit" class="btn btn-success btn-group-sm">注册</button>
        </form>
    </div>
</div>
</body>
</html>