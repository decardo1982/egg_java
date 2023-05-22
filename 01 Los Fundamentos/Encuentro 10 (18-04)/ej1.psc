////Una compa��a de seguros tiene contratados a n vendedores. Cada vendedor realiza
////m�ltiples ventas a la semana. La pol�tica de pagos de la compa��a es que cada vendedor
////recibe un sueldo base m�s un 10% extra por comisiones de sus ventas.

////El gerente de la compa��a desea saber, por un lado, cu�nto dinero deber� pagar en la semana a cada
////vendedor por concepto de comisiones de las ventas realizadas, 
////y por otro lado, cu�nto deber� pagar a cada vendedor como sueldo total (sueldo base + comisiones).

////Para cada vendedor ingresar cuanto es su sueldo base, cuantas ventas realiz� y cuanto cobr� por cada venta.

Algoritmo vendedores
	
	Definir i, nVend, sueldoBase, cantVentas, montoVenta, comision, comisionTotal, ventasTotal Como Real
	
	comision = 0
	ventasTotal = 0
	comisionTotal = 0
	
	Escribir "Ingrese la cantidad de vendedores:"
	Leer nVend
	
	Para nVend <- 1 Hasta nVend Con Paso 1 Hacer
		Escribir "Ingrese el sueldo base del vendedor ", nVend
		Leer sueldoBase
		Escribir "Ingrese la cantidad de ventas realizadas por el vendedor ", nVend
		Leer cantVentas
		
		Para i <- 1 Hasta cantVentas Con Paso 1 Hacer
			Escribir "Ingrese el monto de la venta N� ", i
			Leer montoVenta
			Escribir "La comisi�n por la venta ", i, " es de: $", montoVenta * 0.1
			ventasTotal = ventasTotal + montoVenta
			comisionTotal = ventasTotal * 0.1
			
		FinPara
		Escribir "---------------"
		Escribir "VENDEDOR ", nVend
		Escribir "El vendedor realiz� ", cantVentas, " ventas por un total de $", ventasTotal, " debiendo percibir $", comisionTotal, " en concepto de comisiones."
		Escribir "Sumado a su sueldo base de $", sueldoBase, " deber� percibir $", sueldoBase + comisionTotal, " como sueldo total."
		Escribir "---------------"
		
		
		
	Fin Para
	
FinAlgoritmo
