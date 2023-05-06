////Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
////usuario y muestre por pantalla el promedio de la suma de todos los valores ingresados.

Algoritmo ejExtra2_Guia5
	Definir vector, n, i, sumatoria Como Entero
	sumatoria = 0
	Escribir "Ingrese el tamaño del vector:"
	Leer n
	Dimension vector[n]
	
	Para i <- 0 Hasta (n - 1) Hacer
		Escribir "Ingrese un número para la posición ", i
		Leer vector[i]
		sumatoria = sumatoria + vector[i]
	FinPara
	
	Escribir "El promedio de los números ingresados en el vector es ", sumatoria / n
	
FinAlgoritmo
