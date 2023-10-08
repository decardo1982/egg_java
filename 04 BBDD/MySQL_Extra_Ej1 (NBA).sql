USE NBA;
SELECT * FROM JUGADORES;
SELECT * FROM EQUIPOS;

#1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.
SELECT NOMBRE
FROM JUGADORES
ORDER BY NOMBRE;

#2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras, ordenados por nombre alfabéticamente.
SELECT NOMBRE
FROM JUGADORES
WHERE POSICION
LIKE '%C%'
AND PESO > 200
ORDER BY NOMBRE;

#3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.
SELECT NOMBRE
FROM EQUIPOS
ORDER BY NOMBRE;

#4. Mostrar el nombre de los equipos del este (East).
SELECT NOMBRE
FROM EQUIPOS
WHERE LOWER(CONFERENCIA) = 'EAST';

#5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.
SELECT *
FROM EQUIPOS
WHERE CIUDAD
LIKE 'C%'
ORDER BY NOMBRE;

#6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.
SELECT NOMBRE, NOMBRE_EQUIPO
FROM JUGADORES
ORDER BY NOMBRE_EQUIPO;

#7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.
SELECT * 
FROM JUGADORES
WHERE NOMBRE_EQUIPO = 'RAPTORS'
ORDER BY NOMBRE;

#8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.
SELECT PUNTOS_POR_PARTIDO
FROM ESTADISTICAS E
INNER JOIN JUGADORES J
ON E.JUGADOR = J.CODIGO
WHERE J.NOMBRE = 'PAU GASOL';

#9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.
SELECT PUNTOS_POR_PARTIDO
FROM ESTADISTICAS E
INNER JOIN JUGADORES J
ON E.JUGADOR = J.CODIGO
WHERE J.NOMBRE = 'PAU GASOL'
AND TEMPORADA = '04/05';

#10. Mostrar el número de puntos de cada jugador en toda su carrera.
SELECT NOMBRE, SUM(PUNTOS_POR_PARTIDO)
FROM ESTADISTICAS E
INNER JOIN JUGADORES J ON J.CODIGO = E.JUGADOR
GROUP BY NOMBRE;

#11. Mostrar el número de jugadores de cada equipo.
SELECT NOMBRE_EQUIPO, COUNT(*) AS CANTIDAD_JUGADORES FROM JUGADORES GROUP BY NOMBRE_EQUIPO;


#12. Mostrar el jugador que más puntos ha realizado en toda su carrera.
SELECT NOMBRE, SUM(PUNTOS_POR_PARTIDO) AS PUNTOS
FROM ESTADISTICAS E
INNER JOIN JUGADORES J ON J.CODIGO = E.JUGADOR
GROUP BY NOMBRE
ORDER BY PUNTOS DESC
LIMIT 1;

#13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.
SELECT JUGADORES.NOMBRE, NOMBRE_EQUIPO, CONFERENCIA, DIVISION
FROM JUGADORES
INNER JOIN EQUIPOS ON EQUIPOS.NOMBRE = JUGADORES.NOMBRE_EQUIPO
WHERE ALTURA = (SELECT MAX(ALTURA) FROM JUGADORES);
-- ORDER BY ALTURA DESC LIMIT 5;

#14. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor diferencia de puntos.
SELECT *, MAX(ABS(PUNTOS_LOCAL - PUNTOS_VISITANTE)) AS DIFERENCIA_DE_PUNTOS FROM PARTIDOS
GROUP BY CODIGO
ORDER BY MAX(ABS(PUNTOS_LOCAL - PUNTOS_VISITANTE)) DESC
LIMIT 1;

#15. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante, equipo_ganador), en caso de empate sera null.
SELECT CODIGO, EQUIPO_LOCAL, EQUIPO_VISITANTE, EQUIPO_GANADOR;
