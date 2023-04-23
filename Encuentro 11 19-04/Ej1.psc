////Realizar un programa que lea 5 números (comprendidos entre 1 y 20) e imprima el número
////ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
////	5 *****
////	3 ***
////	11 ***********
////	2 **
////	9 *********

Algoritmo asteriscos
	
	Definir cantNum, num, i, j Como Entero
	i = 0
	cantNum = 0
	Escribir "Informar cuántos número va a ingresar:"
	Leer cantNum
	Escribir ""
	Escribir "-----------------------------------------------------"
	Escribir " Deberá ingresar ", cantNum, " números comprendidos entre 1 y 20"
	Escribir "-----------------------------------------------------"
	Escribir ""
	
	Para i <- 1 Hasta cantNum Con Paso 1 Hacer
		Escribir "Ingrese el ", i, "º número:"
		Leer num
		
		Mientras num < 1 O num > 20 Hacer
			Escribir "El número debe estar entre 1 y 20, intente de nuevo:"
			Leer num
		Fin Mientras	
		Para j <- 1 Hasta num Con Paso 1 Hacer
			Si j = 1 Entonces
				Escribir Sin Saltar num, " "
			FinSi
			Escribir Sin Saltar "*"
		FinPara
		Escribir ""
	FinPara
	Escribir ""
	Escribir "¡Gracias!"
	Escribir ""
	
	
FinAlgoritmo
