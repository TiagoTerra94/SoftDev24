<?php
$firstname = "";
$lastname = "";
$email = "";
$confemail = "";
$phone = "";
$birthdate = "";
$password = "";
$specialChar = "/[!@#$%^&*()_+\-=\[\]{};':\"\\|,.<>\/?]/";
$confpassword = "";
$errors = array();

if ($_POST != null) {

// Define o arquivo JSON
    $jsonFile = 'form_data.json';
// Função modificada para salvar ou atualizar os dados no JSON
    function saveToJsonFile($data, $jsonFile) {
        if (file_exists($jsonFile)) {

// Ler o conteúdo existente
            $existingData = json_decode(file_get_contents($jsonFile), true);
            if (!$existingData) {
                $existingData = [];
            }

// In_array para verificar se o email já existe
            $emailExists = false;
            $emailExists = in_array($data['email'], array_column($existingData, 'email'));

// Se o email já existir, atualiza os dados
            if ($emailExists) {
                foreach ($existingData as $key => $user) {
                    if ($user['email'] === $data['email']) {
                        $existingData[$key] = $data;  // Atualiza os dados
                        break;
                    }
                }
            } else {

// Se o email não existir, adicionar novo registro
                $existingData[] = $data;
            }

// Salvar o array atualizado no arquivo JSON
            file_put_contents($jsonFile, json_encode($existingData, JSON_PRETTY_PRINT));
        } else {

// Se o arquivo não existir, criar um novo e adicionar o primeiro registro
            $newData = [$data];
            file_put_contents($jsonFile, json_encode($newData, JSON_PRETTY_PRINT));
        }
    }

    // Recupera os dados do formulário
    $firstname = $_POST["firstname"];
    $lastname = $_POST["lastname"];
    $email = $_POST["email"];
    $confemail = $_POST["confemail"];
    $phone = $_POST["phone"];
    $birthdate = $_POST["birthdate"];
    $password = $_POST["password"];
    $confpassword = $_POST["confpassword"];

// Validação dos campos
    if (empty($firstname)) {
        $errors["firstname"] = "O campo é obrigatório.<br>";
    } elseif (strlen(trim($firstname)) < 3) {
        $errors["firstname"] = "O campo deve ter pelo menos 3 caracteres.<br>";
    } elseif (preg_match($specialChar, $firstname) || preg_match("/[0-9]/", $firstname)) {
        $errors["firstname"] = "O nome não pode conter números ou caracteres especiais.<br>";
    }
    if (empty($lastname)) {
        $errors["lastname"] = "O campo é obrigatório.<br>";
    } elseif (strlen(trim($lastname)) < 2) {
        $errors["lastname"] = "O campo deve ter pelo menos 2 caracteres.<br>";
    } elseif (preg_match($specialChar, $lastname) || preg_match("/[0-9]/", $lastname)) {
        $errors["lastname"] = "O nome não pode conter números ou caracteres especiais.<br>";
    }

// Validação do email e confirmação do email
    if (empty($email)) {
        $errors["email"] = "O campo é obrigatório.<br>";
    } elseif (strpos($email, "@") === false || strpos($email, ".") === false) {
        $errors["email"] = "Insira um e-mail válido.<br>";
    } elseif (strpos($email, ' ') !== false) {
        $errors["email"] = "O e-mail não pode conter espaços em branco.<br>";
    }
    if (empty($confemail)) {
        $errors["confemail"] = "O campo é obrigatório.<br>";
    } elseif ($email != $confemail) {
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
    } elseif (strlen($password) < 8) {
        $errors["password"] = "A Password deve ter 8 caracteres.<br>";
    } elseif (!preg_match("/[a-z]/", $password)) {
        $errors["password"] = "A password deve ter pelo menos 1 letra minúscula.<br>";
    } elseif (!preg_match("/[A-Z]/", $password)) {
        $errors["password"] = "A password deve ter pelo menos 1 letra maiúscula.<br>";
    } elseif (!preg_match($specialChar, $password)) {
        $errors["password"] = "A password deve ter pelo menos 1 caracter especial.<br>";
    } elseif (strpos($password, ' ') !== false) {
        $errors["password"] = "A password não pode conter espaços em branco.<br>";
    }

// Validação da confirmação da password
    if (empty($confpassword)) {
        $errors["confpassword"] = "O campo é obrigatório.<br>";
    } elseif ($password != $confpassword) {
        $errors["confpassword"] = "A password deve ser igual.<br>";
    }

// Verifica se não há erros e salva no JSON e upload da foto
    if (empty($errors)) {

// Prepare os dados para salvar
        $formData = [
            "firstname" => $firstname,
            "lastname" => $lastname,
            "email" => $email,
            "phone" => $phone,
            "birthdate" => $birthdate,
            "password" => $password
        ];

// Chama a função para salvar os dados no arquivo JSON
        saveToJsonFile($formData, $jsonFile);

// Verificar o upload da foto
        $uploadDir = "uploads/";  // Define o diretório de upload
        if (isset($_FILES["photo"]) && $_FILES["photo"]["error"] == UPLOAD_ERR_OK) {

// Obtém os dados do arquivo enviado
            $fileTmpPath = $_FILES["photo"]["tmp_name"];
            $fileName = $_FILES["photo"]["name"];
            $fileSize = $_FILES["photo"]["size"];
            $fileType = $_FILES["photo"]["type"];
            $fileExtension = strtolower(pathinfo($fileName, PATHINFO_EXTENSION));
            $allowedExtensions = array("jpg", "jpeg", "png", "gif");

// Verifica se a extensão do arquivo é permitida
            if (!in_array($fileExtension, $allowedExtensions)) {
                $errors["photo"] = "Formato de arquivo não permitido. (Use JPG, JPEG, PNG ou GIF.)";
            } else {

// Gera um nome único para o arquivo
                $newFileName = "photo_" . "." . time() . "." . $fileExtension;
                $destPath = $uploadDir . $newFileName;

// Move o arquivo para o diretório de upload
                if (move_uploaded_file($fileTmpPath, $destPath)) {
                    echo "<p style='color: green;'>Foto carregada com sucesso!</p>";
                } else {
                    $errors["photo"] = "Erro ao salvar o arquivo.";
                }
            }
        } else {
            $errors["photo"] = "Nenhuma foto foi carregada ou ocorreu um erro no upload.";
        }

// Exibe mensagens de sucesso ou erro
        if (empty($errors)) {
            echo "<p style='color: green;'>Formulário enviado com sucesso!</p>";
        }
    }
}

?>
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
        <br><input type="submit" value="Enviar">
    </fieldset>
</form>