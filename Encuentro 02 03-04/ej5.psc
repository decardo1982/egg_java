//Escriba un programa que permita al usuario ingresar el valor de dos variables numéricas de
//tipo entero. Posteriormente, el programa debe intercambiar los valores de ambas variables
//y mostrar el resultado final por pantalla.
//Por ejemplo, si el usuario ingresa los valores num1 = 9 y num2 = 3, la salida a del
//programa deberá mostrar: num1 = 3 y num2 = 9
//Ayuda: Para intercambiar los valores de dos variables se debe utilizar una variable auxiliar.
Algoritmo intercambiar_variables
	Definir variable1, variable2, auxiliar Como Entero
	Escribir "Ingrese la Variable 1:"
	Leer variable1
	Escribir "Ingrese la Variable 2:"
	Leer variable2
	auxiliar = variable2
	variable2 = variable1
	variable1 = auxiliar
	Escribir "Ahora la Variable 1 es ", variable1, " y la Variable2 es ", variable2
FinAlgoritmo
