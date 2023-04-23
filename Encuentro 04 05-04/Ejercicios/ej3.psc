//Ejercicio 3
//Se pide ingresar una letra del alfabeto y mostrar si dicha letra es vocal o consonante.
Algoritmo sin_titulo
	Definir letraIngresada Como Caracter
	
	Escribir "Ingrese una letra:"
	leer letraIngresada
	
	Si Minusculas(letraIngresada) == "a" O letraIngresada == "e" O letraIngresada == "i" O letraIngresada == "o" O letraIngresada == "u" Entonces
		Escribir "La letra ingresada ", letraIngresada, " es una vocal"
	SiNo
		Escribir "La letra ingresada ", letraIngresada, " es una consonante"
	FinSi
FinAlgoritmo
