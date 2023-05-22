////Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
////programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
////todos ellos.
////Para poder lograr, por ejemplo, el máximo inicializaremos una variable en cero llamada
////numeroMaximo. Luego iremos comparando cada número que se ingresa con esta variable. Si es
////mayor reemplazaremos el valor de numeroMaximo. Por ejemplo si 5>0 entonces el máximo entre
////estos números será 5. Si luego ingreso el número 2, se evalúa 2>5 lo que resultará falso y por lo
////tanto el valor 5 de numeroMaximo no se reemplaza. Una lógica similar tendrá el número menor.


Algoritmo numerosMaxMin
	
	Definir nMax, nMin, nIngresado, contador, sumaIngresados Como Entero
	Definir promedio Como Real
	
	
	contador = 0
	sumaIngresados = 0
	
	Escribir "Ingrese un número entero:"
	Leer nIngresado
	contador = contador + 1
	sumaIngresados = sumaIngresados + nIngresado
	nMax = nIngresado
	nMin = nIngresado
	
	Hacer
		Escribir "Ingrese un número"
		Leer nIngresado
		contador = contador + 1
		sumaIngresados = sumaIngresados + nIngresado
		Si nIngresado > nMax Entonces
			nMax = nIngresado
		FinSi
		Si nIngresado < nMin Entonces
			nMin = nIngresado
		FinSi
		
	Mientras Que nIngresado <> 0
	
	Escribir "El número máximo es: ", nMax
	Escribir "El número mínimo es: ", nMin
	Escribir "El promedio de los números ingresados es: ", sumaIngresados / contador
	
	
FinAlgoritmo
