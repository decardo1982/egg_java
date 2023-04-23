//Ingrese un numero de 3 cifras y muestre la centena, decena y unidad
Algoritmo sin_titulo
	Definir num, centena, decena, unidad Como Real
	Escribir "Ingrese un número de 3 cifras:"
	Leer num
//	Tomamos el número, por ejemplo, 123
	unidad = num % 10 
//	Divide 123 / 10 = 12,3 entonces saca el resto que sería 3
	num = TRUNC(num/10)
//trunca el 12,3 y num queda definido como 12
	decena = num % 10
//mismo paso que el anterior, divide 12 / 10 = 1,2 entonces saca el resto que seria 2
	num = TRUNC(num/10)
//trunca el 1,2 y num queda definido como 1
	centena = num % 10
//
	
	Escribir "Centena: ", centena
	Escribir "Decena: ", decena
	Escribir "Unidad: ", unidad
	
FinAlgoritmo
