<%@ page language="Java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Temario ARTEMISA</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script src="http://code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
<script
	src="https://cdn.datatables.net/1.10.9/js/jquery.dataTables.min.js"></script>
<link rel="stylesheet"
	href="http://cdn.datatables.net/1.10.9/css/jquery.dataTables.min.css" />
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.11.4/themes/flick/jquery-ui.css">

<script>
	var saveme = $.ajax({
		type : "POST",
		url : "http://localhost:8080/listarTemario", //nombre del archivo php que consultaremos.

		success : function(data) {
			$.each(data, function(i, item) {
				lista = document.getElementById("myTable");
				var tr = document.createElement("tr");
				var columna1 = document.createElement("th")
				columna1.innerHTML = item.id;
				var columna2 = document.createElement("th")
				columna2.innerHTML = item.tema;
				var columna3 = document.createElement("th")
				columna3.innerHTML = item.texto;
				var columna4 = document.createElement("code")
				columna4.innerHTML = item.java;
				

				lista.appendChild(tr);
				tr.appendChild(columna1);
				tr.appendChild(columna2);
				tr.appendChild(columna3);
				tr.appendChild(columna4);

			});
		}
	});
</script>


</head>
<body>

<nav class="navbar navbar-dark bg-dark">
  <div class="container-fluid">
    <span class="navbar-brand mb-0 h1">Ejemplo Ciclo 3</span>
  </div>
</nav>
<div class="container">

	<table id="tabla" class="table">
		<thead>
			<tr>
				<th>ID</th>
				<th>TEMA</th>
				<th>TEXTO</th>
				<th>JAVA</th>
			</tr>
		</thead>
		<tbody id="myTable">
		</tbody>
	</table>
	</div>
	
	<script src="https://{{cdn}}/prism@v1.x/components/prism-core.min.js"></script>
	<script src="https://{{cdn}}/prism@v1.x/plugins/autoloader/prism-autoloader.min.js"></script>
</body>
</html>