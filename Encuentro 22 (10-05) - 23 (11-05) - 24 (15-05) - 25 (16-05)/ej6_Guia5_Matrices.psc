////Una matriz mágica es una matriz cuadrada (tiene igual número de filas que de columnas) que
////tiene como propiedad especial que la suma de las filas, las columnas y las diagonales es igual.
////Por ejemplo:
////	2 | 7 | 6
////	9 | 5 | 1
////	4 | 3 | 8
////	En la matriz de ejemplo las sumas son siempre 15. Considere el problema de construir un
////	algoritmo que compruebe si una matriz de datos enteros es mágica o no, y en caso de que
////	sea mágica escribir la suma.
////	Además, el programa deberá comprobar que los números introducidos son correctos, es decir, 
////	están entre el 1 y el 9. El usuario ingresa el tamaño de la matriz que no debe superar orden igual a 10.

Algoritmo ej6_Guia5_Matrices
	
	Definir i, j, matriz, n Como Entero
	Dimension matriz[3,3]
	
	Para i <- 0 Hasta 2 Hacer
		Para j <- 0 Hasta 2 Hacer
			Hacer
				Escribir "Ingrese un número del 1 al 9 para la posición ", i, "-" j, ":"
				Leer n
				matriz[i, j] = n
			Mientras Que n < 1 O n > 9
		FinPara
	FinPara
	Escribir ""
	mostrarMatriz(matriz, i, j)
	Escribir ""
	Escribir sumatoriaFilas(matriz, i, j)
	Escribir ""
	Escribir sumatoriaColumnas(matriz, i, j)
	Escribir ""
	Escribir sumaDiagonales(matriz, i, j)
	
	Si sumatoriaFilas(matriz, i, j) Y sumatoriaColumnas(matriz, i, j) Y sumaDiagonales(matriz, i, j) Entonces
		Escribir ""
		Escribir "-----------------------------"
		Escribir "* ¡Es una matriz mágica! ;) *"
		Escribir "-----------------------------"	
	SiNo
		Escribir ""
		Escribir "······························"
		Escribir "· No es una matriz mágica :( ·"
		Escribir "······························"	
	FinSi
	
FinAlgoritmo


SubProceso mostrarMatriz(matriz, i, j)
	Para i <- 0 Hasta 2 Hacer
		Para j <- 0 Hasta 2 Hacer
			Escribir matriz[i,j], " | " Sin Saltar
		FinPara
		Escribir ""
	FinPara	
FinSubProceso

Funcion filas <- sumatoriaFilas(matriz, i, j)
	Definir fila1, fila2, fila3 Como Entero
	Definir filas Como Logico
	filas = Falso
	fila1 = 0
	fila2 = 0
	fila3 = 0
	
	Para j <- 0 Hasta 2
		fila1 = fila1 + matriz[0,j]
		fila2 = fila2 + matriz[1,j]
		fila3 = fila3 + matriz[2,j]
	FinPara
	
	Si fila1 == fila2  Y fila2 == fila3 Entonces
		filas = Verdadero
		//Escribir "La suma de la fila 1 es ", fila1
		//Escribir "La suma de la fila 2 es ", fila2
		//Escribir "La suma de la fila 3 es ", fila3
	FinSi
FinSubProceso

Funcion columnas <- sumatoriaColumnas(matriz, i, j)
	Definir columna1, columna2, columna3 Como Entero
	Definir columnas Como Logico
	columnas = Falso
	columna1 = 0
	columna2 = 0
	columna3 = 0
	
	Para i <- 0 Hasta 2
		columna1 = columna1 + matriz[i,0]
		columna2 = columna2 + matriz[i,1]
		columna3 = columna3 + matriz[i,2]
	FinPara
	
	Si columna1 == columna2 Y columna2 == columna3 Entonces
		columnas = Verdadero
		//Escribir "La suma de la columna 1 es ", columna1
		//Escribir "La suma de la columna 2 es ", columna2
		//Escribir "La suma de la columna 3 es ", columna3
	FinSi
FinFuncion

Funcion diagonales <- sumaDiagonales(matriz, i, j)
	Definir diagonales como Logico
	Definir diagonalPrincipal, diagonalSecundaria Como Entero
	diagonales = Falso
	diagonalPrincipal = 0
	diagonalSecundaria = 0
	
	Para i <- 0 Hasta 2
		Para j <- 0 Hasta 2
			Si i = j Entonces
				diagonalPrincipal = diagonalPrincipal + matriz[i,j]
			FinSi
		FinPara
	FinPara

	
	Para i <- 2 Hasta 0
		Para j <- 2 Hasta 0
			diagonalSecundaria = diagonalSecundaria + matriz[i,j]
			i = i -1
		FinPara
	FinPara
	
	Si diagonalPrincipal == diagonalSecundaria Entonces
		diagonales = Verdadero
		//Escribir "La suma de la diagonal principal es ", diagonalPrincipal
		//Escribir "La suma de la diagonal secundaria es ", diagonalSecundaria
	FinSi
	
FinFuncion
