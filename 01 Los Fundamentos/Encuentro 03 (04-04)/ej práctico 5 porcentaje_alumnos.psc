//Un colegio desea saber qué porcentaje de niños y qué porcentaje de niñas hay en el curso
//actual. Diseñar un algoritmo para este propósito. Recuerda que para calcular el porcentaje
//puedes hacer una regla de 3 simple. El programa debe solicitar al usuario que ingrese la
//cantidad total de niños, y la cantidad total de niñas que hay en el curso.
Algoritmo porcentaje_alumnos
	Definir total, boys, girls, boys_percent, girls_percent Como Real
	Escribir "Ingrese la cantidad total de niños:"
	Leer boys
	Escribir "Ingrese la cantidad total de niñas:"
	Leer girls
	total = girls + boys
	girls_percent = girls * 100 / total
	boys_percent = boys * 100 / total
	Escribir "El porcentaje de niñas es de ", girls_percent, "% y el porcentaje de niños es de ", boys_percent, "%" 
	
	
FinAlgoritmo
