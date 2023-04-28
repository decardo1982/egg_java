////Diseñar un procedimiento que reciba una frase, y el programa remueva todas las vocales
////repetidas. Al final el procedimiento mostrará la frase final.
////Por ejemplo:
////Entrada: "Habia una vez un barco"
////Salida: "Habi un vez n brco"
////Se marcan en rojo las repetidas sólo para explicar la consigna. Las vocales ?e?, ?i? y ?o? quedan
////al no estar repetidas.

Algoritmo vocalesRepetidas
	
	Definir frase Como Caracter
	
	Escribir "Ingrese una frase:"
	Leer frase
	
	removerVocales(frase)
	
	
FinAlgoritmo

SubProceso removerVocales(frase)
	
	Definir a, e, ii, oo, u Como Logico
	Definir fraseaux como caracter
	definir i Como Entero
	a = Falso
	e = Falso
	ii = Falso
	oo = Falso
	u = Falso
	fraseaux = frase
	frase = ''
	Para i <- 0 Hasta Longitud(fraseaux) -1 Hacer
		Segun Minusculas(Subcadena(fraseaux, i, i))
			"a":
				si !a Entonces
					a = Verdadero
					frase = Concatenar(frase, (Subcadena(fraseaux, i, i)))
				FinSi
			"e":
				si !e Entonces
					e = Verdadero
					frase = Concatenar(frase, (Subcadena(fraseaux, i, i)))
				FinSi
			"ii":
				si !ii Entonces
					ii = Verdadero
					frase = Concatenar(frase, (Subcadena(fraseaux, i, i)))
				FinSi
			"oo":
				si !oo Entonces
					oo = Verdadero
					frase = Concatenar(frase, (Subcadena(fraseaux, i, i)))
				FinSi
			"u":
				si !u Entonces
					u = Verdadero
					frase = Concatenar(frase, (Subcadena(fraseaux, i, i)))
				FinSi
			De Otro Modo:
				frase = Concatenar(frase, (Subcadena(fraseaux, i, i)))
				
		FinSegun
	
		
	FinPara
	Escribir frase
FinSubProceso
	