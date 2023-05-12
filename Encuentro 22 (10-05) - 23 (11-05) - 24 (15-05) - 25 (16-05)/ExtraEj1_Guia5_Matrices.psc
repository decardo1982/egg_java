////Realizar un programa que rellene de números aleatorios una matriz a través de un
////subprograma y generar otro subprograma que muestre por pantalla la matriz final

Algoritmo ExtraEj1_Guia5_Matrices
	
	Definir matriz, i, j, f, c Como Entero
	Escribir "Ingrese la cantidad de filas de la matriz:"
	Leer i
	Escribir "Ingrese la cantidad de columnas de la matriz:"
	Leer j
	
	Dimension matriz[i, j]
	
	rellenarMatriz(matriz, i, j)
	
	mostrarMatriz(matriz, i, j)
	
	
FinAlgoritmo

SubProceso rellenarMatriz(matriz, i, j)
	
	Para i <- 0 Hasta i -1
		Para j <- 0 Hasta j -1
			matriz[i,j] = Aleatorio(10, 99)
		FinPara
	FinPara
	
FinSubProceso

SubProceso mostrarMatriz(matriz, i, j)
	
	Para i <- 0 Hasta i-1 Hacer
		Para j <- 0 Hasta j-1 Hacer
			Escribir matriz[i,j], " | " Sin Saltar
		FinPara
		Escribir ""
	FinPara
	
FinSubProceso
	