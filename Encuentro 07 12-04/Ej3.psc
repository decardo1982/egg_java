////Dada una secuencia de n�meros ingresados por teclado que finaliza con un -1, por
////ejemplo: 5,3,0,2,4,4,0,0,2,3,6,0,??,-1; realizar un programa que calcule el promedio de
////	los n�meros ingresados. Suponemos que el usuario no insertar� n�mero negativos.

Algoritmo promedio
	
	Definir sumatoria, numIngresado, contador Como Entero
	
	contador = 0
	sumatoria = 0
	
	Escribir "Ingrese un n�mero positivo:"
	Leer numIngresado
	
	Mientras numIngresado > -1 Hacer
		sumatoria = sumatoria + numIngresado
		contador = contador + 1
		Escribir "Ingrese otro n�mero:"
		Leer numIngresado
	Fin Mientras
	
	Escribir "El promedio de los n�meros ingresados es: ", sumatoria / contador
	
FinAlgoritmo
