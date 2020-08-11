 function verifyLoginForm(){
 
	
 	/*
 	var ID = document.getElementById("uid").value;
 	var passwd = document.getElementById("pwd").value;
	*/
	
	var ID = $("#uid").val();
	var passwd= $("#pwd").val();
 	
 	
 	if ((ID == "") || (passwd == ""))
	{
 		alert("user ID or password is blank");
		/*
 		document.getElementById("uid").style = "background:red";
 		document.getElementById("pwd").style = "background:red";		
		*/
		$("#uid").css("border-color","red");
		$("#pwd").css("border-color", "red");
		$("#pics").fadeOut(3000);
	}
	
	else
	{
		$("#pics").fadeIn(3000);
		$("#uid").css("border-color", "green");
		$("#pwd").css("border-color", "green");
		
	}
	
	/*
	if(ID.indexOf("@") == -1)
	{
		alert("invalid userID");
	}
	*/
	
		
	}
	
 
 function abc(){
 	alert("login clicked");
 }
 
