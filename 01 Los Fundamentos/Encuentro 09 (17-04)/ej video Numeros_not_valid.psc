//sumatoria de los N primeros n�meros enteros mayores que cero

Algoritmo Numeros_not_valid
	
	Definir num, suma, i Como Entero
	
	/// Hacer
	/// <secuencia_de_acciones>
	/// Mientras que <expresion_logica>
	
	Hacer
		Escribir "Ingrese un n�mero entero positivo"
		Leer num
	Mientras Que num <= 0
	
	suma = 0
	
	Para i = 1 Hasta num Hacer
		suma = suma + i
	FinPara
	Escribir "La suma de los ", num, " n�meros naturales es: ", suma
	
FinAlgoritmo
