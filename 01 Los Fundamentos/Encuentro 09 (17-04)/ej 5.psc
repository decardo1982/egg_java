////Escribir un programa que calcule la suma de los N primeros números naturales. El valor
////de N se leerá por teclado.
//ok

Algoritmo sumaNumerosNaturales
	
	Definir i, suma Como Entero
	
	suma = 0
	Escribir "Ingrese un número:"
	Leer i
	
	Para i <- 1 Hasta i Con Paso 1 Hacer
		suma = suma + i
	Fin Para
	
	Escribir suma

	
FinAlgoritmo
