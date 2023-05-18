////Realizar un programa que permita visualizar el resultado del producto de una matriz de
////enteros de 3x3 por un vector de 3 elementos. Los valores de la matriz y el vector pueden
////inicializarse evitando así el ingreso de datos por teclado. Para conocer más acerca de cómo se
////realiza la multiplicación entre matrices consultar el siguiente link:
////https://es.wikibooks.org/wiki/%C3%81lgebra_Lineal/Matriz_por_vector


Algoritmo ExtraEj6_Guia5_Matrices
	
	Definir f, c, matriz, vector, resultado, acumulador Como Entero
	f=3
	c=3
	acumulador = 0
	Dimension matriz[f,c]
	Dimension vector[f]
	Dimension resultado[f]
	
	//Completamos aleatoriamente la matriz y el vector
	Para f <- 0 Hasta 2
		Para c <- 0 Hasta 2
			matriz[f,c] = Aleatorio(1,5)
			vector[c] = Aleatorio(1,5)
		FinPara
	FinPara
	
	//Escribimos por pantalla la matriz...
	Escribir "Matriz:"
	Para f <- 0 Hasta f-1
		Para c <- 0 Hasta c-1
			Escribir Sin Saltar matriz[f,c], " "
		FinPara
		Escribir ""
	FinPara
	//... y el vector
	Escribir "Vector:"
	Para c <- 0 Hasta c-1
		Escribir vector[c], " "
	FinPara
	Escribir ""
	
	Para f <- 0 Hasta f-1
		Para c <- 0 Hasta c-1
			
			//Escribir "-"
			//Escribir "Acumulador:" acumulador
			//Escribir matriz[f,c] Sin Saltar " * " vector[c] " = " 
			//Escribir matriz[f,c] * vector[c]
			acumulador = acumulador + matriz[f,c] * vector[c]
			//Escribir "Acumulador:" acumulador
			resultado[f] = acumulador
			//Escribir "Resultado " f, " " resultado[f]
		FinPara
		
		acumulador = 0
		
	FinPara
	
	Escribir "Resultado:"
	Para f <- 0 Hasta 2
		Escribir resultado[f]
	FinPara
FinAlgoritmo
