<?php
/* $hello = "Hello World!";
echo $hello;
echo "<br><br>";

$num1 = 1;
$num2 = 2;

echo "<br><br><br><br><br><br>"; */

/*$meuarray[] = 8;
$meuarray[] = 4;*/

/*$meuarray = array(8, 4);*/

/*$meuarray = array(0 => 8, 1 => 4);*/

$meuarray = [8, 0];

/*
$meuarray["cão"] = 8;
$meuarray["gato"] = 4;
*/

/* echo "<pre>";
print_r($meuarray);
echo "</pre>";

echo "<br><br>";
echo "Soma do array: " . ($meuarray[0] + $meuarray[1]);
echo "<br>";
echo "Subtração do array: " . ($meuarray[0] - $meuarray[1]);
echo "<br>";
echo "Multiplicação do array: " . ($meuarray[0] * $meuarray[1]);
echo "<br>";

if($meuarray[1] != 0) {
echo "Divisão do array: " . ($meuarray[0] / $meuarray[1]);
} else {
	echo "<b>Não é possível fazer a divisão por 0</b>";
}

echo "<br><br><br><br><br>"; */

/* foreach($dividendos as $dividendo) {
	if ($num % $dividendo == 0) {
		echo "É divisível por " . $dividendo . "<br>";
	} else {
		echo "Não é divisível por " . $dividendo . "<br>";
	}
}

echo "<br><br><br><br><br>";

for ($i = 0; $i < count($dividendos); $i++) {
	if ($num % $dividendos[$i] == 0) {
		echo "É divisível por " . $dividendos[$i] . "<br>";
	} else {
		echo "Não é divisível por " . $dividendos[$i] . "<br>";
	}
}

echo "<br><br><br><br><br>";

$i = 0;

do {
	if ($num % $dividendos[$i] == 0) {
		echo "É divisível por " . $dividendos[$i] . "<br>";
	} else {
		echo "Não é divisível por " . $dividendos[$i] . "<br>";
	}
	$i++;		
} while ($i < count($dividendos));

while ($i < count($dividendos)) {
	if ($num % $dividendos[$i] == 0) {
		echo "É divisível por " . $dividendos[$i] . "<br>";
	} else {
		echo "Não é divisível por " . $dividendos[$i] . "<br>";
	}
	$i++;	
} */

$num = 12;
$dividendos = array(2, 3, 4, 5);

function verificardivisiveis($dividendos, $num) {
	
	$i = 0;
	
	while ($i < count($dividendos)) {
	if ($num % $dividendos[$i] == 0) {
		//$results[$dividendos[$i]] = $num . " é divisível por " . $dividendos[$i] . "<br>";
		$results[] = array( "texto" => $num . " é divisível por " . $dividendos[$i] . "<br>", "numdivisivel" => $dividendos[$i]);
	} else {
		//$results[$dividendos[$i]] = $num . " não é divisível por " . $dividendos[$i] . "<br>";
		$results[] = array( "texto" => $num . " não é divisível por " . $dividendos[$i] . "<br>", "numdivisivel" => $dividendos[$i]);
	}
	$i++;	
	}
	return $results;
	}

$return = verificardivisiveis($dividendos, $num);

/* echo '<pre>';
print_r($return);
echo '</pre>'; */

/* foreach ($return as $res) {
if ($res["numdivisivel"] == 3) {
	echo $res["texto"];
	}
} */

 $divisivel = 5;
 
function turutututu($return, $divisivel) {
	foreach ($return as $res) {
		if ($res["numdivisivel"] == $num) {
			return $res["texto"];
		}
	}
}

$tutu = turutututu($return , $num);

echo $tutu;

exit();

/* if ($num % 2 == 0) {
echo "É divisível por 2 <br>";
} else {
	echo "Não é divisível por 2<br>";
}

if ($num % 3 == 0) {
echo "É divisível por 3 <br>";
} else {
	echo "Não é divisível por 3<br>";
}

if ($num % 4 == 0) {
echo "É divisível por 4 <br>";
} else {
	echo "Não é divisível por 4<br>";
}

if ($num % 5 == 0) {
echo "É divisível por 5 <br>";
} else {
	echo "Não é divisível por 5<br>";
} */

// exit();

echo "<br><br><br><br><br><br>";

echo "Soma: " . ($num1 + $num2) . "<br>";
echo "Subtração: " . ($num1 - $num2) . "<br>";
echo "Multiplicação: " . ($num1 * $num2) . "<br>";
echo "Divisão: " . ($num1 / $num2) . "<br>";
?>