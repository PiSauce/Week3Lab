<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            First:<input type="tex" name="first" value="${first}"></br>
            Second:<input type="tex" name="second" value="${second}"></br>
            <input type="submit" name="type" value="+">
            <input type="submit" name="type" value="-">
            <input type="submit" name="type" value="*">
            <input type="submit" name="type" value="%">
        </form>
            
        <p>Result: ${message}</p>
        <a><a href="age">Age Calculator</a>
    </body>
</html>
