Algoritmo sin_titulo
	Definir numeroIngresado, porcentaje Como Real
	
	Escribir "Por favor ingrese un numero: "
	leer numeroIngresado
	
	Mientras numeroIngresado <=0 Hacer
		Escribir "Por favor ingrese un numero POSITIVO"
		leer numeroIngresado
	Fin Mientras
	Si numeroIngresado >= 500 Entonces
		Escribir "Por favor ingrese el porcentaje a calcular"
		leer porcentaje
		Mostrar "El ",porcentaje,"% de ", numeroIngresado, " es: ", numeroIngresado * (porcentaje/100)		
	Sino 
		Mostrar "El numero ingresado es menor a 500"		
		
	Fin Si
	
FinAlgoritmo
