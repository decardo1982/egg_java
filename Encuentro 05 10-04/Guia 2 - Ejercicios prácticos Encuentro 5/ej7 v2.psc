//Continuando el ejercicio anterior, ahora se pedirá una frase o palabra y se validara si la
//	primera letra de la frase es igual a la última letra de la frase. Se deberá de imprimir un
//	mensaje por pantalla que diga "CORRECTO", en caso contrario, se deberá imprimir
//	"INCORRECTO".

Algoritmo primeraYUltima
	
	
	Definir texto_ingresado Como Caracter
	
	Escribir "Ingrese un texto"
	Leer texto_ingresado
	
	Si Minusculas(Subcadena(texto_ingresado, 0, 0)) = Minusculas(Subcadena(texto_ingresado, (Longitud(texto_ingresado) -1), (Longitud(texto_ingresado) -1))) Entonces
		Escribir "CORRECTO. El texto ingresado comienza y termina con la misma letra."
	SiNo
		Escribir "INCORRECTO"
	FinSi
	
	
FinAlgoritmo
