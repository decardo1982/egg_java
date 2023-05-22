Algoritmo sin_titulo
	Definir diaDeLaSemana Como Caracter
	
	Escribir "Por favor ingrese un dia de la semana"
	leer diaDeLaSemana
	
	Si Minusculas(diaDeLaSemana) = "sabado" O Minusculas(diaDeLaSemana) = "domingo" Entonces
		Escribir "El dia ",diaDeLaSemana," es un dia no laborable"
	SiNo
		Escribir "El dia ",diaDeLaSemana," es un dia laborable"
	Fin Si
FinAlgoritmo
