////Crear un procedimiento que calcule la temperatura media de un d�a a partir de la temperatura
////m�xima y m�nima. Crear un programa principal, que, utilizando un procedimiento, vaya
////pidiendo la temperatura m�xima y m�nima de n d�as y vaya mostrando la media de cada d�a. El
////programa pedir� el n�mero de d�as que se van a introducir.

Algoritmo temperaturaMedia
	
	Definir tempMax, tempMin, tempMedia Como Real
	Definir cantDias Como Entero
	
	Escribir "Ingrese la cantidad de d�as a calcular:"
	Leer cantDias
	
	Para cantDias <- 1 Hasta cantDias Hacer
		Escribir "Ingrese temperatura m�xima del d�a ", cantDias, ":"
		Leer tempMax
		Escribir "Ingrese temperatura m�nima del d�a ", cantDias, ":"
		Leer tempMin
		calcularMedia(tempMax, tempMin, tempMedia)
		Escribir ""
		Escribir "La media del d�a ", cantDias, " es: ", tempMedia
		Escribir ""	
	FinPara
	
FinAlgoritmo

SubProceso calcularMedia(tempMax, tempMin, tempMedia Por Referencia)
	
	tempMedia = (tempMax + tempMin) /2	
	
FinSubProceso
