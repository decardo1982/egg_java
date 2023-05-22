////Realice un algoritmo que solicite al usuario una fecha y muestre por pantalla la fecha anterior.
////	Para ello se deberá utilizar un procedimiento llamado diaAnterior que reciba una fecha
////		representada a través de tres enteros dia, mes y anio, y retorne la fecha anterior. Puede
////		asumir que dia, mes y anio representan una fecha válida. Realice pruebas de escritorio para
////			los valores dia=5, mes=10, anio=2012 y para dia=1, mes=3, anio=2004.

Algoritmo dia_anterior
	
	Definir dia, mes, anio Como Entero
	Escribir "Ingrese una fecha (DD/MM/AAAA):"
	Leer dia, mes, anio
	
	diaAnterior(dia, mes, anio)
	
FinAlgoritmo


SubProceso diaAnterior(dia, mes, anio)
	
	Si dia == 1 Y mes == 1 Entonces
		anio = anio -1
		dia = 31
		mes = 12
	SiNo
		Si dia == 1 Entonces
			si mes == 2 o mes == 4 o mes == 6 o mes == 8 o mes == 9 o mes == 11 Entonces
				dia = 31
			SiNo
				si mes <> 3
					dia = 30
				SiNo
					si anio % 4 == 0 Y (anio % 100 <> 0 O anio % 400 == 0) Entonces
						dia = 29
					SiNo
						dia = 28
					FinSi
				FinSi
			FinSi
			mes = mes - 1
		SiNo
			dia = dia - 1
		FinSi
	FinSi
	Escribir dia
	Escribir mes
	Escribir anio
FinSubProceso
