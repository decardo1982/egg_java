////Disponemos de un vector unidimensional de 20 elementos de tipo carácter. Se pide
////desarrollar un programa que:
////	a) Pida una frase al usuario y luego ingrese la frase dentro del arreglo letra por letra.
////Ayuda: utilizar la función Subcadena de PSeInt.
////	b) Una vez completado lo anterior, pedirle al usuario un carácter cualquiera y una
////	posición dentro del arreglo, y el programa debe intentar ingresar el carácter en la
////	posición indicada, si es que hay lugar (es decir la posición está vacía o es un espacio
////	en blanco). De ser posible debe mostrar el vector con la frase y el carácter ingresado,
////	de lo contrario debe darle un mensaje al usuario de que esa posición estaba ocupada.

Algoritmo ej6_G5
	
	Definir i, posicion Como Entero
	Definir frase, vector, caract Como Caracter
	Dimension vector[20]
	Hacer
		Escribir "Ingrese una frase de hasta 20 caracteres:"
		Leer frase
	Mientras Que Longitud(frase) > 20
	
	Para i <- 0 Hasta 19 Con Paso 1 Hacer
		vector[i] = Subcadena(frase, i, i)
	FinPara
	
	Para i <- 0 Hasta 19 Con Paso 1 Hacer
		Escribir Sin Saltar vector[i]
	FinPara
	Escribir ""
	Escribir "---------------------------------------------------------------------"
	Escribir "Ingrese un caracter y una posición dentro del vector para insertarlo:"
	Escribir "---------------------------------------------------------------------"
	Escribir "Caracter:"
	Leer caract
	Escribir "Posición en el vector:"
	Leer posicion
	Escribir ""
	
	Si vector[posicion] = " " Entonces
		vector[posicion] = caract
		Escribir "Caracter insertado!"
	SiNo
		Escribir "La posición está ocupada, caracter no insertado."
	FinSi
	Escribir ""
	Para i <- 0 Hasta 19 Con Paso 1 Hacer
		Escribir Sin Saltar vector[i]
	FinPara

	
FinAlgoritmo
