////Realizar un programa que rellene un vector con 5 valores ingresados por el usuario y los
////muestre por pantalla

Algoritmo ej1_G5_vectores
	
	Definir vector, i Como Entero
	Dimension vector[5]
	
	Escribir "Ingrese 5 números enteros:"
	
	Para i <- 0 Hasta 4 Con Paso 1 Hacer
		Leer vector[i]
	FinPara
	
	Escribir "El vector contiene los siguientes números:"
	Para i <- 0 Hasta 4 Con Paso 1 Hacer
		Si i = 4 Entonces
			Escribir Sin Saltar vector[i] "."
		SiNo
			Escribir Sin Saltar vector[i], ", "
		FinSi
		
	FinPara
	
FinAlgoritmo
