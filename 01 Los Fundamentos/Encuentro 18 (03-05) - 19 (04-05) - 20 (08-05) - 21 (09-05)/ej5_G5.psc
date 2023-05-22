////Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
////usuario. A continuación, se deberá crear una función que reciba el vector y devuelva el valor
////más grande del vector.

Algoritmo ej5_G5
	
	Definir vector, n, i Como Entero // Definimos las variables a utilizar
	Escribir "Ingrese el tamaño del vector:" //El usuario ingresa el tamaño del vector
	Leer n
	Dimension vector[n]
	
	Para i <- 0 Hasta (n - 1) Con Paso 1 Hacer // vamos pidiendo valores
		Escribir "Ingrese el valor para la posición ", i
		Leer vector[i]
	FinPara
	
	Escribir "El número mayor del vector es: ", numeroMayor(vector, n) //llamamos a la función
	
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
	