	//	Crear un programa que dibuje una escalera de n�meros, donde cada l�nea de n�meros
	//	comience en uno y termine en el n�mero de la l�nea. Solicitar la altura de la escalera al usuario
	//	al comenzar.

Algoritmo G4_2_7
	definir num como entero
	escribir 'Ingrese un n�mero: '
	leer num
	escalera(num)	
FinAlgoritmo

SubProceso escalera(n)
	definir i, j como entero
	para i = 1 hasta n
		para j desde 1 hasta i
			escribir sin saltar j
		FinPara
		escribir ''
	FinPara
FinSubProceso
	