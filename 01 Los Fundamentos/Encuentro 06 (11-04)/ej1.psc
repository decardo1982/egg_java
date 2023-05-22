//Construir un programa que simule un men� de opciones para realizar las cuatro
//operaciones aritm�ticas b�sicas (suma, resta, multiplicaci�n y divisi�n) con dos valores
//num�ricos enteros. El usuario, adem�s, debe especificar la operaci�n con el primer
//car�cter de la operaci�n que desea realizar: 'S' o 's' para la suma, 'R' o 'r' para la resta,
//	'M' o 'm' para la multiplicaci�n y 'D' o 'd' para la divisi�n.

Algoritmo menuCalculadora
	
	Definir operacion Como Caracter
	Definir num1, num2 Como Entero
	Definir resultado Como Real
	
	Escribir "Ingrese la primera letra de la operaci�n matem�tica b�sica que necesita realizar"
	Escribir "S para suma"
	Escribir "R para resta"
	Escribir "M para multiplicaci�n"
	Escribir "D para divisi�n"
	
	Leer operacion
		
	Segun operacion Hacer
		"s", "S":
			Escribir "Ingrese el primer n�mero:"
			Leer num1
			Escribir "Ingrese el segundo n�mero:"
			Leer num2
			resultado = num1 + num2
			Escribir "El resultado de la suma es ", resultado
		"r", "R":
			Escribir "Ingrese el primer n�mero:"
			Leer num1
			Escribir "Ingrese el segundo n�mero:"
			Leer num2
			resultado = num1 - num2
			Escribir "El resultado de la resta es ", resultado
		"m", "M":
			Escribir "Ingrese el primer n�mero:"
			Leer num1
			Escribir "Ingrese el segundo n�mero:"
			Leer num2
			resultado = num1 * num2
			Escribir "El resultado de la multiplicaci�n es ", resultado
		"d", "D":
			Escribir "Ingrese el primer n�mero:"
			Leer num1
			Escribir "Ingrese el segundo n�mero:"
			Leer num2
			resultado = num1 / num2
			Escribir "El resultado de la divisi�n es ", resultado
		De Otro Modo:
			Escribir "La operaci�n solicitada no est� entre las opciones."
	Fin Segun
	
FinAlgoritmo
