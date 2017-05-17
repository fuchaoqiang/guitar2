<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Rick'Guitar Shop</title>
</head>
<body>
      <form action="searchGuitar" method="get">
      <div class="container">
            <div class="row">
		        
			         <h2 class="text-center">
				          Guitar Search
			          </h2>
		
	   </div>
	   
	   <div class="row-fuid">
	    
	        <div class="col-md-6">
				<lable>builder&nbsp;&nbsp;&nbsp;</lable>
				<input id="builder" type="text" name="builder"><br/>
				<lable>model</lable>
				<input id="model" type="text" name="model"><br/>
				<lable>type&nbsp;&nbsp;&nbsp;&nbsp;</lable>
				<input id="type" type="text" name="type"><br/>
				<lable>numStrings</lable>
				<input id="numStrings" type="text" name="numStrings"><br/>
				<lable>topwood&nbsp;&nbsp;&nbsp;</lable>
				<input id="topwood" type="text" name="topwood"><br/>
				<lable>backwood&nbsp;&nbsp;&nbsp;</lable>
				<input id="backwood" type="text" name="backwood"><br/>
				<button type="submit"  id="search" value="搜索">
		     </div>
		         
</body>
</html>