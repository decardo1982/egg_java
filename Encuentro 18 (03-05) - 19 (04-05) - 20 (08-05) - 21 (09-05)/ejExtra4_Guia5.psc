////Crear un vector que contenga 100 notas de 100 supuestos estudiantes, con valores entre 0 y
////20 generadas aleatoriamente mediante el uso de la función azar() o aleatorio() de PseInt.
////Luego, de acuerdo a las notas contenidas, el programa debe indicar cuántos estudiantes son:
////	a) Deficientes 0-5
////	b) Regulares 6-10
////	c) Buenos 11-15
////	d) Excelentes 16-20

Algoritmo ejExtra4_Guia5
	
	Definir notas, i, deficientes, regulares, buenos, excelentes Como Entero
	deficientes = 0
	regulares = 0
	buenos = 0
	excelentes = 0
	
	Dimension notas[100]
	//	Se genera un vector con 100 notas de 100 supuestos estudiantes con valores entre 0 y 20
	
	Para i <- 0 Hasta 99 Hacer
		notas[i] = Aleatorio(0, 20)
		Segun notas[i] Hacer //segun la nota, se suma al contador que corresponda
			0, 1, 2, 3, 4, 5:
				deficientes = deficientes + 1
			6, 7, 8, 9, 10:
				regulares = regulares + 1
			11, 12, 13, 14, 15:
				buenos = buenos + 1
			16, 17, 18, 19, 20:
				excelentes = excelentes + 1
		FinSegun
	FinPara
	
	Escribir ""
	Escribir "Mostramos por pantalla el vector creado:"
	Escribir ""
	Para i <- 0 Hasta 99 Hacer
		Escribir notas[i], " | " Sin Saltar
	FinPara
	
	Escribir ""
	Escribir ""
	Escribir "Se indica el resultado solicitado:"
	Escribir "----------------------------------"
	Escribir "Deficientes: ", deficientes
	Escribir "Regulares: ", regulares
	Escribir "Buenos: ", buenos
	Escribir "Excelentes: ", excelentes
	Escribir "----------------------------------"
	Escribir "Total: ", deficientes+regulares+buenos+excelentes //para chequear que sean 100 notas
	
FinAlgoritmo
