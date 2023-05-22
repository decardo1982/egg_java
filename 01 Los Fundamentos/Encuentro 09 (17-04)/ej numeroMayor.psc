////EJERCICIO NUMERO MAYOR
////Escribir una estructura PARA que le solicite al usuario varios números y al finalizar muestre el
////	mayor número ingresado.

Algoritmo numeroMayor
	
	Definir numIngresado, i, numMayor Como Entero
	
	numMayor = 0
	
	Escribir "¿Cuántos números va a ingresar?"
	Leer i
	
	Para i <-1 Hasta  i Con Paso 1 Hacer
		Escribir "Ingrese un número:"
		Leer numIngresado
		Si numIngresado > numMayor Entonces
			numMayor = numIngresado
		FinSi
	Fin Para
	
	Escribir "El número mayor ingresado es: ", numMayor
	
FinAlgoritmo
