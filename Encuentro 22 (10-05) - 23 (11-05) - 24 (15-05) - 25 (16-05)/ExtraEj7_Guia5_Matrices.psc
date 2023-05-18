////Una empresa de venta de productos por correo desea realizar una estadística de las ventas
////realizadas de cada uno de sus productos a lo largo de una semana. Distribuya luego 5
////productos en los 5 días hábiles de la semana. Se desea conocer:
////	a) Total de ventas por cada día de la semana.
////	b) Total de ventas de cada producto a lo largo de la semana.
////	c) El producto más vendido en cada semana.
////	d) El nombre, el día de la semana y la cantidad del producto más vendido.


Algoritmo ExtraEj7_Guia5_Matrices
	
	Definir matriz Como Caracter
	Dimension matriz[8,7]
	llenarMatriz(matriz)
	mostrarMatriz(matriz)
FinAlgoritmo

SubProceso llenarMatriz[matriz]
	Definir i, j Como Entero
	
	Para i <- 0 Hasta 7 Hacer
		Para j <- 0 Hasta 6
			Si i = 0 Entonces
				Segun j Hacer
					0:
						matriz[i,j] = "          "
					1:
						matriz[i,j] = "Lunes"
					2:
						matriz[i,j] = "Martes"
					3:
						matriz[i,j] = "Miércoles"
					4:
						matriz[i,j] = "Jueves"
					5:
						matriz[i,j] = "Viernes"
					6:
						matriz[i,j] = "Total Producto"
					
				FinSegun
			FinSi
			Si j = 0 Entonces
				Segun i Hacer
					1:
						matriz[i,j] = "Producto 1"
					2:
						matriz[i,j] = "Producto 2"
					3:
						matriz[i,j] = "Producto 3"
					4:
						matriz[i,j] = "Producto 4"
					5:
						matriz[i,j] = "Producto 5"
					6:
						matriz[i,j] = "Total Semana"
					7:
						matriz[i,j] = "Producto más vendido"
				FinSegun
			FinSi
			Si i >0 Y i < 6 Entonces
				Si j > 0 Y j < 6 Entonces
					matriz[i,j] = ConvertirATexto(Aleatorio(1,10))
				FinSi
				Si j = 6 Entonces
					matriz[i,j] = ConvertirATexto(totalProducto(matriz,i)) //realizar subproceso
				FinSi
			FinSi
			Si i = 6 Y j > 0 Entonces
				matriz[i,j] = ConvertirATexto(totalSemana(matriz,j)) //realizar subproceso
			FinSi
			Si i = 7 Y j > 0 Entonces
				matriz[i,j] = ConvertirATexto(prodMasVendido(matriz, j)) //realizar subproceso
			FinSi	
		FinPara
	FinPara
FinSubProceso

SubProceso mostrarMatriz(matriz)
	Definir i, j Como Entero
	Para i <- 0 Hasta 7
		Para j <- 0 Hasta 6
			Escribir Sin Saltar matriz[i,j], "       "
		FinPara
		Escribir ""
	FinPara
FinSubProceso

Funcion suma <- totalProducto(matriz, fila)
	Definir col, suma Como Entero
	suma = 0
	Para col = 1 Hasta 5 Hacer
		suma = suma + ConvertirANumero(matriz[fila, col])
	FinPara
FinFuncion

Funcion suma <- totalSemana(matriz, col)
	Definir fila, suma Como Entero
	suma = 0
	Para fila = 1 Hasta 5 Hacer
		suma = suma + ConvertirANumero(matriz[fila, col])
	FinPara
FinFuncion

Funcion maxPos <- prodMasVendido(matriz,col)
	Definir fila, max, maxPos Como Entero
	max = 0
	Para fila = 1 Hasta 5 Hacer
		Si ConvertirANumero(matriz[fila, col]) > max Entonces
			max = ConvertirANumero((matriz[fila,col]))
			maxPos = fila
		FinSi
	FinPara
FinFuncion