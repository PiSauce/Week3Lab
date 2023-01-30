<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="getAge" method="post">
            Enter your age:<input type="tex" name="age" value="${age}"></br>
            <input type="submit" value="Submit">
        </form>
    </body>
</html>
