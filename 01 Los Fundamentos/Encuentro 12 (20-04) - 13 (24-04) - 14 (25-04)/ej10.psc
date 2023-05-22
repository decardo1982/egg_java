//Realizar una función que calcule la suma de los dígitos de un número.
//Ejemplo: 25 = 2 + 5 = 7
//Nota: Para obtener el último número de un digito de 2 cifras o más debemos pensar en el
//		resto de una división entre 10. Recordar el uso de la función Mod y Trunc.
//ok

Algoritmo sumarDigitos
	Definir num Como Entero
	
	Escribir "Ingrese un número de hasta 10 cifras para sumar sus dígitos:" //porque a partir de 11 PSeInt se rompe
	Leer num
	
	Escribir "La sumatoria de los dígitos de ", num, " es ", sumatoria(num)
	
FinAlgoritmo

Funcion retorno <- sumatoria(num)
	Definir retorno Como Real
	retorno = 0
	
	Mientras num <> 0 Hacer
		retorno = retorno + (num % 10)
		num = trunc(num/10)
	FinMientras
	
FinFuncion
