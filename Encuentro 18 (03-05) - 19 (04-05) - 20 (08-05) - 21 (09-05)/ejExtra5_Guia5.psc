////Tomando en cuenta el ejercicio 6, mejore el mecanismo de inserci�n del car�cter, facilitando
////un potencial reordenamiento del vector. Digamos que se pide ingresar el car�cter en la
////posici�n X y la misma est� ocupada, entonces de existir un espacio en cualquier posici�n X-n
////o X+n, desplazar los caracteres hacia la izq o hacia la derecha para poder ingresar el car�cter
////	en cuesti�n en el lugar deseado. El procedimiento de reordenamiento debe ubicar el espacio
////	m�s cercano.
////Por ejemplo, suponiendo la siguiente frase y los sub�ndices del vector:

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
	Escribir "Ingrese un caracter y una posici�n dentro del vector para insertarlo:"
	Escribir "---------------------------------------------------------------------"
	Escribir "Caracter:"
	Leer caract
	Escribir "Posici�n en el vector:"
	Leer posicion
	Escribir ""
	
	Si vector[posicion] = " " Entonces
		vector[posicion] = caract
		Escribir "Caracter insertado!"
	SiNo
		Escribir "La posici�n est� ocupada, caracter no insertado."
	FinSi
	Escribir ""
	Para i <- 0 Hasta 19 Con Paso 1 Hacer
		Escribir Sin Saltar vector[i]
	FinPara
	
	
FinAlgoritmo
