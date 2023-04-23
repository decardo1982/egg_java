Algoritmo calcularSalario
	Definir contrato Como Caracter
	Definir ventas, valorHoras, horas, sueldo, horasExtras Como Real
	
	Escribir "Seleccione el tipo de contrato: "
	Escribir "C - Salario por comisión"
	Escribir "FC - Salario fijo mas comisión"
	Escribir "F - Salario fijo "
	Leer contrato
	
	contrato=Mayusculas(contrato)
	
	Segun contrato Hacer
		"C":
			Escribir "Ingrese el monto total de ventas realizadas en la semana: "
			Leer ventas
			sueldo = (ventas*40)/100
			Escribir "El sueldo del empleado es: " sueldo
		"FC":
			Escribir "Ingrese el valor pagado por horas: "
			Leer valorHoras
			Escribir "Ingrese la cantidad de horas trabajadas: "
			Leer horas
			Si horas<=40 Entonces
				sueldo = ((valorHoras*horas)*25)/100
				Escribir "El sueldo del empleado es: " sueldo
			SiNo
				Si horas>40 Entonces
					sueldo = ((valorHoras*40)*25)/100
					Escribir "El sueldo del empleado es: " sueldo
					Escribir "*Las horas extras no son tenidas en cuenta, por lo tanto se calcula sobre el max de horas=40*"
				FinSi
			FinSi
		"F":
			Escribir "Ingrese el valor pagado por horas: "
			Leer valorHoras
			Escribir "Ingrese la cantidad de horas trabajadas: "
			Leer horas
			Si horas<=40 Entonces
				sueldo = valorHoras*horas
				Escribir "El sueldo del empleado es: " sueldo
			SiNo
				Si horas>40 Entonces
					horasExtras=horas-40
					sueldo = (((valorHoras*horasExtras)*50)/100)  + (valorHoras*horas)
					Escribir "El sueldo del empleado es: " sueldo
				FinSi
			FinSi
		De Otro Modo:
			Escribir "Ingrese un valor del menú"
	FinSegun
FinAlgoritmo