////La función factorial se aplica a números enteros positivos. El factorial de un número
////entero positivo (!n) es igual al producto de los enteros positivos desde 1 hasta n:
////	n! = 1 * 2 * 3 * 4 * 5 * (n-1) * n
////	Escriba un programa que calcule las factoriales de todos los números enteros desde el 1
////hasta el 5. El programa deberá mostrar la siguiente salida:
////	!1 = 1
////	!2 = 1*2 = 2
////	...
////	!5 = 1*2*3*4*5 = 120

Algoritmo factorial
	
	Definir n, i, fact Como Real
	Definir respuesta Como Caracter
	
	Escribir "Ingrese el número:"
	Leer n
	
	Mientras n < 0 Hacer
		Escribir "El número debe ser positivo"
		Leer n
	FinMientras
	
	
	fact = 1
	respuesta = ""
	Para i <- 1 hasta n Con Paso 1 Hacer
		fact = fact * i
		Si i<n Entonces
			respuesta = respuesta + ConvertirATexto(i) + " x "
		SiNo
			respuesta = respuesta + ConvertirATexto(i)
		Fin Si
	FinPara
	
	Escribir "!", n, " = ", respuesta, " = ", fact
	
FinAlgoritmo
