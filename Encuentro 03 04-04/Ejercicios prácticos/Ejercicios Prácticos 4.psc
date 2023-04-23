//Crear un programa que solicite al usuario que ingrese el precio de un producto al inicio del
//año, y el precio del mismo producto al finalizar el año. El programa debe calcular cuál fue el
//porcentaje de aumento que tuvo ese producto en el año y mostrarlo por pantalla.
Algoritmo porcentaje_aumento
	Definir precio_inicial, precio_final, porcentaje_variacion Como Real
	Escribir "Ingrese el precio del producto al inicio del año:"
	Leer precio_inicial
	Escribir "Ingrese el precio del producto al final del año:"
	Leer precio_final
	porcentaje_variacion = ((precio_final - precio_inicial) / precio_inicial) * 100
	Escribir "El porcentaje de variación fue de ", porcentaje_variacion, " %"
	
FinAlgoritmo
