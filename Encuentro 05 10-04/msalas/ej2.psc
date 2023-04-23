Algoritmo sin_titulo
	Definir numeroIngresado Como Entero
	
	Escribir "Ingrese un número"
	
	Leer numeroIngresado
	
	si numeroIngresado = 0 Entonces
		Escribir "El número ingresado e 0 y no tiene valor"
	SiNo
	
	SI numeroIngresado MOD 2 = 0 Entonces
		Escribir "El número ingresado ", numeroIngresado, " es par"
	SiNo
		Escribir "El número ingreso ", numeroIngresado " es impar"
	FinSi
	
FinAlgoritmo
