//Crear una función llamada "Login", que recibe un nombre de usuario y una contraseña y que
//devuelve Verdadero si el nombre de usuario es "usuario1" y si la contraseña es "asdasd".
//		Además, la función calculara el número de intentos que se ha usado para loguearse, tenemos
//			solo 3 intentos, si nos quedamos sin intentos la función devolverá Falso.
//ok

Algoritmo ingreso
	Definir user,password Como Caracter
	Escribir "Ingrese usuario:"
	Leer user
	Escribir "Ingrese contraseña:"
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
			Escribir "Usuario o contraseña incorrectos, intente 	nuevamente:"
			Escribir "Ingrese usuario:"
			Leer user
			Escribir "Ingrese contraseña:"
			leer password
			
			intentos = intentos - 1
			Si user = "usuario1" Y password = "asdasd" Entonces
				retorno = Verdadero
			FinSi
			
		FinMientras
		
	FinSi
FinFuncion
