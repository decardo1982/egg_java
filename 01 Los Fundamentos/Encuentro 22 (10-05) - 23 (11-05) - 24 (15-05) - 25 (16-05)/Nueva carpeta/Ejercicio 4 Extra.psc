Algoritmo sin_titulo
//	Realizar un programa que calcule la multiplicación de dos matrices de enteros de 3x3.
//	Inicialice las matrices para evitar el ingreso de datos por teclado.definir n,m, matriz Como Entero
definir n,m,matrizA,matrizB,matrizRes como entero
n=3
m=3
Dimension matrizA[n,m],matrizB[n,m],matrizRes[n,m]
cargarMatriz(matrizA,n,m)
cargarMatriz(matrizB,n,m)


mostrarMatriz(matrizB,n,m)
Escribir "-----------------------"
mostrarMatriz(matrizA,n,m)
Escribir "-----------------------"


multiplicarMatriz(matrizA,matrizB,matrizRes,n,m)
mostrarMatriz(matrizRes,n,m)
FinAlgoritmo
SubProceso cargarMatriz (matriz,n,m)
	Definir i,j como Entero
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		Para j<-0 Hasta m-1 Con Paso 1 Hacer
			matriz[i,j]= Aleatorio(0,3)			
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
	