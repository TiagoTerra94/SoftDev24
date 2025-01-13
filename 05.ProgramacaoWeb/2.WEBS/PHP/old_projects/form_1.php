<?php
$primeironome = "";
$apelido = "";
$email= "";
$confirmaremail = "";
$telemovel = "";
$today = date("Y-m-d");

$errors=array();
if ($_POST != null) {
    $first_name = $_POST['primeironome'];
    $apelido = $_POST["apelido"];
    $email = $_POST["email"];
    $confirmaremail = $_POST["confirmaremail"];
    $telemovel = $_POST['telemovel'];

    print_r($_POST);
    if (empty($_POST['primeironome'])) {
        $errors['primeironome'] = "Campo obrigatório";
    } elseif (strlen(trim($_POST['primeironome'])) < 3 || strlen(trim($_POST['primeironome'])) > 30) {
        $errors['primeironome'] = "O nome deve ter pelo menos entre 3 e 30 caracteres";
    }

    if (strlen(trim($_POST['apelido'])) < 3 || strlen(trim($_POST['apelido'])) > 30) {
        $errors["apelido"] = "O nome deve ter entre pelo menos 3 e 30 caracteres";
    } elseif (empty($_POST['apelido'])) {
        $errors['apelido'] = "Campo obrigatório";
    }

    if (strpos($_POST['email'], "@") === false || strpos($_POST['email'], ".") === false) {
        $errors['email'] = "Deve inserir um email válido";
    }else if(empty($_POST['email'])) {
        $errors['email'] = "Campo obrigatório";
    }

    if($_POST['email'] != $_POST['confirmaremail']) {
        $errors['confirmaremail'] = "O email não corresponde ao inserido";
    }elseif(empty($_POST['confirmaremail'])) {
        $errors['confirmaremail'] = "Campo obrigatório";
    }

    if(strlen(trim($_POST['datanascimento'])) !=8){
        $errors['datanascimento'] = "Data de nascimento inválida.";
    }elseif (empty($_POST['datanascimento'])){
        $errors['datanascimento'] = "Campo obrigatório";
    }elseif (strlen(trim($_POST)))

    if(strlen(trim($_POST['telemovel'])) != 6){
        $errors['telemovel'] = "Deve inserir um número de telemóvel válido.";
    }elseif (empty($_POST['telemovel'])){
        $errors['telemovel'] = "Campo obrigatório";
    }

}
?>

<br><h1 align="center">Formulario de Registo</h1><br><br>
<form id="form" method="post">
    <fieldset>
        <legend>Primeiro Nome</legend>
        <label for="nome"></label><input type="text" name="primeironome" id="primeironome" value=" "
                                         placeholder="Insira o seu Nome"><br> <?php if (isset($errors["primeironome"])) {
            echo $errors["primeironome"];
        } ?></fieldset>
    <fieldset>
        <legend>Apelido</legend>
        <label for="apelido"></label><input type="text" name="apelido" id="apelido" value=" "
                                            placeholder="Insira o seu Apelido"><br> <?php if (isset($errors["apelido"])) {
            echo $errors["apelido"];
        } ?></fieldset>
    <fieldset>
        <legend>Email</legend>
        <label for="email"></label><input type="text" name="email" id="email" value=" "
                                          placeholder="Insira o seu Email"><br> <?php if (isset($errors["email"])) {
            echo $errors["email"];
        } ?></fieldset>
    <fieldset>
        <legend>Confirme Email</legend>
        <label for="confirmaremail"></label><input type="text" name="confirmaremail" id="confirmaremail" value=" "
                                                   placeholder="Confirme o seu email"><br><?php if (isset($errors["confirmaremail"])) {
            echo $errors["confirmaremail"];
        } ?></fieldset>
    <fieldset>
        <legend>Data de Nascimento</legend>
        <label for="datanascimento"></label><input type="date" name="datanascimento" id="datanascimento" value=" "
                                                   placeholder="Insira a sua data de nascimento"><br></fieldset>
    <fieldset>
        <legend>Numero de Telemovel</legend>
        <label for="telemovel"></label><input type="text" name="telemovel" id="telemovel" value=" "
                                              placeholder="Insira o seu numero de telemovel"><br><?php if (isset($errors["telemovel"])) {
            echo $errors["telemovel"];
        } ?></fieldset>
    <input type="submit" value="Enviar"><br>
</form>
