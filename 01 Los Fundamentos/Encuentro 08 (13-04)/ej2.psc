////Escribir un programa que lea n�meros enteros hasta teclear 0 (cero). Al finalizar el
////programa se debe mostrar el m�ximo n�mero ingresado, el m�nimo, y el promedio de
////todos ellos.
////Para poder lograr, por ejemplo, el m�ximo inicializaremos una variable en cero llamada
////numeroMaximo. Luego iremos comparando cada n�mero que se ingresa con esta variable. Si es
////mayor reemplazaremos el valor de numeroMaximo. Por ejemplo si 5>0 entonces el m�ximo entre
////estos n�meros ser� 5. Si luego ingreso el n�mero 2, se eval�a 2>5 lo que resultar� falso y por lo
////tanto el valor 5 de numeroMaximo no se reemplaza. Una l�gica similar tendr� el n�mero menor.


Algoritmo numerosMaxMin
	
	Definir nMax, nMin, nIngresado, contador, sumaIngresados Como Entero
	Definir promedio Como Real
	
	
	contador = 0
	sumaIngresados = 0
	
	Escribir "Ingrese un n�mero entero:"
	Leer nIngresado
	contador = contador + 1
	sumaIngresados = sumaIngresados + nIngresado
	nMax = nIngresado
	nMin = nIngresado
	
	Hacer
		Escribir "Ingrese un n�mero"
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
	
	Escribir "El n�mero m�ximo es: ", nMax
	Escribir "El n�mero m�nimo es: ", nMin
	Escribir "El promedio de los n�meros ingresados es: ", sumaIngresados / contador
	
	
FinAlgoritmo
