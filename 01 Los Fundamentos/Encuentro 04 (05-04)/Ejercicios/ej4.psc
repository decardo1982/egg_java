//Ejercicio 4
//Dise�e un algoritmo que lea un n�mero de tres cifras y determine si es o no capic�a.
Algoritmo sin_titulo
	
	Definir numeroIngresado, unidad, decena, centena Como Entero
	
	Escribir "Por favor ingrese un n�mero de 3 cifras:"
	Leer numeroIngresado
	
	Mientras (numeroIngresado < 100 O numeroIngresado >= 1000) O (numeroIngresado > -999 O numeroIngresado > -100) Hacer
		Escribir "Por favor ingrese un n�mero de 3 CIFRAS!"
		leer numeroIngresado
	FinMientras
	
	//125 / 100 1.25 trunc 1
	//125 -C 25/10 trunc 2
	//125  -C -D U
	
	centena = trunc(numeroIngresado/100)
	decena = trunc((numeroIngresado - centena * 100) / 10)
	unidad = numeroIngresado - (centena * 100 ) - (decena * 10)
	
	Escribir "La centena es: ", centena
	Escribir "La decena es: ", decena
	Escribir "La unidad es: ", unidad
	
	Si centena = unidad Entonces
		Escribir "El n�mero ", numeroIngresado, " es capic�a."
	SiNo
		Escribir "El n�mero ingresado no es capic�a"
	FinSi
	
	
FinAlgoritmo
