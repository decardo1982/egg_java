////Una empresa tiene personal de distintas �reas con distintas condiciones de contrataci�n y formas de pago.
////El departamento de contabilidad necesita calcular los sueldos semanales (lunes a viernes) en base a las 3 modalidades de sueldo:
////	a) comisi�n
////	b) salario fijo + comisi�n
////	c) salario fijo

////	a) Para la modalidad salario por comisi�n se debe ingresar el monto total de las ventas realizadas en la semana, y el 40% de ese monto total corresponde al salario del	empleado.

////	b) Para la condici�n de salario fijo + comisi�n, se debe ingresar el valor que se paga por hora, la cantidad de horas trabajadas semanalmente y el monto total de las ventas en
////	esa semana. En este tipo de contrato las horas extras no est�n contempladas y se fija como m�ximo 40 horas por semana. La comisi�n por las ventas se calcula como 25%
////	del valor de venta total.

////	c) Finalmente, para la modalidad de salario fijo se debe ingresar el valor que se paga por hora y la cantidad de horas trabajadas en la semana. En el caso de exceder las
////	40 horas semanales, las horas extras se deben pagar con un extra del 50% del valor de la hora. Realizar un men� de opciones para poder elegir el tipo de contrato que
////	tiene un empleado.

Algoritmo sueldosSemanales
	
	Definir ventasTotalSemanal, valorHora, horasTrabajadas, tipoSueldo, salarioHorasTrabajadas, salarioHorasExtras, comisiones Como Real
	
	Escribir "Ingrese el tipo de sueldo a calcular seg�n opciones:"
	Escribir "1 - Comisi�n"
	Escribir "2 - Salario Fijo + Comisi�n"
	Escribir "3 - Salario Fijo"
	Leer tipoSueldo
	
	Segun tipoSueldo Hacer
		1:
			Escribir "Sueldo por Comisi�n (40% del total de las ventas)"
			Escribir "Ingrese el monto total de ventas realizadas en la semana:"
			Leer ventasTotalSemanal
			comisiones = ventasTotalSemanal * 0.4
			Escribir "El monto a percibir es de $", comisiones
		2:
			Escribir "Salario Fijo + Comisiones (no se contemplan horas extras)"
			Escribir "Ingrese el valor hora:"
			Leer valorHora
			Escribir "Ingrese la cantidad de horas trabajadas:"
			Leer horasTrabajadas
			Escribir "Ingrese el monto total de ventas realizadas en la semana:"
			Leer ventasTotalSemanal
			Si horasTrabajadas >= 40 Entonces
				salarioHorasTrabajadas = valorHora * 40
			SiNo
				Si horasTrabajadas < 40 Entonces
					salarioHorasTrabajadas = valorHora * horasTrabajadas
				FinSi
			FinSi
			comisiones = ventasTotalSemanal * 0.25
			Escribir "El monto a percibir es de $", salarioHorasTrabajadas, " por las horas trabajadas"
			Escribir "Y se adicionan $", comisiones, " en concepto de comisiones"
			Escribir "Totalizando $", comisiones + salarioHorasTrabajadas
		3:
			Escribir "Salario Fijo (contempla horas extras)"
			
			
			
		De Otro Modo:
			Escribir "La opci�n ingresada es incorrecta"
	Fin Segun
	
	
	
FinAlgoritmo
