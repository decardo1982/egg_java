////Realizar un programa que pida una frase y el programa deber� mostrar la frase con un
////espacio entre cada letra. La frase se mostrar� as�: H o l a. Nota: recordar el
////		funcionamiento de la funci�n Subcadena().

////	NOTA:. En PseInt, si queremos escribir sin que haya saltos de l�nea, al final de la
////		operaci�n "escribir" escribimos "sin saltar". Por ejemplo:
////			Escribir sin saltar "Hola, "
////			Escribir sin saltar "c�mo est�s?"
////		Imprimir� por pantalla: Hola, c�mo est�s?
//ok


Algoritmo espacioEntreLetras
	
	Definir frase Como Caracter
	Definir i Como Entero
	
	
	Escribir "Ingrese una palabra:"
	Leer frase
	
	i = Longitud(frase)
	
	Para i <- 1 Hasta i Con Paso 1 Hacer
		Escribir Sin Saltar Subcadena(frase, i-1, i-1), " "
	Fin Para
		
FinAlgoritmo
