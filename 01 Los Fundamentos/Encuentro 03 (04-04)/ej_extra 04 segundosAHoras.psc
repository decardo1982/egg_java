////Hacer un programa que ingrese por teclado un número total de segundos y que luego
////	pueda mostrar la cantidad de horas, minutos y segundos que existen en el valor
////	ingresado.

Algoritmo segundosAHoras
	
	Definir secs Como Entero
	
	Escribir "Ingrese la cantidad de segundos:"
	Leer secs
	
	Escribir "Los ", secs, " ingresados equivalen a:"
	Escribir secs/60, " minutos"
	Escribir secs/3600, " horas"
	
FinAlgoritmo
