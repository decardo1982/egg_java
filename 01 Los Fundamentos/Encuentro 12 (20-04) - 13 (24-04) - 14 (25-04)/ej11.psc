//Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero
//tiene todos sus d�gitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener que separar el
//		numero en partes (si es un numero de m�s de un digito) y ver si cada n�mero es par o impar.
//		Nota: recordar el uso de la funci�n Mod y Trunc(). No podemos pasar el numero a cadena para
//				realizar el ejercicio.
//ok

Algoritmo digitosImpares
	
	Definir num Como Real
	Escribir "Ingrese un n�mero para averiguar si todos los d�gitos son impares:"
	Leer num	
	Escribir "El n�mero ", num, " �tiene todos sus d�gitos impares? ", impares(num)
	
FinAlgoritmo

Funcion retorno <- impares(num)
	Definir retorno Como logico
	Definir check Como Entero
	check = 0
	retorno = Verdadero
	
	Si num % 2 = 0 Entonces
		retorno = Falso
	SiNo
		Mientras num <> 0 Y num % 2 <> 0 Y retorno = Verdadero Hacer
			check = check + (num % 10)
			num = trunc(num/10)
		FinMientras
	FinSi
	
FinFuncion