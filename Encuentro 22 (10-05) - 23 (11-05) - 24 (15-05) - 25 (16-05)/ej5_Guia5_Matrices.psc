////Rellenar una matriz, de 3 x 3, con una palabra de 9 de longitud, pedida por el usuario,
////encontrando la manera de que la frase se muestre de manera continua en la matriz.
////Por ejemplo, si tenemos la palabra habilidad, nuestra matriz se debería ver así:
////		H A B
////		I L I
////		D A D
////	Nota: recordar el uso de la función Subcadena().

Algoritmo sin_titulo
	
	Definir matriz, palabra Como Caracter
	Definir i, j, k Como Entero
	k = 0 //usamos esta variable como contador
	
	Dimension matriz[3,3]
	
	Hacer //nos aseguramos de que la palabra ingresada sea de 9 letras
		Escribir "Ingrese una palabra de 9 letras:"
		Leer palabra
	Mientras Que Longitud(palabra) <> 9
	
	Para i <- 0 Hasta 2 Hacer
		Para j <- 0 Hasta 2 Hacer
			matriz[i, j] = Subcadena(palabra,k,k) //el contador inicializado en 0 nos da la posición de la subcadena
			k = k + 1
		FinPara
	FinPara
	
	mostrarMatriz(matriz)
	
FinAlgoritmo

SubAlgoritmo mostrarMatriz(matriz)
	Definir i, j Como Entero
	Para i <- 0 Hasta 2 Hacer
		Para j <- 0 Hasta 2 Hacer
			Escribir matriz[i,j], " | " Sin Saltar
		FinPara
		Escribir ""
	FinPara
	
FinSubAlgoritmo
