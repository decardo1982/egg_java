	Algoritmo DesafioGuia5
	Definir matriz, palabra Como Caracter
	Dimension matriz(9,12)
	
	inicializarMatriz(matriz,9,12)
	llenarMatriz(matriz,9)
	imprimirMatriz(matriz,9,12)
	Escribir ""
	acomodarPalabra(matriz)
	imprimirMatriz(matriz,9,12)
	
FinAlgoritmo

//subprograma inicializarMatriz:
SubProceso inicializarMatriz(matriz por referencia,n,m)
	Definir i, j Como Entero
	
	Para i=0 Hasta n-1 Hacer
		para j=0 Hasta m-1 Hacer
			matriz(i,j) = "*"
		FinPara
	FinPara
FinSubProceso

//subprograma imprimirMatriz:
SubProceso imprimirMatriz(matriz,n,m)
	Definir i, j Como Entero
	
	Para i=0 Hasta n-1 Hacer
		para j=0 Hasta m-1 Hacer
			Escribir Sin Saltar " " matriz(i,j) " "
		FinPara
		Escribir ""
	FinPara
FinSubProceso

//subprograma agregarPalabra:
SubProceso agregarPalabra(matriz Por Referencia, n, palabra)
	
	Definir i Como Entero
	
	Para i=0 Hasta Longitud(palabra)-1 Hacer
		matriz(n,i)=subcadena(palabra,i,i)
	FinPara
	
FinSubProceso

//llenarMatriz(agragado)?)
SubProceso llenarMatriz(matriz, n)
	
	Definir i Como Entero
	
	Para i=0 Hasta n-1 Hacer
		Segun i Hacer
			0:
				agregarPalabra(matriz,i,"VECTOR")
			1:
				agregarPalabra(matriz,i,"MATRIX")
			2:
				agregarPalabra(matriz,i,"PROGRAMA")
			3:
				agregarPalabra(matriz,i,"SUBPROGRAMA")
			4:
				agregarPalabra(matriz,i,"SUBPROCESO")
			5:
				agregarPalabra(matriz,i,"VARIABLE")
			6:
				agregarPalabra(matriz,i,"ENTERO")
			7:
				agregarPalabra(matriz,i,"PARA")
			8:
				agregarPalabra(matriz,i,"MIENTRAS")
		FinSegun
	FinPara
	
FinSubProceso

//subprograma buscarR:
Funcion pos = buscarR(matriz,n)
	
	Definir i, pos Como Entero
	i=0
	
	Mientras matriz(n,i)<>"R"
		i=i+1
	FinMientras
	
	pos=i
FinFuncion

//subprograma acomodarPalabra:
SubProceso acomodarPalabra(matriz por referencia)
	
	Definir i, j, pos Como Entero
	
	Para i=0 Hasta 8 Hacer
		pos=5 - (buscarR(matriz,i))
		
		Si pos<> 0 Entonces
			Para j=11 Hasta 0 Con Paso -1 Hacer
				Si matriz(i,j) <> "*"
					matriz(i,j+pos)=matriz(i,j)
				FinSi
				Si j<pos
					matriz(i,j)="*"
				FinSi
			FinPara
		FinSi
	FinPara
FinSubProceso