////Escribir un programa que lea un n�mero entero y devuelva el n�mero de d�gitos que
////componen ese n�mero. Por ejemplo, si introducimos el n�mero 12345, el programa
////deber� devolver 5. Calcular la cantidad de d�gitos matem�ticamente utilizando el operador
////de divisi�n. Nota: recordar que las variables de tipo entero truncan los n�meros o resultados.

Algoritmo ej2
	
	Definir num, digitos, numInicial Como Real
	
//	Solicitamos al usuario que ingrese un n�mero
	Escribir "Ingrese un n�mero de hasta 10 d�gitos:"
	Leer num
	//	Definimos que si el n�mero ingresado es 0, directamente indicamos que tiene 1 d�gito
	//	ya que si corremos el programa, el mismo indicar� que tiene 0 d�gitos.
	
	Si num = 0 Entonces
		Escribir "El n�mero 0 tiene 1 d�gito."
	SiNo
		numInicial = num
		digitos = 0
		Mientras num <> 0 Hacer
			num = trunc(num /10)
			digitos = digitos + 1
		Fin Mientras
		Si digitos > 10 Entonces
			Escribir "El n�mero ingresado tiene m�s de 10 d�gitos"
		SiNo
			Escribir "El n�mero ", numInicial, " tiene ", digitos, " d�gitos."
		FinSi
	FinSi
	
FinAlgoritmo
