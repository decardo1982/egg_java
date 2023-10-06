-- #1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.
select nombre from jugadores order by nombre;
-- #2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras, ordenados por nombre alfabéticamente.
select nombre from jugadores where posicion like "%C%" and peso > 200 order by nombre;
-- #3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.
select nombre from equipos order by nombre;
-- #4. Mostrar el nombre de los equipos del este (East).
select nombre from equipos where conferencia = "east";
-- #5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.
select * from equipos where ciudad like "C%" order by nombre;
-- #6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.
select nombre, Nombre_equipo from jugadores order by nombre_equipo;
-- #7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.
select * from jugadores where Nombre_equipo = "Raptors" order by nombre;
-- #8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.
select puntos_por_partido 
from estadisticas e 
inner join jugadores j 
on e.jugador = j.codigo
where j.nombre = "Pau Gasol"; 
-- #9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.
select puntos_por_partido 
from estadisticas e 
inner join jugadores j 
on e.jugador = j.codigo
where j.nombre = "Pau Gasol" and temporada = "04/05"; 
-- #10. Mostrar el número de puntos de cada jugador en toda su carrera.
select nombre, sum(puntos_por_partido) 
from estadisticas e 
inner join jugadores j on j.codigo = e.jugador
group by nombre;
-- #11. Mostrar el número de jugadores de cada equipo.
select nombre_equipo, count(nombre_equipo) as cantidadJugadores 
from jugadores 
group by Nombre_equipo;
-- #12. Mostrar el jugador que más puntos ha realizado en toda su carrera.
select nombre, sum(puntos_por_partido) as puntos
from estadisticas e 
inner join jugadores j on j.codigo = e.jugador
group by nombre
order by puntos desc
limit 1;
-- #13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.
select jugadores.nombre, nombre_equipo, conferencia, division
from jugadores
inner join equipos on equipos.nombre = jugadores.Nombre_equipo
where altura = (SELECT MAX(altura) FROM jugadores);

-- #14. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor diferencia de puntos.
select *, max(abs(puntos_local - puntos_visitante)) as diferenciaDePuntos 
from partidos
group by codigo
order by diferenciaDePuntos desc
limit 1;
-- #15. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante, equipo_ganador), en caso de empate sera null.
select codigo, equipo_local, equipo_visitante 