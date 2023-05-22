//En medio de la auditoría interna, el equipo está cubriendo a un compañero de trabajo que está de licencia. Su compañero de trabajo ha dejado un mensaje con las tareas a realizar.

//"¡Hola! Muchas gracias por cubrirme. Lo principal que debes hacer es completar la hoja de cálculo de ingresos mensuales. Puedes hacerlo buscando los últimos ingresos publicitarios en los informes de marketing.
//Después de hacer todo eso, revisa mi correo electrónico y si hay menos de 10 correos sin leer revisa mi correo de voz para ver si hay alguna solicitud de los ejecutivos. Si hay tales solicitudes, 
//hágalas primero a menos que tenga una solicitud de emergencia de otro departamento. Una vez que hayas terminado con la solicitud de cumplimiento, riegue la planta de mi escritorio después
//de apagar la computadora. Ah, espera, debería haber mencionado un par de cosas: debes iniciar sesión con usuario de administrador para ver los informes de marketing, y tendrás que enviarme un correo 
//electrónico de actualización justo después de que termines de manejar las solicitudes. Bueno, gracias de nuevo. ¡Es de gran ayuda! Te debo elalmuerzo cuando regrese."


//Nuestra tarea será imprimir por pantalla la lista de tareas en el orden que corresponden para que luego las podamos realizar. ¿Te animas a colocar las tareas en el orden correcto?
//Para hacer esto, debes crear en PSeInt la cantidad de variables que creas correctas y asignarles valor.

Algoritmo listaDeTareas
	
//	Definimos las variables que nos indica la consigna: cantidad de mails, y saber si hay solicitudes de ejectuvos y emergencias extras:
	Definir numeroEmails como entero
	Definir solicitudesEjecutivos, emergenciaExtras como Logico
	
//	Solicitamos que el usuario ingrese los datos para asignar a las variables
	
	Escribir  "Por favor ingrese la cantidad de emails:"
	leer numeroEmails
	Escribir "Indicar, por favor, si hay solicitudes de Ejecutivos (Verdadero / Falso)"
	leer solicitudesEjecutivos
	Escribir "Indicar, por favor, si hay emergencias de otros departamentos (Verdadero / Falso)"
	Leer emergenciaExtras
	
//	Las primeras acciones debe realizarlas sí o sí, entonces ya las dejamos escritas:
	
	Escribir "Iniciar sesión como administrador"
	Escribir "Acceder a planillas de marketing"
	Escribir "Completar la hoja de ingresos mensuales"
	
//	Ahora revisamos la cantidad de correos y en base a eso se determinan las acciones a seguir:
	
	Escribir "Revisando correo"
	
// Si hay más de 10 correos sin leer, entonces hay que contestarlos y dejar de lado las solicitudes de ejecutivos y las emergencias extras.
	
	Si numeroEmails>=10 Entonces
		Escribir "Contestando correos ya que hay ",numeroEmails," emails: no podemos perder tiempo"
	SiNo
//		Si hay menos de 10 correos, entonces podemos atender otras tareas, primero emergencias extras y luego solicitudes de ejecutivos:
		Escribir "Hay ",numeroEmails," emails, puedo atender otras cuestiones"
		Escribir "Buscando si hay pedidos de Emergencias Extras"
		Si emergenciaExtras Entonces
			Escribir "Resolvemos las Emergencias Extras de otras áreas"
		Fin Si
		Escribir "Buscando mensaje voz solicitudes Ejecutivos"
		Si solicitudesEjecutivos Entonces
			Escribir "Resolvemos las solicitudes de Ejecutivos"
		Fin Si
	Fin Si
	
//	Una vez resuelto esto, terminamos con las tareas
	
	Escribir "Enviar mail de actualizacion"
	Escribir "Apagar PC"
	Escribir "Regar plantita del escritorio"
	
	
FinAlgoritmo
