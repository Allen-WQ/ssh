<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="../jquery/jquery-3.3.1.min.js"></script>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<script type="text/javascript">

function ajaxFun(){
	
	$.post("json/getJsonData",{name:'zanfsan'},
			function(data){
			$(".len").text(data.len);
			$(".str").text(data.str);
			for(var i=0;i<data.list.length;i++){
				$(".list").append(data.list[i]);
			}
				$(".map").append(data.map.zhnagsan);
				
	});
}
</script>
</head>
<body>
<div class="context">
	<form action="loginSubmit" method="post">
		user:<input type="text" name="dog.name"/>
		password:<input type="text" name="dog.age"/>
		<input type="submit" value="login" />
		<input type="button" value="ajax" onclick="ajaxFun()"/>
	</form>
	<br>
	len
	<p class="len">${len }</p>
	str
	<p class="str">${str}</p>
	list
	<p class="list">${list[0] }</p>
	map
	<p class="map">${map.zhnagsan }</p>
	<p>jstl标签</p>
	
	<c:forEach items="${list }" var ="item">
		${item}
	</c:forEach>
	<c:forEach items="${map }" var ="item">
		${item.key}+${item.value }
	</c:forEach>
</div>
</body>
</html>