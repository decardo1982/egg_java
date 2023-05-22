////Crear una matriz que contenga 3 columnas y la cantidad de filas que decida el usuario. Las dos
////primeras columnas contendrán valores enteros ingresados por el usuario y en la 3 columna se
////deberá almacenar el resultado de sumar el número de la primera y segunda columna. Mostrar
////la matriz de la siguiente forma:
////	3 + 5 = 8
////	4 + 3 = 7
////	1 + 4 = 5

Algoritmo ExtraEj5_Guia5_Matrices
	
	Definir matriz, f, c Como Entero
	c = 3
	
	Hacer
	Escribir "Ingrese la cantidad de filas de la matriz:"
	Leer f
	Mientras Que f < 1
	
	Dimension matriz(f, c)
	
	Para f <- 0 Hasta f - 1
		Para c <- 0 Hasta 1
			Escribir "Ingrese un elemento (número) para la posición [", f, "]-[", c, "]"
			Leer matriz[f,c]
		FinPara	
	FinPara
	
	Para f <- 0 Hasta f -1
		Para c <- 0 Hasta 2
			Si c = 0 Entonces
				Escribir Sin Saltar matriz[f,c], " + "
			SiNo
				Si c = 1 Entonces
					Escribir Sin Saltar matriz[f,c], " = "
				SiNo
					Escribir Sin Saltar matriz[f,c-2] + matriz[f,c-1]
				Escribir ""	
				FinSi
			FinSi
		FinPara
	FinPara
	Escribir ""	
FinAlgoritmo
