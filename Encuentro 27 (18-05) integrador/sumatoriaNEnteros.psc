////Es una función recursiva para sumar los primeros N enteros de un numero

Algoritmo sumatoriaNEnteros
	definir n Como Entero
	n = 4
	Escribir sumatoria(n)
FinAlgoritmo

Funcion suma <- sumatoria(n)
	Definir suma como entero
	
	Si n = 1 Entonces
		suma = 1
	SiNo
		suma = n + sumatoria(n-1)
	FinSi
FinFuncion
	