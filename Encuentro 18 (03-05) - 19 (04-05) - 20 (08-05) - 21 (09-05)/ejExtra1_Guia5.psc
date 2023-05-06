////Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios y los
////muestre por pantalla.

Algoritmo ejExtra1_Guia5
	Definir v1, v2, i Como Entero
	Dimension v1[5]
	Dimension v2[5]
	Escribir "Se crearán 2 vectores con 5 valores aleatorios"
	
	Para i <- 0 Hasta 4 Con Paso 1 Hacer
		v1[i] = Aleatorio(-100, +100)
		v2[i] = Aleatorio(-100, +100)
	FinPara
	Para i <- 0 Hasta 4 Hacer
		Escribir Sin Saltar v1[i], " "
	FinPara
	Escribir ""
	Para i <- 0 Hasta 4 Hacer
		Escribir Sin Saltar v2[i], " "
	FinPara
	
FinAlgoritmo
