//Conocido el número en matemática PI ?, pedir al usuario que ingrese el valor del radio de
//una circunferencia y calcular y mostrar por pantalla el área y perímetro. Recuerde que para
//calcular el área y el perímetro se utilizan las siguientes fórmulas:
//area = PI * radio2
//perimetro = 2 * PI * radio

Algoritmo area_perimetro
	Definir radio Como Real
	Definir area Como Real
	Definir perimetro Como Real
	Escribir "Ingrese valor de radio"
	Leer radio
	area = pi * radio^2
	perimetro = 2 * PI * radio
	Escribir "El area es: ", area, " y el perimetro es ", perimetro
FinAlgoritmo
