//Los empleados de una fábrica trabajan en dos turnos: Diurno y Nocturno. Se desea calcular el
//jornal diario de acuerdo con las siguientes reglas:
//	a) La tarifa de las horas diurnas es de $ 90
//	b) La tarifa de las horas nocturnas es de $ 125
//	c) En caso de ser feriado, la tarifa se incrementa en un 10% si el turno es diurno y en
//		un 15% si el turno es nocturno.

//		El programa debe solicitar la siguiente información al usuario: el nombre del trabajador, el día
//			de la semana, el turno (diurno o nocturno) y la cantidad de horas trabajadas. Además,
//debemos preguntarle al usuario si el día de la semana (lunes, martes, miércoles, etc.) era
//	festivo o no, para poder calcular el jornal diario. Utilice una función para realizar el cálculo
//ok

Algoritmo calculoDeJornal
	
	Definir nombreTrabajador, diaSemana, turno Como Caracter
	Definir cantHorasTrabajadas Como Real
	Definir diaFestivo Como Logico
	
	Escribir "Ingrese el nombre del trabajador:"
	Leer nombreTrabajador
	
	Escribir "Ingrese el día de la semana:"
	Leer diaSemana
	
	Escribir "El día ", diaSemana, " ¿fue un día festivo? (V/F)"
	Leer diaFestivo
	
	Escribir "Ingrese turno: (DIURNO / NOCTURNO)"
	Leer turno
	
	Escribir "Ingrese la cantidad de horas trabajadas:"
	Leer cantHorasTrabajadas
	
	Escribir "El jornal del día es de: $", jornalDiario(nombreTrabajador, diaSemana, diaFestivo, turno, cantHorasTrabajadas)
	
FinAlgoritmo


Funcion retorno <- jornalDiario(nombreTrabajador, diaSemana, diaFestivo, turno, cantHorasTrabajadas)
	Definir retorno, horaDiurna, horaNocturna Como Real
	retorno = 0
	horaDiurna = 90 //Feriado incrementa 10%
	horaNocturna = 125 //Feriado incrementa 15%
	
	Si Mayusculas(turno) == "DIURNO" Entonces
		Si diaFestivo Entonces //si fue un día festivo el valor de la hora se incrementa un 10%
			retorno = cantHorasTrabajadas * horaDiurna * 1.1
		SiNo
			retorno = cantHorasTrabajadas * horaDiurna
		FinSi
	FinSi
	
	Si Mayusculas(turno) == "NOCTURNO" Entonces
		Si diaFestivo Entonces
			retorno = cantHorasTrabajadas * horaNocturna * 1.15
		SiNo
			retorno = cantHorasTrabajadas * horaNocturna
		FinSi
	FinSi
	
	
	
FinFuncion
	