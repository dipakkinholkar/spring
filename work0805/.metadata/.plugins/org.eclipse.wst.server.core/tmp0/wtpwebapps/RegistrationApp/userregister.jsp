<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600' rel='stylesheet' type='text/css'>
<link href="style.css" rel="stylesheet">
</head>
<body>


<div class="testbox">
  <h1>Registration</h1>

<a href="userlogin.jsp" >login</a>

  <form action="UserRegistrationServlet" method="post">
 <hr>
    <div class="accounttype">
    
      <input type="radio" value="personal"  id="radioOne" name="account" checked/>
      <label for="radioOne" class="radio" chec>Personal</label>
      <input type="radio"  value="company" id="radioTwo" name="account" />
      <label for="radioTwo" class="radio">Company</label>
    </div>
  <hr>
  
  <label id="icon" for="name"><i class="icon-envelope "></i></label>
  <input type="text" name="useremail" id="name" placeholder="Email" required/>
  
  <label id="icon" for="name"><i class="icon-user"></i></label>
  <input type="text" name="username" id="name" placeholder="Name" required/>
  
  <label id="icon" for="name"><i class="icon-shield"></i></label>
  <input type="password" name="password" id="name" placeholder="Password" required/>
  
  <div class="gender">
    <input type="radio"  value ="male" id="male" name="gender" checked/>
    <label for="male" class="radio" chec>Male</label>
    <input type="radio" value="female" id="female" name="gender" />
    <label for="female"  class="radio">Female</label>
  </div> 
   <p>By clicking Register, you agree on our <a href="#">terms and condition</a>.</p>
  
  <input type="submit" value="submit">
  
<!--    <a href="" class="button">Register</a> -->
  </form>
</div>

</body>
</html>