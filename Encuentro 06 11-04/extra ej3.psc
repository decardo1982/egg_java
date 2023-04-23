//Hacer un algoritmo que lea un número por el teclado y determine si tiene tres dígitos

Algoritmo tresDigitos
	
	Definir num Como Entero
	Escribir "Ingrese un número:"
	Leer num
	
	Si Longitud(ConvertirATexto(num)) = 3 Entonces
		Escribir "El número ingresado es de 3 dígitos"
	SiNo
		Escribir "El número ingresado no es de 3 dígitos"
	FinSi
	
FinAlgoritmo
