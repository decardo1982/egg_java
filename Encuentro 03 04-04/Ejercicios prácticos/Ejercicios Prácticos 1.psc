//Solicitar al usuario que ingrese la base y altura de un rect�ngulo, y calcular y mostrar por
//pantalla el �rea y per�metro del mismo
	///area = base * altura
	///perimetro = 2 * altura + 2 * base.
Algoritmo area_y_perimetro
	Definir base, altura, area, perimetro Como Real
	Escribir "Ingrese el valor de la base del rect�ngulo:"
	Leer base
	Escribir "Ingrese el valor de la altura del rect�ngulo:"
	Leer altura
	area = base * altura
	perimetro = (base * 2) + (altura * 2)
	Escribir "El �rea del rect�ngulo es ", area, " y el per�metro es ", perimetro
FinAlgoritmo
