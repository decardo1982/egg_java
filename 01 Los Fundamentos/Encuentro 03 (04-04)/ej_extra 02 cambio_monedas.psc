//Calcular el cambio de monedas en dólares y euros al ingresar cierta cantidad de dinero en
//pesos.
Algoritmo cambio_monedas
	Definir pesos, dolar_oficial, dolar_blue, euros Como Real
	Escribir "Ingrese la cantidad de pesos a cambiar:"
	leer pesos
	dolar_oficial = pesos / 210.77
	dolar_blue = pesos / 392
	euros = pesos / 230.97
	
	Escribir "La cantidad de ", pesos, " pesos equivale a:"
	Escribir dolar_blue, " dólares blue"
	Escribir dolar_oficial, " dólares oficiales"
	Escribir euros, " euros"
FinAlgoritmo
