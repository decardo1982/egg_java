//Realizar una funci�n que valide si un n�mero es impar o no. Si es impar la funci�n debe
//devolver un verdadero, si no es impar debe devolver falso. Nota: la funci�n no debe tener
//		mensajes que digan si es par o no, eso debe pasar en el Algoritmo.
//ok

Algoritmo parOImpar
	
	Definir num Como Entero
	Escribir "Ingrese un n�mero:"
	Leer num
	
	Escribir "Y te respondo: �el n�mero ingresado es par? " imparopar(num)
FinAlgoritmo

Funcion respuesta <- imparopar(num)
	Definir respuesta Como Logico
	respuesta = num % 2 = 0
FinFuncion
