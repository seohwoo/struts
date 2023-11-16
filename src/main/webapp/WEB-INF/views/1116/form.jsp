<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>form.jsp</title>
    </head>
    <body>
    	<form action="/struts/pro.action">
    		name : <input type="text" name="name" /> <br />
    		number : <input type="text" name="number" /> <br />
    		<input type="submit" value="전송" />
    	</form>
    </body>
</html>
