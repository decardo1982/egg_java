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
	
	//mostrarMatriz(matriz, n, n)
	
	
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