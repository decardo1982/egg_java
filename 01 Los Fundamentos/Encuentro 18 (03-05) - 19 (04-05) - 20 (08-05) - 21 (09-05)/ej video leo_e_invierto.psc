//pedir 5 enteros por teclado e imprimirlos por pantalla en el orden invertido de ingreso

Algoritmo leo_e_invierto
	
	///Dimension nombre_variable(tamaño)
	///Definir   nombre_variable tipo
	
	Dimension valores(5)
	Definir i, valores Como Entero
	
	Escribir "Ingresa 5 valores enteros:"
	
	Para i <- 0 Hasta 4 Con Paso 1 Hacer
		Leer valores(i)
	FinPara
	
	Escribir "Los valores ingresado en forma invertida son:"
	
	Para i <- 4 Hasta 0 Con Paso -1 Hacer
		Si i = 0
			Escribir valores(i)
		SiNo
			Escribir valores(i), ", " Sin Saltar
		FinSi
	FinPara
	
FinAlgoritmo
	