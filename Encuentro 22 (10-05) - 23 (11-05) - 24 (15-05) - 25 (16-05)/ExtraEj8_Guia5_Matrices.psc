////Una distribuidora de Nescafé tiene 4 representantes que viajan por toda la Argentina
////ofreciendo sus productos. Para tareas administrativas el país está dividido en cinco zonas:
////		Norte, Sur, Este, Oeste y Centro. Mensualmente almacena sus datos y obtiene distintas
////		estadísticas sobre el comportamiento de sus representantes en cada zona. Se desea hacer un
////	programa que lea el monto de las ventas de los representantes en cada zona y calcule luego:
////		a) el total de ventas de una zona introducida por teclado
////		b) el total de ventas de un vendedor introducido por teclado en cada una de las zonas
////		c) el total de ventas de todos los representantes

Algoritmo extra8
	definir choice Como Caracter
	definir ventasPorZona Como Entero
	dimension ventasPorZona( 5,4)
	
	llenarVentas(ventasPorZona)
	mostrarMatriz(ventasPorZona)
	escribir ""
	
	Repetir
		choice = ejecutarPrograma(ventasPorZona)
		escribir ""
	Mientras Que choice <> "s"
	
	
FinAlgoritmo

funcion choice = ejecutarPrograma(ventasPorZona)
	definir ventas Como Entero
	definir choice,zona,vendedor Como Caracter
	
	repetir
		escribir " qué quiere hacer?"
		escribir " a -> calcular el total de ventas de una zona"
		escribir " b -> calcular  el total de ventas de un vendedor en cada una de las zonas "
		escribir " c -> calcular el total de ventas de todos los representantes"
		escribir " s -> Salir"
		leer choice
	mientras que choice <> "a" y choice <> "b" y choice <> "c" y choice <> "s" 
	
	Segun Minusculas(choice)
		"a" : 
			escribir " ingrese zona 0 -> Sur   1-> Norte   2-> Oeste   3-> Este   4-> Centro"
			leer zona
			ventas = calcularVentasPorZona(ConvertirANumero(zona),ventasPorZona)
			segun zona
				"0": zona = "Sur"
				"1":zona = "Norte"
				"2":zona = "Oeste"
				"3":zona = "Este"
				"4":zona = "Centro"
					
			FinSegun
			escribir " la cantidad de ventas en la zona " zona " fue de " ventas
		"b" : 
			escribir " ingrese vendedor (0,1,2,3)"
			leer vendedor
			calcularVentasVendeodorPorZona(ConvertirANumero(vendedor),ventasPorZona)
		"c" : 
			escribir " la cantidad de ventas totales fue de : " calcularVentasTotales(ventasPorZona)
		"s" : 
			escribir " chaucito....."
	FinSegun
FinFuncion

SubProceso llenarVentas(ventasPorZona)
	definir i,j como entero
	para i = 0 hasta 4
		para j = 0 hasta 3
			ventasPorZona(i,j) = Aleatorio(1,10)
		FinPara
	FinPara
FinSubProceso

SubProceso mostrarMatriz(ventasPorZona)
	definir i,j Como Entero
	para i = 0 hasta 4
		para j = 0 hasta 3
			Escribir Sin Saltar ventasPorZona(i,j) " "
		FinPara
		escribir ""
	FinPara
FinSubProceso

funcion ventas = calcularVentasPorZona(zona,ventasPorZona)
	definir i , ventas Como Entero
	ventas = 0
	para i = 0 hasta 3
		ventas = ventas + ventasPorZona(zona,i)
	FinPara
FinSubProceso

SubProceso calcularVentasVendeodorPorZona(vendedor,ventasPorZona)
	definir i  Como Entero
	definir zona Como Caracter
	para i = 0 hasta 4
		segun i
			0:zona = "Sur"
			1:zona = "Norte"
			2:zona = "Oeste"
			3:zona = "Este"
			4:zona = "Centro"
				
		FinSegun
		escribir " El vendedor " vendedor " vendio en la zona " zona " : " ventasPorZona(i,vendedor)
	FinPara
FinSubProceso

funcion ventas = calcularVentasTotales(ventasPorZona)
	definir i ,j, ventas Como Entero
	ventas = 0
	para i = 0 hasta 4
		para j = 0 hasta 3
			ventas = ventas + ventasPorZona(i,j)
		FinPara
	FinPara	
FinSubProceso