
Algoritmo ejExtra1_enClase
	definir vector1, vector2, i Como Entero
	Dimension vector1[5], vector2[5]
	
	para i <- 0 hasta 4 Hacer
		vector1[i] = aleatorio(-100, 100)
		vector2[i] = aleatorio(-100, 100)
	FinPara
	imprimirVector(vector1, 5)
	imprimirVector(vector2, 5)
FinAlgoritmo

SubProceso imprimirVector (vector, dimens)
	definir i Como Entero
	escribir "****************************"
	escribir "|" sin saltar
	Para i <- 0 Hasta dimens -1 Hacer
		escribir vector[i], "|" Sin Saltar
	FinPara
	escribir ""
	escribir "****************************"
	
FinSubProceso