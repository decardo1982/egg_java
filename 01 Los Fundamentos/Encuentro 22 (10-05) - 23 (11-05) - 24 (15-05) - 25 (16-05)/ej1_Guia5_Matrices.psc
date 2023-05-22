////Realizar un programa que rellene una matriz de 3x3 con 9 valores ingresados por el usuario y
////los muestre por pantalla

Algoritmo ej1_Guia5_Matrices
	
	Definir matriz, i, j Como Entero
	Dimension matriz[3, 3]
	
	Para i <- 0 Hasta 2 Hacer
		Para j <- 0 Hasta 2 Hacer
			Escribir "Ingrese un número para la posición ", i, "-", j, ":"
			Leer matriz[i, j]
		FinPara
	FinPara
	
	Para i <- 0 Hasta 2 Hacer
		Para j <- 0 Hasta 2 Hacer
			Escribir "El valor para ", i, "-", j, " es: " matriz[i, j]
		FinPara
	FinPara
	
	
FinAlgoritmo
