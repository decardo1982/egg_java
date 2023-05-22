//Escriba un programa que solicite dos números enteros (mínimo y máximo). A
//continuación, se debe pedir al usuario que ingrese números enteros situados entre el
//máximo y mínimo. Cada vez que un número se encuentre entre ese intervalo, se sumara
//uno a una variable. El programa terminará cuando se escriba un número que no
//pertenezca a ese intervalo, y al finalizar se debe mostrar por pantalla la cantidad de
//números ingresados dentro del intervalo.

Algoritmo minAndMax
	
	Definir min, max, numIngresado, cantNumIngresados Como Real
	
	cantNumIngresados = 0
	
	Escribir "Ingrese un valor de número mínimo:"
	Leer min
	Escribir "Ingrese un valor de número máximo:"
	Leer max
	
	Escribir "Ingrese un número entre los valores mínimo (", min, ") y máximo (", max, ")"
	Leer numIngresado
	
	Mientras numIngresado >= min Y numIngresado <= max Hacer
		cantNumIngresados = cantNumIngresados + 1
		Escribir "Ingrese otro número entre los valores mínimo (", min, ") y máximo (", max, ")"
		Leer numIngresado
	Fin Mientras
	
	Escribir "La cantidad de números ingresados entre los valores fue de ", cantNumIngresados
	
FinAlgoritmo
