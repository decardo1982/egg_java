//A partir de una conocida cantidad de metros que el usuario ingresa a trav�s del teclado se
//debe obtener su equivalente en cent�metros, en mil�metros y en pulgadas.

Algoritmo medidas
	Definir metros, centimetros, milimetros, pulgadas Como Real
	Escribir "Ingrese la cantidad de metros:"
	Leer metros
	centimetros = metros * 100
	milimetros = centimetros * 100
	pulgadas = centimetros / 2.54
	Escribir metros " metros equivalen a ", centimetros, " cent�metros."
	Escribir metros " metros equivalen a ", milimetros, " mil�metros."
	Escribir metros " metros equivalen a ", pulgadas, " pulgadas."
	
	
FinAlgoritmo
