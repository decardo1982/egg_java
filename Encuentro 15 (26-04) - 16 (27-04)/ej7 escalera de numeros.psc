////Crear un programa que dibuje una escalera de n�meros, donde cada l�nea de n�meros
////comience en uno y termine en el n�mero de la l�nea. Solicitar la altura de la escalera al usuario
////al comenzar. Ejemplo: si se ingresa el n�mero 3:
////1
////12
////123

Algoritmo escalera_de_numeros
	Definir n Como Entero
	Escribir "Ingrese la altura de la escalera:"
	Leer n
	
	escalera(n)
	
FinAlgoritmo

SubProceso escalera(n)
	Definir i, j Como Entero
	
	Para i <- 1 Hasta n Hacer
		para j Desde 1 hasta i
			Escribir Sin Saltar j	
		FinPara
		Escribir ""
	FinPara
	
	
FinSubProceso
