//Ejercicio 1
//Un hombre desea saber si su sueldo es mayor al sueldo m�nimo, el programa le pedir� al
//	usuario su sueldo actual y el sueldo m�nimo. Si el sueldo es mayor al m�nimo se debe
//		mostrar un mensaje por pantalla indic�ndolo.
Algoritmo sueldo
	Definir sueldoMinimo, sueldoActual Como Entero
	
	Escribir "Ingrese sueldo m�nimo:"
	leer sueldoMinimo
	
	Escribir "Ingrese sueldoA actual:"
	leer sueldoActual
	
	Si sueldoActual > sueldoMinimo Entonces
		Escribir "El sueldo actual es mayor al m�nimo"
	FinSi
FinAlgoritmo
