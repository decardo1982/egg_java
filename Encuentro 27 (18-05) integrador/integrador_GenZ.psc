Algoritmo integrador_GenZ
	Definir matriz, muestra Como Caracter
	Definir m Como Real
	
	muestra = "CACBCACAC"
	//	muestra = "ADDDABBDD"
	//	muestra = "CDDACCACCACAAABC"
	//	muestra = "ABAABBCBD"
	//	muestra = "BCBBABBACBBBBCBB"
	//	muestra = "BCAADCCBABCCBABB"
	//	muestra = "CCADDBACCDDDDBDBCCABBAABDBCDCADDABABCDCDDABBBCABBABBDCADCCDABDDACDBBBDBDCCDDCABCAAAACDCDCCACDCDDADAADDACBDBCCDDBCBCBBAAADDAADCAABBBCBCCBCBDBCCBBCBABADAACDBDBADCBBACDADAADABBDBDBDBDCCDDCABCCCCCADBBBBCCDACCBBBDBDAADDBCCBCCBCBDDDDCCBAAACDDBBCAABAADABBBCCCCDCCBBDCDABCDACBCBACDBCCDABDBDCDCADCCBBADDBDCCADCCDCCACCDCDBCDBBADBAADBBCAADDABCAADADAABAACCBABDADADADDBCABDCCBBAADDDCDDCBADBCACCAAADCCDDABDBACBCAAADDBADBDACDDBDCBDCCCDDCACBCCCACCCCBACBAAAAACBCBCDAADCAACBCABDDABCBCBACCADABBBABBBBBAACADDDDBABACADAAABDDDCCDCACAACACADADBABACBABDBBADCDBBDACDCAABCADDBDBDCAABDCDABDDADDCDDBCBCDADCDBBDACABCDAABBCBADDDBCBADCABACDCABBCBCBCBCADBABBDBCCCADCADDCBABBDDDBBCBCDABACDDDABCCDBACCBDBADADDDAAACBDCDCCAACBDDCDCBADACDDDDBDCBAACDADBBDBDBCCACADBAABBAADAADDDACDDCDBDDBBDAADDAACCCACDBBBBBDCDCDDDABBCBAAADACADDCDCDCBCDCACAAABCADBDBBDDACCBBDABDDBCADCCCADDCDBACBBBDAADDCDAAADBBCDADBDBCBDDCAABCCDCCDCABCAACADADAACADDBBDABAABACDACDCDBBDDCCBCBCAAACBDBDBBBDBDBBCADCBACDCCBDACBBACBCADCDBACCADCDBDCDBBACBBCDCAAAAABCCDDCDDBBCBABCBCAABDBCCACBABDCABAACBDBDBCCCCADBBCDCCCAABADBACDDBADCDCAADDDCBDDBDCDCCCCCCCDBCDDBACBBCDACDADCACBDBBCCCDCCBCBCDACBDDDACCCAADBDBBDADDCCDDDBCDABCCBACCCCCBAACCBCABAAABBCABBCACCCABCDACBCDBDACACDDCACBCBBCCADABCBBDDABADDAAABACCBDCDABCBBBBACCDABAACDCACCCBBCDDACCDBCBCBAACBBBBADBCBCDABAAAABADAAAACDACADACDBBCCABADDDCACDCAACCDABBDBDAABADDBDCCCACDADBDDDCBBCBDCADCBCDAABDDDDBBBBCDDCC"
	//	muestra = "ACCDBBADDDCCBACABDCBDCBADBDACBBBBDAABBCCBAACCABDBDCDDABDBDADAAACBBBBCDDDCBBBDDCDABBDDABDBDBBACADCDAAADACDDDACCDCACDDABACDCCCAABDDCCACDADDBCBAACCDBCBCDDDCAACCBAADCBBBCDCBBACBDCCDDADBABCAABBACABDCAACCBDADDCAAACCDBDBBCDDDDDACBCDDADDDDCBADADBDCADDABBCDAACBCCDDDADDADADAACCACDCDDABCCCADABBACDACCAADDBCBCCDADBCCADAAABDDDAABBABCADDCCAADDCDDCDCACBADADACADDAADCBDBCDBDDACDCBCDCCABBDCBACDDACCCDADBCADCACAAABBBCADDDDBCBACDBDAAADDDACCDACBBBADACCCDCACCBACDADBCBBDADACABAACBCCADDCCCCACCCCADBCCDAADCAABBABAADDBDADDABABCCABBCDDACCADAAADBBCCDBADCADCBBDADACCDDBCAAABBBDCAAAACBAADBABBABACDDBBCBDCDCADABABBDADCBADAACDBCBDABADBCBADCACADAABCDDCABACDDBDCBCBDCAAACBDABBCACBACCCBACACDCADBDCDCDDCAACDBDCBACDBBDAABDBBCBAAADBABDBAACAAACDCDAAABABDDDBCACADCBBAADCCDABCCCBBCACCBAABDAADDDCDACDDDBCDCCBABDABACCDCDCDABAABCABBADADCBDDACDDCDDCDACDADADCACBCDABABDDCCDBCCDABACDBDAABDBDDDBADDBACABDCDDBACDDBBDDBBACBCCAACABBDADDBCAACCBCCDADDBCAADDADCCCBAAABABBBBBCABAACADBCBBABACCABCDAABADCCCCDCCADDDCCABBDDDAAADDADACBBBCBDAADACABABBAACCCADADDABDBCADDDCCDBBCCBCDCDBDDDDCACDACDBBBDDBADDACADDADDABCACDCBBADDABBBDCBBDCDAABADDDDDBCACCCCAAACBCBCDBACCCDACCCDBCBDCBADBCDDACCDBDBDBCAAACDDCBAABDBCAADCADDBABABDCBCBCBBBCACBCADDCAAAAAACBBACBBCCACBDCDDDDADCAAACBABDDBDADBAADCBABDDBCDBABDBAADDDBACBBBCCCDBDDBDDAADBBADADDDCBCACBABCDBBABAADABCABCDBACBBBCDBADADDBDCBDABBDDDCDDCCACDCBDCADABAABCDCAACCDDBADBDBCDACAAACBCADCCCBAC"
	
	
	muestra = Mayusculas(muestra)
	Escribir "Muestra ingresada: " muestra
	//Escribir "Longitud: " Longitud(muestra)
	
	Si Longitud(muestra) <> 9 Y Longitud(muestra) <> 16 Y Longitud(muestra) <> 1369 Entonces
		Escribir "La muestra no es v�lida"
	SiNo
		m = raiz(Longitud(muestra))
		Dimension matriz[m,m] //como la matriz es cuadrada, utilizamos el mismo valor m para filas y columnas
		Si muestraValida(muestra,m) = Verdadero
			Escribir "La muestra es v�lida"
			Escribir ""
			llenarMatriz(matriz, muestra, m)
			imprimirMatriz(matriz, m)
			Si diagonales(matriz, m) Entonces
				Escribir "---------------------------"
				Escribir "�Se ha encontrado el Gen Z!"
				Escribir "---------------------------"	
			SiNo
				Escribir "No se ha encontrado el Gen Z"
			FinSi
		SiNo
			Escribir "La muestra no es v�lida"
		FinSi
	FinSi
	Escribir ""
FinAlgoritmo

////subproceso para llenar la matriz dada la muestra
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

////subproceso para imprimir la matriz
SubProceso imprimirMatriz(matriz Por Referencia, m)
	Definir i, j Como Entero	
	Para i <- 0 Hasta m - 1
		Para j <- 0 Hasta m - 1
			Escribir Sin Saltar matriz[i,j], " "
		FinPara
		Escribir ""
	FinPara
FinSubProceso

////Creamos una funci�n que verifique si la muestra es v�lida (que los caracteres sean A, B, C o D
Funcion retorno <- muestraValida(muestra,m)
	Definir i Como Entero
	Definir retorno Como Logico
	Definir letra Como Caracter
	retorno = Verdadero
	
	Si retorno = Verdadero Entonces
		Para i <- 0 Hasta Longitud(muestra) - 1
			letra = Subcadena(muestra,i,i)
			//Escribir letra
			Si letra <> "A" Y letra <> "B" Y letra <> "C" Y letra <> "D" Entonces
				retorno = Falso
			FinSi
		FinPara
	FinSi
	
FinFuncion

////Creamos una funci�n para chequear que las diagonales principal y secundaria sean v�lidas, es decir,
////que contengan cada una los mismos caracteres
Funcion retorno <- diagonales(matriz, m)
	Definir retorno Como Logico
	retorno = Falso
	Definir i, j, contadorD1, contadorD2 Como Entero
	Definir diagonal1, diagonal2, d1, d2 como Caracter
	Dimension diagonal1(m), diagonal2(m)
	contadorD1 = 0
	contadorD2 = 0
	// Recorremos la matriz y armamos las diagonales en arreglos individuales
	Para i = 0 Hasta m-1 Hacer
		Para j <- 0 Hasta m - 1 Hacer
			diagonal1(i) = matriz(i,i)
			Si i + j = m - 1 Entonces
				diagonal2(i) = matriz(i,j)
			FinSi
		FinPara
	FinPara
	Escribir " "
	//Definimos d1 y d1 como el primer caracter de cada diagoan y verificamos cu�ntas veces se encuentra en el array
	d1 = diagonal1(0)
	d2 = diagonal2(0)
	Para i <- 0 Hasta m - 1
		Si diagonal1(i) = d1 Entonces
			contadorD1 = contadorD1 + 1
		FinSi
		Si diagonal2(i) = d2 Entonces
			contadorD2 = contadorD2 + 1
		FinSi
	FinPara
	//	
	Si contadorD1 == m Y contadorD2 == m Entonces
		retorno = Verdadero 
	FinSi
FinFuncion
