//Realizar un programa que, dado un n�mero entero, visualice en pantalla si es par o
//impar. En caso de que el valor ingresado sea 0, se debe mostrar "el n�mero no es par ni
//impar". Nota: investigar la funci�n mod de PSeInt


Algoritmo parOImpar
	
	Definir numeroIngresado Como Entero
	
	Escribir "Por favor, ingrese un n�mero:"
	Leer numeroIngresado
	
	Si numeroIngresado = 0 Entonces
		Escribir "El n�mero no es par ni impar"
	SiNo
		Si numeroIngresado % 2 = 0 Entonces
			Escribir "El n�mero ingresado es par."
		SiNo
			Escribir "El n�mero ingresado es impar."
		FinSi
	FinSi
	
FinAlgoritmo
