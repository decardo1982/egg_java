//Solicitar al usuario que ingrese dos números enteros y determinar si ambos son pares o
//	impares. Mostrar en pantalla un mensaje que indique "Ambos números son pares"
//	siempre y cuando cumplan con la condición. En caso contrario se deberá imprimir el
//	siguiente mensaje "Los números no son pares, o uno de ellos no es par".
//Nota: investigar la función mod de PseInt.

Algoritmo paresOImpares
	
	Definir num1, num2 Como Entero
	
	Escribir "Ingrese el primer número:"
	Leer num1
	
	Mientras num1 = 0 Hacer
		Escribir "El número no puede ser 0, por favor ingrese el primero número:"
		Leer num1
	FinMientras
	
	Escribir "Ingrese el segundo número:"
	Leer num2
	Mientras num2 = 0 Hacer
		Escribir "El número no puede ser 0, por favor ingrese el primero número:"
		Leer num2
	FinMientras
	
	Si (num1 % 2 = 0) Y (num2 % 2 = 0) Entonces
		Escribir "Ambos números son pares"
	SiNo
		Escribir "Los números no son pares, o uno de ellos no es par."
		
	FinSi
	
	
FinAlgoritmo
