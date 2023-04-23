Algoritmo sin_titulo
	Definir palabraIngresada Como Caracter
	Escribir "Por favor ingresa una palabra"
	Leer palabraIngresada
	
	Si Longitud(palabraIngresada) = 4 Entonces
		Escribir "Correcto usted ingreso una palabra de 4 digitos"
		palabraIngresada = Concatenar(palabraIngresada,"!")
		
	SiNo
		Escribir "Incorrecto usted ingreso una palabra de ",Longitud(palabraIngresada), " digitos "
		palabraIngresada = Concatenar(palabraIngresada,"?")

	Fin Si
	
	Escribir  palabraIngresada
FinAlgoritmo
