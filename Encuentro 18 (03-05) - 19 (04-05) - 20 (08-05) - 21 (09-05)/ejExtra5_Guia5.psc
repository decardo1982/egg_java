////Tomando en cuenta el ejercicio 6, mejore el mecanismo de inserción del carácter, facilitando
////un potencial reordenamiento del vector. Digamos que se pide ingresar el carácter en la
////posición X y la misma está ocupada, entonces de existir un espacio en cualquier posición X-n
////o X+n, desplazar los caracteres hacia la izq o hacia la derecha para poder ingresar el carácter
////	en cuestión en el lugar deseado. El procedimiento de reordenamiento debe ubicar el espacio
////	más cercano.
////Por ejemplo, suponiendo la siguiente frase y los subíndices del vector:

Algoritmo ejExtra5_Guia5
	
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
	//Mostramos el vector por pantalla
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
