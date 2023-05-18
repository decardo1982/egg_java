Algoritmo sin_titulo
//	Realizar un programa que permita visualizar el resultado del producto de una matriz de
//	enteros de 3x3 por un vector de 3 elementos. Los valores de la matriz y el vector pueden
	//	inicializarse evitando así el ingreso de datos por teclado.
	
	definir n,m,matriz,vector,vectorRes como entero
	n=3
	m=3
	Dimension matriz[n,m],vector[n],vectorRes[n]
	cargarMatriz(matriz,n,m)
	cargarVector(vector,n)

	mostrarVector(vector,n)
	Escribir "-----------------------"
	mostrarMatriz(matriz,n,m)
	Escribir "-----------------------"
	multiplicarMatrizVector(matriz,vector,n,m)
	
	
FinAlgoritmo
SubProceso multiplicarMatrizVector(matriz,vector,n,m)
	definir i,j,k,l,acumulador,vectorRes Como Entero
	Dimension vectorRes[n]
	
		Para j<-0 Hasta m-1 Con Paso 1 Hacer
			acumulador = 0
			Para k<-0 Hasta n - 1 Con Paso 1 Hacer
				Escribir "valor A en la fila ",j," columna ",k," es ",matriz[j,k]
				Escribir "valor del vectot B en la  columna ", k," es ",vector[k]
				Escribir "su multiplicacion es : ",matriz[j,k] * vector[k]
				acumulador = acumulador + matriz[j,k] * vector[k]
				Escribir "El valor del acumulador es ",acumulador
			Fin Para
			Escribir "El valor del acumulador es para acentar ",acumulador
			vectorRes[j]=acumulador
		Fin Para
		Escribir "------------------------------"
		mostrarVector(vectorRes,n)
	
FinSubProceso
SubProceso cargarVector (vector,n)
	definir i como entero
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		vector[i]= Aleatorio(0,1)
	Fin Para
FinSubProceso
SubProceso mostrarVector(vector,n)
	definir i Como Entero
	Escribir "Mostrar vector"
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		Escribir sin saltar vector[i]," "
	Fin Para
	Escribir ""
FinSubProceso
SubProceso cargarMatriz (matriz,n,m)
	Definir i,j como Entero
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		Para j<-0 Hasta m-1 Con Paso 1 Hacer
			matriz[i,j]= Aleatorio(0,1)			
		Fin Para
	Fin Para
FinSubProceso

SubProceso mostrarMatriz(matriz,n,m)
	Definir i,j como Entero
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		Para j<-0 Hasta m-1 Con Paso 1 Hacer
			
			Escribir sin saltar matriz[i,j]," "
			
		Fin Para
		Escribir ""
	Fin Para
FinSubProceso
SubProceso multiplicarMatriz(matrizA,matrizB,matrizRes,n,m)
	definir i,j,k,l,acumulador Como Entero
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		Para j<-0 Hasta m-1 Con Paso 1 Hacer
			acumulador = 0
			Para k<-0 Hasta n - 1 Con Paso 1 Hacer
				Escribir "valor A en la fila ",j," columna ",k," es ",matrizA[j,k]
				Escribir "valor B en la fila ",k," columna ", i," es ",matrizB[k,i]
				Escribir "su multiplicacion es : ",matrizA[j,k] * matrizB[k,i]
				acumulador = acumulador + matrizA[j,k] * matrizB[k,i]
				Escribir "El valor del acumulador es ",acumulador
			Fin Para
			Escribir "El valor del acumulador es para acentar ",acumulador
			matrizRes[j,i]=acumulador
		Fin Para
	Fin Para
FinSubProceso
