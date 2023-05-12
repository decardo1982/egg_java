////Realizar un programa que calcule la multiplicación de dos matrices de enteros de 3x3.
////Inicialice las matrices para evitar el ingreso de datos por teclado.

Algoritmo ExtraEj4_Guia5_Matrices
	
	Definir matrizA, matrizB, i, j Como Entero
	
	Dimension matrizA[3,3], matrizB[3,3]
	
	rellenarMatriz(matrizA, 3, 3)
	rellenarMatriz(matrizB, 3, 3)
	Escribir "Matriz A:"
	mostrarMatriz(matrizA, 3, 3)
	
	Escribir ""
	Escribir "Matriz B:"
	mostrarMatriz(matrizB, 3, 3)
	
FinAlgoritmo

SubAlgoritmo rellenarMatriz(matriz, i, j) ///creamos un subproceso que inicialice una matriz
	Para i <- 0 Hasta 2
		Para j <- 0 Hasta 2
			matriz[i,j] = Aleatorio(0, 1)
		FinPara
	FinPara
FinSubAlgoritmo

SubAlgoritmo mostrarMatriz(matriz, i, j) ///creamos un proceso para mostrar la matriz por pantalla
	Para i <- 0 Hasta 2
		Para j <- 0 Hasta 2
			Escribir " | ", matriz(i,j), "" Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinSubAlgoritmo

Funcion matrizResultante <- matrizC(matrizA, matrizB) ///Creamos una funcion cuyo resultado sea el producto de ambas matrices
	
FinFuncion
	