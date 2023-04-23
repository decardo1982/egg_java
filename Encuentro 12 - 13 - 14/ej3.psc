//Crea una función EsMultiplo que reciba los dos números pasados por el usuario, validando
//que el primer número múltiplo del segundo y devuelva verdadero si el primer número es
//	múltiplo del segundo, sino es múltiplo que devuelva falso.
Funcion retorno <- EsMultiplo (num1, num2)
	Definir retorno Como Logico
	retorno = num1 % num2 = 0
	
FinFuncion


Algoritmo seraMultiplo
	Definir num1, num2 Como Entero
	Escribir "Ingrese el primer número:"
	Leer num1
	Escribir "Ingrese el segundo número:"
	Leer num2
	Escribir "El número ", num1, " ¿es múltiplo de ", num2, "? " EsMultiplo(num1, num2)
	
FinAlgoritmo
