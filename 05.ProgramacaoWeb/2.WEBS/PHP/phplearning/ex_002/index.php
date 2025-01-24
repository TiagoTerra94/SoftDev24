<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Exemplo de PHP</h1>
    <?php
        date_default_timezone_set("Europe/London"); //GMT 0
        echo "Hoje é dia " . date("d/M/Y");//dia, mes, ano
        echo " e a hora atual é " . date("G:i:s T"); //código pré-processado, só o resultado é enviado para o Cliente
    ?>

</body>
</html>