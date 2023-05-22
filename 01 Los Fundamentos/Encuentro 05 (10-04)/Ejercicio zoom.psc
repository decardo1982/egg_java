//EJERCICIO ZOOM 
//Realizar un programa que pida al usuario el horario en el que se conectó al zoom. Si ese horario está entre la hora de ingreso y la hora de ingreso + los 15? de tardanza, mostrará un mensaje por
//	pantalla que diga "Llegaste a tiempo, tienes presente". Si el horario de ingreso supera ese límite, se mostrará un mensaje por pantalla que diga "Hoy tendrás tardanza. Recuerda avisarle a tus
//	coaches cuando llegarás tarde. Mañana te esperamos a tiempo, tu participación en el equipo es VITAL"

Algoritmo tardanza
	
	//	Definimos las variables
	Definir hora_zoom, minutos_zoom Como Entero
	
	//	Solicitamos el ingreso del horario
	Escribir "Por favor, indicar horario de conexión al zoom en horas (HH):"
	Leer hora_zoom
	//	El ingreso en Argentina es a las 19hs 
	Si hora_zoom >= 19 Y hora_zoom < 20 Entonces
		Escribir "Por favor, indicar minutos de conexión al zoom en horas (MM):"
		Leer minutos_zoom
		Si minutos_zoom >= 0 Y minutos_zoom <= 15 Entonces
			Escribir "Llegaste a tiempo, tienes presente"
		SiNo
			Si minutos_zoom > 15 Entonces
				Escribir "Hoy tendrás tardanza. Recuerda avisarle a tus coaches cuando llegarás tarde. Mañana te esperamos a tiempo, tu participación en el equipo es VITAL"
			FinSi
		finsi
	FinSi

FinAlgoritmo
