////Necesitamos crear un sistema para una máquina de reciclaje de botellas automática. Dicha
////máquina nos pagará dinero por la cantidad de plástico reciclado. Tenemos que ingresar
////nuestro usuario y contraseña para que se nos cargue el saldo por sistema a nuestra cuenta.
////	Condición simple anidada: validaremos que el usuario sea "Albus_D", luego si esto es
////	verdadero, validaremos si la contraseña es "caramelosDeLimon". Si la contraseña es
////	correcta haremos que una variable llamada Login sea verdadera.
////	Bucle Mientras: Este bloque de validación de la contraseña lo encerraremos en un
////	bucle Mientras para darle al usuario sólo 3 intentos para poner la contraseña.
///	Bucle Hacer Mientras(Repetir): Una vez que el login sea verdadero, accederemos al menú de opciones:
////					o Ingresar botellas
////					o Consultar saldo
////					o Salir
////				! Ingresar Botellas: Primero preguntaremos cuántas botellas se va a ingresar al sistema.
////									Una vez que tenemos el número vamos a usar un bucle para, a fin de ir ingresando
////									cada botella. En cada ciclo del bucle se debe generar un número aleatorio entre 100 y
////									3000 gr, que va a ser el peso de las botellas a reciclar (simulando que el usuario está
////									ingresando botellas en la máquina). Una vez generado, según el peso del material,
////									usaremos un condicional múltiple para asignarle un valor monetario:
////												o! Si es menos de 500 gr, corresponden $50
////												o! Si es entre 501 gr y 1500 gr, corresponden $125
////												o! Si es más de 1501 gr, corresponden $200
////				Hecho esto, el programa debe informar al usuario por pantalla el valor que se le
////				ofrece. Si el usuario acepta, lo acreditamos a su saldo, sino se debe devolver el
////				material (sólo mostrar en pantalla "Devolviendo material"). Para esto usaremos un condicional doble.
////				! Consultar saldo: revisaremos el valor monetario que tiene asignada la variable "saldo".
////				! Tanto al terminar "Ingresar Botellas" como "Consultar Saldo" debe volver al menú principal.


Algoritmo reciclajeDeBotellas
	
	Definir usuario, password, aceptaValor Como Caracter
	Definir passIntento, opcionMenu, cantBotellas, i, pesoBotella, valorOfrecido, saldo Como Entero
	Definir login Como Logico
	
	passIntento = 3
	valorOfrecido = 0
	saldo = 0
	
	Hacer
		Escribir ""
		Escribir "Ingrese su nombre de usuario:"
		Escribir ""
		Leer usuario
	Mientras Que usuario <> "Albus_D" 
	
	Hacer
		Escribir "Ingrese su contraseña:"
		Leer password
		passIntento = passIntento -1
	Mientras Que password <> "caramelosDeLimon" Y passIntento > 0
	login = password == "caramelosDeLimon"
	Si login Entonces
		Hacer
			Escribir "----------------------------"
			Escribir "Menú de opciones"
			Escribir "Opción 1: Ingresar botellas"
			Escribir "Opción 2: Consultar saldo"
			Escribir "Opción 3: Salir"
			Leer opcionMenu
			Escribir "----------------------------"
			
			Segun opcionMenu Hacer
				1:
					Escribir "¿Cuántas botellas va a ingresar?"
					Leer cantBotellas
					Para i <- 1 Hasta cantBotellas
						pesoBotella = Aleatorio(100, 3000)
						Si pesoBotella < 500 Entonces
							valorOfrecido = valorOfrecido + 50
						SiNo
							si pesoBotella < 1501 Entonces
								valorOfrecido = valorOfrecido + 125
							SiNo
								valorOfrecido = valorOfrecido + 200
							FinSi
							
						FinSi
					FinPara
					Escribir ""
					Escribir "El valor ofrecido por las ", cantBotellas, " botellas es de: $", valorOfrecido, " ¿acepta? (S/N)"
					Escribir ""
					Leer aceptaValor
					Si Mayusculas(aceptaValor) = "S" Entonces
						saldo = saldo + valorOfrecido
					SiNo
						Escribir ""
						Escribir "Devolviendo material"
						Escribir ""
					FinSi
					valorOfrecido = 0
					
				2:
					Escribir ""
					Escribir "El saldo actual es de: $", saldo
					Escribir ""
			FinSegun
			
		Mientras Que opcionMenu <> 3
		Escribir "Gracias vuelvas prontos como dice el muchachos"
		
	Sino
		Escribir "***************************+"
		Escribir "La contraseña es incorrecta."
		Escribir "***************************+"
		
	FinSi
	
FinAlgoritmo
