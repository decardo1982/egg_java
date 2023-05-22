Algoritmo sin_titulo
	Definir palabraIngresada Como Caracter
	Escribir "Ingrese una palabra"
	Leer palabraIngresada
	
	Escribir "Funcion longitud: ", Longitud(palabraIngresada)
	
	Si Longitud(palabraIngresada) = 4 Entonces
		palabraIngresada = palabraIngresada + Concatenar(palabraIngresada, "!")
	SiNo
		palabraIngresada = palabraIngresada + Concatenar(palabraIngresada, "?")
	FinSi
	
	Escribir palabraIngresada
	
FinAlgoritmo
