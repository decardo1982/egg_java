////Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
////usuario. A continuación, se debe buscar un elemento dentro del arreglo (el número a buscar
////también debe ser ingresado por el usuario). El programa debe indicar la posición donde se
////encuentra el valor. En caso que el número se encuentre repetido dentro del arreglo se deben
////imprimir todas las posiciones donde se encuentra ese valor.
////Finalmente, en caso que el número a buscar no está adentro del arreglo se debe mostrar un mensaje.

Algoritmo ej3_G5
	
	Definir vector, n, i, buscaNumero, j, contador Como Entero
	contador = 0
	Escribir "Ingrese el tamaño del vector:"
	Leer n
	
	Dimension vector[n]
	
	Escribir "Ingrese los ", n, " números del vector:"
	
	Para i <- 0 Hasta (n-1) Con Paso 1 Hacer
		Leer vector[i]
	FinPara
	
	Escribir "Ingrese el número a buscar en el vector:"
	Leer buscaNumero
	
	Para j <- 0 Hasta (n - 1) Con Paso 1 Hacer
		Si vector[j] == buscaNumero Entonces
			contador = contador + 1
			Escribir "El número ", buscaNumero, " se encuentra en la posición ", j
			
		FinSi
		
	FinPara
	
	Si contador == 0 Entonces
		Escribir "El número ", buscaNumero, " no se encuentra en el vector."
	FinSi
	
FinAlgoritmo
