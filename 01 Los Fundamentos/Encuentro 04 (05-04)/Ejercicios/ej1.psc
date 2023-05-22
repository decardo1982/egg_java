//Ejercicio 1
//Un hombre desea saber si su sueldo es mayor al sueldo mínimo, el programa le pedirá al
//	usuario su sueldo actual y el sueldo mínimo. Si el sueldo es mayor al mínimo se debe
//		mostrar un mensaje por pantalla indicándolo.
Algoritmo sueldo
	Definir sueldoMinimo, sueldoActual Como Entero
	
	Escribir "Ingrese sueldo mínimo:"
	leer sueldoMinimo
	
	Escribir "Ingrese sueldoA actual:"
	leer sueldoActual
	
	Si sueldoActual > sueldoMinimo Entonces
		Escribir "El sueldo actual es mayor al mínimo"
	FinSi
FinAlgoritmo
