Algoritmo sin_titulo
	
	definir nombre Como Caracter
	definir nota1, nota2, nota3, notaFinal Como Real
	
	escribir "Ingrese el nombre del alumno"
	leer nombre
	Mientras nombre <> "" Hacer
		escribir "Ingrese las 3 notas"
		leer nota1, nota2, nota3
		
		Si (nota1>=0 y nota1<=10) y (nota2>=0 y nota2<=10) y (nota3>=0 y nota3<=10) Entonces
			notaFinal = (nota1*0.1 + nota2 * 0.5 + nota3 * 0.4)
			escribir "El promedio del alumno ", nombre, " es ", notaFinal
			escribir "Ingrese el nombre del alumno"
			leer nombre
		SiNo
			escribir "No ingreso las notas correctamente"
			escribir "Ingrese el nombre del alumno"
			leer nombre
		Fin Si
		
	Fin Mientras
	
FinAlgoritmo