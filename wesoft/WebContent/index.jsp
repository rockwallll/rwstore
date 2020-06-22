<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=uft-8">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Insert title here</title>
<style>
th, tr, td, table {
	border: 1px solid red;
}
</style>
</head>
<body>
	<table>
		<tr>
			<th>cname</th>

		</tr>
 
		<c:forEach items="${key_list}" var="usr" varStatus="idx">
        <tr>
			<td>${usr.cname}
				
			
			</td> 
		</tr>
		</c:forEach>
	</table>
 
</body>
</html>