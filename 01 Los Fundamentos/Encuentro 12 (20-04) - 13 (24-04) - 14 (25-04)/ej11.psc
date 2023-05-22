//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número
//tiene todos sus dígitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener que separar el
//		numero en partes (si es un numero de más de un digito) y ver si cada número es par o impar.
//		Nota: recordar el uso de la función Mod y Trunc(). No podemos pasar el numero a cadena para
//				realizar el ejercicio.
//ok

Algoritmo digitosImpares
	
	Definir num Como Real
	Escribir "Ingrese un número para averiguar si todos los dígitos son impares:"
	Leer num	
	Escribir "El número ", num, " ¿tiene todos sus dígitos impares? ", impares(num)
	
FinAlgoritmo

Funcion retorno <- impares(num)
	Definir retorno Como logico
	Definir check Como Entero
	check = 0
	retorno = Verdadero
	
	Si num % 2 = 0 Entonces
		retorno = Falso
	SiNo
		Mientras num <> 0 Y num % 2 <> 0 Y retorno = Verdadero Hacer
			check = check + (num % 10)
			num = trunc(num/10)
		FinMientras
	FinSi
	
FinFuncion