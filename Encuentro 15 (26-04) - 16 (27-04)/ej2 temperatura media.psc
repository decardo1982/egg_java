////Crear un procedimiento que calcule la temperatura media de un día a partir de la temperatura
////máxima y mínima. Crear un programa principal, que, utilizando un procedimiento, vaya
////pidiendo la temperatura máxima y mínima de n días y vaya mostrando la media de cada día. El
////programa pedirá el número de días que se van a introducir.

Algoritmo temperaturaMedia
	
	Definir tempMax, tempMin, tempMedia Como Real
	Definir cantDias Como Entero
	
	Escribir "Ingrese la cantidad de días a calcular:"
	Leer cantDias
	
	Para cantDias <- 1 Hasta cantDias Hacer
		Escribir "Ingrese temperatura máxima del día ", cantDias, ":"
		Leer tempMax
		Escribir "Ingrese temperatura mínima del día ", cantDias, ":"
		Leer tempMin
		calcularMedia(tempMax, tempMin, tempMedia)
		Escribir ""
		Escribir "La media del día ", cantDias, " es: ", tempMedia
		Escribir ""	
	FinPara
	
FinAlgoritmo

SubProceso calcularMedia(tempMax, tempMin, tempMedia Por Referencia)
	
	tempMedia = (tempMax + tempMin) /2	
	
FinSubProceso
