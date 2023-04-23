Algoritmo sin_titulo
	Definir letraIngresada Como Caracter
	Escribir "Ingrese por favor una letra: "
	leer letraIngresada
	
	Mientras letraIngresada = "1" O letraIngresada = "2" O letraIngresada = "3" O letraIngresada = "4" O letraIngresada = "5" O letraIngresada = "6"  Hacer
		Escribir "Ingrese por favor una letra no un NUMERO: "
		leer letraIngresada
	Fin Mientras
	Si Minusculas(letraIngresada) = "a" O Minusculas(letraIngresada) = "e" O Minusculas(letraIngresada) = "i" O Minusculas(letraIngresada) = "o" O Minusculas(letraIngresada)="u"  Entonces
		Escribir "Usted ingreso ",letraIngresada," que efectivamente es una vocal"
	SiNo
		Escribir "Usted ingreso una consonante"
	Fin Si
	
	
FinAlgoritmo
