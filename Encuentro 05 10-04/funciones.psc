Algoritmo funciones
	
	////	Veremos ejemplos de funciones matemáticas en PSeInt
	
	Definir num Como Real
	Escribir "Ingrese un número:"
	Leer num
	
	Escribir "La raíz cuadrada de ", num, " es ", rc(num)
	Escribir "El valor absoludo de ", num, " es ", abs(num)
	Escribir "El logaritmo natural de ", num, " es ", ln(num)
	Escribir "La función exponencial de ", num, " es ", exp(num)
	Escribir "El seno de ", num, " es ", sen(num)
	Escribir "El coseno de ", num, " es ", cos(num)
	Escribir "La tangente de ", num, " es ", tan(num)
	
//	Dado que para calcular arcoseno y arcocoseno el valor de num debe estar entre -1 y 1, se aplica función SI para que no haya errores
	Si num >= -1 Y num <= 1 Entonces
		Escribir "El arcoseno de ", num, " es ", asen(num)
		Escribir "El arcocoseno de ", num, " es ", acos(num)
	FinSi
	
	Escribir "El arco tangente de ", num, " es ", atan(num)
	Escribir "El resto de la división entera de ", num, " es ", num mod num + 1
	Escribir "La parte entera de ", num, " es ", trunc(num)
	Escribir "El valor redondeado más cercano a ", num, " es ", redon(num)
	Escribir "Un valor al azar entre 0 y ", num - 1, " es ", azar(num)
	Escribir "Un valor aleatorio entre ", num, " y 100.000 es ", Aleatorio(num, 100000)
	
	////	Funciones de cadenas de texto
	
	Definir textoIngresado Como Caracter
	Escribir "Ingrese una frase o palabra:"
	Leer textoIngresado
	
	Escribir "El texto tiene una longitud de ", Longitud(textoIngresado), " caracteres."
	Escribir "El texto en mayúsculas queda así: ", Mayusculas(textoIngresado)
	Escribir "El texto en minúsculas queda así: ", Minusculas(textoIngresado)
	
	Escribir "Definimos cadena1 = programacion y cadena2 = EGG"
	Definir cadena1,cadena2 como cadena
	cadena1 = "programacion"
	cadena2 = "EGG"
	Escribir "La longitud de cadena1 es: " longitud(cadena1)
	Escribir "El primer carácter de cadena1 es: " subcadena(cadena1,0,0)
	Escribir "La cadena1 en mayúsculas es: " mayusculas(cadena1)
	Escribir "La cadena2 en minusculas es: " minusculas(cadena2)
	Escribir "La cadena concatenada queda como: " concatenar(cadena1," es muy interesante")
	Escribir "La cadena convertida a numero queda:" convertirANumero("10")
	
	
	
	
	
	
	
FinAlgoritmo
