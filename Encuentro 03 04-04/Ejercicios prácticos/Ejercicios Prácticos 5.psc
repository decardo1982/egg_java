//Un colegio desea saber qu� porcentaje de ni�os y qu� porcentaje de ni�as hay en el curso
//actual. Dise�ar un algoritmo para este prop�sito. Recuerda que para calcular el porcentaje
//puedes hacer una regla de 3 simple. El programa debe solicitar al usuario que ingrese la
//cantidad total de ni�os, y la cantidad total de ni�as que hay en el curso.
Algoritmo porcentaje_alumnos
	Definir total, boys, girls, boys_percent, girls_percent Como Real
	Escribir "Ingrese la cantidad total de ni�os:"
	Leer boys
	Escribir "Ingrese la cantidad total de ni�as:"
	Leer girls
	total = girls + boys
	girls_percent = girls * 100 / total
	boys_percent = boys * 100 / total
	Escribir "El porcentaje de ni�as es de ", girls_percent, "% y el porcentaje de ni�os es de ", boys_percent, "%" 
	
	
FinAlgoritmo
