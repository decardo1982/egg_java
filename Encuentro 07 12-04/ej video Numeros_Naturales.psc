//Sumatoria de los N primeros números enteros mayores que cero

Algoritmo Numeros_Naturales
	
	Definir num, suma, i Como Entero
	
	Escribir "Ingrese un número entero"
	Leer num
	
	//	Mientras <expresion_logica> Hacer
	//	<secuencia_de_acciones>
	//	Fin Mientras
	
	suma = 0
	i = 1
	Mientras i <= num Hacer
		suma = suma + i
		i = i + 1
	FinMientras
	
	Escribir "La suma de los ", num, " número naturales es: ", suma
	
FinAlgoritmo
