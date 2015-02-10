<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<script src="js/main.js"></script>
<!-- <script type="text/javascript">
	function call(){
		var id = $("#id").val();
		alert(id);
	}
</script> -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student</title>
</head>
<body>
<form action="add" method="post">
	<table>
		<tr>			
			<td>ID</td>
			<td><input type="text" id="id" name="id"></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><input type="text" id="name" name="name"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="Submit"></td>
			<td><input type="button" value="Validate" onclick="call();"></td>
		</tr>
	</table>
</form>
</body>
</html>