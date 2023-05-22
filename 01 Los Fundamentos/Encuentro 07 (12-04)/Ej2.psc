//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
//solicite números al usuario hasta que la suma de los números introducidos supere el
//límite inicial.

Algoritmo sin_titulo
	
	Definir valor_limite, num, sumatoria Como Real
	
	sumatoria = 0	
	num = 0
	
	Escribir "Ingrese un número límite:"
	Leer valor_limite
	
	
	Mientras valor_limite > sumatoria Hacer
		Escribir "Ingrese un número:"
		Leer num
		sumatoria = sumatoria + num
		Escribir sumatoria
	Fin Mientras
	
	Escribir "El valor ", sumatoria, " alcanzó o superó el límite inicial: ", valor_limite
	
	
	
FinAlgoritmo
