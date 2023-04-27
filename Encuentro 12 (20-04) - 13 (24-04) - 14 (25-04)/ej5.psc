//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número es
//primo o no. Un número es primo cuando es divisible sólo por 1 y por sí mismo, por ejemplo: 2,
//3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.

Algoritmo elNumeroEsPrimo
	Definir num Como Entero
	Escribir "Ingrese un número para averiguar si es primo:"
	Leer num
	Escribir "El número ", num, " ¿es primo? ", esPrimo(num)
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
	