//Construir un programa que simule un menú de opciones para realizar las cuatro
//operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores
//numéricos enteros. El usuario, además, debe especificar la operación con el primer
//carácter de la operación que desea realizar: 'S' o 's' para la suma, 'R' o 'r' para la resta,
//	'M' o 'm' para la multiplicación y 'D' o 'd' para la división.

Algoritmo menuCalculadora
	
	Definir operacion Como Caracter
	Definir num1, num2 Como Entero
	Definir resultado Como Real
	
	Escribir "Ingrese la primera letra de la operación matemática básica que necesita realizar"
	Escribir "S para suma"
	Escribir "R para resta"
	Escribir "M para multiplicación"
	Escribir "D para división"
	
	Leer operacion
		
	Segun operacion Hacer
		"s", "S":
			Escribir "Ingrese el primer número:"
			Leer num1
			Escribir "Ingrese el segundo número:"
			Leer num2
			resultado = num1 + num2
			Escribir "El resultado de la suma es ", resultado
		"r", "R":
			Escribir "Ingrese el primer número:"
			Leer num1
			Escribir "Ingrese el segundo número:"
			Leer num2
			resultado = num1 - num2
			Escribir "El resultado de la resta es ", resultado
		"m", "M":
			Escribir "Ingrese el primer número:"
			Leer num1
			Escribir "Ingrese el segundo número:"
			Leer num2
			resultado = num1 * num2
			Escribir "El resultado de la multiplicación es ", resultado
		"d", "D":
			Escribir "Ingrese el primer número:"
			Leer num1
			Escribir "Ingrese el segundo número:"
			Leer num2
			resultado = num1 / num2
			Escribir "El resultado de la división es ", resultado
		De Otro Modo:
			Escribir "La operación solicitada no está entre las opciones."
	Fin Segun
	
FinAlgoritmo
