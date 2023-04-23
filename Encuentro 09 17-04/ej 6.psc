////Siguiendo el ejercicio 2 de los ejercicios principales, ahora deberemos hacer lo mismo
////pero que la cadena se muestre al revés. Por ejemplo, si tenemos la cadena: Hola,
////		deberemos mostrar a l o H.
//ok

Algoritmo espacioEntreLetras
	
	Definir frase Como Caracter
	Definir i Como Entero
	
	
	Escribir "Ingrese una palabra:"
	Leer frase
	
	i = Longitud(frase)
	
	Para i <- i Hasta 0 Con Paso -1 Hacer
		Escribir Sin Saltar Subcadena(frase, i-1, i-1), " "
	Fin Para
	
FinAlgoritmo