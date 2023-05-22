//Una verdulería ofrece las manzanas con descuento según la siguiente tabla:
//	KILOS COMPRADOS 	% DESCUENTO
//	0 - 2				0%
//	2.01 - 5			10%
//	5.01 - 10			15%
//	10.01 en adelante	20%
//	Determinar cuánto pagará una persona que compre manzanas en esa verdulería


Algoritmo descuentoEnManzanas
	
	Definir kg, descuento, precio Como Real
	
	descuento = 0
	
	Escribir "Ingrese el precio del kilo de manzanas:"
	Leer precio
	Escribir "Ingrese la cantidad de kilos de manzanas comprados:"
	Leer kg

	
	Si kg > 0 Y kg <= 2 Entonces
		Escribir "Usted compró ", kg, " kilos de manzanas a razón de $", precio, " por lo que pagará un total de $", kg * precio
		Escribir "No se aplica descuento."
		
	SiNo
		
		Si kg >= 2.01 Y kg <= 5 Entonces
			descuento = 10
			Escribir "Usted compró ", kg, " kilos de manzanas a razón de $ ", precio, " con un ", descuento "% de descuento por lo que pagará un total de $", kg * precio * (100 - descuento) / 100
		SiNo
			
			Si kg >= 5.01 Y kg <= 10 Entonces
				descuento = 15
				Escribir "Usted compró ", kg, " kilos de manzanas a razón de $ ", precio, " con un ", descuento "% de descuento por lo que pagará un total de $", kg * precio * (100 - descuento) / 100
			SiNo
				
				Si kg >= 10.01 Entonces
					descuento = 20
					Escribir "Usted compró ", kg, " kilos de manzanas a razón de $ ", precio, " con un ", descuento "% de descuento por lo que pagará un total de $", kg * precio * (100 - descuento) / 100
				FinSi
			FinSi
		FinSi
	FinSi
	
	
	
FinAlgoritmo
