////Teniendo en cuenta que la clave es "eureka", escribir un programa que nos pida ingresar
////una clave. S�lo se cuenta con 3 intentos para acertar, si fallamos los 3 intentos se deber�
////mostrar un mensaje indic�ndonos que hemos agotado esos 3 intentos. Si acertamos la
////clave se deber� mostrar un mensaje que indique que se ha ingresado al sistema
////correctamente.

Algoritmo eureka
	
	Definir clave, palabra Como Caracter
	Definir intento Como Entero
	
	intento = 3
	
	clave = "eureka"
	
	
	Hacer
		intento = intento -1
		Escribir "Ingrese la clave:"
		Leer palabra
		Si palabra = clave Entonces
			Escribir "Ingresaste al sistema"
		FinSi
	Mientras Que palabra <> clave Y intento <> 0
	
	
	
FinAlgoritmo
