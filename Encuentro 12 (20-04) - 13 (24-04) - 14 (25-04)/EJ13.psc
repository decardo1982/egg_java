//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número es
//capicúa o no (Por ejemplo: 12321). Nota: recordar el uso del MOD y el Trunc. No podemos
//		transformar el numero a cadena para realizar el ejercicio.
//ok

Algoritmo capicua
	Definir n Como Entero
	Escribir "Ingrese un número para averiguar si es capicúa:"
	Leer n
	
	Escribir "El número ", n, " ¿es capicúa? ", esCapicua(n)
	
	
FinAlgoritmo

Funcion retorno <- esCapicua(n)
	Definir retorno Como Logico
	Definir invertido, aux Como Entero
	invertido = 0
	aux = n
	
	Mientras aux <> 0 Hacer
		invertido = invertido * 10 + aux % 10
		aux = trunc(aux / 10)
	FinMientras
	
	retorno = n == invertido

FinFuncion
