///La empresa "Te llevo a todos lados" está destinada al alquiler de autos y tiene un sistema de tarifa que consiste en cobrar el alquiler por hora.

///Si el cliente devuelve el auto dentro de las 2 horas de uso el valor que corresponde pagar es de $400 pesos y la nafta va de regalo.

///Cuando el cliente regresa a la empresa pasadas las 2 horas, se ingresan la cantidad de litros de nafta gastados y el tiempo transcurrido en horas.
///Luego, se le cobra 40 pesos por litro de nafta gastado, y la hora se fracciona en minutos, cobrando un total de $5,20 el minuto de uso.

///Realice un programa que permita registrar esa información y el total a pagar por el cliente.

Algoritmo alquilerAuto
	
	Definir horas_alquiler, litros_nafta Como Entero
	
	Escribir "Ingrese la cantidad de horas de alquilado:"
	Leer horas_alquiler
	
	Mientras horas_alquiler < 0 Hacer
		Escribir "Las horas deben ser mayores o iguales a 0. Ingrese la cantidad de horas de alquilado:"
		Leer horas_alquiler
	Fin Mientras
	
	Si horas_alquiler <= 2 Entonces
		Escribir "El importe a pagar es de $400. Gracias, vuelva prontos!"
	FinSi
	
	si horas_alquiler > 2 Entonces
		Escribir "Ingrese la cantidad de litros de nafta consumidos:"
		leer litros_nafta
		
		Escribir "El importe a pagar por nafta es de $", litros_nafta * 40
		Escribir "El importe a pagar por canon de alquiler es de $", horas_alquiler * 5.2 * 60
		Escribir "El importe total a pagar sería de $", (litros_nafta * 40) + (horas_alquiler * 5.2 * 60)
	FinSi
	
	
FinAlgoritmo
