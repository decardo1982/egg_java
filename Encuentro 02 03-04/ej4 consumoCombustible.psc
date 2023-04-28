//Escribir un programa que calcule cuántos litros de combustible consumió un automóvil. El
//usuario ingresará una cantidad de litros de combustible cargados en la estación y una
//cantidad de kilómetros recorridos, después, el programa calculará el consumo (km/lt) y se
//lo mostrará al usuario.
Algoritmo consumoCombustible
	Definir litros Como Real
	Definir kilometros Como Real
	Definir consumo_promedio Como Real
	Escribir "Ingrese la cantidad de litros cargados:"
	Leer litros
	Escribir "Ingrese la cantidad de kilómetros recorridos:"
	Leer kilometros
	consumo_promedio = kilometros / litros
	Escribir "El consumo promedio es de ", consumo_promedio, " litros."
	
FinAlgoritmo
