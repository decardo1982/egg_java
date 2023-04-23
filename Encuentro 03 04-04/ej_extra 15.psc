//Un ciclista parte de una ciudad A a las HH horas, MM minutos y SS segundos. El tiempo
//de viaje hasta llegar a otra ciudad B es de T segundos. Escribir un algoritmo que
//	determine la hora de llegada a la ciudad B.
Algoritmo sin_titulo
	Definir hora, minutos, segs, tiempo_viaje Como Entero
	
	Escribir "Ingrese la hora de salida en el siguiente formato:"
	Escribir "Hora:"
	leer hora
	Escribir "Minutos:"
	leer minutos
	Escribir "Segundos:"
	leer segs
	
	Escribir "Ingrese el tiempo de viaje expresado en segundos:"
	Leer tiempo_viaje
	
	Definir partida_seg, llegada_seg Como Entero
	partida_seg = (hora * 3600) + (minutos * 60 ) + segs
	llegada_seg = partida_seg + tiempo_viaje
	
	
	
FinAlgoritmo
