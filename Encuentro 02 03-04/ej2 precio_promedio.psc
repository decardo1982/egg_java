//Escribir un programa que calcule el precio promedio de un producto. El precio promedio se
//debe calcular a partir del precio del mismo producto en tres establecimientos distintos.

Algoritmo precio_promedio
	Definir precio1 Como Real
	Definir precio2 Como Real
	Definir precio3 Como Real
	Definir promedio Como Real
	Escribir "Ingrese los 3 valores de precios:"
	Leer precio1, precio2, precio3
	promedio = (precio1 + precio2 + precio3) / 3
	Escribir "El promedio de los precios es ", promedio
	
FinAlgoritmo
