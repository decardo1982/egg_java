//Una tienda ofrece para los meses de septiembre, octubre y noviembre un descuento del
//	10% sobre el total de la compra que realiza un cliente. Solicitar al usuario que ingrese un
//	mes y el importe de la compra. El programa debe calcular cuál es el monto total que se
//	debe cobrar al cliente e imprimirlo por pantalla.

Algoritmo descuento
	
	Definir mesCompra Como Caracter
	Definir importe_compra Como Real
	
	Escribir "Ingrese en qué mes se realiza la compra:"
	Leer mesCompra
	
	Escribir "Ingrese, por favor, el importe de la compra realizada:"
	Leer importe_compra
	
	mesCompra = Minusculas(mesCompra)
	
	Si mesCompra = "septiembre" O mesCompra = "octubre" O mesCompra = "noviembre" Entonces
		
		Escribir "Se aplicará un descuento del 10% en su compra por lo que deberá pagar $", importe_compra * 0.9, " Gracias y vuelva prontos!"
		
	SiNo
		Escribir "Lamentablemente no se aplicará descuento."
	FinSi
	
FinAlgoritmo
