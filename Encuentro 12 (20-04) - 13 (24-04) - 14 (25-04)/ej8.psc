//Crear una funci�n llamada "Login", que recibe un nombre de usuario y una contrase�a y que
//devuelve Verdadero si el nombre de usuario es "usuario1" y si la contrase�a es "asdasd".
//		Adem�s, la funci�n calculara el n�mero de intentos que se ha usado para loguearse, tenemos
//			solo 3 intentos, si nos quedamos sin intentos la funci�n devolver� Falso.
//ok

Algoritmo ingreso
	Definir user,password Como Caracter
	Escribir "Ingrese usuario:"
	Leer user
	Escribir "Ingrese contrase�a:"
	leer password
	
	Escribir Login(user, password)
	
FinAlgoritmo

Funcion retorno <- Login(user, password)
	Definir intentos Como Entero
	Definir retorno Como Logico
	intentos = 2
	retorno = Falso
	
	Si user = "usuario1" Y password = "asdasd" Entonces
		retorno = Verdadero
	SiNo
		
		Mientras user <> "usuario1" Y password <> "asdasd" Y intentos <> 0 Y retorno = Falso
			Escribir "Usuario o contrase�a incorrectos, intente 	nuevamente:"
			Escribir "Ingrese usuario:"
			Leer user
			Escribir "Ingrese contrase�a:"
			leer password
			
			intentos = intentos - 1
			Si user = "usuario1" Y password = "asdasd" Entonces
				retorno = Verdadero
			FinSi
			
		FinMientras
		
	FinSi
FinFuncion
