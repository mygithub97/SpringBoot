<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
<style>

	#stadium{
		height: 870px;
		width: 870px;
		background-image: url('stadium.jpeg');
		text-align: center;
		
	}
	
	
</style>

</head>

<body>
	Welcome <s:property value = "uid"/>
	<div id = "stadium" >
	
		<iframe width="560" height="315" src="https://www.youtube.com/embed/WTJSt4wP2ME" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
		
	</div>
	
	
</html>