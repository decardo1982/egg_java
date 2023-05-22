////Una compañía de seguros tiene contratados a n vendedores. Cada vendedor realiza
////múltiples ventas a la semana. La política de pagos de la compañía es que cada vendedor
////recibe un sueldo base más un 10% extra por comisiones de sus ventas.

////El gerente de la compañía desea saber, por un lado, cuánto dinero deberá pagar en la semana a cada
////vendedor por concepto de comisiones de las ventas realizadas, 
////y por otro lado, cuánto deberá pagar a cada vendedor como sueldo total (sueldo base + comisiones).

////Para cada vendedor ingresar cuanto es su sueldo base, cuantas ventas realizó y cuanto cobró por cada venta.

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
			Escribir "Ingrese el monto de la venta Nº ", i
			Leer montoVenta
			Escribir "La comisión por la venta ", i, " es de: $", montoVenta * 0.1
			ventasTotal = ventasTotal + montoVenta
			comisionTotal = ventasTotal * 0.1
			
		FinPara
		Escribir "---------------"
		Escribir "VENDEDOR ", nVend
		Escribir "El vendedor realizó ", cantVentas, " ventas por un total de $", ventasTotal, " debiendo percibir $", comisionTotal, " en concepto de comisiones."
		Escribir "Sumado a su sueldo base de $", sueldoBase, " deberá percibir $", sueldoBase + comisionTotal, " como sueldo total."
		Escribir "---------------"
		
		
		
	Fin Para
	
FinAlgoritmo
