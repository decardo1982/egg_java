//Realizar un programa que, dado un número entero, visualice en pantalla si es par o
//impar. En caso de que el valor ingresado sea 0, se debe mostrar "el número no es par ni
//impar". Nota: investigar la función mod de PSeInt


Algoritmo parOImpar
	
	Definir numeroIngresado Como Entero
	
	Escribir "Por favor, ingrese un número:"
	Leer numeroIngresado
	
	Si numeroIngresado = 0 Entonces
		Escribir "El número no es par ni impar"
	SiNo
		Si numeroIngresado % 2 = 0 Entonces
			Escribir "El número ingresado es par."
		SiNo
			Escribir "El número ingresado es impar."
		FinSi
	FinSi
	
FinAlgoritmo
