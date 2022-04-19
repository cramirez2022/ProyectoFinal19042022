function list(){
	$.ajax({
		type : "post",
		url : "/titletype/list",
		success : function(response) {
			$("#message").val(response);
		}
	});
}