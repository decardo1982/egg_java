//Escriba un programa para obtener el grado de eficiencia de un operario de una fábrica de tornillos, de acuerdo a las siguientes dos condiciones que se le imponen para un período de prueba:

///Producir menos de 200 tornillos defectuosos.
/// Producir más de 10000 tornillos sin defectos.
/// El grado de eficiencia se determina de la siguiente manera:

/// Si no cumple ninguna de las condiciones, grado 5.
/// Si sólo cumple la primera condición, grado 6.
/// Si sólo cumple la segunda condición, grado 7.
/// Si cumple las dos condiciones, grado 8

/// Nota: para trabajar este ejercicio de manera prolija, ir probando cada inciso que pide el ejercicio. No hacer todos al mismo tiempo y después probar.

Algoritmo gradoDeEficiencia
	
	Definir tornillos_defectuosos, tornillos_sin_defectos Como Enteros
	
	Escribir "Ingrese la cantidad de tornillos defectuosos:"
	leer tornillos_defectuosos
	Escribir "Ingrese la cantidad de tornillos sin defectos:"
	leer tornillos_sin_defectos
	
	si tornillos_defectuosos < 200 Y tornillos_sin_defectos > 10000 Entonces
		Escribir "La eficiencia se ubica en grado 8"
	SiNo
		si tornillos_defectuosos < 200 Y tornillos_sin_defectos < 10000 Entonces
			Escribir "La eficiencia se ubica en grado 6"
		SiNo
			Si tornillos_defectuosos > 200 Y tornillos_sin_defectos > 10000 Entonces
				Escribir "La eficiencia se ubica en grado 7"
			SiNo
				Si tornillos_defectuosos > 200 Y tornillos_sin_defectos < 10000 Entonces
					Escribir "La eficiencia se ubica en grado 5"
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
