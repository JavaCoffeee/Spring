<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC</title>
<script type="text/javascript">
	function call(){
		document.getElementById("downloadFrame").src = "http://localhost:9090/studentimage1/display";
	}
</script>
</head>
<body onload="call()">
<h2>Congratulations..!!File Uploaded Successfully</h2>
<p>${msg}</p>
<h3>Preview : </h3>
<iframe id="downloadFrame" height="1000px" width="100%"></iframe>
</body>
</html>