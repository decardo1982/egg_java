////Escriba un programa que lea un n�mero entero (altura) y a partir de �l cree una escalera
////invertida de asteriscos con esa altura. Por ejemplo, si ingresamos una altura de 5 se
////deber� mostrar:
////	*****
////	****
////	***
////	**
////	*
Algoritmo escalera
	
	definir i, j, altura Como Entero
	Escribir "Ingrese la altura que desea: "
	leer altura
	
	para i = 1 hasta altura Con Paso 1 Hacer
		para j=i hasta altura Con Paso 1 Hacer
			Escribir "*" Sin Saltar
		FinPara
		Escribir " "
	FinPara
	
FinAlgoritmo