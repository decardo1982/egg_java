//Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase. La
//función debe devolver la cantidad de veces que encontró la letra. Nota: recordar el uso de la
//	función Subcadena().
//ok

Funcion contadorLetra <- cantLetras(frase, letra)
	Definir i, contadorLetra Como Entero
	i = 0
	contadorLetra = 0
	Para i = 0 Hasta Longitud(frase) Con Paso 1 Hacer
		si Mayusculas(letra) == Mayusculas(Subcadena(frase, i, i)) Entonces
			contadorLetra = contadorLetra + 1
		FinSi
	Fin Para
	
FinFuncion

Algoritmo buscarLetra
	
	Definir frase, letra Como Caracter
	
	Escribir "Ingrese la frase:"
	Leer frase
	Escribir "Ingrese la letra a buscar:"
	Leer letra
	
	Escribir "La letra ", letra, " se encuentra ", cantLetras(frase, letra), " veces en la frase ", frase
	
FinAlgoritmo

