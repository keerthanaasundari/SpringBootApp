<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<body>
  Welcome to HackerRank
<form action="/signIn" method="post" modelAttribute="User">
<input name="userName" placeholder="UserName" type="text" /> <br>
<input name="Password" placeholder="Password" type="password"/> <br>
<input type="submit" value="Sign In">
<a href="/registerUp"> Sign Up</a>

</form>
</body>
</html>