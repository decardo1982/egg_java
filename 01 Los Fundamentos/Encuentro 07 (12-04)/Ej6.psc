//Escriba un programa que solicite al usuario n�meros decimales mientras que el usuario
//escriba n�meros mayores al primero que se ingres�. Por ejemplo: si el usuario ingresa
//como primer n�mero un 3.1, y luego ingresa un 4, el programa debe solicitar un tercer
//n�mero. El programa continuar� solicitando valores sucesivamente mientras los valores
//ingresados sean mayores que 3.1, caso contrario, el programa finaliza.

Algoritmo decimales
	
	Definir num1, num Como Real
	
	Escribir "Ingrese un n�mero decimal:"
	Leer num1
	Escribir "Ingrese otro n�mero mayor al primero:"
	Leer num
	
	Mientras num > num1 Hacer
		Escribir "Ingrese otro n�mero m�s:"
		Leer num
	Fin Mientras
	
FinAlgoritmo
