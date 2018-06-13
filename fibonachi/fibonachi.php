<?php
/**
* Clase para mostrar la serie Fibonachi
*/
class Fibonachi
{

	public function funFibonachi($limit = 10)
	{
		$n1 = 1;
		$n2 = 0;
		for ($i = 0; $i <= $limit ; $i++) {
			$suma = $n1 + $n2;
			$n1 = $n2;
			$n2 = $suma;
			echo "[".$i."] = ".$suma. "<br>";
		}
	}
}

$obj = new Fibonachi;
$obj->funFibonachi(10);

?>