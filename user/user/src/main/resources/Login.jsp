<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<body>
  Welcome to HackerRank
<form action="/login/dashboard" method="get" modelAttribute="User">
<input name="userName" placeholder="UserName" type="text" /> 
<input name="Password" placeholder="Password" type="password"/> 
<input type="submit" value="Sign In">
</form>
</body>
</html>