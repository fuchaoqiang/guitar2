<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Result</title>
</head>
<body>
<h1>搜索结果</h1>
      <div class="reta">
			<table class="table">
				<thead>
					<tr>
						<th>
							type
						</th>
						<th>
							price
						</th>
						<th>
							builder
						</th>
						<th>
							backwood
						</th>
						<th>
							topwood
						</th>
					</tr>
				</thead>
				</table>
				</div>
  <table>
		<c:forEach var="SearchGuitar" items="${requestScope.theGuitars}">	             
		               <tr>
		               <td>${SearchGuitar.spec.type}</td>
		               <td>${SearchGuitar.spec.price}</td>
		               <td>${SearchGuitar.spec.builder}</td>
		               <td>${SearchGuitar.spec.backwood}</td>
		               <td>${SearchGuitar.spec.topwood}</td>      
		               </tr>
		</c:forEach>
		  </table>  
</body>
</html>