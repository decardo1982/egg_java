////Hacer un algoritmo para calcular la media de los n�meros pares e impares, s�lo se
////ingresar� diez n�meros.

Algoritmo paresEImpares
	
	Definir contador, numIngresado, sumaPares, sumaImpares, cantPares, cantImpares Como Entero
	
	contador = 10
	sumaImpares = 0
	sumaPares = 0
	cantImpares = 0
	cantPares = 0
	
	Hacer
		Escribir "Ingrese un n�mero:"
		Leer numIngresado
		
		Si numIngresado % 2 = 0 Entonces
			sumaPares = sumaPares + numIngresado
			cantPares = cantPares + 1
		SiNo
			sumaImpares = sumaImpares + numIngresado
			cantImpares = cantImpares + 1
		FinSi
		contador = contador - 1
	Mientras Que contador <> 0
	
	Escribir "El promedio de los n�mero pares es: ", sumaPares / cantPares
	Escribir "El promedio de los n�mero impares es: ", sumaImpares/ cantImpares
	
FinAlgoritmo
