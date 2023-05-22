////Escribir un programa que realice la b�squeda lineal de un n�mero entero ingresado por el
////usuario en una matriz de 5x5, llena de n�meros aleatorios y devuelva por pantalla las
////coordenadas donde se encuentra el valor, es decir en que fila y columna se encuentra. En
////caso de no encontrar el valor dentro de la matriz se debe mostrar un mensaje

Algoritmo ej2_Guia5_Matrices
	
	Definir matriz, i, j, n Como Entero
	Definir nEncontrado Como Logico
	nEncontrado = Falso
	Dimension matriz[5,5]
	
	//Creamos la matriz con n�meros aleatorios entre 0 y 100
	Para i <- 0 Hasta 4 Hacer
		Para j <- 0 Hasta 4 Hacer
			matriz[i,j] = Aleatorio(0, 100)
		FinPara
	FinPara
	
	//Lo mostramos por pantalla a modo meramente demostrativo
	Para i <- 0 Hasta 4 Hacer
		Escribir ""
		Para j <- 0 Hasta 4 Hacer
			Escribir matriz[i,j], "|" Sin Saltar
		FinPara
	FinPara
	Escribir ""
	
	Escribir "Ingrese el n�mero a buscar en la matriz:"
	Leer n
	Para i <- 0 Hasta 4 Hacer
		Para j <- 0 Hasta 4 Hacer
			Si matriz[i,j] = n Entonces
				Escribir "El n�mero ", n, " se encuentra en Fila ", i, " columna ", j
				nEncontrado = Verdadero
			FinSi
		FinPara
	FinPara	
	
	Si !nEncontrado Entonces
		Escribir "El n�mero ", n, " no se encuentra en la matriz"
	FinSi
	
FinAlgoritmo
