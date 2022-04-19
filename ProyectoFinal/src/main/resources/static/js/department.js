function list(){
	$.ajax({
		type : "post",
		url : "/department/list",
		success : function(response) {
			$("#message").val(response);
		}
	});
}

function select(){
	$.ajax({
		type : "post",
		url : "/department/select",
		data: "dept_no=" + $("#dept_no").val(),
		success : function(response) {
			$("#dept_name").val(response.dept_name);
		}
	});
}

function borrar(){
	$.ajax({
		type : "post",
		url : "/department/borrar",
		data: "dept_no=" + $("#dept_no").val(),
		success : function(response) {
			window.alert("Eliminado OK");
			$("#dept_name").val("");

		}
	});
}

function actualizar(){
	$.ajax({
		type : "post",
		url : "/department/actualizar",
		data: {
			dept_no:$("#dept_no").val(),
			dept_name:$("#dept_name").val()
			},
		success : function(response) {
			if (response == 1) {
				alert("Se actualizó el registro: " + $("#dept_no").val());
				$("#dept_name").val("");
			else {
				alert("Ocurrio un error en la creación");	
				}
			}			
		}
	});
}

function insertar(){
	$.ajax({
		type : "post",
		url : "/department/insertar",
		data: {
			dept_no:$("#dept_no").val(),
			dept_name:$("#dept_name").val()
			},
		success : function(response) {
			if (response == 1) {
				alert("Se insertó el registro: " + $("#dept_no").val());
				$("#dept_name").val("");
				else {
				alert("Ocurrio un error en la creación");	
				}
			}			
		}
	});
}

