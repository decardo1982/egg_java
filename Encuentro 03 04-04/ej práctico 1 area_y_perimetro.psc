//Solicitar al usuario que ingrese la base y altura de un rectángulo, y calcular y mostrar por
//pantalla el área y perímetro del mismo
	///area = base * altura
	///perimetro = 2 * altura + 2 * base.
Algoritmo area_y_perimetro
	Definir base, altura, area, perimetro Como Real
	Escribir "Ingrese el valor de la base del rectángulo:"
	Leer base
	Escribir "Ingrese el valor de la altura del rectángulo:"
	Leer altura
	area = base * altura
	perimetro = (base * 2) + (altura * 2)
	Escribir "El área del rectángulo es ", area, " y el perímetro es ", perimetro
FinAlgoritmo
