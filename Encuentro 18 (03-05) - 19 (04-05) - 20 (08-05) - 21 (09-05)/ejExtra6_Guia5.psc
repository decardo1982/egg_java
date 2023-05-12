////Crear una funci�n que devuelva la diferencia que hay entre el valor m�s chico de un arreglo y
////su valor m�s grande

Algoritmo ejExtra6_Guia5
	
	Definir vector, n, i, min, max Como Entero
	min = 0
	max = 0
	Escribir "Ingrese el tama�o del vector:"
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
	Escribir "Mostramos por pantalla el vector creado con valores aleatorios entre -100 y 100:"
	Escribir "--------------------"
	Para i <- 0 Hasta n - 1 Hacer
		Escribir vector[i]	" " Sin Saltar
	FinPara
	Escribir ""
	Escribir "--------------------"
	Escribir "Valor m�nimo del vector: ", min
	Escribir "Valor m�ximo del vector: ", max
	Escribir ""
	Escribir "La diferencia entre el valor m�ximo ", max, " y el valor m�nimo ", min, " es: ", diferencia(max, min)
	Escribir ""
FinAlgoritmo

Funcion retorno <- diferencia(max, min)
	Definir retorno Como Real
	retorno = max - min
FinFuncion
	