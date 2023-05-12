////Rellenar en un subproceso una matriz cuadrada con números aleatorios salvo en la diagonal
////	principal, la cual debe rellenarse con ceros. Una vez llena la matriz debe generar otro
////	subproceso para imprimir la matriz.

Algoritmo ej4_Guia5_Matrices	
	Definir matriz, i, j, n Como Entero
	Escribir "Ingrese el tamaño de la matriz:"
	Leer n
	Dimension matriz[n,n]
	
	rellenarMatriz(matriz,n)
	mostrarMatriz(matriz,n)
FinAlgoritmo

SubProceso rellenarMatriz(matriz, n)
	Definir i, j Como Entero
	Para i <- 0 Hasta n -1 Hacer
		Para j <- 0 Hasta n - 1 Hacer
			Si i == j Entonces
				matriz[i,j] = 0
			SiNo
				matriz[i,j] = Aleatorio(10, 99)
			FinSi
		FinPara
	FinPara
FinSubProceso

SubProceso mostrarMatriz(matriz, n)
	Definir i, j Como Entero
	Para i <- 0 Hasta n - 1 Hacer
		Para j <- 0 Hasta n - 1 Hacer
			Escribir matriz[i,j], " | " Sin Saltar
		FinPara
		Escribir ""
	FinPara	
FinSubProceso