////Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el
////usuario. A continuaci�n, se deber� crear una funci�n que reciba el vector y devuelva el valor
////m�s grande del vector.

Algoritmo ej5_G5
	
	Definir vector, n, i Como Entero // Definimos las variables a utilizar
	Escribir "Ingrese el tama�o del vector:" //El usuario ingresa el tama�o del vector
	Leer n
	Dimension vector[n]
	
	Para i <- 0 Hasta (n - 1) Con Paso 1 Hacer // vamos pidiendo valores
		Escribir "Ingrese el valor para la posici�n ", i
		Leer vector[i]
	FinPara
	
	Escribir "El n�mero mayor del vector es: ", numeroMayor(vector, n) //llamamos a la funci�n
	
FinAlgoritmo

Funcion retorno <- numeroMayor(vector, n)
	Definir retorno, j Como Entero
	retorno = 0
	j = 0
	
	Para j <- 0 Hasta (n - 1) Con Paso 1 Hacer
		Si vector[j] > retorno Entonces
			retorno = vector[j]
		FinSi
		
	FinPara
	
FinFuncion
	