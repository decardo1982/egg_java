////Realizar un programa que cree una matriz de 5x15 y deberemos llenar la matriz de unos y
////ceros. Llenando el marco o la delimitación externa de la matriz de unos y la parte interna de
////ceros.
////Por ejemplo, nuestro matriz final debería verse así:
//// 111111111111111
//// 100000000000001
//// 100000000000001
//// 100000000000001
//// 111111111111111

Algoritmo ExtraEj3_Guia5_Matrices
	
	Definir matriz, f, c Como Entero
	Dimension matriz[5,15]
	
	Para f <- 0 Hasta 4
		para c <- 0 Hasta 14
			Si f = 0  O f = 4 O c = 0 O c = 14 Entonces
				matriz[f,c] = 1
		SiNo
			matriz[f, c] = 0
		FinSi
		FinPara
	FinPara
	
	Escribir ""
	mostrarMatriz(matriz, f, c)
	Escribir ""
FinAlgoritmo

SubProceso mostrarMatriz(matriz, f, c)
	
	Para f <- 0 Hasta 4
		Para c <- 0 Hasta 14
			Escribir matriz[f,c] Sin Saltar
		FinPara
		Escribir ""
	FinPara
	
FinSubProceso
	