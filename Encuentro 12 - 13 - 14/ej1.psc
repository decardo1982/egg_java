//Realizar una función que calcule la suma de dos números. En el algoritmo principal le
//	pediremos al usuario los dos números para pasárselos a la función. Después la función
//		calculará la suma y lo devolverá para imprimirlo en el algoritmo.

Algoritmo sumando
	Definir num1, num2 Como Real
	Escribir "Ingrese el primer número:"
	Leer num1
	Escribir "Ingrese el segundo número:"
	Leer num2
	
	Escribir "La suma es ", sumar(num1, num2)
	
FinAlgoritmo

Funcion resultado <- sumar (num1, num2)
	Definir resultado Como Real
	resultado = num1 + num2
FinFuncion
	