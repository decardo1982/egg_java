//Solicitar al usuario que ingrese dos n�meros enteros y determinar si ambos son pares o
//	impares. Mostrar en pantalla un mensaje que indique "Ambos n�meros son pares"
//	siempre y cuando cumplan con la condici�n. En caso contrario se deber� imprimir el
//	siguiente mensaje "Los n�meros no son pares, o uno de ellos no es par".
//Nota: investigar la funci�n mod de PseInt.

Algoritmo paresOImpares
	
	Definir num1, num2 Como Entero
	
	Escribir "Ingrese el primer n�mero:"
	Leer num1
	
	Mientras num1 = 0 Hacer
		Escribir "El n�mero no puede ser 0, por favor ingrese el primero n�mero:"
		Leer num1
	FinMientras
	
	Escribir "Ingrese el segundo n�mero:"
	Leer num2
	Mientras num2 = 0 Hacer
		Escribir "El n�mero no puede ser 0, por favor ingrese el primero n�mero:"
		Leer num2
	FinMientras
	
	Si (num1 % 2 = 0) Y (num2 % 2 = 0) Entonces
		Escribir "Ambos n�meros son pares"
	SiNo
		Escribir "Los n�meros no son pares, o uno de ellos no es par."
		
	FinSi
	
	
FinAlgoritmo
