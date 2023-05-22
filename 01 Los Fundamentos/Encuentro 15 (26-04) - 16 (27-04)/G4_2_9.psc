	//	Diseñar un procedimiento que reciba una frase, y el programa remueva todas las vocales
	//	repetidas. Al final el procedimiento mostrará la frase final.

Algoritmo G4_2_9
	definir frase1 como cadena
	escribir 'Ingrese una frase: '
	leer frase1
	RemoverVocales(frase1)
FinAlgoritmo

SubProceso RemoverVocales(frase Por Referencia)
	definir a, e, ii ,oo ,u como logico
	definir fraseaux como cadena
	definir i como entero
	a = Falso
	e = Falso
	ii = Falso
	oo = Falso
	u = Falso
	fraseaux = frase
	frase = ''
	para i = 0 hasta Longitud(fraseaux) - 1
		segun Minusculas(Subcadena(fraseaux, i,i))
			'a':
				si !a
					a = Verdadero
					frase = Concatenar(frase,Subcadena(fraseaux, i,i))
				FinSi
			'e':
				si !e
					e = Verdadero
					frase = Concatenar(frase,Subcadena(fraseaux, i,i))
				FinSi
			'i':
				si !ii
					ii = Verdadero
					frase = Concatenar(frase,Subcadena(fraseaux, i,i))
				FinSi
			'o':
				si !oo
					oo = Verdadero
					frase = Concatenar(frase,Subcadena(fraseaux, i,i))
				FinSi
			'u':
				si !u
					u = Verdadero
					frase = Concatenar(frase,Subcadena(fraseaux, i,i))
				FinSi
			De Otro Modo:
				frase = Concatenar(frase,Subcadena(fraseaux, i,i))
		FinSegun
	FinPara
	escribir frase
FinSubProceso