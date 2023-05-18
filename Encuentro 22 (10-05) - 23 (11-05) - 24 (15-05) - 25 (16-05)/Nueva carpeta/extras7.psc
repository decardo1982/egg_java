Algoritmo extras7
	
	Definir matriz Como Caracter
	Dimension matriz(8,7)
	
	llenar(matriz)
	mostrarM(matriz)
	
FinAlgoritmo

SubProceso llenar(matriz)
	Definir i, j Como Entero
	
	Para i=0 Hasta 7 Hacer
		Para j=0 Hasta 6 Hacer
			Si i=0 Entonces
				Segun j Hacer
					0: 
						matriz(i,j)=" "
					1:
						matriz(i,j)="Lunes"
					2: 
						matriz(i,j)="Martes"
					3:
						matriz(i,j)="Miercoles"
					4: 
						matriz(i,j)="Jueves"
					5:
						matriz(i,j)="Viernes"
					6:
						matriz(i,j)="Total Producto"
				FinSegun
			FinSi
			
			Si j=0 Entonces
				Segun i Hacer
					1:
						matriz(i,j)="Producto 1"
					2: 
						matriz(i,j)="Producto 2"
					3:
						matriz(i,j)="Producto 3"
					4: 
						matriz(i,j)="Producto 4"
					5:
						matriz(i,j)="Producto 5"
					6:
						matriz(i,j)="Total Semana"
					7: 
						matriz(i,j)="Producto mas vendido"
				FinSegun
			FinSi
			Si i>0 y i<6 Entonces
				Si j>0 y j<6 Entonces
					matriz(i,j)= ConvertirATexto(Aleatorio(1,10))
				FinSi
				Si j=6 Entonces
					matriz(i,j)=ConvertirATexto(totalProd(matriz,i))
				FinSi
			FinSi
			Si i=6 y j>0 Entonces
				matriz(i,j)=ConvertirATexto(totalSemana(matriz,j))
			FinSi
			Si i=7 y j>0 Entonces
				matriz(i,j)=ConvertirATexto(ProdMasVendido(matriz,j))
			FinSi
		FinPara
	FinPara
FinSubProceso

SubProceso mostrarM(matriz)
	Definir i, j Como Entero
	Para i=0 Hasta 7 Hacer
		Para j=0 Hasta 6 Hacer
			Escribir Sin Saltar matriz(i,j) "              "
		FinPara
		Escribir " "
	FinPara
FinSubProceso

Funcion suma = totalProd(matriz,fila)
	Definir col,suma Como Entero
	suma=0
	
	Para col=1 Hasta 5 Hacer
		suma=suma+ConvertirANumero(matriz(fila,col))
	FinPara
FinFuncion

Funcion suma = totalSemana(matriz,col)
	Definir fila,suma Como Entero
	suma=0
	
	Para fila=1 Hasta 5 Hacer
		suma=suma+ConvertirANumero(matriz(fila,col))
	FinPara
FinFuncion

Funcion pos = prodMasVendido(matriz,col)
	Definir fila, max, pos Como Entero
	max=0
	Para fila=1 Hasta 5 Hacer
		Si ConvertirANumero(matriz(fila,col)) > max Entonces
			max=ConvertirANumero(matriz(fila,col))
			pos=fila
		FinSi
	FinPara
FinFuncion