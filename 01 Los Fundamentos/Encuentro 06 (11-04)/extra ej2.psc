//Leer tres números que denoten una fecha (día, mes, año) y comprobar que sea una
//fecha válida. Si la fecha no es válida escribir un mensaje de error por pantalla. Si la fecha
//es válida se debe imprimir la fecha cambiando el número que representa el mes por su
//	nombre. Por ejemplo: si se introduce 1 2 2006, se deberá imprimir "1 de febrero de 2006".


Algoritmo fechaValida
	
	Definir dia, mes, anio Como Entero
	Definir mes_valor Como Caracter
	mes_valor = "ERROR"
	
	//Solicitamos el ingreso de los tres números
	
	Escribir "Ingrese la fecha en el siguiente formato: dia / mes / año:"
	Leer dia
	Leer mes
	Leer anio
	
	Segun mes Hacer
		1:
			mes_valor = "enero"
		2:
			mes_valor = "febrero"
		3:
			mes_valor = "marzo"
		4:
			mes_valor = "abril"
		5:
			mes_valor = "mayo"
		6:
			mes_valor = "junio"
		7:
			mes_valor = "julio"
		8:
			mes_valor = "agosto"
		9:
			mes_valor = "septiembre"
		10:
			mes_valor = "octubre"
		11:
			mes_valor = "noviembre"
		12:
			mes_valor = "diciembre"
		De Otro Modo:
			Escribir "El valor ingresado no es correcto"
			
	FinSegun
	
	Escribir dia, " de ", mes_valor, " de ", anio
	
FinAlgoritmo
