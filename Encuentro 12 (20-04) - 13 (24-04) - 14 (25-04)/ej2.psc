//Realizar una función que valide si un número es impar o no. Si es impar la función debe
//devolver un verdadero, si no es impar debe devolver falso. Nota: la función no debe tener
//		mensajes que digan si es par o no, eso debe pasar en el Algoritmo.
//ok

Algoritmo parOImpar
	
	Definir num Como Entero
	Escribir "Ingrese un número:"
	Leer num
	
	Escribir "Y te respondo: ¿el número ingresado es par? " imparopar(num)
FinAlgoritmo

Funcion respuesta <- imparopar(num)
	Definir respuesta Como Logico
	respuesta = num % 2 = 0
FinFuncion
