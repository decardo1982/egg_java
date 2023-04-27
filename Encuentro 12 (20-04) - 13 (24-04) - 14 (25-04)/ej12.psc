//Realizar una funci�n que permita obtener el t�rmino n de la sucesi�n de Fibonacci. La
//sucesi�n de Fibonacci es la sucesi�n de los siguientes n�meros:
//	1, 1, 2, 3, 5, 8, 13, 21, 34, ...
//Donde cada uno de los n�meros se calcula sumando los dos anteriores a �l. Por ejemplo:
//	La sucesi�n del n�mero 2 se calcula sumando (1+1) An�logamente, la sucesi�n del n�mero 3 es (1+2),
//	Y la del 5 es (2+3),
//	Y as� sucesivamente
//La sucesi�n de Fibonacci se puede formalizar de acuerdo a la siguiente f�rmula:
//	Fibonacci (n) = Fibonacci (n-1) + Fibonacci (n-2) para todo n > 1
//	Fibonacci (n) = 1 para todo n <= 1
//	Por lo tanto, si queremos calcular el t�rmino "n" debemos escribir una funci�n que reciba
//	como argumento el valor de "n" y que calcule la serie hasta llegar a ese valor.
//	Para conocer m�s acerca de la serie de Fibonacci consultar el siguiente link:
//	https://quantdare.com/numeros-de-fibonacci/

Algoritmo fibonacci
	Definir n Como Entero
	Escribir "Ingrese un n�mero para obtener el t�rmino de la sucesi�n de Fibonacci:"
	Leer n
	
	Escribir "La sucesi�n es la siguiente: ", sucesionFibonacci(n)
	
FinAlgoritmo


Funcion serie <- sucesionFibonacci(n)
	
	Definir serie, aux1, aux2, i Como Entero
	aux1 = 0
	aux2 = 1
	i = 0
	serie = 1
	
	Si n <= 1 Entonces
		serie = 1
	SiNo
		Si n > 1 Entonces
			Para i <- 1 Hasta n Con Paso 1 Hacer
				serie = aux1 + aux2
				//Escribir serie
				aux2 = aux1
				aux1 = serie
			FinPara
		FinSi
	FinSi
	
	
	
	
	

FinFuncion
	