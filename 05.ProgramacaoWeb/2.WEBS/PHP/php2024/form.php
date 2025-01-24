<?php

$firstname = "";
$lastname = "";
$email = "";
$confemail = "";
$phone = "";
$birthdate = "";
$password = "";
$confpassword = "";
$specialChar = "/[!@#$%^&*()_+\-=\[\]{};':\"\\|,.<>\/?]/";

$errors = array();

$jsonFile = "form_data.json";

function saveToJsonFile($data, $jsonFile)
{

    if (file_exists($jsonFile)) {

        $existingData = json_decode(file_get_contents($jsonFile), true);
        if (!$existingData) {
            $existingData = [];
        }

        $emailExists = in_array($data['email'], array_column($existingData, 'email'));

        if ($emailExists) {
            foreach ($existingData as $key => $user) {
                if ($user['email'] === $data['email']) {
                    $existingData[$key] = $data;
                    break;
                }
            }
        } else {

            $existingData[] = $data;
        }

        file_put_contents($jsonFile, json_encode($existingData, JSON_PRETTY_PRINT));

    } else {

        $newData = [$data];
        file_put_contents($jsonFile, json_encode($newData, JSON_PRETTY_PRINT));
    }
}

if ($_POST != null) {

    $firstname = $_POST["firstname"];
    $lastname = $_POST["lastname"];
    $email = $_POST["email"];
    $confemail = $_POST["confemail"];
    $phone = $_POST["phone"];
    $birthdate = $_POST["birthdate"];
    $password = $_POST["password"];
    $confpassword = $_POST["confpassword"];

    // Validação do nome e sobrenome
    if (empty($firstname)) {
        $errors["firstname"] = "O campo é obrigatório.<br>";
    } else if (strlen(trim($firstname)) < 3) {
        $errors["firstname"] = "O campo deve ter pelo menos 3 caracteres.<br>";
    } else if (preg_match($specialChar, $firstname) || preg_match("/[0-9]/", $firstname)) {
        $errors["firstname"] = "O nome não pode conter números ou caracteres especiais.<br>";
    }

    if (empty($lastname)) {
        $errors["lastname"] = "O campo é obrigatório.<br>";
    } else if (strlen(trim($lastname)) < 2) {
        $errors["lastname"] = "O campo deve ter pelo menos 2 caracteres.<br>";
    } else if (preg_match($specialChar, $lastname) || preg_match("/[0-9]/", $lastname)) {
        $errors["lastname"] = "O nome não pode conter números ou caracteres especiais.<br>";
    }

    // Validação do e-mail e confirmação do e-mail
    if (empty($email)) {
        $errors["email"] = "O campo é obrigatório.<br>";
    } else if (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
        $errors["email"] = "Insira um e-mail válido.<br>";
    } else if (strpos($email, ' ') !== false) {
        $errors["email"] = "O e-mail não pode conter espaços em branco.<br>";
    }

    if (empty($confemail)) {
        $errors["confemail"] = "O campo é obrigatório.<br>";
    } else if ($email != $confemail) {
        $errors["confemail"] = "O e-mail deve ser igual.<br>";
    }

    // Validação do telefone
    if (empty($phone)) {
        $errors["phone"] = "O campo é obrigatório.<br>";
    } else {
        $length = strlen($phone);
        if ($length != 9 && $length != 12 && $length != 14) {
            $errors["phone"] = "O campo deve ter 9, 12 ou 14 caracteres, exatamente.<br>";
        } else {
            if (!preg_match("/^\d+$/", $phone)) {
                $errors["phone"] = "O número de telefone deve conter apenas números.<br>";
            } else {
                switch ($length) {
                    case 9:
                        if ($phone[0] != '9') {
                            $errors["phone"] = "Número de telemóvel deve começar por 9.<br>";
                        }
                        break;
                    case 12:
                        if ($phone[3] != '9') {
                            $errors["phone"] = "Número de telemóvel deve começar por 9.<br>";
                        }
                        break;
                    case 14:
                        if ($phone[5] != '9') {
                            $errors["phone"] = "Número de telemóvel deve começar por 9.<br>";
                        }
                        break;
                    default:
                        $errors["phone"] = "O campo deve ter 9, 12 ou 14 caracteres, exatamente.<br>";
                        break;
                }
            }
        }
    }

    // Validação da data de nascimento
    if (empty($birthdate)) {
        $errors["birthdate"] = "O campo é obrigatório.<br>";
    } else {
        $birthdateobj = new DateTime($birthdate);
        $today = new DateTime();
        $difBirthday = $birthdateobj->diff($today);
        $myage = $difBirthday->y;
        if ($myage < 18 || $myage > 120) {
            $errors["birthdate"] = "A idade deve ser maior que 18 e menor que 120 anos.<br>";
        }
        if ($birthdateobj > $today) {
            $errors["birthdate"] = "A data de nascimento não pode ser no futuro.<br>";
        }
    }

    // Validação da password
    if (empty($password)) {
        $errors["password"] = "O campo é obrigatório.<br>";
    } else if (strlen($password) < 8) {
        $errors["password"] = "A Password deve ter 8 caracteres.<br>";
    } else if (!preg_match("/[a-z]/", $password)) {
        $errors["password"] = "A password deve ter pelo menos 1 letra minúscula.<br>";
    } else if (!preg_match("/[A-Z]/", $password)) {
        $errors["password"] = "A password deve ter pelo menos 1 letra maiúscula.<br>";
    } else if (!preg_match($specialChar, $password)) {
        $errors["password"] = "A password deve ter pelo menos 1 caracter especial.<br>";
    } else if (strpos($password, ' ') !== false) {
        $errors["password"] = "A password não pode conter espaços em branco.<br>";
    }

    if (empty($confpassword)) {
        $errors["confpassword"] = "O campo é obrigatório.<br>";
    } else if ($password != $confpassword) {
        $errors["confpassword"] = "A password deve ser igual.<br>";
    }

    // Guarda a foto na pasta uploads e guarda os dados no JSON
    if (empty($errors)) {

        $uploadDir = "uploads/";
        if (isset($_FILES["photo"]) && $_FILES["photo"]["error"] == UPLOAD_ERR_OK) {

            $fileTmpPath = $_FILES["photo"]["tmp_name"];
            $fileName = $_FILES["photo"]["name"];
            $fileSize = $_FILES["photo"]["size"];
            $fileType = $_FILES["photo"]["type"];
            $fileExtension = strtolower(pathinfo($fileName, PATHINFO_EXTENSION));
            $allowedExtensions = array("jpg", "jpeg", "png", "gif");

            if (!in_array($fileExtension, $allowedExtensions)) {
                $errors["photo"] = "Formato de arquivo não permitido. (Use JPG, JPEG, PNG ou GIF.)";
            } else {

                $newFileName = "photo_" . "." . time() . "." . $fileExtension;
                $destPath = $uploadDir . $newFileName;

                move_uploaded_file($fileTmpPath, $destPath);
            }
        } else {
            $errors["photo"] = "Nenhuma foto foi carregada ou ocorreu um erro no upload.";
        }

        if (empty($errors)) {
            $formData = $_POST;

            unset($formData["confpassword"], $formData["confemail"]);
            $formData["image"] = $destPath;

            saveToJsonFile($formData, $jsonFile);

            echo "<p style='color: green;'>Formulário enviado com sucesso!</p>";
        }
    }
}

?>

    <!DOCTYPE html>
    <html lang="pt-BR">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Projeto PHP com CSS</title>
        <!-- Link para o CSS -->
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="css/style.css">
    </head>

<body id="body">
    <h1>FORMULÁRIO</h1>

    <form id="myform" method="post" action="" enctype="multipart/form-data">
        <fieldset>
            <label for="firstname">Nome:</label><br>
            <input type="text" id="firstname" name="firstname" value="<?php echo $firstname; ?>"><br>
            <?php if (isset($errors["firstname"])) {
                echo $errors["firstname"];
            } ?>
            <br><label for="lastname">Sobrenome:</label><br>
            <input type="text" id="lastname" name="lastname" value="<?php echo $lastname; ?>"><br>
            <?php if (isset($errors["lastname"])) {
                echo $errors["lastname"];
            } ?>
            <br><label for="email">E-mail:</label><br>
            <input type="text" id="email" name="email" value="<?php echo $email; ?>"><br>
            <?php if (isset($errors["email"])) {
                echo $errors["email"];
            } ?>
            <br><label for="confemail">Confirmar e-mail:</label><br>
            <input type="text" id="confemail" name="confemail" value="<?php echo $confemail; ?>"><br>
            <?php if (isset($errors["confemail"])) {
                echo $errors["confemail"];
            } ?>
            <br><label for="phone">Telefone:</label><br>
            <input type="text" id="phone" name="phone" value="<?php echo $phone; ?>"><br>
            <?php if (isset($errors["phone"])) {
                echo $errors["phone"];
            } ?>
            <br><label for="birthdate">Data de Nascimento:</label><br>
            <input type="date" id="birthdate" name="birthdate" value="<?php echo $birthdate; ?>"><br>
            <?php if (isset($errors["birthdate"])) {
                echo $errors["birthdate"];
            } ?>
            <br><label for="password">Password:</label><br>
            <input type="password" id="password" name="password" value="<?php echo $password; ?>"><br>
            <?php if (isset($errors["password"])) {
                echo $errors["password"];
            } ?>
            <br><label for="confpassword">Confirmar password:</label><br>
            <input type="password" id="confpassword" name="confpassword" value="<?php echo $confpassword; ?>"><br>
            <?php if (isset($errors["confpassword"])) {
                echo $errors["confpassword"];
            } ?>
            <br><label for="photo">Fotografia:</label>
            <input type="file" id="photo" name="photo"><br>
            <?php if (isset($errors["photo"])) {
                echo $errors["photo"];
            } ?>
            <br>
            <br><input type="submit" value="Enviar">
        </fieldset>
    </form>

<?php

if (file_exists($jsonFile)) {

    $data = json_decode(file_get_contents($jsonFile), true);

    $linha = isset($_GET['linha']) ? (int)$_GET['linha'] : -1;
    if (isset($_GET['action']) && $_GET['action'] == 'delete') {
        if (isset($data[$linha-1])) {
            unset($data[$linha-1]);
            $data = array_values($data);
            file_put_contents($jsonFile, json_encode($data, JSON_PRETTY_PRINT));
        }
    }

    if (!empty($data)) { ?>

        <br>
        <br>
        <hr>
        <br>
        <br>
        <h2>DADOS</h2>
        <table border='1' style='margin-top: 20px;' id="table">
            <tr>
                <th>Nome</th>
                <th>Apelido</th>
                <th>E-mail</th>
                <th>Telefone</th>
                <th>Data de Nascimento</th>
                <th>Foto</th>
            </tr>

            <?php

            foreach ($data as $key => $user) {

            if ($linha - 1 == $key || $linha == -1) {
            ?>
            <tr>
                <td><?php echo $user['firstname']; ?></td>
                <td><?php echo $user['lastname']; ?></td>
                <td><?php echo $user['email']; ?></td>
                <td><?php echo $user['phone']; ?></td>
                <td><?php echo $user['birthdate']; ?></td>
                <td>
                    <?php if (file_exists($user["image"])) { ?>
                        <a href='<?php echo $user["image"]; ?>'>
                            <img src='<?php echo $user["image"]; ?>' alt='<?php echo $user["firstname"]; ?>'
                                 style='width: 50px; height: 50px;'>
                        </a>
                    <?php } else { ?>
                        <p>Foto não encontrada</p>
                    <?php } ?>
                </td>
                <?php
                if ($linha == $key) {
                    break;
                }
                }
                } ?>
        </table>
    <?php } else {
        echo "<p>Nenhum dado encontrado no arquivo.</p>";
    }
} else {
    echo "<p>Arquivo JSON não encontrado.</p>";
}

?>
<h5>Desenvolvido por Rúben Pereira, Rui Cruz e Tiago Terra</h5>
</body>
</html>
