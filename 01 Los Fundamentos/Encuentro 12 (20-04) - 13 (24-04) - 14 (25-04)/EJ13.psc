//Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero es
//capic�a o no (Por ejemplo: 12321). Nota: recordar el uso del MOD y el Trunc. No podemos
//		transformar el numero a cadena para realizar el ejercicio.
//ok

Algoritmo capicua
	Definir n Como Entero
	Escribir "Ingrese un n�mero para averiguar si es capic�a:"
	Leer n
	
	Escribir "El n�mero ", n, " �es capic�a? ", esCapicua(n)
	
	
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
