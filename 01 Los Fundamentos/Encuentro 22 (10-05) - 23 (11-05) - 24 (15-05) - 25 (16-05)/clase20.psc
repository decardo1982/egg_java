//Algoritmo ej_1
//	definir matriz Como Entero
//	dimension matriz[3,3]
//	
//	
//	llenarMatriz(matriz, 3, 3)
//	mostrarMatriz(matriz, 3, 3)
//	
//	
//FinAlgoritmo

SubProceso llenarMatriz(matriz Por Referencia, n, m)
	definir i, j Como Entero
	
	para i = 0 hasta n-1 Hacer
		para j = 0 hasta m-1 Hacer
			Escribir "Ingrese un valor"
			leer matriz[i,j] 
		FinPara
	FinPara
FinSubProceso

SubProceso llenarMatrizAleatorio(matriz Por Referencia, n, m)
	definir i, j Como Entero
	
	para i = 0 hasta n-1 Hacer
		para j = 0 hasta m-1 Hacer
			matriz[i,j] = Aleatorio(0,9)
		FinPara
	FinPara
FinSubProceso

SubProceso mostrarMatriz(matriz, n, m)
	definir i, j Como Entero
	
	para i = 0 hasta n-1 Hacer
		para j = 0 hasta m-1 Hacer
			Escribir "[" matriz[i,j] "]" sin saltar
		FinPara
		Escribir ""
	FinPara
	
	
FinSubProceso

//Algoritmo ej_2
//	definir n, matriz como entero
//	dimension matriz[5,5]
//	
//	Escribir "Ingrese el valor a buscar en la matriz"
//	leer n
//	
//	llenarMatrizAleatorio(matriz, 5, 5)
//	mostrarMatriz(matriz, 5, 5)
//	buscarValor(matriz, 5, 5, n)
//	
//	
//FinAlgoritmo



SubProceso buscarValor(matriz, n, m, valor)
	definir i, j Como Entero
	definir encontrado Como logico
	encontrado = falso
	
	para i = 0 hasta n-1 Hacer
		para j = 0 hasta m-1 Hacer
			si matriz[i,j] == valor Entonces
				Escribir "Las coordenadas son: ", i, ",", j
				encontrado = Verdadero
			FinSi
		FinPara
	FinPara
	
	si !encontrado Entonces
		Escribir "No se encontró el valor " valor, " en la matriz"
	FinSi
	
FinSubProceso

//Algoritmo ej_3
//	definir n, m, matriz Como Entero
//	
//	Escribir "Ingrese el tamaño de la matriz"
//	leer n, m
//	Dimension matriz[n,m]
//	
//	llenarMatrizAleatorio(matriz, n, m)
//	sumarMatriz(matriz, n, m)
//	mostrarMatriz(matriz, n, m)
//	
//FinAlgoritmo



SubProceso sumarMatriz(matriz, n, m)
	definir i, j, suma Como Entero
	suma = 0
	para i = 0 hasta n-1 Hacer
		para j = 0 hasta m-1 Hacer
			suma = suma + matriz[i,j]
		FinPara
	FinPara
	Escribir "La suma de los elementos de la matriz es ", suma
FinSubProceso

//Algoritmo ej_4
//	definir matriz como entero
//	Dimension matriz[5,5]
//	
//	rellenarSinDiagonal(matriz, 5, 5)
//	
//	mostrarMatriz(matriz, 5, 5)
//	
//FinAlgoritmo

SubProceso rellenarSinDiagonal(matriz, n, m)
	definir i, j Como Entero
	
	para i = 0 hasta n-1 Hacer
		para j = 0 hasta m-1 Hacer
			si j == i Entonces
				matriz[i,j] = 0
			SiNo
				matriz[i,j] = Aleatorio(1,9)
			FinSi
		FinPara
	FinPara
	
FinSubProceso

//Algoritmo ej_5
//	definir matriz Como cadena
//	definir i, j, k Como Entero
//	definir frase como cadena
//	dimension matriz[3,3]
//	k = 0
//	
//	Repetir
//		Escribir "Ingrese una frase de 9 caracteres de longitud"
//		leer frase
//	Mientras Que Longitud(frase) <> 9
//	
//	
//	
//	para i = 0 hasta 2 Hacer
//		para j = 0 hasta 2 Hacer
//			matriz[i,j] = Subcadena(frase,k,k)
//			k = k+1
//		FinPara
//	FinPara
//	
//	mostrarMatriz(matriz, 3, 3)
//	
//FinAlgoritmo

Algoritmo ej_6 
	definir n, matriz, sumaFila, sumaColumna, sumaDiagonal, sumaDiagonalInversa, i, j, valor, suma Como Entero
	definir magica como logico
	magica = Verdadero
	sumaDiagonal = 0
	sumaColumna = 0
	sumaFila = 0
	sumaDiagonalInversa = 0
	Repetir
		Escribir "Ingrese el tamaño de la matriz"
		leer n
	Mientras Que n < 1 O n > 10
	
	Dimension matriz[n,n]
	
	// pedimos los valores por teclado
    Para i = 0 Hasta n-1 Hacer
        Para j = 0 Hasta n-1 Hacer
            Escribir "Ingrese el valor de la celda [" , i, "][" , j, "]: "
            Leer valor
            // Asegurarse de que el valor ingresado sea válido
            Mientras valor < 1 O valor > 9 Hacer
                Escribir "El valor debe estar entre 1 y 9."
                Escribir "Ingrese el valor de la celda [" , i, "][" , j, "]: "
                Leer valor
            FinMientras
            matriz[i,j] = valor
        FinPara
    FinPara
	
	mostrarMatriz(matriz, n, n)
	
	
	// hacemos las sumas y verificamos
	para i = 0 hasta n-1 Hacer
		sumaFila = 0
		sumaColumna = 0
		// filas y columnas deben ser sumadas en cada ciclo de j (filas)
		para j = 0 hasta n-1 Hacer
			sumaFila = sumaFila + matriz[i,j]
			sumaColumna = sumaColumna + matriz[j,i]
		FinPara
		si sumaFila <> sumaColumna Entonces
			magica = Falso
		FinSi
		// las diagonales se suman en cada ciclo de i (filas)
		j = j-1
		sumaDiagonal = sumaDiagonal + matriz[i,i]
		sumaDiagonalInversa = sumaDiagonalInversa + matriz[i,j-i]
	FinPara
	
	si sumaDiagonal <> sumaDiagonalInversa o sumaDiagonal <> sumaFila Entonces
		magica = Falso
	FinSi
	
	
	// Mostramos el resultado
    Si magica Entonces
        Escribir "La matriz es mágica y su suma es " sumaFila
    SiNo
        Escribir "La matriz no es mágica"
    FinSi
	
	
FinAlgoritmo
//
//Algoritmo extra_1
//definir matriz, n ,m Como Entero
//Escribir "Ingrese el tamaño de la matriz"
//leer n,m
//Dimension matriz[n,m]
//	
//	llenarMatrizAleatorio(matriz,n,m)
//	mostrarMatriz(matriz,n,m)
//	
//FinAlgoritmo

//Algoritmo extra_2
//	definir matriz, n , m, transpuesta Como Entero
//	Escribir "Ingrese el tamaño de la matriz"
//	leer n,m
//	Dimension matriz[n,m]
//	Dimension transpuesta[m,n]
//	
//	definir i, j Como Entero
//	
//	para i = 0 hasta n-1 Hacer
//		para j = 0 hasta m-1 Hacer
//			matriz[i,j] = Aleatorio(1, 100)
//		FinPara
//	FinPara
//	
//	para i = 0 hasta m-1 Hacer
//		para j = 0 hasta n-1 Hacer
//			transpuesta[i,j] = matriz[j,i]
//		FinPara
//	FinPara
//	
//	mostrarMatriz(matriz, n, m)
//	Escribir ""
//	mostrarMatriz(transpuesta, m ,n)
//	
//	
//FinAlgoritmo

//Algoritmo extra_3
//	definir matriz, i, j, k Como Entero
//	Dimension matriz[5,15]
//	
//	k = 0
//	para i = 0 hasta 4 Hacer
//		matriz[i,0] = 1
//		k = k+ 1
//		para j = 1 hasta 14 Hacer
//			si i = 0  o i = 4 o j = 14 Entonces
//				matriz[i,j] = 1
//			sino
//				matriz[i,j] = 0
//			FinSi
//		FinPara
//	FinPara
//	
//	mostrarMatriz(matriz, 5, 15)
//FinAlgoritmo

//Algoritmo extra_4
//	definir matriz1, matriz2, i, j, k, suma, matriz_resultado Como Entero
//	Dimension matriz1[3,3]
//	Dimension matriz2[3,3]
//	Dimension matriz_resultado[3,3]
//	llenarMatrizAleatorio(matriz1, 3, 3)
//	llenarMatrizAleatorio(matriz2, 3, 3)	
//	
//	Para i = 0 Hasta 2 Con Paso 1 Hacer
//        Para j = 0 Hasta 2 Con Paso 1 Hacer
//            suma = 0
//            Para k = 0 Hasta 2 Con Paso 1 Hacer
//                suma = suma + matriz1[i,k] * matriz2[k,j]
//            FinPara
//            matriz_resultado[i,j] = suma
//        FinPara
//    FinPara
//	
//	mostrarMatriz(matriz_resultado, 3, 3)
//	
//FinAlgoritmo

//algoritmo extra_5
//	
//	definir matriz, filas, i, j Como Entero
//	Escribir "Ingrese la cantidad de filas de la matriz"
//	leer filas
//	dimension matriz[filas, 3]
//	
//	para i = 0 hasta filas - 1 Hacer
//		para j = 0 hasta 1 Hacer
//			Escribir "Ingrese un valor"
//			leer matriz[i,j]
//		FinPara
//		matriz[i,2] = matriz[i,0] + matriz[i,1]
//	FinPara
//	
//	para i = 0 hasta filas - 1 Hacer
//		Escribir matriz[i,0] " + " matriz[i,1] " = " matriz[i,2] sin saltar
//		Escribir ""
//	FinPara
//	
//FinAlgoritmo

SubProceso rellenarVectorAleatorio(vector, n)
	definir i Como Entero
	para i = 0 hasta n-1 Hacer
		
		vector[i] = aleatorio(0, 20)
	FinPara
FinSubProceso

SubProceso rellenarVector(vector Por Referencia, n)
	definir i Como Entero
	para i = 0 hasta n-1 Hacer
		
		leer vector[i]
	FinPara
FinSubProceso

SubProceso mostrarVector(vector, n)
	definir i Como Entero
	para i = 0 hasta n-1 Hacer
		
		Escribir "[" vector[i] "]" sin saltar
	FinPara
	Escribir ""
	
FinSubProceso

//Algoritmo extra_6
//	definir matriz, vector, producto, fila, columna Como Entero
//	dimension matriz[3,3]
//	dimension vector[3]
//	dimension producto[3]
//	
//	llenarMatrizAleatorio(matriz, 3, 3)
//	rellenarVectorAleatorio(vector, 3)
//	
//	mostrarMatriz(matriz, 3, 3)
//	Escribir ""
//	mostrarVector(vector, 3)
//	Escribir ""
//	
//	Para fila = 0 Hasta 2 hacer
//        producto[fila] = 0  // Inicializar producto para esta fila
//        
//        Para columna = 0 Hasta 2 hacer
//            producto[fila] = producto[fila] + matriz[fila,columna] * vector[columna]
//        Fin Para
//        
//        Escribir "Fila ", fila + 1, ": ", producto[fila]  // Mostrar resultado
//    Fin Para
//    
//FinAlgoritmo

//Algoritmo extra_7
//	definir matriz, i, j, sumaProducto Como Entero
//	Dimension matriz[7,6]
//	
//	para i = 0 hasta 6 Hacer
//		sumaProducto = 0
//		para j = 0 hasta 4 Hacer
//			si i <=4 y j <= 4 Entonces
//				Escribir "Ingrese las ventas del dia ", j+1 " del producto " i +1
//				leer matriz[i,j]
//			FinSi
//			si i = 0 Entonces
//				matriz[5,j] = 0
//				matriz[6,j] = i+1
//			FinSi
//			sumaProducto = matriz[i,j] + sumaProducto
//			si i <> 5 y i <> 6 Entonces
//				matriz[5,j] = matriz[5,j] + matriz[i,j]
//			FinSi
//			si i > 0 y i <= 4 Entonces
//				si matriz[i,j] > matriz[i-1,j] Entonces
//					matriz[6,j] = i+1
//				FinSi
//			FinSi
//		FinPara
//		matriz[i,5] = sumaProducto
//		matriz[6,5] = 0
//	FinPara
//	
//	mostrarMatriz(matriz, 7, 6)
//	
//	
//FinAlgoritmo



//Algoritmo extra_8
//	Definir ventas como Entero
//	Dimension ventas[4,5]
//	Definir i, j como Entero
//	Definir total_zona, total_vendedor, total_general como Entero
//	definir zona, vendedor como entero
//	definir nombreZona como cadena
//	total_zona <- 0
//	total_vendedor <- 0
//	total_general <- 0
//	
//	// Ingreso de ventas de los representantes en cada zona
//	Para i <- 0 Hasta 3 Con Paso 1 Hacer
//		Para j <- 0 Hasta 4 Con Paso 1 Hacer
//			Escribir "Ingrese las ventas del representante ", i+1, " en la zona ", j+1, ": "
//			Leer ventas[i, j]
//			total_general <- total_general + ventas[i, j]
//		Fin Para
//	Fin Para
//	
//	// Cálculo del total de ventas de una zona
//	Escribir "Ingrese el nombre de la zona que desea calcular el total de ventas (Norte/Sur/Este/Oeste/Centro): "
//	Leer nombreZona
//	nombreZona = Minusculas(nombreZona)
//	segun nombreZona Hacer
//		"norte":
//			zona = 0
//		"sur":
//			zona = 1
//		"este":
//			zona = 2
//		"oeste":
//			zona = 3
//		"centro":
//			zona = 4
//	FinSegun
//	Para i <- 0 Hasta 3 Con Paso 1 Hacer
//		total_zona <- total_zona + ventas[i, zona]
//	Fin Para
//	Escribir "El total de ventas de la zona ", nombreZona, " es: ", total_zona
//	
//	// Cálculo del total de ventas de un vendedor en cada zona
//	Escribir "Ingrese el número del vendedor que desea calcular el total de ventas en cada zona: "
//	Leer vendedor
//	Para j <- 0 Hasta 4 Con Paso 1 Hacer
//		total_vendedor <- ventas[vendedor-1, j]
//		Escribir "El total de ventas del representante ", vendedor, " en la zona ", j+1, " es: ", total_vendedor
//	Fin Para
//	Escribir "El total de ventas de todos los representantes es: ", total_general
//	
//	mostrarMatriz(ventas,4,5)
//FinAlgoritmo
//



































	