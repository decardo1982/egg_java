////Realizar un programa con el siguiente menú y le pregunte al usuario que quiere hacer hasta
////que ingrese la opción Salir:
////	A. Llenar Vector A. Este vector es de tamaño N y se debe llenar de manera aleatoria
////	usando la función Aleatorio(valorMin, valorMax) de PseInt.
////	B. Llenar Vector B. Este vector también es de tamaño N y se llena de manera aleatoria.
////	C. Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar elemento
////a elemento. Ejemplo: C = A + B
////	D. Llenar Vector C con la resta de los vectores B y A. La resta se debe realizar elemento a
////elemento. Ejemplo: C = B - A
////E. Mostrar. Esta opción debe permitir al usuario decidir qué vector quiere mostrar: Vector
////	A, B, o C.
////	F. Salir.
////NOTA: El rango de los números aleatorios para los Vectores será de [-100 a 100]. La longitud
////		para todos los vectores debe ser la misma, por lo tanto, esa información sólo se solicitará una vez.
Algoritmo ej4_G5
	menu()
FinAlgoritmo

SubProceso menu()
	Definir option Como Caracter
	Definir n, vectorA, vectorB, vectorC, i Como Entero
	
	Hacer
		Escribir "-------------------------------------------"	
		Escribir " Seleccione una de las opciones indicadas:"
		Escribir "-------------------------------------------"
		Escribir "A. Llenar Vector A"
		Escribir "B. Llenar Vector B"
		Escribir "C. Llenar Vector C con la suma de los vectores A y B"
		Escribir "D. Llenar Vector C con la resta de los vectores B y A"
		Escribir "E. Mostrar. Esta opción permite al usuario decidir qué vector mostrar: A, B o C"
		Escribir "F. Salir"
		Escribir ""
		Leer option
		option = Mayusculas(option)
	Mientras Que option < "A" O option > "F"
	
	Escribir "Ingrese el tamaño de los vectores:"
	Leer n
	Dimension vectorA[n]
	Dimension vectorB[n]
	Dimension vectorC[n]
	
	Segun option Hacer
		"A": 
			
		"B":
			
		"C":
			
		"D":
			
		"E":
			mostrarVectores()
		"F":
			salir()
			
	FinSegun
	
	
FinSubProceso


SubProceso mostrarVectores()
	Definir verVector Como Caracter
	
	Hacer
		Escribir "Seleccione el vector a visualizar:"
		Escribir "Vector A"
		Escribir "Vector B"
		Escribir "Vector C"
		Leer verVector
		verVector = Mayusculas(verVector)
	Mientras Que verVector < "A" O verVector > "C"
	
	Segun verVector Hacer
		"A":
			Escribir "A"
		"B":
			Escribir "B"
		"C":
			Escribir "C"
	FinSegun
	
FinSubProceso

SubProceso salir()
	
	Escribir "Gracias por usar nuestro programa de vectores."
	
FinSubProceso
