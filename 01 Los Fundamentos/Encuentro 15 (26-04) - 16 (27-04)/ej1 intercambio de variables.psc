////Realizar un procedimiento que permita intercambiar el valor de dos variables de tipo entero.
////La variable A, debe terminar con el valor de la variable B.

Algoritmo intercambio
	
	Definir variableA, variableB Como Entero
	Escribir "Ingrese la Variable A:"
	Leer variableA
	Escribir "Ingrese la Variable B:"
	Leer variableB
	
	cambiarVariables(variableA, variableB)
	
	Escribir "Ahora el valor de la variable A es ", variableA, " y la variable B es ", variableB
	
FinAlgoritmo

SubProceso cambiarVariables(variableA Por Referencia, variableB Por Referencia)
	Definir variableAuxiliar Como Entero
	
	variableAuxiliar = variableA
	variableA = variableB
	variableB = variableAuxiliar	
	
	
FinSubProceso
