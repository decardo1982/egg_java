////Realizar un programa que muestre la cantidad de n�meros que son m�ltiplos de 2 o de 3
////comprendidos entre 1 y 100.
//ok

Algoritmo multiplosDeDosYDeTres
	
	Definir i, multiploDeDosOTres Como Entero
	
	multiploDeDosOTres = 0
	
	Para i <- 1 Hasta 100 Con Paso 1 Hacer
		Si i % 2 = 0 O i % 3 = 0 Entonces
			multiploDeDosOTres = multiploDeDosOTres + 1
		FinSi		
	Fin Para
	Escribir "Entre 1 y 100 tenemos ", multiploDeDosOTres, " n�meros que son m�ltiplos de 2 o 3"

	
FinAlgoritmo
