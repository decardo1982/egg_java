////Crear una matriz que contenga 3 columnas y la cantidad filas que decida el usuario. Las dos
////primeras columnas contendrán valores enteros ingresados por el usuario y en la 3 columna se
////deberá almacenar el resultado de sumar el número de la primera y segunda columna. Mostrar
////la matriz de la siguiente forma:
////	3 + 5 = 8
////	4 + 3 = 7
////	1 + 4 = 5

Algoritmo ExtraEj5_Guia5_Matrices
	
	Definir matriz, i, j Como Entero
	
	Escribir "Ingrese la cantidad de filas de la matriz:"
	Leer j
	i = 3
	
	Dimension matriz(i, j)
	
	Para i <- 0 Hasta 1
		Para j <- 0 Hasta j - 1
			Escribir "Ingrese un elemento (número):"
			Leer matriz[i,j]
		FinPara
	FinPara
	
FinAlgoritmo
