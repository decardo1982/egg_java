//Un vendedor recibe un sueldo base m�s un 10% extra por comisi�n de sus ventas, el
//vendedor desea saber cu�nto dinero obtendr� por concepto de comisiones por las tres
//ventas que realiza en el mes y el total que recibir� en el mes tomando en cuenta su
//sueldo base y comisiones.
Algoritmo comisionDeVentas
	Definir sueldoBase, sueldoTotal, ventas, comision Como Real
	Escribir "Ingrese el valor del sueldo base:"
	leer sueldoBase
	Escribir "Ingrese cantidad de ventas:"
	leer ventas
	comision = ventas * 0.1
	sueldoTotal = sueldoBase + comision
	
	Escribir "El sueldo total a percibir ser� de: $", sueldoTotal
	
FinAlgoritmo
