////Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el
////usuario y muestre por pantalla el promedio de la suma de todos los valores ingresados.

Algoritmo ejExtra2_Guia5
	Definir vector, n, i, sumatoria Como Entero
	sumatoria = 0
	Escribir "Ingrese el tama�o del vector:"
	Leer n
	Dimension vector[n]
	
	Para i <- 0 Hasta (n - 1) Hacer
		Escribir "Ingrese un n�mero para la posici�n ", i
		Leer vector[i]
		sumatoria = sumatoria + vector[i]
	FinPara
	
	Escribir "El promedio de los n�meros ingresados en el vector es ", sumatoria / n
	
FinAlgoritmo
