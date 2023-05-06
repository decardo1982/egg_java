//Realizar un programa con el siguiente men� y le pregunte al usuario que quiere hacer hasta
//que ingrese la opci�n Salir:
//	A. Llenar Vector A. Este vector es de tama�o N y se debe llenar de manera aleatoria
//	usando la funci�n Aleatorio(valorMin, valorMax) de PseInt.
//	B. Llenar Vector B. Este vector tambi�n es de tama�o N y se llena de manera aleatoria.
//	C. Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar elemento
//a elemento. Ejemplo: C = A + B
//	D. Llenar Vector C con la resta de los vectores B y A. La resta se debe realizar elemento a
//elemento. Ejemplo: C = B - A
//E. Mostrar. Esta opci�n debe permitir al usuario decidir qu� vector quiere mostrar: Vector
//	A, B, o C.
//	F. Salir.
//NOTA: El rango de los n�meros aleatorios para los Vectores ser� de [-100 a 100]. La longitud
//		para todos los vectores debe ser la misma, por lo tanto, esa informaci�n s�lo se solicitar� una
//vez.

Algoritmo Guia5Encuentro18Ejercicio4
	Definir menu, vectorAMostrar Como Caracter
	
	Escribir "Seleccione una opci�n"
	Leer menu
	
	Si Mayusculas(menu) = "A" O Mayusculas(menu) = "B" O Mayusculas(menu) = "C"
		Definir n Como Entero
		Definir vectorA, vectorB, vectorC Como Real
		
		Escribir "Ingrese la dimensi�n del vector"
		Leer n

		Dimension vectorA[n]
		Dimension vectorB[n]
		Dimension vectorC[n]
		
		inicializarVectores(n, vectorA)
		inicializarVectores(n, vectorB)
		inicializarVectores(n, vectorC)
	FinSi
	
	Mientras Mayusculas(menu) <> "F" Hacer
		
		Segun Mayusculas(menu) hacer
			"A":
				llenarVector(n, vectorA)
			"B":
				llenarVector(n, vectorB)
			"C":
				sumaVectorC(n, vectorA, vectorB, vectorC)
			"D":
				restaVectorC(n, vectorA, vectorB, vectorC)
			"E":
				Escribir "Ingresar vector a mostrar"
				Leer vectorAMostrar
				Segun Mayusculas(vectorAMostrar) Hacer
					"A":
						mostrarVector(n, vectorA)
					"B":
						mostrarVector(n, vectorB)
					"C":
						mostrarVector(n, vectorC)
					De Otro Modo:
						Escribir "No se mostrara vector"
				Fin Segun
		FinSegun
		Escribir "Seleccione otra opci�n"
		Leer menu
	FinMientras
	
FinAlgoritmo


//	Inicializar Vectores
SubProceso inicializarVectores(n, vector Por Referencia)
	Definir i Como Entero
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		vector[i] = 0
	Fin Para
FinSubProceso

//	A. Llenar Vector A. Este vector es de tama�o N y se debe llenar de manera aleatoria
//	usando la funci�n Aleatorio(valorMin, valorMax) de PseInt.
SubProceso llenarVector(n, vector Por Referencia)
	Definir i Como Entero
	Para i = 0 Hasta n-1 Hacer
		vector[i] = Aleatorio(-100, 100)
	FinPara
FinSubProceso

//	C. Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar elemento
//a elemento. Ejemplo: C = A + B
SubProceso sumaVectorC(n, vectorA, vectorB, vectorC Por Referencia)
	Definir i Como Entero
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		vectorC[i] = vectorA[i] + vectorB[i]
	Fin Para
FinSubProceso

SubProceso restaVectorC(n, vectorA, vectorB, vectorC Por Referencia)
	Definir i Como Entero
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		vectorC[i] = vectorB[i] - vectorA[i]
	Fin Para
FinSubProceso

SubProceso mostrarVector(n, vector Por Referencia)
	Definir i Como Entero
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		Escribir vector[i] , " " Sin Saltar
	Fin Para
FinSubProceso