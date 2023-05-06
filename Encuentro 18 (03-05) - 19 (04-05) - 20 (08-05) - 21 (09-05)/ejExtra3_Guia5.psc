////Crear dos vectores que tengan el mismo tamaño (el tamaño se pedirá por teclado) y
////almacenar en uno de ellos nombres de personas como cadenas. En el segundo vector se
////debe almacenar la longitud de cada uno de los nombres (para ello puedes usar la función
////	Longitud() de PseInt). Mostrar por pantalla cada uno de los nombres junto con su longitud.

Algoritmo ejExtra3_Guia5
	
	Definir vectorNombres Como Caracter
	Definir vectorLongitud, i, n Como Entero
	
	Escribir "Ingrese la longitud de los vectores:"
	Leer n
	Dimension vectorNombres[n]
	Dimension vectorLongitud[n]
	
	Para i <- 0 Hasta n -1 Hacer
		Escribir "Ingrese un nombre para la posición ", i
		Leer vectorNombres[i]
		vectorLongitud[i] = Longitud(vectorNombres[i])
	FinPara
	
	Para i <- 0 Hasta n - 1 Hacer
		Escribir "El nombre ", vectorNombres[i], " tiene ", vectorLongitud[i], " caracteres."
	FinPara
	
FinAlgoritmo
