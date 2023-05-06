Algoritmo vectores
	
	Definir vector Como Entero
	Dimension vector[5]
	
	vector[0] = 1
	vector[1] = 2
	vector[2] = 3
	vector[3] = 4
	vector[4] = 5
	Escribir vector[0]
	Escribir vector[1]
	Escribir vector[2]
	Escribir vector[3]
	Escribir vector[4]
	Escribir ""
	
	vectores_para()
FinAlgoritmo

SubProceso vectores_para()
	Definir vector, i Como Entero
	Dimension vector[5]
	
	Para i <- 0 Hasta 4 Con Paso 1 Hacer
		vector[i]  = i+1
	FinPara
	
	Para i <- 0 Hasta 4 Con Paso 1 Hacer
		Escribir Sin Saltar "[" vector[i] "] "
	FinPara
	
	
FinSubProceso
