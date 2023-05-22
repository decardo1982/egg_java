//Continuando el ejercicio anterior, ahora se pedirá una frase o palabra y se validara si la
//	primera letra de la frase es igual a la última letra de la frase. Se deberá de imprimir un
//	mensaje por pantalla que diga "CORRECTO", en caso contrario, se deberá imprimir
//	"INCORRECTO".

Algoritmo primeraYUltima
	
	
	Definir texto_ingresado, primera_letra, ultima_letra Como Caracter
	
	Escribir "Ingrese un texto"
	Leer texto_ingresado
	
	primera_letra = Subcadena(texto_ingresado, 0, 0)
	Mostrar "La primera letra del texto ingresado es ", primera_letra
	
	ultima_letra = Subcadena(texto_ingresado, (Longitud(texto_ingresado) -1), (Longitud(texto_ingresado) -1))
	Mostrar "La última letra del texto ingresado es ", ultima_letra
	
	Si Minusculas(primera_letra) = Minusculas(ultima_letra) Entonces
		Escribir "CORRECTO. El texto ingresado comienza y termina con la misma letra."
	SiNo
		Escribir "INCORRECTO"
	FinSi

	
FinAlgoritmo
