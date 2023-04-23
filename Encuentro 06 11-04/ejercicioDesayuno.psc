//EJERCICIO DESAYUNO
//Es tu turno, diseña un condicional anidado que le pregunte al usuario si quiere tomar té o café y
//	en caso de que quiera tomar café, preguntar si solo o cortado y en caso de ser cortado, si
//			prefiere leche vegetal.


Algoritmo ejercicioDesayuno
	
	Definir infusion Como Entero
	
	Escribir "Ingrese la opción de desayuno:"
	Escribir "1 - Café"
	Escribir "2 - Té"
	Leer infusion
	
	Si infusion = 2 Entonces
		Escribir "Seleccionó té para desayunar"
	SiNo
		Definir opcion_cafe Como Entero
		Escribir "Ingrese la opción de café:"
		Escribir "1 - Café solo"
		Escribir "2 - Café cortado"
		Leer opcion_cafe
		
		Si opcion_cafe = 1 Entonces
			Escribir "Seleccionó para desayunar café solo"
		SiNo
			Si opcion_cafe = 2 Entonces
				Definir opcion_leche Como Entero
				Escribir "Ingrese una opción:"
				Escribir "1 - Leche vegetal"
				Escribir "2 - Leche común"
				Leer opcion_leche
			FinSi
			
			Si opcion_leche = 1 Entonces
				Escribir "Seleccionó para desayuna café cortado con leche vegetal"
			SiNo
				Si opcion_leche = 2 Entonces
					Escribir "Seleccionó para desayunar café cortado con leche común"
				FinSi
				Escribir "La opción no es correcta."
			FinSi
		FinSi
	FinSi
	
	
	
	
FinAlgoritmo
