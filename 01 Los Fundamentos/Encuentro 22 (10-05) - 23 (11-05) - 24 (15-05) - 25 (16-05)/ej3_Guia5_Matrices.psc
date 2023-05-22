////Dada una matriz de orden n * m (donde n y m son valores ingresados por el usuario) realizar
////un subprograma que llene la matriz de numeros aleatorios. Despues, crearemos otro
////subprograma que calcule y muestre la suma de los elementos de la matriz. Mostrar la matriz y
////los resultados por pantalla.

Algoritmo ej3_Guia5_Matrices
	
	Definir matriz, n, m, i, j, suma Como Entero
	suma = 0
	Escribir "Ingrese la cantidad de filas de la matriz:"
	Leer n
	Escribir "Ingrese la cantidad de columnas de la matriz:"
	Leer m
	
	//Definimos las dimensiones de la matriz
	Dimension matriz[n,m]
	llenarMatriz(matriz, n, m)
	Escribir "---------------------------"
	Escribir "Mostramos la matriz creada:"
	Escribir "---------------------------"
	mostrarMatriz(matriz, n, m)
	Escribir ""
	Escribir "---------------------------"
	Escribir "La sumatoria de la matriz es: ", sumatoriaMatriz(matriz, n, m)
	Escribir "---------------------------"
FinAlgoritmo

SubProceso llenarMatriz(matriz, n,m) //Llenamos la matriz con nùmeros aleatorios entre 0 y 1000
	Definir i, j Como Entero
	Para i <- 0 Hasta n - 1 Con Paso 1 Hacer
		Para j <- 0 hasta m - 1 Con Paso 1 Hacer
			matriz[i,j] = Aleatorio(0, 1000)
		FinPara
	FinPara
FinSubProceso

Funcion suma <- sumatoriaMatriz(matriz, n, m) //recorremos la matriz y vamos sumando los números
	Definir i, j, suma Como Entero
	suma = 0
	Para i <- 0 Hasta n - 1 Con Paso 1 Hacer
		Para j <- 0 hasta m - 1 Con Paso 1 Hacer
			suma = suma + matriz[i,j]
		FinPara
	FinPara
FinFuncion


SubProceso mostrarMatriz(matriz, n, m) //recorremos la matriz y mostramos por pantalla
	Definir i, j Como Entero
	Para i <- 0 Hasta n - 1 Con Paso 1 Hacer
		Para j <- 0 hasta m - 1 Con Paso 1 Hacer
			Escribir matriz[i,j], " | " Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinSubProceso
