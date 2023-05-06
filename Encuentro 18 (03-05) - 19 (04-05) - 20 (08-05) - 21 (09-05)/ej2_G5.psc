////Realizar un programa que lea 10 números reales por teclado, los almacene en un arreglo y
////muestre por pantalla la suma, resta y multiplicación de todos los números ingresados al
////arreglo.

Algoritmo ej2_G5
	
	Definir vector, i, suma, resta, mult Como Real
	Dimension vector[10]
	suma = 0
	resta = 0
	mult = 1
	
	Escribir "Ingresaremos 10 valores:"
	
	Para i <- 0 Hasta 9 Con Paso 1 Hacer
		Leer vector[i]
		
		suma = suma + vector[i]
		resta = resta - vector[i]
		mult = mult * vector[i]
	FinPara
	
	Escribir "La sumatoria es: ", suma
	Escribir "La resta es: ", resta
	Escribir "La multiplicación es ", mult
	
FinAlgoritmo
