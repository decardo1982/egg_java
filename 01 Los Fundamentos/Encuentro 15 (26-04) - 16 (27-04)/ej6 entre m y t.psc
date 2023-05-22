////Realizar un subproceso que reciba una letra y muestre un mensaje si esa letra esta entre las
////		letras "M" y "T". Recordar que Pseint le da un valor numérico a cada letra a través del Código
////		Ascii, lo que nos deja usar operadores relacionales con letras y cadenas.

Algoritmo entreMyT
	
	Definir letra Como Caracter
	Escribir "Ingrese una letra:"
	Leer letra
	buscarLetra(letra)
	
FinAlgoritmo

SubProceso buscarLetra(letra)
	
	si Mayusculas(letra) > "M" Y Mayusculas(letra) < "T" Entonces
		Escribir "Un mensaje"
	SiNo
		si Mayusculas(letra) == "Ñ" Entonces
			Escribir "un mensaje"
		FinSi
	FinSi
	
	
FinSubProceso
	