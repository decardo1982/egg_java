//Realizar una funci�n que calcule la suma de dos n�meros. En el algoritmo principal le
//	pediremos al usuario los dos n�meros para pas�rselos a la funci�n. Despu�s la funci�n
//		calcular� la suma y lo devolver� para imprimirlo en el algoritmo.

Algoritmo sumando
	Definir num1, num2 Como Real
	Escribir "Ingrese el primer n�mero:"
	Leer num1
	Escribir "Ingrese el segundo n�mero:"
	Leer num2
	
	Escribir "La suma es ", sumar(num1, num2)
	
FinAlgoritmo

Funcion resultado <- sumar (num1, num2)
	Definir resultado Como Real
	resultado = num1 + num2
FinFuncion
	