//EJERCICIO DESAYUNO
//Es tu turno, dise�a un condicional anidado que le pregunte al usuario si quiere tomar t� o caf� y
//	en caso de que quiera tomar caf�, preguntar si solo o cortado y en caso de ser cortado, si
//			prefiere leche vegetal.


Algoritmo ejercicioDesayuno
	
	Definir infusion Como Entero
	
	Escribir "Ingrese la opci�n de desayuno:"
	Escribir "1 - Caf�"
	Escribir "2 - T�"
	Leer infusion
	
	Si infusion = 2 Entonces
		Escribir "Seleccion� t� para desayunar"
	SiNo
		Definir opcion_cafe Como Entero
		Escribir "Ingrese la opci�n de caf�:"
		Escribir "1 - Caf� solo"
		Escribir "2 - Caf� cortado"
		Leer opcion_cafe
		
		Si opcion_cafe = 1 Entonces
			Escribir "Seleccion� para desayunar caf� solo"
		SiNo
			Si opcion_cafe = 2 Entonces
				Definir opcion_leche Como Entero
				Escribir "Ingrese una opci�n:"
				Escribir "1 - Leche vegetal"
				Escribir "2 - Leche com�n"
				Leer opcion_leche
			FinSi
			
			Si opcion_leche = 1 Entonces
				Escribir "Seleccion� para desayuna caf� cortado con leche vegetal"
			SiNo
				Si opcion_leche = 2 Entonces
					Escribir "Seleccion� para desayunar caf� cortado con leche com�n"
				FinSi
				Escribir "La opci�n no es correcta."
			FinSi
		FinSi
	FinSi
	
	
	
	
FinAlgoritmo
