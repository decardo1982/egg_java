////Crear un subproceso que rellene dos arreglos de tamaño n, con números aleatorios.
////Después hacer una función que reciba los dos arreglos y diga si todos sus valores son iguales o no.
////La función debe devolver el resultado de está validación, para mostrar el mensaje en el
////algoritmo. Nota: recordar el uso de las variables de tipo lógico.


Algoritmo ej7_G5
	
	Definir n, vector1, vector2, i Como Entero
	Escribir "Ingrese la longitud de los vectores:"
	Leer n
	
	Dimension vector1[n]
	Dimension vector2[n]
	
	Para i <- 0 Hasta (n - 1) Con Paso 1 Hacer
		vector1[i] = Aleatorio(0, 9)
		vector2[i] = Aleatorio(0, 9)
	FinPara
	
	Para i <- 0 Hasta n-1 Con Paso 1 Hacer
		Escribir Sin Saltar vector1[i], " "
	FinPara
	
	Escribir ""
	
	Para i <- 0 Hasta n-1 Con Paso 1 Hacer
		Escribir Sin Saltar vector2[i], " "
	FinPara
	Escribir ""
	
	Escribir "Los vectores, ¿son iguales? ", sonIguales(vector1, vector2, n)
	
FinAlgoritmo

Funcion retorno <- sonIguales(vector1, vector2, n)
	Definir retorno Como Logico
	Definir i, contador Como Entero
	contador = 0
	Para i <- 0 Hasta (n-1) Con Paso 1 Hacer
		Si vector1[i] == vector2[i] Entonces
			contador = contador + 1
		FinSi
	FinPara
	
	retorno = contador == n
	
FinFuncion




