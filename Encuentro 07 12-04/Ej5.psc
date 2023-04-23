//Escriba un programa que solicite dos n�meros enteros (m�nimo y m�ximo). A
//continuaci�n, se debe pedir al usuario que ingrese n�meros enteros situados entre el
//m�ximo y m�nimo. Cada vez que un n�mero se encuentre entre ese intervalo, se sumara
//uno a una variable. El programa terminar� cuando se escriba un n�mero que no
//pertenezca a ese intervalo, y al finalizar se debe mostrar por pantalla la cantidad de
//n�meros ingresados dentro del intervalo.

Algoritmo minAndMax
	
	Definir min, max, numIngresado, cantNumIngresados Como Real
	
	cantNumIngresados = 0
	
	Escribir "Ingrese un valor de n�mero m�nimo:"
	Leer min
	Escribir "Ingrese un valor de n�mero m�ximo:"
	Leer max
	
	Escribir "Ingrese un n�mero entre los valores m�nimo (", min, ") y m�ximo (", max, ")"
	Leer numIngresado
	
	Mientras numIngresado >= min Y numIngresado <= max Hacer
		cantNumIngresados = cantNumIngresados + 1
		Escribir "Ingrese otro n�mero entre los valores m�nimo (", min, ") y m�ximo (", max, ")"
		Leer numIngresado
	Fin Mientras
	
	Escribir "La cantidad de n�meros ingresados entre los valores fue de ", cantNumIngresados
	
FinAlgoritmo
