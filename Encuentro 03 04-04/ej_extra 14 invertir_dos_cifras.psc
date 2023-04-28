//Dado un número de dos cifras, diseñe un algoritmo que permita obtener el número
//	invertido. Ejemplo, si se introduce 23 que muestre 32.
Algoritmo invertir_dos_cifras
	
	Definir num, unidad, decena Como Entero
	Escribir "Por favor, ingrese un número de 2 cifras:"
	leer num
	
	decena = trunc(num/10)
	unidad = num % 10
	
	Escribir "El número invertido sería ", unidad, decena
	
FinAlgoritmo
