//Realizar un programa que pida tres notas y determine si un alumno aprueba o reprueba
//	un curso, sabiendo que aprobará el curso si su promedio de tres calificaciones es mayor o
//		igual a 70; y reprueba en caso contrario.
Algoritmo sin_titulo
	Definir nota1, nota2, nota3, promedio Como Real
	
	Escribir "Ingrese la primera nota en el rango de 0 a 100:"
	Leer nota1
	
	Escribir "Ingrese la segunda nota en el rango de 0 a 100:"
	Leer nota2
	
	Escribir "Ingrese la tercera nota en el rango de 0 a 100:"
	Leer nota3
	
	promedio = (nota1 + nota2 + nota3) / 3
	
	Si promedio >= 70 Entonces
		Escribir "El alumno aprobó ya que su promedio es de ", promedio
	SiNo
		Escribir "El alumno NO aprobó ya que su promedio es de ", promedio, " y no alcanza al mínimo de 70"
	FinSi

	
	
FinAlgoritmo
