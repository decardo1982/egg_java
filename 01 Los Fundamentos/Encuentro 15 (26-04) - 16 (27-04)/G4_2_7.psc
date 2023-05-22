	//	Crear un programa que dibuje una escalera de números, donde cada línea de números
	//	comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al usuario
	//	al comenzar.

Algoritmo G4_2_7
	definir num como entero
	escribir 'Ingrese un número: '
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
	