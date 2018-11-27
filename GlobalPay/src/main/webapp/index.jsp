<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<style type="text/css">
 #pay {
  border: 2px solid black;
  width : 450px;
  padding: 10px;
} 
</style>
</head>
<body>
		<div align="center" class="container-fluid">
		<form id="pay" action="pay" >
			<h1 align="center">Global Payment</h1>
			<div  class="form-group">
				<label for="transactionId">Transaction Id</label> <input type="text" class="form-control"
					 name="transactionId" placeholder="Enter Transaction Id" />
			</div>
			<div class="form-group">
				<label for="ticketNo">Ticket Number</label> <input
					type="text" class="form-control" name="ticketNo"
					placeholder="Enter Ticket No" />
			</div>
			<input type="submit" value="submit" class="btn btn-success" />
				</form>
		</div>
</body>
</html>