////Realizar un programa que lea un número entero (tamaño del lado) y a partir de él cree
////un cuadrado de asteriscos de ese tamaño. Los asteriscos sólo se verán en el borde del
////cuadrado, no en el interior. Por ejemplo, si se ingresa el número 4 se debe mostrar:
////		* * * *
////		*     *
////		*     *
////		* * * *


Algoritmo cuadrado
	
	Definir i, j, lado Como Entero
	
	Escribir "Ingrese un número para el lado del cuadrado:"
	Leer lado
	i = lado

	
	Para i <- 1 Hasta lado Con Paso 1 Hacer
		Para j <- 1 Hasta lado Con Paso 1 Hacer
			si i = 1 o i = lado o j = 1 o j = lado Entonces
				Escribir Sin Saltar "*"
			SiNo
				Escribir Sin Saltar " "
			FinSi
			
		FinPara
		Escribir " "
		
	FinPara
	
	
FinAlgoritmo
