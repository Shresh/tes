<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/jquery-1.12.3.min.js"></script>
<title>Datum</title>
</head>
<body>
<button onclick="showZones()">Get zones</button> &nbsp <button onclick="showDistricts()">Get districts</button> &nbsp <button onclick="showBoth()">Get both</button><br/>
<select id = "zoneJSON"><option>Select zone</option> </select> &nbsp <select id = "districtJSON"><option>Select district</option> </select>
</body>
<script type="text/javascript">	
		function showZones(){
			$.ajax({
				type : "GET",
				contentType : "application/json",
				url : "api/rest/zone"
			}).then(function(data){
				$.each(data, function(key, value){
					$("#zoneJSON").append($('<option></option>').html(value.zone));
				});
			});
			
		}	
		function showDistricts(){
			$.ajax({
				type : "GET",
				contentType : "application/json",
				url : "api/rest/district"
			}).then(function(data){
				$.each(data, function(key, value){
					$("#districtJSON").append($('<option></option>').html(value.district));
				});
			});
			
		}		

		function showBoth(){
			$.ajax({
				type : "GET",
				contentType : "application/json",
				url : "api/rest/zone",
				success: function(data){
					$.each(data, function(key, value){
						$("#zoneJSON").append($('<option></option>').html(value.zone));
					});					
				}
			});

			$.ajax({
				type : "GET",
				contentType : "application/json",
				url : "api/rest/district",
				success: function(data){
					$.each(data, function(key, value){
						$("#districtJSON").append($('<option></option>').html(value.district));
					});					
				}
			});
		}
	</script>
</html>