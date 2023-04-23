Algoritmo sin_titulo
	Definir numeroIngresado Como Entero
	
	Escribir "Ingrese un numero"
	Leer numeroIngresado
	
	Si numeroIngresado = 0 Entonces
		Escribir "El numeroIngresado es 0 y no es par ni impar"
	SiNo
		Si numeroIngresado Mod 2 = 0 Entonces
			Escribir "El numero ", numeroIngresado, " es par"
		SiNo
			Escribir "El numero ", numeroIngresado, " es impar"
		Fin Si
	Fin Si
	
FinAlgoritmo
