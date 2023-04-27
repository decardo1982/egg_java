//Realizar una funci�n que calcule la suma de los d�gitos de un n�mero.
//Ejemplo: 25 = 2 + 5 = 7
//Nota: Para obtener el �ltimo n�mero de un digito de 2 cifras o m�s debemos pensar en el
//		resto de una divisi�n entre 10. Recordar el uso de la funci�n Mod y Trunc.
//ok

Algoritmo sumarDigitos
	Definir num Como Entero
	
	Escribir "Ingrese un n�mero de hasta 10 cifras para sumar sus d�gitos:" //porque a partir de 11 PSeInt se rompe
	Leer num
	
	Escribir "La sumatoria de los d�gitos de ", num, " es ", sumatoria(num)
	
FinAlgoritmo

Funcion retorno <- sumatoria(num)
	Definir retorno Como Real
	retorno = 0
	
	Mientras num <> 0 Hacer
		retorno = retorno + (num % 10)
		num = trunc(num/10)
	FinMientras
	
FinFuncion
