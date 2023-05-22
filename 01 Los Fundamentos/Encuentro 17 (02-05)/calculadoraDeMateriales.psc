////Vamos a programar una calculadora de materiales para construir
////Primero leeremos todo el ejercicio y luego dividiremos tareas en el equipo. El algoritmo principal sólo debe llamar al subPrograma menu()
////Cada subPrograma puede descomponerse, si hiciera falta, en otros subProgramas a creatividad del programador
////El menú debe quedar de la siguiente manera:
////			1.! Calcular muro de ladrillo
////			2.! Calcular viga de hormigón
////			3.! Calcular columnas de hormigón
////			4.! Calcular contrapisos
////			5.! Calcular techo
////			6.! Calcular pisos
////			7.! Calcular pintura
////			8.! Calcular iluminación
////			9.! Salir
////subprogramas calcularSuperficie y calcularVolumen
////Haremos ambos para usarlos dentro de los otros subprogramas. El usuario no puede acceder a ellos.

Algoritmo calculadoraDeMateriales
	
	menu()
	
FinAlgoritmo

SubProceso menu()
	
	Definir option como Entero
		
	Hacer
		Escribir "--------------------------"
		Escribir "Ingrese la opción deseada:"
		Escribir "--------------------------"
		Escribir ""
		Escribir "1. Calcular muro de ladrillo"
		Escribir "2. Calcular viga de hormigón"
		Escribir "3. Calcular columnas de hormigón"
		Escribir "4. Calcular contrapisos"
		Escribir "5. Calcular techo"
		Escribir "6. Calcular pisos"
		Escribir "7. Calcular pintura"
		Escribir "8. Calcular iluminación"
		Escribir "9. Salir"
		Escribir ""
		Leer option
				
	Mientras Que option < 1 O option > 9
	
	Segun option
		1: calcularMuro()
		2: calcularViga()
		3: calcularColumna()
		4: calcularContrapisos()
		5: calcularTecho()
		6: calcularPisos()
		7: calcularPintura()
		8: calcularIluminacion()
		9: salir()
				
	FinSegun

FinSubProceso

Funcion retorno <- calcularSuperficie(largo, ancho)
	Definir retorno Como Real
	retorno = largo * ancho
	
FinFuncion

Funcion retorno <- calcularVolumen(largo, ancho, alto)
	Definir retorno Como Real
	retorno = largo * ancho * alto
	
FinFuncion


SubProceso calcularMuro()
	
	Definir largo, espesor, alto, superficie Como Real
	
	Hacer
		
		Escribir "Ingrese el espesor del muro según opciones (20 o 30 cm)"
		Leer espesor
		
	Mientras Que espesor <> 20 Y espesor <> 30
	
	Escribir "Ingrese el LARGO del muro expresado en METROS:"
	Leer largo
	Escribir "Ingrese el ALTO del muro expresado en METROS:"
	Leer alto
	
	superficie = calcularSuperficie(largo, alto)
	
	espesor = espesor / 100
	
	Si espesor == 20
		Escribir ""
		Escribir "Para la construcción del muro de 20 cm. de espesor se necesitan:"
		Escribir 10.9 * superficie " kg de cemento"
		Escribir 0.09 * superficie " m3 de arena"
		Escribir 90 * superficie " ladrillos."
		Escribir ""
		
	SiNo
		Escribir ""
		Escribir "Para la construcción del muro de 30 cm. de espesor se necesitan:"
		Escribir 15.2 * superficie " kg. de cemento"
		Escribir 0.115 * superficie " m3 de arena"
		Escribir 120 * superficie " ladrillos."
		
	FinSi
	Escribir ""
	
	menu()
	
FinSubProceso

SubProceso calcularViga()
	
	Definir largoViga Como Real
	
	Escribir "Ingrese el largo de la viga (METROS)"
	Leer largoViga
	Escribir ""
	Escribir "Para una viga de ", largoViga, " metros se necesitan los siguientes materiales:"
	Escribir 9 * largoViga " kg de cemento"
	Escribir 0.02 * largoViga " m3 de arena" 
	Escribir 0.02 * largoViga " m2 de piedras" 
	Escribir 4 * largoViga " mts de hierro del 8" 
	Escribir 3 * largoViga " mts de hierro del 4." 
	Escribir ""
	
	menu()
FinSubProceso

SubProceso calcularColumna()
	
	Definir largoColumna Como Real
	
	Escribir "Ingrese el largo de la columna (METROS):"
	Leer largoColumna
	Escribir ""
	Escribir "Para una columna de ", largoColumna, " metros se necesitan los siguientes materiales:"
	Escribir 7.5 * largoColumna " kg de cemento"
	Escribir 0.016 * largoColumna " m3 de arena" 
	Escribir 0.016 * largoColumna " m2 de piedras"
	Escribir 6 * largoColumna " mts de hierro del 10" 
	Escribir 3 * largoColumna " mts de hierro del 4."
	Escribir ""
	
	menu()
FinSubProceso


SubProceso calcularContrapisos()
	Definir espesor, ancho, largo, volumen Como Real
	Escribir ""
	Escribir "Ingrese el largo del contrapiso (METROS)"
	Leer largo
	Escribir "Ingrese el ancho del contrapiso (METROS)"
	Leer ancho
	Escribir "Ingrese el espesor del contrapiso (METROS)"
	Leer espesor
	
	volumen = calcularVolumen(largo, ancho, espesor)
	
	Escribir ""
	Escribir "Para el contrapiso se necesitan los siguientes materiales:"
	Escribir 105 * volumen " kg. de cemento"
	Escribir 0.45 * volumen " m3 de arena"
	Escribir 0.9 * volumen " m3 de piedra."
	Escribir ""
	
	menu()
	
FinSubProceso

SubProceso calcularTecho()
	
	Definir espesor, ancho, largo, volumen Como Real
	Escribir ""
	Escribir "Ingrese el largo del techo (METROS)"
	Leer largo
	Escribir "Ingrese el ancho del techo (METROS)"
	Leer ancho
	Escribir "Ingrese el espesor del techo (METROS)"
	Leer espesor
	
	volumen = calcularVolumen(largo, ancho, espesor)
	
	Escribir ""
	Escribir "Para el techo se necesitan los siguientes materiales:"
	Escribir 33 * volumen " kg. de cemento"
	Escribir 0.072 * volumen " m3 de arena"
	Escribir 0.072 * volumen " m3 de piedra"
	Escribir 7 * volumen " metros de hierro del 8"
	Escribir 4 * volumen " metros de hierro del 6"
	Escribir ""
	
	menu()
	
FinSubProceso

SubProceso calcularPisos()
	
	Definir ancho, largo, superficie Como Real	
	
	Escribir ""
	Escribir "Ingrese el largo del contrapiso (METROS):"
	Leer largo
	Escribir "Ingrese el ancho del contrapiso (METROS):"
	Leer ancho
	
	superficie = calcularSuperficie(ancho, largo)
	
	Escribir ""
	Escribir "Para cubrir la supercifie de ", superficie, " m2 se neceistan los siguientes materiales:"
	Escribir superficie * 1.1 " m2. de cerámicos."
	Escribir ""
	
	menu()
	
FinSubProceso

SubProceso calcularPintura()
	
	Definir largo, alto, superficie Como Real
	
	Escribir "Ingrese la altura de la pared a pintar (METROS):"
	Leer alto
	Escribir "Ingrese el largo de la pared a pintar (METROS):"
	Leer largo
	superficie = largo * alto
	Escribir ""
	Escribir "Se necesitan " superficie / 6 " litros de pintura para pintar la pared indicada."
	Escribir ""
	
	menu()
	
FinSubProceso

SubProceso calcularIluminacion()
	
	Definir largo, alto, superficie Como Real
	
	Escribir "Ingrese la altura de la habitación (METROS):"
	Leer alto
	Escribir "Ingrese el largo de la habitación (METROS):"
	Leer largo
	superficie = largo * alto
	
	Escribir ""
	Escribir "La habitación debe tener un mínimo de " superficie * 0.20 " m2 de iluminación natural."
	Escribir ""
	
	menu()
	
FinSubProceso

SubProceso salir()
	
	Escribir ""
	Escribir "----------------------------------"
	Escribir "Gracias por usar nuestro programa."
	Escribir "----------------------------------"
	Escribir ""
	
FinSubProceso


