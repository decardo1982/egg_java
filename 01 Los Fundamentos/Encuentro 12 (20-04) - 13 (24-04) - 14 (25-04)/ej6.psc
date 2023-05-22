//Realizar una función que calcule y retorne la suma de todos los divisores del número n
//distintos de n. El valor de n debe ser ingresado por el usuario.
//ok

Funcion sumatoria <- divisores(num)
	Definir sumatoria, i Como Entero
	i = 0
	sumatoria = 0
	
	Para i <- 1 Hasta num -1 Con Paso 1 Hacer
		si num % i = 0 Entonces
			sumatoria = sumatoria + i
		FinSi
	Fin Para
FinFuncion

Algoritmo sumaDeDivisores
	
	Definir num Como Entero
	
	Escribir "Ingrese un número:"
	Leer num
	
	Escribir "La sumatoria de divisores del número ", num, " es ", divisores(num)
	
FinAlgoritmo
