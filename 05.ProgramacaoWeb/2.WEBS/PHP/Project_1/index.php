
<?php

//Isto é um comentário 
$ola = "Hello World";
echo $ola;
echo "<br>";

$numeroum = 4;
$numerodois = 8;
echo "<br>";

/*
echo "A soma dos numeros é: ".$numeroum + $numerodois."<br>";

echo "A substração dos numeros é: ".$numeroum - $numerodois."<br>";

echo "A divisão dos numeros é: ".$numeroum / $numerodois."<br>"; 

echo "A multiplicação dos numeros é: ".$numeroum * $numerodois;

echo "<br><br><br>";

$meuarray[] = 8;
$meuarray[] = 0;

//formas de criar array
//$meuarray = array(0 =>8, 1 => 0);
//$meuarray = array(8, 0);
//$meuarray ["gato"] = 5; recomendo
//$meuarray("gato" => 6, "cao" => 7); recomendado
//$meuarray = array(8,0); 

echo"<pre>";
print_r($meuarray);
echo "</pre>";
//exit();

echo "O resultado da soma do array é: ".$meuarray[0] + $meuarray[1]."<br>";
echo "O resultado da subtraçao do array é: ".$meuarray[0] - $meuarray[1]."<br>";
echo "O resultado da multiplicação do array é: ".$meuarray[0] * $meuarray[1]."<br>";

if($meuarray[1]!= 0){
echo "O resultado da divisao do array é: ".$meuarray[0] / $meuarray[1]."<br>";    
}else{
	echo "Não é possível fazer a divisão por zero!";
}*/

//O numero 12 é divisivel por 2,3,4,5
$num = 12;

$dividendos = array(2,3,4,5);

//verificardivisiveis($dividendos,$numero);

$return = verificardivisiveis($dividendos,$num);


$divisivel = 3;
$res_text = " ";

//nesta operaçao ele ve em cada pos e procura pelo valor e depois imprime o que esta nesse valor
foreach($return as $res){
	if($res["numdivisivel"]==$divisivel){
		echo $res["text"];
	}
}
exit();

echo "<pre>";
print_r($return);
echo "</pre>";

/*operação usando o for each
foreach($dividendos as $dividendo){
	if($num%$dividendo == 0){
		echo "O número ".$num. " é divisivel por ".$dividendo."<br>";
	}else{
		echo "O ".$num." não é divisivel por ".$dividendo."<br>";
	}
}

echo "<br>";
echo "<br>";
echo "<br>";

//operação usando for 
for($i = 0; $i < count($dividendos); $i++ ){
	if($num%$dividendos[$i] == 0){
		echo "O número ".$num. " é divisivel por ".$dividendos[$i]."<br>";
	}else{
		echo "O ".$num." não é divisivel por ".$dividendos[$i]."<br>";
	}
}

echo "<br>";
echo "<br>";
echo "<br>";
*/
/*operação usando while

// $i=0;
// while($i < count($dividendos)){
	// if($num%$dividendos[$i] == 0){
		// echo "O número ".$num. " é divisivel por ".$dividendos[$i]."<br>";
	// }else{
		// echo "O ".$num." não é divisivel por ".$dividendos[$i]."<br>";
	// }
	// $i++;
 }*/
/*operação usando do while
do{
	if($num%$dividendos[$i] == 0){
		echo "O número ".$num. " é divisivel por ".$dividendos[$i]."<br>";
	}else{
		echo "O ".$num." não é divisivel por ".$dividendos[$i]."<br>";
	}
	$i++;
}while($i < count($dividendos));

exit();

if(12 % 2 == 0){
	echo "O número ".$num. " é divisivel por 2"."<br>";
}

if(12 % 3 == 0){
	echo "O número ".$num. " é divisel por 3"."<br>";
}

if(12 % 4 == 0){
	echo "O número ".$num. " é divisel por 4"."<br>";
}

if(12 % 5 == 0){
	echo "O número ".$num. " é divisel por 5"."<br>";
}else{
	echo "O numero ".$num. " nao é divisel por 5";
}*/	
/*operação function 
function verificardivisiveis($dividendos, $num){
	$i=0;
	while($i < count($dividendos)){
		if($num%$dividendos[$i] == 0){
			$results[$dividendos[$i]]= "O número ".$num. " é divisivel por ".$dividendos[$i]."<br>";
		}else{
			$results[$dividendos[$i]]= "O ".$num." não é divisivel por ".$dividendos[$i]."<br>";
		}
		$i++;
	}
	return $results;
}
*/
//operação function com varios arrays
function verificardivisiveis($dividendos, $num){
	$i=0;
	while($i < count($dividendos)){
		if($num%$dividendos[$i] == 0){
			$results[]= array("text" => "O número ".$num. " é divisivel por ".$dividendos[$i]."<br>",
			"numdivisivel" => $dividendos[$i]);
		}else{
			$results[]= array("text" => "O número ".$num. " não é divisivel por ".$dividendos[$i]."<br>",
			"numdivisivel" => $dividendos[$i]);
		}
		$i++;
	}
	return $results;
}

//operaçao com variavel aplicada na funçao
function devolvetexto($return,$divisivel){
	foreach($return as $res){
		if($res["numdivisivel"]==$divisivel){
			return $res["text"];
		}
	}
}

	
?>