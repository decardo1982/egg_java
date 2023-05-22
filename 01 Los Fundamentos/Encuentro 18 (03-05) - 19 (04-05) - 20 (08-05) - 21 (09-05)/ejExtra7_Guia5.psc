////Programe una funci�n que calcule el producto de un arreglo de n�meros enteros. 
////Para esto imagine, por ejemplo, que para un vector V de tama�o 4
////el producto de todos los valores es igual a (V[1]*V[2]*V[3]*V[4])

Algoritmo ejExtra7_Guia5
	
	Definir vector, i Como Entero
	Dimension vector[4]
	
	Para i <- 0 Hasta 3 Hacer
		Escribir "Ingrese el valor para el sub�ndice ", i, ":"
		Leer vector[i]
	FinPara
	
	Escribir "El producto de todos los valores del vector es ", producto(vector)
	
FinAlgoritmo

Funcion retorno <- producto(vector)
	Definir retorno, i Como Entero
	retorno = 1 //inicializamos retorno con 1 porque si fuese 0 la multiplicaci�n siempre va a dar 0
	
	Para i <- 0 Hasta 3 Hacer
		retorno = retorno * vector[i]
	FinPara
	
FinFuncion
