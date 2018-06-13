<?php

/**
* Clase para validar los numero primos
*/
class Primos
{
	/**
	 * Función que determina si un numero es primo
	 * Tiene que recibir el numero a determinar si es primo o no
	 * Devuelve True o False
	 */
	public function esPrimo($num)
	{
	    $cont=0;
	    // Funcion que recorre todos los numero desde el 2 hasta el valor recibido
	    for($i=2;$i<=$num;$i++) {
	        if($num%$i==0) {
	            # Si se puede dividir por algun numero mas de una vez, no es primo
	            if(++$cont>1)
	                return false;
	        }
	    }
	    return true;
	}

	public function losNumeros($limit = 100)
	{
		for($i = 1; $i <= $limit; $i++)
		{
		    if($this->esPrimo($i))
		        echo "El número ".$i." es primo<br>";
		    else
		        echo "El número ".$i." NO es primo<br>";
		}
	}

}

$obj = new Primos;
$obj->losNumeros(100);


?>