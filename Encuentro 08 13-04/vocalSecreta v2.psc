////EJERCICIO VOCAL SECRETA
////Diseña un programa que guarde una vocal secreta en una variable, debemos pedirle al usuario
////que intente adivinar la vocal secreta, e intentará tantas veces como sea necesario hasta que la
////adivine.

////Vamos a hacer nuevamente el ejercicio de la vocal misteriosa, pero esta vez con una estructura
////Hacer-Mientras. ¿Puedes notar cuál es la diferencia entre ambas estructuras?


Algoritmo vocalSecreta
	
	Definir vocal_secreta, letra Como Caracter
	Definir vocal Como Entero
	
	vocal = aleatorio(1, 5)
	
	Segun vocal Hacer
		1:
			vocal_secreta = "a"
		2:
			vocal_secreta = "e"
		3:
			vocal_secreta = "i"
		4:
			vocal_secreta = "o"
		5:
			vocal_secreta = "u"
	Fin Segun
	
	
	Hacer 
		Escribir "Hay una vocal secreta, intenta adivinarla:"
		Leer letra
	Mientras Que Mayusculas(vocal_secreta) <> Mayusculas(letra) 
	
	Escribir "¡Encontraste la vocal secreta! Era ", Mayusculas(vocal_secreta)
	
	
FinAlgoritmo
