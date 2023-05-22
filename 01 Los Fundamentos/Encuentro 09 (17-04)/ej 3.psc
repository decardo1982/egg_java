////Un docente de Programaci�n tiene un listado de 3 notas registradas por cada uno de sus
////N estudiantes. La nota final se compone de un trabajo pr�ctico Integrador (35%), una
////Exposici�n (25%) y un Parcial (40%). El docente requiere los siguientes informes claves
////de sus estudiantes:

////	-	Nota promedio final de los estudiantes que reprobaron el curso. Un estudiante reprueba el curso si tiene una nota final inferior a 6.5
////	- 	Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5.
////	-	La mayor nota obtenida en las exposiciones.
////	-	Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5.

////		El programa pedir� la cantidad de alumnos que tiene el docente y en cada alumno pedir�
////		las 3 notas y calcular� todos informes claves que requiere el docente.

Algoritmo notasFinales
	
	Definir notaTrabajoPractico, notaExposicion, notaParcial, notaFinal, NotaExposicionMax, alumnosConIntegradorMayorSietePuntoCinco, notasFinalesReprobados Como Real
	Definir cantAlumnos, alumnosAprobados, alumnosReprobados, alumnosParcialEntreCuatroYSietePuntoCinco Como Entero
	
	Escribir "Ingrese la cantidad de alumnos:"
	Leer cantAlumnos
	alumnosAprobados = 0
	alumnosReprobados = 0
	alumnosConIntegradorMayorSietePuntoCinco = 0
	alumnosParcialEntreCuatroYSietePuntoCinco = 0
	NotaExposicionMax = 0
	notasFinalesReprobados = 0
	notaFinal = 0
	
	Para cantAlumnos <- 1 Hasta cantAlumnos Con Paso 1 Hacer
		Escribir "Ingrese primera nota (Trabajo pr�ctico integrador 35%):"
		Leer notaTrabajoPractico
		Si notaTrabajoPractico > 7.5 Entonces
			alumnosConIntegradorMayorSietePuntoCinco = alumnosConIntegradorMayorSietePuntoCinco + 1
		FinSi
		
		Escribir "Ingrese segunda nota (Exposici�n 25%):"
		Leer notaExposicion
		Si notaExposicion > NotaExposicionMax Entonces
			NotaExposicionMax = notaExposicion
		FinSi
		Escribir "Ingrese tercera nota (Parcial 40%):"
		Leer notaParcial
		
		Si notaParcial >= 4.0 Y notaParcial <= 7.5 Entonces
			alumnosParcialEntreCuatroYSietePuntoCinco = alumnosParcialEntreCuatroYSietePuntoCinco + 1			
		FinSi
		
		notaFinal = notaTrabajoPractico * 0.35 + notaExposicion * 0.25 + notaParcial * 0.4
		Escribir "La nota final obtenida es: " notaFinal
		Si notaFinal < 6.5 Entonces
			alumnosReprobados = alumnosReprobados + 1
			notasFinalesReprobados = notasFinalesReprobados + notaFinal
			
		FinSi
	Fin Para
	
	Escribir "La nota promedio de los estudiantes que reprobaron el curso (inferior a 6.5) es: ", notasFinalesReprobados / alumnosReprobados
	Escribir "El porcentaje de alumnos que tienen una nota de integrador mayor a 7.5 es: ", alumnosConIntegradorMayorSietePuntoCinco * 100 / cantAlumnos, "%"
	Escribir "La mayor nota obtenida en las exposiciones es: ", NotaExposicionMax
	Escribir "El total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5 es: ", alumnosParcialEntreCuatroYSietePuntoCinco
	
FinAlgoritmo
