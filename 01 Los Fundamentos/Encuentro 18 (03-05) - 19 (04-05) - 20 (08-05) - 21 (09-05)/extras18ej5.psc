SubProceso cargarArray(array, frase)
	Definir i Como Entero
	
	Para i = 0 Hasta 19 Hacer
		array(i) = Subcadena(frase,i,i)
	FinPara
FinSubProceso

SubProceso reemplazarLetra(vector, letra, pos)
	Definir espacioVacio Como Entero
	espacioVacio = buscarLugarDisponible(vector, pos)
	
	si espacioVacio = -1 Entonces
		Escribir "No hay espacios"
	SiNo
		si pos = espacioVacio Entonces
			vector(pos) = letra
		SiNo
			mueveArray(vector, pos, espacioVacio, letra)
		FinSi
	FinSi
	
	leerArray(vector)
FinSubProceso

Funcion lugar = buscarLugarDisponible(v, pos)
	Definir lugar Como Entero
	si v(pos) = "" o v(pos) = " " Entonces
		lugar = pos
	SiNo
		lugar = buscarEspacioCercano(v, pos)
	FinSi
FinFuncion

Funcion espacio = buscarEspacioCercano(v, pos)
	Definir i, espacio, min Como Entero
	
	espacio = -1
	min = 20
	Para i = 0 Hasta 19 Hacer
		si v(i) = " " o v(i) = "" Entonces
			si abs(pos - i) < min Entonces
				min = abs(pos - i)
				espacio = i
			FinSi
		FinSi
	FinPara
FinFuncion

SubProceso mueveArray(v, pos, espacioVacio, letra)
	Definir i, d, h, p Como Entero
	
	si pos < espacioVacio Entonces
		d = 19
		h = pos+1
		p = -1
	SiNo
		d = 0
		h = pos-1
		p = 1
	FinSi
	
	Para i = d Hasta h Con Paso p Hacer
		v(i) = v(i+p)
	FinPara
	
	v(pos) = letra
FinSubProceso

SubProceso leerArray(array)
	Definir i Como Entero
	Para i = 0 Hasta 19 Hacer
		Escribir array(i) Sin Saltar
	FinPara
	Escribir ""
FinSubProceso

Algoritmo extras18ej5
	Definir vector, frase, letra Como Caracter
	Definir pos Como Entero
	Dimension vector(20)
	
	Escribir "ingrese una frase"
	frase = "Hola mundo cruel!" //leer frase
	
	cargarArray(vector, frase)
	
	Escribir "ingrese un caracter y una posición donde desee insertarlo"
	leer letra
	Repetir
		leer pos
	Mientras Que pos < 0 o pos > 19
	
	reemplazarLetra(vector, letra, pos)
FinAlgoritmo
