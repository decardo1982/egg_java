Algoritmo invertir_guardarEnVar
	Definir aux, var, num Como Entero
	num = 1549
	aux <- num
	var <- aux MOD 10
	
	Escribir "num " num
	Escribir "aux " aux
	Escribir "var " var
	Escribir ""
	
	Mientras aux > 9 Hacer
		
		aux <- trunc(aux/10)
		
		var <- var * 10 + aux MOD 10
		
		Escribir "num " num
		Escribir "aux " aux
		Escribir "var " var
		Escribir ""
		
	FinMientras
	
FinAlgoritmo
