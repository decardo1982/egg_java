////Se debe realizar un programa que:
////	1�) Pida por teclado un n�mero (entero positivo).
////	2�) Pregunte al usuario si desea introducir o no otro n�mero.
////		3�) Repita los pasos 1� y 2� mientras que el usuario no responda n/N (no).
////		4�) Muestre por pantalla la suma de los n�meros introducidos por el usuario.


Algoritmo sin_titulo
	
	Definir num, suma Como Entero
	Definir respuesta Como Caracter
	
	suma = 0
	
	Hacer
		Escribir "Ingrese un n�mero:"
		Leer num
		suma = suma + num
		Escribir "�Desea ingresar otro n�mero?"
		Leer respuesta
	Mientras Que Minusculas(respuesta) <> "n" 
	
	Escribir "La sumatoria de los n�meros ingresados es: ", suma
	
	
	
FinAlgoritmo
