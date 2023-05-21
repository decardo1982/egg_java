Algoritmo integrador_Gen
	Definir matriz, muestra Como Caracter
	Definir m Como Entero
	
	Hacer
		Escribir "Ingrese la muestra:" //9, 16 o 1369
		Escribir "ACDDCADBCDABDBBA"
		muestra = "ACddCADBCdABdbBa"
		muestra = Mayusculas(muestra)
		m = Longitud(muestra)
		
	Mientras Que m <> 9 Y m <> 16 Y m <> 1369
	m = raiz(m)
	Dimension matriz[m,m] //como la matriz es cuadrada, utilizamos el mismo valor m para filas y columnas
	
	Si muestraValida(muestra) = Verdadero
		llenarMatriz(matriz, muestra, m)
		imprimirMatriz(matriz, m)
		diagonales(matriz, m)
	SiNo
		Escribir "La muestra no ess válida"
	FinSi
	
	Escribir ""
	
FinAlgoritmo

//
SubProceso llenarMatriz(matriz Por Referencia, muestra, m)
	Definir i, j, k Como Entero
	k = 0 //defino variable adicional para ir recorriendo la cadena "muestra"
	Para i <- 0 Hasta m - 1
		Para j <- 0 Hasta m -1
			matriz(i,j) = Subcadena(muestra,k,k)
			k = k + 1
		FinPara
	FinPara
FinSubProceso

//

SubProceso imprimirMatriz(matriz Por Referencia, m)
	Definir i, j Como Entero	
	Para i <- 0 Hasta m - 1
		Para j <- 0 Hasta m - 1
			Escribir Sin Saltar matriz[i,j], " "
		FinPara
		Escribir ""
	FinPara
FinSubProceso

//

Funcion retorno <- muestraValida(muestra) //hay que revisar que cada caracter de la muestra sea A, B, C o D
	Definir i Como Entero
	Definir retorno Como Logico
	Definir letra Como Caracter
	retorno = Falso
	
	Para i <- 0 Hasta Longitud(muestra) - 1
		letra = Subcadena(muestra,i,i)
		Si letra = "A" O letra = "B" O letra = "C" O letra = "D" Entonces
			retorno = Verdadero
		SiNo
			retorno = Falso
		FinSi
	FinPara
FinFuncion

//Averiguamos las diagonales principal y secundaria y chequeamos que cada una contenga los mismos caracteres
SubProceso diagonales(matriz, m)
	Definir i, j, contadorD1, contadorD2 Como Entero
	Definir diagonal1, diagonal2, d1, d2 como Caracter
	Dimension diagonal1(m), diagonal2(m)
	contadorD1 = 0
	contadorD2 = 0
	
	Para i = 0 Hasta m-1 Hacer
		Para j <- 0 Hasta m - 1 Hacer //vamos recorriendo la matriz y armando las diagonales
			diagonal1(i) = matriz(i,i) //diagonal1 <- principal / diagonal2 <- secundaria
			Si i + j = m - 1 Entonces
				diagonal2(i) = matriz(i,j)
			FinSi
		FinPara
	FinPara
	
	Escribir "La diagonal principal es:" //mostramos diagonales por pantalla para chequear
	Para i = 0 Hasta m - 1
		Escribir Sin Saltar diagonal1(i), " "
	FinPara
	Escribir ""
	Escribir "La diagonal secundaria es:"
	Para i = 0 Hasta m - 1
		Escribir Sin Saltar diagonal2(i), " "
	FinPara
	
	Escribir " "
//	asignamos a cada variable d1 y d2 el primer valor de la respectiva cadena
	d1 = diagonal1(0)
	Escribir "d1 = ", d1 //mostramos por pantalla para verificar
	d2 = diagonal2(0)
	Escribir "d2 = ", d2
//	recorremos la cadena para contar cuántas veces aparece el primer valor en la cadena
	Para i <- 0 Hasta m - 1
		Si diagonal1(i) = d1 Entonces
			contadorD1 = contadorD1 + 1
		FinSi
		Si diagonal2(i) = d2 Entonces
			contadorD2 = contadorD2 + 1
		FinSi
	FinPara
	Escribir "contadorD1 = ", contadorD1 //mostramos ambos contadores por pantalla para verificar
	Escribir "contadorD2 = ", contadorD2
	
	Si contadorD1 == m Y contadorD2 == m Entonces
		Escribir "La muestra es válida! se ha encontrado el Gen Z"
	SiNo
		Escribir "La muestra no es válida."
	FinSi
	
FinSubProceso
