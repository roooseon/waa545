function checkPassword(form) { 
	var password  = form[form.id + ":password"].value;
	var confirmPassword = form[form.id + ":passwordConfirm"].value;

	if (password == confirmPassword) {
     			form.submit();
      
    } else {
		alert("password and confirm password should be match");	
    } 
}
