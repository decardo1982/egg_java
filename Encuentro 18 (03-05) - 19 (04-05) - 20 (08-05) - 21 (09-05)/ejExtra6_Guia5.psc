////Crear una función que devuelva la diferencia que hay entre el valor más chico de un arreglo y
////su valor más grande

Algoritmo ejExtra6_Guia5
	
	Definir vector, n, i, min, max Como Entero
	min = 0
	max = 0
	Escribir "Ingrese el tamaño del vector:"
	Leer n
	Dimension vector[n]
	
	Para i <- 0 Hasta n - 1 Con Paso 1 Hacer
		vector[i] = Aleatorio(-100, 100)
		Si vector[i] < min Entonces
			min = vector[i]
		FinSi
		Si vector[i] > max Entonces
			max = vector[i]
		FinSi
	FinPara
	
	Escribir ""
	Escribir "Mostramos por pantalla el vector creado:"
	Escribir ""
	Para i <- 0 Hasta n - 1 Hacer
		Escribir vector[i]	" " Sin Saltar
	FinPara
	Escribir ""
	Escribir "Valor mínimo del vector: ", min
	Escribir "Valor máximo del vector: ", max
	
	Escribir "La diferencia entre el valor máximo ", max, " y el valor mínimo ", min, " es: ", diferencia(max, min)
	
FinAlgoritmo

Funcion retorno <- diferencia(max, min)
	Definir retorno Como Real
	retorno = max - min
FinFuncion
	