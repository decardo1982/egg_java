//Escriba un programa en el cual se ingrese un valor l�mite positivo, y a continuaci�n
//solicite n�meros al usuario hasta que la suma de los n�meros introducidos supere el
//l�mite inicial.

Algoritmo sin_titulo
	
	Definir valor_limite, num, sumatoria Como Real
	
	sumatoria = 0	
	num = 0
	
	Escribir "Ingrese un n�mero l�mite:"
	Leer valor_limite
	
	
	Mientras valor_limite > sumatoria Hacer
		Escribir "Ingrese un n�mero:"
		Leer num
		sumatoria = sumatoria + num
		Escribir sumatoria
	Fin Mientras
	
	Escribir "El valor ", sumatoria, " alcanz� o super� el l�mite inicial: ", valor_limite
	
	
	
FinAlgoritmo
