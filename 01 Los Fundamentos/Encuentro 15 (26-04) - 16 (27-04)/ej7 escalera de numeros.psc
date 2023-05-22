////Crear un programa que dibuje una escalera de números, donde cada línea de números
////comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al usuario
////al comenzar. Ejemplo: si se ingresa el número 3:
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
