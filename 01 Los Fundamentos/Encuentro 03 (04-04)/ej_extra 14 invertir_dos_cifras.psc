//Dado un n�mero de dos cifras, dise�e un algoritmo que permita obtener el n�mero
//	invertido. Ejemplo, si se introduce 23 que muestre 32.
Algoritmo invertir_dos_cifras
	
	Definir num, unidad, decena Como Entero
	Escribir "Por favor, ingrese un n�mero de 2 cifras:"
	leer num
	
	decena = trunc(num/10)
	unidad = num % 10
	
	Escribir "El n�mero invertido ser�a ", unidad, decena
	
FinAlgoritmo
