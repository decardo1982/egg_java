//Dise�ar una funci�n que reciba un numero en forma de cadena y lo devuelva como numero
//entero. El programa podr� recibir n�meros de hasta 3 d�gitos. Nota: no poner n�meros con
//decimales ni letras. Ejemplo: ingresando "100"(car�cter) debe convertirse en 100(entero).
//ok

Algoritmo cadenaANumero
	
	Definir tresDigitos como Caracter
	
	Escribir "Ingrese un n�mero de 3 d�gitos:"
	Leer tresDigitos
	
	Mientras Longitud(tresDigitos) < 3 Hacer
		Escribir "El n�mero debe ser de hasta 3 d�gitos, intente nuevamente:"
		Leer tresDigitos
	FinMientras
	
	Escribir "El n�mero ", tresDigitos, " ahora es ", tresDigitosConvertido(tresDigitos)
	
FinAlgoritmo

Funcion retorno <- tresDigitosConvertido(tresDigitos)
	Definir retorno Como Entero
	retorno = ConvertirANumero(tresDigitos)
FinFuncion
