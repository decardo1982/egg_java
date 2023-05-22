////Crear una matriz de orden n * m (donde n y m son valores ingresados por el usuario), llenarla
////con números aleatorios entre 1 y 100 y mostrar su traspuesta.
////La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por
////columnas (o viceversa).

Algoritmo ExtraEj2_Guia5_Matrices
	
	Definir matrizOriginal, matrizTraspuesta, i, j, n, m Como Entero
	
	Escribir "Ingrese las dimensiones de la matriz:"
	Escribir "Filas:"
	Leer n
	Escribir "Columnas:"
	Leer m
	Dimension matrizOriginal[n, m], matrizTraspuesta[m, n]
	
	Para i <- 0	Hasta n-1
		Para j <- 0 Hasta m-1
			matrizOriginal[i, j] = Aleatorio(1, 100)
			matrizTraspuesta[j, i] = matrizOriginal[i, j]
		FinPara
	FinPara
	
	Escribir ""
	Escribir "Imprimimos por pantalla la matriz original:"
	Escribir "-------------------------------------------"
	mostrarMatriz(matrizOriginal, n, m)
	Escribir ""
	Escribir "Y así queda la matriz traspuesta:"
	Escribir "---------------------------------"
	mostrarMatriz(matrizTraspuesta, m, n)
	
FinAlgoritmo

SubProceso mostrarMatriz(matriz, m, n)
	Para m <- 0 Hasta m-1
		Para n <- 0 Hasta n-1
			Escribir matriz(m, n), " | " Sin Saltar
		FinPara
		Escribir ""
	FinPara
	
FinSubProceso
	