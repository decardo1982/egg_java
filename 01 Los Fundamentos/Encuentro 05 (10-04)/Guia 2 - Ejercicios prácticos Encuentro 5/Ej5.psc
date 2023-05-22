//Escriba un programa que pida 3 notas y valide si esas notas están entre 1 y 10. Si están
//		entre esos parámetros se debe poner en verdadero una variable de tipo lógico y si no
//			ponerla en falso. Al final el programa debe decir si las 3 notas son correctas usando la
//				variable de tipo lógico.

Algoritmo tresNotas
	
//	Definimos las 3 variables para las 3 notas a ingresar, y las 3 variables lógicas (una para cada nota)
	Definir nota1, nota2, nota3 Como Entero
	Definir nota1_logico, nota2_logico, nota3_logico Como Logico
	
///	Solicitamos el ingreso de la primera nota
	Escribir "Ingrese la primera nota:"
	Leer nota1
//Chhequeamos que el valor de la nota esté entre 1 y 10 para asignar verdadero o falso a la variable lógica que le corresponda	
	Si nota1 >= 1 Y nota1 <=10 Entonces
		nota1_logico = Verdadero
	SiNo
		nota1_logico = Falso
	FinSi
	
	///	Solicitamos el ingreso de la segunda nota
	Escribir "Ingrese la segunda nota:"
	Leer nota2
	//Chhequeamos que el valor de la nota esté entre 1 y 10 para asignar verdadero o falso a la variable lógica que le corresponda	
	Si nota2 >= 1 Y nota2 <=10 Entonces
		nota2_logico = Verdadero
	SiNo
		nota2_logico = Falso
	FinSi
	
	///	Solicitamos el ingreso de la tercera nota
	Escribir "Ingrese la tercera nota:"
	Leer nota3
	//Chhequeamos que el valor de la nota esté entre 1 y 10 para asignar verdadero o falso a la variable lógica que le corresponda	
	Si nota1 >= 3 Y nota3 <=10 Entonces
		nota3_logico = Verdadero
	SiNo
		nota3_logico = Falso
	FinSi
	
	/// Revisamos si los 3 valores lógicos son verdadeeros para mostrar "VERDADERO" por pantalla, caso contrario, indicar que al menos 1 de las notas no está en el rango requerido
	Si nota1_logico = Verdadero Y nota2_logico = Verdadero Y nota3_logico = Verdadero Entonces
		Escribir "VERDADERO"
	SiNo
		Escribir "Al menos una de las notas no está en el rango entre 1 y 10"
	FinSi

	
FinAlgoritmo
