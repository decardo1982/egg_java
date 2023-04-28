//A partir de una conocida cantidad de días que el usuario ingresa a través del teclado, escriba
//un programa para convertir los días en horas, en minutos y en segundos. Por ejemplo
//	1 día = 24 horas = 1440 minutos = 86400 segundos
Algoritmo conversor_dias
	Definir var_dias, var_horas, var_minutos, var_segundos Como Entero
	Escribir "Ingrese la cantidad de días a convertir:"
	Leer var_dias
	var_horas = var_dias * 24
	var_minutos = var_horas * 60
	var_segundos = var_minutos * 60
	Escribir var_dias " = ", var_horas, " horas = ", var_minutos, " minutos = ", var_segundos, " segundos."
	
FinAlgoritmo
