Algoritmo sin_titulo
	Definir nota1, nota2, nota3 Como Entero
	Definir nota1Logica, nota2Logica, nota3Logica Como Logico
	
	Escribir "Ingrese la nota 1:"
	Leer nota1
	Escribir "Ingrese la nota 2:"
	Leer nota2
	Escribir "Ingrese la nota 3:"
	Leer nota3
	
	SI nota1 >= 1 Y nota1 <= 10 Entonces
		nota1Logica = Verdadero
	SiNo
		nota1Logica = Falso
	FinSi
	
	SI nota2 >= 1 Y nota1 <= 10 Entonces
		nota2Logica = Verdadero
	SiNo
		nota2Logica = Falso
	FinSi
	
	SI nota3 >= 1 Y nota1 <= 10 Entonces
		nota3Logica = Verdadero
	SiNo
		nota3Logica = Falso
	FinSi
	
	Si nota1Logica Y nota2Logica Y nota3Logica Entonces
		Escribir "Las 3 son verdaderas"
	SiNo
		Escribir "Al menos una de las 3 no es verdadera"
	FinSi
	
FinAlgoritmo
