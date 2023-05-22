////Se pide escribir un programa que calcule la suma de los N primeros números pares. Es
////decir, si ingresamos el número 5 como valor de N, el algoritmo nos debe realizar la suma
////	de los siguientes valores: 2+4+6+8+10.


Algoritmo sumaNPares
	
	Definir n, suma, i Como Entero
	
	i = 0
	suma = 0
	Escribir "Ingrese la cantidad de N pares a sumar:"
	Leer n
	
	Hacer
		i = i + 1
		suma = i * 2 + suma
	Mientras Que i < n
	
	Escribir "La sumatoria es: ", suma
	
FinAlgoritmo
