<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
<script type="text/javascript" src="/static/js/do.js"></script>
</head>
<title>Home</title>
<body>
<h2>Hello ${hello.name}!</h2>
<fmt:message key="welcome.title"/>
<div>From ${user1.name}</div>
<div>and ${bob.name}</div>
<div>and ${sessionScope['scopedTarget.jeff'].name}</div>
<div>
You appear to be using the following browser:<br>
${header["user-agent"]}
</div>
</body>
</html>
