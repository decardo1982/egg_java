////Escribir un programa que lea un número entero y devuelva el número de dígitos que
////componen ese número. Por ejemplo, si introducimos el número 12345, el programa
////deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
////de división. Nota: recordar que las variables de tipo entero truncan los números o resultados.

Algoritmo ej2
	
	Definir num, digitos, numInicial Como Real
	
//	Solicitamos al usuario que ingrese un número
	Escribir "Ingrese un número de hasta 10 dígitos:"
	Leer num
	//	Definimos que si el número ingresado es 0, directamente indicamos que tiene 1 dígito
	//	ya que si corremos el programa, el mismo indicará que tiene 0 dígitos.
	
	Si num = 0 Entonces
		Escribir "El número 0 tiene 1 dígito."
	SiNo
		numInicial = num
		digitos = 0
		Mientras num <> 0 Hacer
			num = trunc(num /10)
			digitos = digitos + 1
		Fin Mientras
		Si digitos > 10 Entonces
			Escribir "El número ingresado tiene más de 10 dígitos"
		SiNo
			Escribir "El número ", numInicial, " tiene ", digitos, " dígitos."
		FinSi
	FinSi
	
FinAlgoritmo
