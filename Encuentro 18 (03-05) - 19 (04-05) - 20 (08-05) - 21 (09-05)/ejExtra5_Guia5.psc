////Tomando en cuenta el ejercicio 6, mejore el mecanismo de inserción del carácter, facilitando
////un potencial reordenamiento del vector. Digamos que se pide ingresar el carácter en la
////posición X y la misma está ocupada, entonces de existir un espacio en cualquier posición X-n
////o X+n, desplazar los caracteres hacia la izq o hacia la derecha para poder ingresar el carácter
////en cuestión en el lugar deseado. El procedimiento de reordenamiento debe ubicar el espacio más cercano.
////Por ejemplo, suponiendo la siguiente frase y los subíndices del vector:
////H o l a   m u n d o     c  r  u  e  l  !  
////0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
////Si se desea ingresar el carácter "%" en la posición 8, entonces el resultado con desplazamiento
////sería:
////	h o l a   m u n % d  o     c  r  u  e  l  !  
////	0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
////Notar que el desplazamiento se hizo hacia la izquierda porque el espacio de la posición 10 estaba
////más cerca de la posición 8 que el espacio de la posición 4. Nota: en caso del que el desplazamiento
////sea a la izquierda y se requiera que se remueva la letra, se hará. Por ejemplo,
////para poner un "%" en la posición 6, haríamos un desplazamiento a la izquierda y borraríamos la letra h

Algoritmo ejExtra5_Guia5
	
	Definir i, posicion, vacio Como Entero
	Definir frase, vector, char Como Caracter
	Dimension vector[20]
	Hacer
		Escribir "Ingrese una frase de hasta 20 caracteres:"
		Leer frase
	Mientras Que Longitud(frase) > 20
	Escribir ""
	
	Para i <- 0 Hasta 19 Con Paso 1 Hacer
		vector[i] = Subcadena(frase, i, i)
	FinPara
	Si Longitud(frase) < 20 Entonces
		Para i <- Longitud(frase) Hasta 19 Hacer
			vector[i] = " "
		FinPara
	FinSi
	//Mostramos el vector por pantalla
	Para i <- 0 Hasta 19 Con Paso 1 Hacer
		Escribir Sin Saltar vector[i], "-" 
	FinPara
	
	Escribir ""
	Escribir "---------------------------------------------------------------------"
	Escribir "Ingrese un caracter y una posición dentro del vector para insertarlo:"
	Escribir "---------------------------------------------------------------------"
	Escribir "Caracter:"
	Leer char
	Escribir "Posición en el vector:"
	Leer posicion
	Escribir ""
	
	//	Si vector[posicion] = " " Entonces
	//		vector[posicion] = char
	//	SiNo
	//		Si posicion/10 > 1 Entonces
	//			Para i <- 19 Hasta (posicion) Con Paso -1 Hacer
	//				vector[i] = vector[i-1]
	//			FinPara
	//			vector[posicion] = char
	//		SiNo
	//			Para i <- 0 Hasta (posicion) Con Paso 1 Hacer
	//				vector[i] = vector[i+1]
	//			FinPara
	//			vector[posicion] = char
	//		FinSi
	//		
	//	FinSi
	
	Si vector[posicion] = " " Entonces
		vector[posicion] = char
	SiNo
		Si buscarEspacio(vector, posicion) = "derecha" Entonces
			Para i <- 19 Hasta (posicion) Con Paso -1 Hacer
				vector[i] = vector[i-1]
			FinPara
			vector[posicion] = char
		SiNo
			Para i <- 0 Hasta (posicion) Con Paso 1 Hacer
				vector[i] = vector[i+1]
			FinPara
			vector[posicion] = char
		FinSi
		
	FinSi
	
	//mostramos el vector final por pantalla:
	Escribir ""
	Para i <- 0 Hasta 19 Con Paso 1 Hacer
		Escribir Sin Saltar vector[i]
	FinPara
	Escribir ""
	
FinAlgoritmo

Funcion direccion <- buscarEspacio(vector, posicion)
	Definir direccion Como Caracter
	Definir i, izquierda, derecha Como Entero
	Definir check Como Logico
	check = Falso
	izquierda = 100
	derecha = 100
	
	
	Para i <- posicion Hasta 0 Con Paso -1 Hacer
		Si check = Falso Entonces
			Si vector[i] = " " Entonces
				izquierda = posicion - i 
				check = Verdadero
			FinSi
		FinSi
	FinPara
	
	check = Falso
	
	Para i <- posicion Hasta 19 Con Paso 1 Hacer
		Si check = Falso Entonces
			Si vector[i] = " " Entonces
				derecha = i - posicion
				check = Verdadero
			FinSi
		FinSi
	FinPara
	Escribir izquierda
	Escribir derecha
	Si izquierda < derecha Entonces
		direccion = "izquierda"
		Escribir "izquierda"
	SiNo
		direccion = "derecha"
		Escribir "derecha"
	FinSi
FinFuncion


