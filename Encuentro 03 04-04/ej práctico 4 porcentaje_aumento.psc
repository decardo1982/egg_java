//Crear un programa que solicite al usuario que ingrese el precio de un producto al inicio del
//a�o, y el precio del mismo producto al finalizar el a�o. El programa debe calcular cu�l fue el
//porcentaje de aumento que tuvo ese producto en el a�o y mostrarlo por pantalla.
Algoritmo porcentaje_aumento
	Definir precio_inicial, precio_final, porcentaje_variacion Como Real
	Escribir "Ingrese el precio del producto al inicio del a�o:"
	Leer precio_inicial
	Escribir "Ingrese el precio del producto al final del a�o:"
	Leer precio_final
	porcentaje_variacion = ((precio_final - precio_inicial) / precio_inicial) * 100
	Escribir "El porcentaje de variaci�n fue de ", porcentaje_variacion, " %"
	
FinAlgoritmo
