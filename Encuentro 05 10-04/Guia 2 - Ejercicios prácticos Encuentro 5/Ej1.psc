//Realiza un programa que sólo permita introducir los caracteres 'S' y 'N'.
//Si el usuario ingresa alguno de esos dos caracteres se deberá de imprimir
//un mensaje por pantalla que diga "CORRECTO", en caso contrario, se deberá imprimir "INCORRECTO".

Algoritmo ese_o_ene
	
	Definir caracterIngresado Como Caracter
	
	Escribir "Ingrese un caracter (S o N):"
	Leer caracterIngresado
	
	Si Minusculas(caracterIngresado) = "s" O Minusculas(caracterIngresado) = "n" Entonces
		Escribir "CORRECTO"
	SiNo
		Escribir "INCORRECTO"
	FinSi
	
FinAlgoritmo
