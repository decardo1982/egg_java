Algoritmo sin_titulo
//	Crear una matriz que contenga 3 columnas y la cantidad filas que decida el usuario. Las dos
//	primeras columnas contendrán valores enteros ingresados por el usuario y en la 3 columna se
//	deberá almacenar el resultado de sumar el número de la primera y segunda columna. Mostrar
	//la matriz de la siguiente forma:
	
	definir n,m, matriz Como Entero
	Escribir "Elija la cantidad de filas"
	leer n
	m=3
	Dimension matriz[n,m]
	cargarMatriz(matriz,n,m)
	mostrarMatriz(matriz,n,m)
	
FinAlgoritmo
SubProceso cargarMatriz (matriz,n,m)
	Definir i,j como Entero
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		Para j<-0 Hasta m-2 Con Paso 1 Hacer
			Escribir "Ingrese el valor de la fila ",i +1," columna ",j + 1
			leer matriz[i,j]
		Fin Para
	Fin Para

FinSubProceso

SubProceso mostrarMatriz(matriz,n,m)
	Definir i,j como Entero
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		Para j<-0 Hasta m-1 Con Paso 1 Hacer
			Si j = 0 Entonces
				Escribir sin saltar matriz[i,j]," + "
			SiNo
				Si j = 1 Entonces
					Escribir sin saltar matriz[i,j]," = "
				SiNo
					Escribir sin saltar matriz[i,j-2] + matriz[i,j-1]
				Fin Si
			Fin Si
			
			
		Fin Para
		Escribir ""
	Fin Para
FinSubProceso