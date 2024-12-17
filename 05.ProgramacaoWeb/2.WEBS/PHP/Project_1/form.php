<!--
Primeiro Nome
Apelido
Email
Confirmaçao de email
data de nascimento
telemovel
-->
<?php
$errors=array();
if($_POST != null){
	//print_r($_POST);
	$firstname=$_POST["firstname"];
	$lastname=$_POST["lastname"];
	$email=$_POST["email"];
	//validaçao primeiro nome
	if(empty($_POST["firstname"])){
		$errors["firstname"] ="O campo é de preenchimento obrigatório";
	}else if(strlen(trim($_POST["firstname"])) < 3){
		$errors["firstname"] = "O campo deve ter pelo menos 3 caracteres";
	}
	//validaçao ultimo nome
	if(empty($_POST["lastname"])){
		$errors["lastname"] ="O campo é de preenchimento obrigatório";
	}else if(strlen(trim($_POST["firstname"])) < 3){
		$errors["lastname"] = "O campo deve ter pelo menos 3 caracteres";
	}
	//validaçao email
	if(empty($_POST["email"])){
		$errors["email"] ="O campo é de preenchimento obrigatório";
	}else if(!$_POST["email"] == @){
		$errors["email"] ="Introduza um email válido";
	}
}
?>




<h1>Formulário</h1>
<form id="form" method="post">
	<fieldset>
		<label for="fname">Primeiro Nome:</label><br>
		<input type="text" name = "firstname" id="firstname" value = "" placeholder="Insira o seu nome"><br>
		<?php if(isset($errors["firstname"])){echo$errors["firstname"]."<br>";} ?>
		
		<label for="lastname">Último Nome:</label><br>
		<input type="text" name = "lastname" id="lastname" value = "" placeholder="Insira o seu apelido"><br>
		<?php if(isset($errors["lastname"])){echo$errors["lastname"]."<br>";} ?>

		<label for="email"> Email: </label><br>
		<input type="text" name = "email" id="email" value = "" placeholder="Insira aqui o seu email"><br>
		<?php if(isset($errors["email"])){echo$errors["email"]."<br>";} ?>

		<label for="email"> Confirmação de Email: </label><br>
		<input type="text" name = "email" id="email" value = "" placeholder="Confirme o seu email"><br>

		<label for="password">Palavra-Passe: </label><br>
		<input type="text" name = "password" id="password" value = "" placeholder="Insira aqui a password"><br>

		<label for="password">Confirmação de Palavra-Passe: </label><br>
		<input type="text" name = "password" id="password" value = "" placeholder="Confirme a password"><br>

		<label for="birthday">Data de Nascimento: </label><br>
		<input type="date" id="birthday" name="birthday"><br>

		<label for="phone">Telemovel: </label><br>
		<input type="tel" id="phone" name="phone" pattern="[0-9]{3}-[0-9]{3}-[0-9]{3}"><br>
		<input type="submit">
	</fieldset>
</form>