////Escribir un programa que calcule cu�ntos d�gitos tiene un n�mero entero positivo sin
////convertirlo a cadena (pista: se puede hacer dividiendo varias veces entre 10). Nota:
////investigar la funci�n trunc().

Algoritmo sin_titulo
	
	Definir digitos, num Como Entero
	
	digitos = 0
	
	Escribir "Ingrese un n�mero positivo y veremos cu�ntos d�gitos tiene:"
	Leer num
	
	Mientras num <= 0 Hacer
		Escribir "El n�mero debe ser POSITIVO. Intente nuevamente:"
		Leer num
	Fin Mientras
	
	Mientras num <> 0 Hacer
		num = trunc(num/10)
		digitos = digitos + 1
	Fin Mientras
	
	Escribir "El n�mero ingresado tiene ", digitos, " d�gitos."
	
FinAlgoritmo
