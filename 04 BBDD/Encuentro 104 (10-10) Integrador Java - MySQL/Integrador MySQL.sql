#CANDADO A
-- Posición: El candado A está ubicado en la posición calculada a partir del número obtenido en la/s siguiente/s consulta/s:
-- #Teniendo el máximo de asistencias por partido, muestre cuantas veces se logró dicho máximo. Este resultado nos dará la posición del candado (1, 2, 3 o 4)
SELECT COUNT(*) FROM ESTADISTICAS WHERE ASISTENCIAS_POR_PARTIDO = (SELECT MAX(ASISTENCIAS_POR_PARTIDO) FROM ESTADISTICAS); # Resultado: 2
-- Clave: La clave del candado A estará con formada por la/s siguientes consulta/s a la base de datos:
-- Muestre la suma total del peso de los jugadores, donde la conferencia sea Este y la posición sea centro o esté comprendida en otras posiciones.
SELECT SUM(J.PESO) FROM JUGADORES J INNER JOIN EQUIPOS E ON E.NOMBRE = J.NOMBRE_EQUIPO WHERE J.POSICION LIKE '%C%' AND E.CONFERENCIA = 'EAST'; # Resultado: 14043

#CANDADO B
-- Posición: El candado B está ubicado en la posición calculada a partir del número obtenido en la/s siguiente/s consulta/s:
-- Muestre la cantidad de jugadores que poseen más asistencias por partidos, que el numero de jugadores que tiene el equipo Heat. Este resultado nos dará la posición del candado (1, 2, 3 o 4)
SELECT COUNT(*) FROM JUGADORES WHERE NOMBRE_EQUIPO = "HEAT"; -- 16
SELECT COUNT(ASISTENCIAS_POR_PARTIDO) FROM ESTADISTICAS WHERE ASISTENCIAS_POR_PARTIDO >= (SELECT COUNT(*) FROM JUGADORES WHERE NOMBRE_EQUIPO = "HEAT"); # Resultado: 3

-- Clave: La clave del candado B estará con formada por la/s siguientes consulta/s a la base de datos:
-- La clave será igual al conteo de partidos jugados durante las temporadas del año 1999.
SELECT DISTINCT TEMPORADA FROM ESTADISTICAS WHERE TEMPORADA LIKE '%99%';
SELECT COUNT(*) FROM PARTIDOS WHERE TEMPORADA LIKE '%99%'; #Resultado: 3480


#CANDADO C
-- Posición: El candado C está ubicado en la posición calculada a partir del número obtenido en la/s siguiente/s consulta/s:
-- La posición del código será igual a la cantidad de jugadores que proceden de Michigan y forman parte de equipos de la conferencia oeste.
-- Al resultado obtenido lo dividiremos por la cantidad de jugadores cuyo peso es mayor o igual a 195, y a eso le vamos a sumar 0.9945.
-- Este resultado nos dará la posición del candado ( -->1<--, 2, 3 o 4)
SELECT 
    (SELECT COUNT(J.PROCEDENCIA)
        FROM JUGADORES J
                INNER JOIN EQUIPOS E ON E.NOMBRE = J.NOMBRE_EQUIPO
        WHERE J.PROCEDENCIA = 'MICHIGAN'
                AND E.CONFERENCIA = 'EAST') / (SELECT COUNT(*)
        FROM JUGADORES
        WHERE PESO >= 195) + 0.9945; #Resultado: 1


-- Clave: La clave del candado C estará con formada por la/s siguientes consulta/s a la base de datos:
-- Para obtener el siguiente código deberás redondear hacia abajo el resultado que se devuelve de sumar:
	-- el promedio de puntos por partido
    -- el conteo de asistencias por partido, y 
    -- la suma de tapones por partido. 
    -- Además, este resultado debe ser, donde la división sea central 
    #RESULTADO: 631

SELECT * FROM EQUIPOS WHERE DIVISION = "CENTRAL"; -- "PISTONS, CAVALIERS, PACERS, BULLS, BUCKS"
SELECT * FROM JUGADORES WHERE NOMBRE_EQUIPO IN ("PISTONS", "CAVALIERS", "PACERS", "BULLS", "BUCKS");
SELECT * FROM JUGADORES INNER JOIN EQUIPOS ON JUGADORES.NOMBRE_EQUIPO = EQUIPOS.NOMBRE WHERE EQUIPOS.DIVISION = "CENTRAL";
SELECT * FROM EQUIPOS E INNER JOIN JUGADORES J ON J.NOMBRE_EQUIPO = E.NOMBRE WHERE E.DIVISION = "CENTRAL";
SELECT * FROM EQUIPOS E INNER JOIN JUGADORES J ON J.NOMBRE_EQUIPO = E.NOMBRE INNER JOIN ESTADISTICAS EST ON EST.JUGADOR = J.CODIGO WHERE E.DIVISION = "CENTRAL";
SELECT AVG(PUNTOS_POR_PARTIDO), COUNT(ASISTENCIAS_POR_PARTIDO), SUM(TAPONES_POR_PARTIDO) FROM EQUIPOS E INNER JOIN JUGADORES J ON J.NOMBRE_EQUIPO = E.NOMBRE INNER JOIN ESTADISTICAS EST ON EST.JUGADOR = J.CODIGO;

SELECT FLOOR(AVG(PUNTOS_POR_PARTIDO) + COUNT(ASISTENCIAS_POR_PARTIDO) + SUM(TAPONES_POR_PARTIDO))
FROM EQUIPOS E
        INNER JOIN JUGADORES J ON J.NOMBRE_EQUIPO = E.NOMBRE
        INNER JOIN ESTADISTICAS EST ON EST.JUGADOR = J.CODIGO
WHERE E.DIVISION = 'CENTRAL';


#CANDADO D
-- Posición: El candado D está ubicado en la posición calculada a partir del número obtenido en la/s siguiente/s consulta/s:
-- Muestre los tapones por partido del jugador Corey Maggette durante la temporada 00/01. Este resultado debe ser redondeado. Nota: el resultado debe estar redondeado
-- Este resultado nos dará la posición del candado (1, 2, 3 o -->4<--)
SELECT FLOOR(E.TAPONES_POR_PARTIDO) FROM ESTADISTICAS E INNER JOIN JUGADORES J ON J.CODIGO = E.JUGADOR WHERE J.NOMBRE = "COREY MAGGETTE" AND TEMPORADA = "00/01";

-- Clave: La clave del candado D estará con formada por la/s siguientes consulta/s a la base de datos:
-- Para obtener el siguiente código deberás redondear hacia abajo, la suma de puntos por partido de todos los jugadores de procedencia argentina.
SELECT PROCEDENCIA, NOMBRE FROM JUGADORES WHERE PROCEDENCIA = "ARGENTINA"; 

SELECT J.PROCEDENCIA, J.NOMBRE, E.PUNTOS_POR_PARTIDO FROM ESTADISTICAS E INNER JOIN JUGADORES J ON E.JUGADOR = J.CODIGO WHERE J.PROCEDENCIA = "ARGENTINA";
SELECT round(SUM(PUNTOS_POR_PARTIDO)) FROM ESTADISTICAS E INNER JOIN JUGADORES J ON E.JUGADOR = J.CODIGO WHERE J.PROCEDENCIA = "ARGENTINA";


#CANDADO A	POSICIÓN: 2	CLAVE: 14043
#CANDADO B	POSICIÓN: 3	CLAVE: 3480
#CANDADO C	POSICIÓN: 1	CLAVE: 631
#CANDADO D	POSICIÓN: 4	CLAVE: 10