//Crea una funci�n EsMultiplo que reciba los dos n�meros pasados por el usuario, validando
//que el primer n�mero m�ltiplo del segundo y devuelva verdadero si el primer n�mero es
//	m�ltiplo del segundo, sino es m�ltiplo que devuelva falso.
Funcion retorno <- EsMultiplo (num1, num2)
	Definir retorno Como Logico
	retorno = num1 % num2 = 0
	
FinFuncion


Algoritmo seraMultiplo
	Definir num1, num2 Como Entero
	Escribir "Ingrese el primer n�mero:"
	Leer num1
	Escribir "Ingrese el segundo n�mero:"
	Leer num2
	Escribir "El n�mero ", num1, " �es m�ltiplo de ", num2, "? " EsMultiplo(num1, num2)
	
FinAlgoritmo
