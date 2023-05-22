Algoritmo sin_titulo
	Definir nota1, nota2, nota3 Como Entero
	Definir nota1Logica, nota2Logica, nota3Logica como Logico
	
	Escribir "Ingrese la nota1"
	leer nota1
	Escribir "Ingrese la nota2"
	leer nota2
	Escribir "Ingrese la nota3"
	leer nota3
	
	Si nota1 >0 Y nota1 <11 Entonces
		nota1Logica = Verdadero
	SiNo
		nota1Logica = Falso
	Fin Si
	
	Si nota2 >0 Y nota2 <11 Entonces
		nota2Logica = Verdadero
	SiNo
		nota2Logica = Falso
	Fin Si
	
	Si nota3 >0 Y nota3 <11 Entonces
		nota3Logica = Verdadero
	SiNo
		nota3Logica = Falso
	Fin Si
	
	Si nota1Logica Y nota2Logica Y nota3Logica Entonces
		Escribir "Las 3 son verdaderas "
	SiNo
		Escribir "Al menos una de las 3 no es verdadera "
	Fin Si
	
FinAlgoritmo
