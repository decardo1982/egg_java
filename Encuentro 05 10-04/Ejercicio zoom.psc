//EJERCICIO ZOOM 
//Realizar un programa que pida al usuario el horario en el que se conect� al zoom. Si ese horario est� entre la hora de ingreso y la hora de ingreso + los 15? de tardanza, mostrar� un mensaje por
//	pantalla que diga "Llegaste a tiempo, tienes presente". Si el horario de ingreso supera ese l�mite, se mostrar� un mensaje por pantalla que diga "Hoy tendr�s tardanza. Recuerda avisarle a tus
//	coaches cuando llegar�s tarde. Ma�ana te esperamos a tiempo, tu participaci�n en el equipo es VITAL"

Algoritmo tardanza
	
	//	Definimos las variables
	Definir hora_zoom, minutos_zoom Como Entero
	
	//	Solicitamos el ingreso del horario
	Escribir "Por favor, indicar horario de conexi�n al zoom en horas (HH):"
	Leer hora_zoom
	//	El ingreso en Argentina es a las 19hs 
	Si hora_zoom >= 19 Y hora_zoom < 20 Entonces
		Escribir "Por favor, indicar minutos de conexi�n al zoom en horas (MM):"
		Leer minutos_zoom
		Si minutos_zoom >= 0 Y minutos_zoom <= 15 Entonces
			Escribir "Llegaste a tiempo, tienes presente"
		SiNo
			Si minutos_zoom > 15 Entonces
				Escribir "Hoy tendr�s tardanza. Recuerda avisarle a tus coaches cuando llegar�s tarde. Ma�ana te esperamos a tiempo, tu participaci�n en el equipo es VITAL"
			FinSi
		finsi
	FinSi

FinAlgoritmo
