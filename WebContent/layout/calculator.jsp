<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Vanessa's calculator</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">

</head>
<body>

<h1> Hello welcome on vanessa's calculator</h1>

<br><br>

<div class="formulaire">

	<form  method="post" action="Calculator">
		
		<div class="case"> 
			<label for="numberone"> Firstly please enter a first number </label>
			<br>
			<input type="text" id="numberone" name="numberone"/>	
		</div>	
		<br>
		<div class="case">
			<label for="numbertwo">Then enter a second number </label>
			<br>
			<input type="text" id="numbertwo" name="numbertwo"/>
		</div>		
		<br>	
			
		<div class="case operator"> 
		<label for="operation" > Finally select an operator</label>		
		<br> <br>
		<button type="submit" name="addition" value="addition"> + </button>
		<button type="submit" name="substraction" value="addition"> - </button>
		<button type="submit" name="multiplication" value="addition"> * </button>
		<button type="submit" name="division" value="division"> / </button>
		</div>			
		
		<div class="case">
		<br><br>
		  <c:if test="${ !empty choix }"><p><c:out value="The result is : ${ choix }" /> </p> </c:if>
		<br>
		</div> 
							
					
	</form> 
	
</div>

</body>
</html>