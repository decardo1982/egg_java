////Solicitar al usuario que ingrese un valor entre 1 y 7. EL programa debe mostrar por
////pantalla un mensaje que indique a qu� d�a de la semana corresponde. Considere que el
////n�mero 1 corresponde al d�a "Lunes", y as� sucesivamente.

Algoritmo diasDeLaSemana
	Definir diaIngresado Como Real
	
	Escribir "Ingrese un valor entre 1 y 7"
	Leer diaIngresado
	
	Segun diaIngresado Hacer
		1:
			Escribir "Lunes"
		2:
			Escribir "Martes"
		3:
			Escribir "Mi�rcoles"
		4:
			Escribir "Jueves"
		5:
			Escribir "Viernes"
		6:
			Escribir "S�bado"
		7:
			Escribir "Domingo"
		De Otro Modo:
			Escribir "El valor ingresado no es correcto"
	Fin Segun
	
	
FinAlgoritmo
