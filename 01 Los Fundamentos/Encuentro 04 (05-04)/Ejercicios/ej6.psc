//En medio de la auditor�a interna, el equipo est� cubriendo a un compa�ero de trabajo que est� de licencia. Su compa�ero de trabajo ha dejado un mensaje con las tareas a realizar.
//"�Hola! Muchas gracias por cubrirme. Lo principal que debes hacer es completar la hoja de
//c�lculo de ingresos mensuales. Puedes hacerlo buscando los �ltimos ingresos publicitarios en los
//informes de marketing. Despu�s de hacer todo eso, revisa mi correo electr�nico y si hay menos
//	de 10 correos sin leer revisa mi correo de voz para ver si hay alguna solicitud de los ejecutivos. Si
//	hay tales solicitudes, h�galas primero a menos que tenga una solicitud de emergencia de otro
//	departamento. Una vez que hayas terminado con la solicitud de cumplimiento, riegue la planta
//	de mi escritorio despu�s de apagar la computadora. Ah, espera, deber�a haber mencionado un
//	par de cosas: debes iniciar sesi�n con usuario de administrador para ver los informes de
//	marketing, y tendr�s que enviarme un correo electr�nico de actualizaci�n justo despu�s de que
//	termines de manejar las solicitudes. Bueno, gracias de nuevo. �Es de gran ayuda! Te debo el
//	almuerzo cuando regrese."
//					Nuestra tarea ser� imprimir por pantalla la lista de tareas en el orden que corresponden para que
//						luego las podamos realizar. �Te animas a colocar las tareas en el orden correcto? Para hacer
//							esto, debes crear en PSeInt la cantidad de variables que creas correctas y asignarles valor.
//						Por ejemplo:
//							?? cantidadEmails = 6
//							?? solicitudesEjecutivos = 3

// 1ro iniciar sesion como admin
// 2do completar la hooja de c�lculo de ingresos mensuales
// 
// chequear correos, si hay 10 sin leer, chequear correo de voz
Algoritmo sin_titulo
	Definir numeroEmails Como Entero
	Definir solicitudesEjecutivos, emergenciasExtras Como Logico
	
	Escribir "Por favor, ingrese la cantidad de mails"
	leer numeroEmails
	Escribir "Hay solicitudes de Ejecutivos? (Verdadero / Falso)"
	leer solicitudesEjecutivos
	
	Escribir "Hay emergencias Extras? (Verdadero / Falso)"
	leer emergenciasExtras
	
	Escribir "Iniciar sesi�n como administrador"
	Escribir "Accediendo a planillas de marketing"
	Escribir "Completando la hoja de ingresos mensuales"
	
	Escribir "Revisando correo"
	
	SI numeroEmails >= 10 Entonces
		Escribir "Contestar email, hay ", numeroEmails, " emails, ejecutivos que la sigan esperando"
	SiNo
		Escribir "Hay ", numeroEmails, " emails, puedo atender otras cuestiones"
		si emergenciasExtras Entonces
			Escribir "Resolvemos las emergencias Extras de otros departamentos"
		FinSi
		Escribir "Buscando mensaje de voz de solicitudesEjecutivos"
		si solicitudesEjecutivos Entonces
			Escribir "Resolvemos las solicitudes de Ejecutivos"
		FinSi
	FinSi
	
	Escribir "Enviar mail de actualizaci�n"
	Escribir "Apagar la PC"
	Escribir "regar la planta"
	
	
FinAlgoritmo
