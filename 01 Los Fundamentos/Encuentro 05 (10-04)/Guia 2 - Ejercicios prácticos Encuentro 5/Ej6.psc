//Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
//	es una ?A?. Si la primera letra es una ?A?, se deberá de imprimir un mensaje por pantalla
//	que diga "CORRECTO", en caso contrario, se deberá imprimir "INCORRECTO". Nota:
//		investigar la función Subcadena de PseInt.


Algoritmo primeraLetraSeaA
	
	Definir texto_ingresado Como Caracter
	
	Escribir "Ingrese un texto"
	Leer texto_ingresado
	
	Si Mayusculas(Subcadena(texto_ingresado, 0, 0)) = "A" Entonces
		Escribir "CORRECTO"
	SiNo
		Escribir "INCORRECTO"
	FinSi
	
FinAlgoritmo
