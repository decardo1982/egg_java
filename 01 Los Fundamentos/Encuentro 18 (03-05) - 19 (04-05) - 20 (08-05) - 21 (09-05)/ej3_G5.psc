////Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el
////usuario. A continuaci�n, se debe buscar un elemento dentro del arreglo (el n�mero a buscar
////tambi�n debe ser ingresado por el usuario). El programa debe indicar la posici�n donde se
////encuentra el valor. En caso que el n�mero se encuentre repetido dentro del arreglo se deben
////imprimir todas las posiciones donde se encuentra ese valor.
////Finalmente, en caso que el n�mero a buscar no est� adentro del arreglo se debe mostrar un mensaje.

Algoritmo ej3_G5
	
	Definir vector, n, i, buscaNumero, j, contador Como Entero
	contador = 0
	Escribir "Ingrese el tama�o del vector:"
	Leer n
	
	Dimension vector[n]
	
	Escribir "Ingrese los ", n, " n�meros del vector:"
	
	Para i <- 0 Hasta (n-1) Con Paso 1 Hacer
		Leer vector[i]
	FinPara
	
	Escribir "Ingrese el n�mero a buscar en el vector:"
	Leer buscaNumero
	
	Para j <- 0 Hasta (n - 1) Con Paso 1 Hacer
		Si vector[j] == buscaNumero Entonces
			contador = contador + 1
			Escribir "El n�mero ", buscaNumero, " se encuentra en la posici�n ", j
			
		FinSi
		
	FinPara
	
	Si contador == 0 Entonces
		Escribir "El n�mero ", buscaNumero, " no se encuentra en el vector."
	FinSi
	
FinAlgoritmo
