//Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero es
//primo o no. Un n�mero es primo cuando es divisible s�lo por 1 y por s� mismo, por ejemplo: 2,
//3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.

Algoritmo elNumeroEsPrimo
	Definir num Como Entero
	Escribir "Ingrese un n�mero para averiguar si es primo:"
	Leer num
	Escribir "El n�mero ", num, " �es primo? ", esPrimo(num)
FinAlgoritmo

Funcion retorno <- esPrimo(num)
	Definir retorno Como Logico
	Definir i, contador Como Entero
	i = 1
	contador = 0
	
	Para i<- 1 Hasta num Hacer
		Si num % i == 0 Entonces
			contador = contador + 1
		FinSi
		
	FinPara
	retorno = contador == 2 
	
	
FinFuncion
	