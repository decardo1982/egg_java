//Escribir un programa que calcule cu�ntos litros de combustible consumi� un autom�vil. El
//usuario ingresar� una cantidad de litros de combustible cargados en la estaci�n y una
//cantidad de kil�metros recorridos, despu�s, el programa calcular� el consumo (km/lt) y se
//lo mostrar� al usuario.
Algoritmo consumoCombustible
	Definir litros Como Real
	Definir kilometros Como Real
	Definir consumo_promedio Como Real
	Escribir "Ingrese la cantidad de litros cargados:"
	Leer litros
	Escribir "Ingrese la cantidad de kil�metros recorridos:"
	Leer kilometros
	consumo_promedio = kilometros / litros
	Escribir "El consumo promedio es de ", consumo_promedio, " litros."
	
FinAlgoritmo
