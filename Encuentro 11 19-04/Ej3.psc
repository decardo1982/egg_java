////Necesitamos crear un sistema para una m�quina de reciclaje de botellas autom�tica. Dicha
////m�quina nos pagar� dinero por la cantidad de pl�stico reciclado. Tenemos que ingresar
////nuestro usuario y contrase�a para que se nos cargue el saldo por sistema a nuestra cuenta.
////	Condici�n simple anidada: validaremos que el usuario sea "Albus_D", luego si esto es
////	verdadero, validaremos si la contrase�a es "caramelosDeLimon". Si la contrase�a es
////	correcta haremos que una variable llamada Login sea verdadera.
////	Bucle Mientras: Este bloque de validaci�n de la contrase�a lo encerraremos en un
////	bucle Mientras para darle al usuario s�lo 3 intentos para poner la contrase�a.
///	Bucle Hacer Mientras(Repetir): Una vez que el login sea verdadero, accederemos al men� de opciones:
////					o Ingresar botellas
////					o Consultar saldo
////					o Salir
////				! Ingresar Botellas: Primero preguntaremos cu�ntas botellas se va a ingresar al sistema.
////									Una vez que tenemos el n�mero vamos a usar un bucle para, a fin de ir ingresando
////									cada botella. En cada ciclo del bucle se debe generar un n�mero aleatorio entre 100 y
////									3000 gr, que va a ser el peso de las botellas a reciclar (simulando que el usuario est�
////									ingresando botellas en la m�quina). Una vez generado, seg�n el peso del material,
////									usaremos un condicional m�ltiple para asignarle un valor monetario:
////												o! Si es menos de 500 gr, corresponden $50
////												o! Si es entre 501 gr y 1500 gr, corresponden $125
////												o! Si es m�s de 1501 gr, corresponden $200
////				Hecho esto, el programa debe informar al usuario por pantalla el valor que se le
////				ofrece. Si el usuario acepta, lo acreditamos a su saldo, sino se debe devolver el
////				material (s�lo mostrar en pantalla "Devolviendo material"). Para esto usaremos un condicional doble.
////				! Consultar saldo: revisaremos el valor monetario que tiene asignada la variable "saldo".
////				! Tanto al terminar "Ingresar Botellas" como "Consultar Saldo" debe volver al men� principal.


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
		Escribir "Ingrese su contrase�a:"
		Leer password
		passIntento = passIntento -1
	Mientras Que password <> "caramelosDeLimon" Y passIntento > 0
	login = password == "caramelosDeLimon"
	Si login Entonces
		Hacer
			Escribir "----------------------------"
			Escribir "Men� de opciones"
			Escribir "Opci�n 1: Ingresar botellas"
			Escribir "Opci�n 2: Consultar saldo"
			Escribir "Opci�n 3: Salir"
			Leer opcionMenu
			Escribir "----------------------------"
			
			Segun opcionMenu Hacer
				1:
					Escribir "�Cu�ntas botellas va a ingresar?"
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
					Escribir "El valor ofrecido por las ", cantBotellas, " botellas es de: $", valorOfrecido, " �acepta? (S/N)"
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
		Escribir "La contrase�a es incorrecta."
		Escribir "***************************+"
		
	FinSi
	
FinAlgoritmo
