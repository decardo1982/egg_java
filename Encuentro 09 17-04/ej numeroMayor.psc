////EJERCICIO NUMERO MAYOR
////Escribir una estructura PARA que le solicite al usuario varios n�meros y al finalizar muestre el
////	mayor n�mero ingresado.

Algoritmo numeroMayor
	
	Definir numIngresado, i, numMayor Como Entero
	
	numMayor = 0
	
	Escribir "�Cu�ntos n�meros va a ingresar?"
	Leer i
	
	Para i <-1 Hasta  i Con Paso 1 Hacer
		Escribir "Ingrese un n�mero:"
		Leer numIngresado
		Si numIngresado > numMayor Entonces
			numMayor = numIngresado
		FinSi
	Fin Para
	
	Escribir "El n�mero mayor ingresado es: ", numMayor
	
FinAlgoritmo
