////Escribir un programa que calcule cuántos dígitos tiene un número entero positivo sin
////convertirlo a cadena (pista: se puede hacer dividiendo varias veces entre 10). Nota:
////investigar la función trunc().

Algoritmo sin_titulo
	
	Definir digitos, num Como Entero
	
	digitos = 0
	
	Escribir "Ingrese un número positivo y veremos cuántos dígitos tiene:"
	Leer num
	
	Mientras num <= 0 Hacer
		Escribir "El número debe ser POSITIVO. Intente nuevamente:"
		Leer num
	Fin Mientras
	
	Mientras num <> 0 Hacer
		num = trunc(num/10)
		digitos = digitos + 1
	Fin Mientras
	
	Escribir "El número ingresado tiene ", digitos, " dígitos."
	
FinAlgoritmo
