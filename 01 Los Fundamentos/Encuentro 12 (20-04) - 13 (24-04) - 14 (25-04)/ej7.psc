//Diseñar una función que reciba un numero en forma de cadena y lo devuelva como numero
//entero. El programa podrá recibir números de hasta 3 dígitos. Nota: no poner números con
//decimales ni letras. Ejemplo: ingresando "100"(carácter) debe convertirse en 100(entero).
//ok

Algoritmo cadenaANumero
	
	Definir tresDigitos como Caracter
	
	Escribir "Ingrese un número de 3 dígitos:"
	Leer tresDigitos
	
	Mientras Longitud(tresDigitos) < 3 Hacer
		Escribir "El número debe ser de hasta 3 dígitos, intente nuevamente:"
		Leer tresDigitos
	FinMientras
	
	Escribir "El número ", tresDigitos, " ahora es ", tresDigitosConvertido(tresDigitos)
	
FinAlgoritmo

Funcion retorno <- tresDigitosConvertido(tresDigitos)
	Definir retorno Como Entero
	retorno = ConvertirANumero(tresDigitos)
FinFuncion
