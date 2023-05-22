Algoritmo sin_titulo
	Definir numeroIngresado, unidad, decena,centena Como Entero
	
	Escribir "Por favor ingrese un numero de 3 cifras"
	leer numeroIngresado
	
	Mientras (numeroIngresado<100 O numeroIngresado>= 1000) Y (numeroIngresado<-999 O numeroIngresado>-100) Hacer
		Escribir "Por favor ingrese un numero de 3 CIFRAS !!"
		leer numeroIngresado
	Fin Mientras
	
	
	//  125 /100 1.25 trunc 1
	// 125 -C 25/10 trunc 2
	// 125 -C -D U
	centena = trunc(numeroIngresado/100)
	decena = trunc((numeroIngresado - centena*100)/10)
	unidad = numeroIngresado -(centena *100) - (decena *10)
	Escribir "La centena es: ", centena
	Escribir "La decena es: ", decena
	Escribir "La unidad es: ", unidad
	
	Si centena = unidad Entonces
		Escribir "El numero ",numeroIngresado, " Es capicua"
	SiNo
		Escribir "Lo lamento su numero ",numeroIngresado, " NO es capicua"
	Fin Si

	
	
	
FinAlgoritmo
