-- Consultas sobre una tabla
#1. Devuelve un listado con el código de oficina y la ciudad donde hay oficinas.
SELECT CODIGO_OFICINA, CIUDAD 
FROM OFICINA;

#2. Devuelve un listado con la ciudad y el teléfono de las oficinas de España.
SELECT CIUDAD, TELEFONO 
FROM OFICINA 
WHERE PAIS = "ESPAÑA";

#3. Devuelve un listado con el nombre, apellidos y email de los empleados cuyo jefe tiene un código de jefe igual a 7.
SELECT NOMBRE, APELLIDO1, APELLIDO2, EMAIL 
FROM EMPLEADO 
WHERE CODIGO_JEFE = 7;

#4. Devuelve el nombre del puesto, nombre, apellidos y email del jefe de la empresa.
SELECT * 
FROM EMPLEADO 
WHERE CODIGO_JEFE IS NULL;

#5. Devuelve un listado con el nombre, apellidos y puesto de aquellos empleados que no sean representantes de ventas.
SELECT NOMBRE, APELLIDO1, APELLIDO2, PUESTO 
FROM EMPLEADO 
WHERE PUESTO != "REPRESENTANTE VENTAS";

#6. Devuelve un listado con el nombre de los todos los clientes españoles.
SELECT * 
FROM CLIENTE 
WHERE PAIS = "SPAIN";

#7. Devuelve un listado con los distintos estados por los que puede pasar un pedido.
SELECT DISTINCT ESTADO 
FROM PEDIDO;

#8. Devuelve un listado con el código de cliente de aquellos clientes que realizaron algún pago en 2008.
	-- Tenga en cuenta que deberá eliminar aquellos códigos de cliente que aparezcan repetidos. Resuelva la consulta:
	-- o Utilizando la función YEAR de MySQL.
SELECT DISTINCT CODIGO_CLIENTE 
FROM PAGO 
WHERE YEAR(FECHA_PAGO) = 2008; 
	-- o Utilizando la función DATE_FORMAT de MySQL.
SELECT DISTINCT CODIGO_CLIENTE 
FROM PAGO 
WHERE DATE_FORMAT(FECHA_PAGO, '%Y/') = 2008;
	-- o Sin utilizar ninguna de las funciones anteriores.
SELECT DISTINCT CODIGO_CLIENTE 
FROM PAGO 
WHERE FECHA_PAGO 
LIKE "2008%";

#9. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de entrega de los pedidos que no han sido entregados a tiempo.
SELECT CODIGO_PEDIDO, CODIGO_CLIENTE, FECHA_ESPERADA, FECHA_ENTREGA 
FROM PEDIDO 
WHERE (FECHA_ENTREGA > FECHA_ESPERADA);

#10. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de entrega de los pedidos cuya fecha de entrega 
	-- ha sido al menos dos días antes de la fecha esperada.
SELECT CODIGO_PEDIDO, CODIGO_CLIENTE, FECHA_ESPERADA, FECHA_ENTREGA 
FROM PEDIDO 
WHERE (FECHA_ENTREGA - FECHA_ESPERADA) >= 2;
	-- o Utilizando la función ADDDATE de MySQL.
SELECT CODIGO_PEDIDO, CODIGO_CLIENTE, FECHA_ESPERADA, FECHA_ENTREGA 
FROM PEDIDO 
WHERE ADDDATE(FECHA_ESPERADA, INTERVAL 2 DAY) <= FECHA_ENTREGA;
	-- o Utilizando la función DATEDIFF de MySQL.
SELECT CODIGO_PEDIDO, CODIGO_CLIENTE, FECHA_ESPERADA, FECHA_ENTREGA 
FROM PEDIDO 
WHERE DATEDIFF(FECHA_ENTREGA, FECHA_ESPERADA) >= 2;

#11. Devuelve un listado de todos los pedidos que fueron rechazados en 2009.
SELECT * 
FROM PEDIDO 
WHERE ESTADO = "RECHAZADO" AND 
YEAR(FECHA_PEDIDO) = 2009;

#12. Devuelve un listado de todos los pedidos que han sido entregados en el mes de enero de cualquier año.
SELECT *
FROM PEDIDO
WHERE ESTADO = "ENTREGADO" AND
DATE_FORMAT(FECHA_ENTREGA, '%m') = 1;

#13. Devuelve un listado con todos los pagos que se realizaron en el año 2008 mediante Paypal. Ordene el resultado de mayor a menor.
SELECT *
FROM PAGO
WHERE FORMA_PAGO = "PAYPAL" AND
DATE_FORMAT(FECHA_PAGO, '%Y') = 2008 
ORDER BY FECHA_PAGO;

#14. Devuelve un listado con todas las formas de pago que aparecen en la tabla pago. Tenga en cuenta que no deben aparecer formas de pago repetidas.
SELECT DISTINCT FORMA_PAGO 
FROM PAGO;

#15. Devuelve un listado con todos los productos que pertenecen a la gama Ornamentales y que tienen más de 100 unidades en stock.
	-- El listado deberá estar ordenado por su precio de venta, mostrando en primer lugar los de mayor precio.
SELECT * FROM PRODUCTO
WHERE GAMA = "ORNAMENTALES" 
AND CANTIDAD_EN_STOCK > 100
ORDER BY PRECIO_VENTA DESC;

#16. Devuelve un listado con todos los clientes que sean de la ciudad de Madrid y cuyo representante de ventas tenga el código de empleado 11 o 30.
SELECT * FROM CLIENTE
WHERE CIUDAD = "MADRID"
AND CODIGO_EMPLEADO_REP_VENTAS IN(11, 30);

	-- Consultas multitabla (Composición interna) Las consultas se deben resolver con INNER JOIN.
#1. Obtén un listado con el nombre de cada cliente y el nombre y apellido de su representante de ventas.
SELECT C.NOMBRE_CLIENTE, E.NOMBRE, E.APELLIDO1, E.APELLIDO2 
FROM CLIENTE C 
INNER JOIN EMPLEADO E 
ON C.CODIGO_EMPLEADO_REP_VENTAS = E.CODIGO_EMPLEADO; 

#2. Muestra el nombre de los clientes que hayan realizado pagos junto con el nombre de sus representantes de ventas.
SELECT DISTINCT C.NOMBRE_CLIENTE, E.NOMBRE, P.CODIGO_CLIENTE 
FROM CLIENTE C 
INNER JOIN EMPLEADO E 
ON C.CODIGO_EMPLEADO_REP_VENTAS = E.CODIGO_EMPLEADO
INNER JOIN PAGO P 
ON C.CODIGO_CLIENTE = P.CODIGO_CLIENTE;

#3. Muestra el nombre de los clientes que no hayan realizado pagos junto con el nombre de sus representantes de ventas.
SELECT DISTINCT C.NOMBRE_CLIENTE, E.NOMBRE
FROM CLIENTE C
INNER JOIN EMPLEADO E
ON C.CODIGO_EMPLEADO_REP_VENTAS = E.CODIGO_EMPLEADO
WHERE C.CODIGO_CLIENTE NOT IN(
	SELECT DISTINCT CODIGO_CLIENTE 
	FROM PAGO);

#4. Devuelve el nombre de los clientes que han hecho pagos y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.
SELECT DISTINCT C.NOMBRE_CLIENTE, E.NOMBRE, O.CIUDAD
FROM CLIENTE C 
INNER JOIN EMPLEADO E 
ON C.CODIGO_EMPLEADO_REP_VENTAS = E.CODIGO_EMPLEADO
INNER JOIN PAGO P 
ON C.CODIGO_CLIENTE = P.CODIGO_CLIENTE
INNER JOIN OFICINA O
ON E.CODIGO_OFICINA = O.CODIGO_OFICINA;

#5. Devuelve el nombre de los clientes que no hayan hecho pagos y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.
SELECT DISTINCT C.NOMBRE_CLIENTE, E.NOMBRE, O.CIUDAD
FROM CLIENTE C
INNER JOIN EMPLEADO E ON C.CODIGO_EMPLEADO_REP_VENTAS = E.CODIGO_EMPLEADO
INNER JOIN OFICINA O ON E.CODIGO_OFICINA = O.CODIGO_OFICINA
WHERE C.CODIGO_CLIENTE NOT IN (SELECT DISTINCT
	CODIGO_CLIENTE
    FROM PAGO);

#6. Lista la dirección de las oficinas que tengan clientes en Fuenlabrada.
SELECT DISTINCT O.LINEA_DIRECCION1
FROM OFICINA O
INNER JOIN EMPLEADO E ON O.CODIGO_OFICINA = E.CODIGO_OFICINA
INNER JOIN CLIENTE C ON E.CODIGO_EMPLEADO = C.CODIGO_EMPLEADO_REP_VENTAS
WHERE C.CIUDAD = 'FUENLABRADA';

#7. Devuelve el nombre de los clientes y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.
-- SELECT * FROM CLIENTE;
-- SELECT * FROM EMPLEADO;
-- SELECT * FROM OFICINA;
SELECT C.NOMBRE_CLIENTE, E.NOMBRE, O.CIUDAD
FROM CLIENTE C
INNER JOIN EMPLEADO E ON C.CODIGO_EMPLEADO_REP_VENTAS = E.CODIGO_EMPLEADO
INNER JOIN OFICINA O ON E.CODIGO_OFICINA = O.CODIGO_OFICINA;


#8. Devuelve un listado con el nombre de los empleados junto con el nombre de sus jefes.
SELECT E1.NOMBRE AS 'Nombre Empleado', E2.NOMBRE AS 'Jefe'
FROM EMPLEADO E1
INNER JOIN EMPLEADO E2 ON E1.CODIGO_JEFE = E2.CODIGO_EMPLEADO; 

#9. Devuelve el nombre de los clientes a los que no se les ha entregado a tiempo un pedido.
-- SELECT * FROM PEDIDO; -- WHERE FECHA_ENTREGA > FECHA_ESPERADA
-- SELECT * FROM CLIENTE;
SELECT DISTINCT C.NOMBRE_CLIENTE
FROM CLIENTE C
INNER JOIN PEDIDO P ON C.CODIGO_CLIENTE = P.CODIGO_CLIENTE
WHERE P.FECHA_ENTREGA > P.FECHA_ESPERADA;

#10. Devuelve un listado de las diferentes gamas de producto que ha comprado cada cliente.
SELECT DISTINCT GAMA_PRODUCTO.GAMA 
FROM GAMA_PRODUCTO 
INNER JOIN PRODUCTO ON GAMA_PRODUCTO.GAMA = PRODUCTO.GAMA
INNER JOIN DETALLE_PEDIDO ON PRODUCTO.CODIGO_PRODUCTO = DETALLE_PEDIDO.CODIGO_PRODUCTO
INNER JOIN PEDIDO ON DETALLE_PEDIDO.CODIGO_PEDIDO = PEDIDO.CODIGO_PEDIDO
INNER JOIN CLIENTE ON PEDIDO.CODIGO_CLIENTE = CLIENTE.CODIGO_CLIENTE;


	-- Consultas multitabla (Composición externa) Resuelva todas las consultas utilizando las cláusulas LEFT JOIN, RIGHT JOIN, JOIN.
#1. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.
SELECT DISTINCT C.NOMBRE_CLIENTE
FROM CLIENTE C
LEFT JOIN PAGO P ON P.CODIGO_CLIENTE = C.CODIGO_CLIENTE
WHERE C.CODIGO_CLIENTE NOT IN (SELECT DISTINCT
            CODIGO_CLIENTE 
            FROM PAGO);

#2. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pedido.
SELECT DISTINCT C.NOMBRE_CLIENTE, P.CODIGO_PEDIDO
FROM CLIENTE C
LEFT JOIN PEDIDO P ON P.CODIGO_CLIENTE = C.CODIGO_CLIENTE
WHERE P.CODIGO_PEDIDO IS NULL;

#3. Devuelve un listado que muestre los clientes que no han realizado ningún pago y los que no han realizado ningún pedido.
SELECT DISTINCT P.CODIGO_CLIENTE, C.NOMBRE_CLIENTE FROM CLIENTE C RIGHT JOIN PAGO P ON P.CODIGO_CLIENTE = C.CODIGO_CLIENTE;
SELECT DISTINCT P.CODIGO_CLIENTE, C.NOMBRE_CLIENTE FROM CLIENTE C LEFT JOIN PAGO P ON P.CODIGO_CLIENTE = C.CODIGO_CLIENTE;
SELECT * FROM PAGO RIGHT JOIN CLIENTE ON PAGO.CODIGO_CLIENTE = CLIENTE.CODIGO_CLIENTE WHERE PAGO.FECHA_PAGO IS NULL;

#4. Devuelve un listado que muestre solamente los empleados que no tienen una oficina asociada.
select * from oficina;
SELECT * FROM EMPLEADO;
SELECT E.NOMBRE, E.CODIGO_OFICINA FROM EMPLEADO E LEFT JOIN OFICINA O ON E.CODIGO_OFICINA = O.CODIGO_OFICINA WHERE E.CODIGO_OFICINA IS NULL;

#5. Devuelve un listado que muestre solamente los empleados que no tienen un cliente asociado.
#6. Devuelve un listado que muestre los empleados que no tienen una oficina asociada y los que no tienen un cliente asociado.
#7. Devuelve un listado de los productos que nunca han aparecido en un pedido.
#8. Devuelve las oficinas donde no trabajan ninguno de los empleados que hayan sido los representantes de ventas de algún cliente que haya realizado la compra de algún producto de la gama Frutales.
#9. Devuelve un listado con los clientes que han realizado algún pedido, pero no han realizado ningún pago.
#10. Devuelve un listado con los datos de los empleados que no tienen clientes asociados y el nombre de su jefe asociado.
	-- Consultas resumen
#1. ¿Cuántos empleados hay en la compañía?
SELECT COUNT(CODIGO_EMPLEADO) 
FROM EMPLEADO;

#2. ¿Cuántos clientes tiene cada país?
SELECT PAIS, COUNT(PAIS) AS CANT_CLIENTES FROM CLIENTE GROUP BY PAIS;

#3. ¿Cuál fue el pago medio en 2009?
SELECT * FROM PAGO;
SELECT AVG(TOTAL) AS PROMEDIO
FROM PAGO
WHERE YEAR(FECHA_PAGO) = 2009;

#4. ¿Cuántos pedidos hay en cada estado? Ordena el resultado de forma descendente por el número de pedidos.
SELECT COUNT(ESTADO) AS CANTIDAD, ESTADO 
FROM PEDIDO 
GROUP BY ESTADO 
ORDER BY CANTIDAD DESC;

#5. Calcula el precio de venta del producto más caro y más barato en una misma consulta.
SELECT * FROM PRODUCTO;
SELECT MAX(PRECIO_VENTA) as PRECIO FROM PRODUCTO
UNION
SELECT MIN(PRECIO_VENTA) as PRECIO FROM PRODUCTO;

#6. Calcula el número de clientes que tiene la empresa.
SELECT COUNT(CODIGO_CLIENTE) FROM CLIENTE;

#7. ¿Cuántos clientes tiene la ciudad de Madrid?
SELECT COUNT(CODIGO_CLIENTE) FROM CLIENTE WHERE CIUDAD = "MADRID";

#8. ¿Calcula cuántos clientes tiene cada una de las ciudades que empiezan por M?
SELECT COUNT(CODIGO_CLIENTE) FROM CLIENTE WHERE CIUDAD LIKE "M%";

#9. Devuelve el nombre de los representantes de ventas y el número de clientes al que atiende cada uno.
#10. Calcula el número de clientes que no tiene asignado representante de ventas.
#11. Calcula la fecha del primer y último pago realizado por cada uno de los clientes. El listado deberá mostrar el nombre y los apellidos de cada cliente.
#12. Calcula el número de productos diferentes que hay en cada uno de los pedidos.
#13. Calcula la suma de la cantidad total de todos los productos que aparecen en cada uno de los pedidos.
#14. Devuelve un listado de los 20 productos más vendidos y el número total de unidades que se han vendido de cada uno. El listado deberá estar ordenado por el número total de unidades vendidas.
#15. La facturación que ha tenido la empresa en toda la historia, indicando la base imponible, el IVA y el total facturado.
	-- La base imponible se calcula sumando el coste del producto por el número de unidades vendidas de la tabla detalle_pedido. El IVA es el 21 % de la base
	-- imponible, y el total la suma de los dos campos anteriores.
#16. La misma información que en la pregunta anterior, pero agrupada por código de producto.
#17. La misma información que en la pregunta anterior, pero agrupada por código de producto filtrada por los códigos que empiecen por OR.
#18. Lista las ventas totales de los productos que hayan facturado más de 3000 euros. Se mostrará el nombre, unidades vendidas, total facturado y total facturado con impuestos (21% IVA)
	 
     -- Subconsultas con operadores básicos de comparación
#1. Devuelve el nombre del cliente con mayor límite de crédito.
#2. Devuelve el nombre del producto que tenga el precio de venta más caro.
SELECT NOMBRE
FROM PRODUCTO
WHERE PRECIO_VENTA = (
	SELECT 
    MAX(PRECIO_VENTA)
    FROM PRODUCTO);

#3. Devuelve el nombre del producto del que se han vendido más unidades. (Tenga en cuenta que tendrá que calcular cuál es el número total de unidades que se han vendido de cada
	-- producto a partir de los datos de la tabla detalle_pedido. Una vez que sepa cuál es el código del producto, puede obtener su nombre fácilmente.)
#4. Los clientes cuyo límite de crédito sea mayor que los pagos que haya realizado. (Sin utilizar INNER JOIN).
#5. Devuelve el producto que más unidades tiene en stock.
SELECT NOMBRE 
FROM PRODUCTO 
WHERE CANTIDAD_EN_STOCK = (
	SELECT MAX(CANTIDAD_EN_STOCK) 
    FROM PRODUCTO);

#6. Devuelve el producto que menos unidades tiene en stock.
SELECT NOMBRE 
FROM PRODUCTO 
WHERE CANTIDAD_EN_STOCK = (
	SELECT MIN(CANTIDAD_EN_STOCK) 
    FROM PRODUCTO);

#7. Devuelve el nombre, los apellidos y el email de los empleados que están a cargo de Alberto Soria.


	-- Subconsultas con ALL y ANY
#1. Devuelve el nombre del cliente con mayor límite de crédito.
#2. Devuelve el nombre del producto que tenga el precio de venta más caro.
#3. Devuelve el producto que menos unidades tiene en stock.

	-- Subconsultas con IN y NOT IN
#1. Devuelve el nombre, apellido1 y cargo de los empleados que no representen a ningún cliente.
#2. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.
#3. Devuelve un listado que muestre solamente los clientes que sí han realizado ningún pago.
#4. Devuelve un listado de los productos que nunca han aparecido en un pedido.
#5. Devuelve el nombre, apellidos, puesto y teléfono de la oficina de aquellos empleados que no sean representante de ventas de ningún cliente.

	-- Subconsultas con EXISTS y NOT EXISTS
#1. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.
#2. Devuelve un listado que muestre solamente los clientes que sí han realizado ningún pago.
#3. Devuelve un listado de los productos que nunca han aparecido en un pedido.
#4. Devuelve un listado de los productos que han aparecido en un pedido alguna vez