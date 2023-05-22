//Si se compran menos de cinco llantas el precio es de $3000 cada una, si se compran
//entre 5 y 10 el precio es de $2500, y si se compran más de 10 el precio es $2000.
//Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las
//llantas que compra, y el monto total que tiene que pagar por el total de la compra.

Algoritmo compraDeLlantas
	
	Definir cantidad_llantas, precio Como Entero
	precio = 3000
	
	
	Escribir "Ingrese la cantidad de llantas a comprar:"
	Leer cantidad_llantas
	
	Si cantidad_llantas > 0 Y cantidad_llantas < 5 Entonces
		Escribir "El valor de cada llanta es de $", precio
		Escribir "Usted comprará ", cantidad_llantas " llantas por las que pagará un total de $" cantidad_llantas * precio
	SiNo
		Si cantidad_llantas >= 5 Y cantidad_llantas <= 10 Entonces
			precio = 2500
			Escribir "El valor de cada llanta es de $", precio
			Escribir "Usted comprará ", cantidad_llantas " llantas por las que pagará un total de $" cantidad_llantas * precio
		SiNo
			Si cantidad_llantas > 10 Entonces
				precio = 2000
				Escribir "El valor de cada llanta es de $", precio
				Escribir "Usted comprará ", cantidad_llantas " llantas por las que pagará un total de $" cantidad_llantas * precio
			FinSi
		FinSi
	FinSi
	
	
	
FinAlgoritmo
