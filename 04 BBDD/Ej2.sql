select nombre from producto;

select nombre,precio from producto;

select * from producto;

select nombre,round(precio) from producto;

select codigo from producto;

select distinct codigo_fabricante from producto;

select nombre from fabricante order by nombre asc;

select nombre,precio from fabricante order by nombre asc;

select * from fabricante limit 5;

select * from producto order by precio asc limit 1;

select * from producto order by precio desc limit 1;

select nombre from producto where precio <= 120;

select * from producto where precio between 60 and 200;

select * from producto where codigo_fabricante in(1,3,5);

select * from producto where nombre like "%portatil%";

/*
select * from fabricante inner join producto on producto.codigo = fabricante.codigo;

select * from producto left join fabricante on producto.codigo = fabricante.codigo;

select * from producto right join fabricante on producto.codigo = fabricante.codigo;
*/

select producto.codigo as "codigo del producto"
,producto.nombre as "nombre del producto",
fabricante.codigo as "codigo del fabricante",
fabricante.nombre as "nombre del fabricante" from producto
inner join fabricante on producto.codigo_fabricante = fabricante.codigo;

select p.nombre as "nombre del producto",
p.precio as "precio del producto",
f.nombre as "nombre del fabricante" from producto p
inner join fabricante f on p.codigo_fabricante = f.codigo 
order by f.nombre;

select p.nombre as "nombre del producto",
p.precio as "precio del producto",
f.nombre as "nombre del fabricante" from producto p
inner join fabricante f on p.codigo_fabricante = f.codigo where p.precio = (select min(precio) from producto);
-- inner join fabricante on producto.codigo = fabricante.codigo order by producto.precio asc limit 1;

select * from producto p inner join fabricante f on p.codigo_fabricante = f.codigo where lower(f.nombre) = "lenovo";

select * from producto p inner join fabricante f on p.codigo_fabricante = f.codigo where lower(f.nombre) = "crucial" and p.precio > 200;

select * from producto p inner join fabricante f on p.codigo_fabricante = f.codigo where f.nombre in("Asus","Hewlett-Packard");

select p.nombre as "nombre del producto" , 
p.precio as "$" , 
f.nombre as "nombre del fabricante" from producto p
inner join fabricante f on p.codigo_fabricante = f.codigo where p.precio >= 180 order by p.precio desc ,p.nombre asc;

select * from fabricante f left join producto p on p.codigo_fabricante = f.codigo;

/*2. Devuelve un listado donde sólo aparezcan aquellos fabricantes que no tienen ningún producto asociado.*/
select * from fabricante f left join producto p on p.codigo_fabricante = f.codigo where f.codigo not in(select codigo_fabricante from producto);
select * from fabricante f left join producto p on p.codigo_fabricante = f.codigo where p.codigo_fabricante is null;
/*Subconsultas (En la cláusula WHERE) Con operadores básicos de comparación*/
/*1. Devuelve todos los productos del fabricante Lenovo. (Sin utilizar INNER JOIN).*/
select * from producto p, fabricante f where p.codigo_fabricante = f.codigo and lower(f.nombre) = "lenovo"; 
/*2. Devuelve todos los datos de los productos que tienen el mismo precio que el producto más caro del fabricante Lenovo. (Sin utilizar INNER JOIN).*/
select * from producto p,fabricante f 
where p.codigo_fabricante = f.codigo 
and p.precio = (select max(p.precio) from producto p ,fabricante f where p.codigo_fabricante = f.codigo and f.nombre = "lenovo");

/*3. Lista el nombre del producto más caro del fabricante Lenovo.*/
select max(p.precio) from producto p,fabricante f where p.codigo_fabricante = f.codigo and f.nombre = "lenovo";

/*4. Lista todos los productos del fabricante Asus que tienen un precio superior al precio medio de todos sus productos.*/
select p.* from producto p,fabricante f 
where p.codigo_fabricante = f.codigo 
and f.nombre = "Asus" 
and p.precio > (select avg(p.precio) from producto p,fabricante f where p.codigo_fabricante = f.codigo and f.nombre = "Asus");

/*Subconsultas con IN y NOT IN*/
/*1. Devuelve los nombres de los fabricantes que tienen productos asociados. (Utilizando IN o NOT IN).*/
select distinct f.nombre from fabricante f
left join producto p 
on p.codigo_fabricante = f.codigo 
where f.codigo in(select codigo_fabricante from producto);
/*2. Devuelve los nombres de los fabricantes que no tienen productos asociados. (Utilizando IN o NOT IN).*/
select distinct f.nombre from fabricante f
left join producto p 
on p.codigo_fabricante = f.codigo 
where f.codigo not in(select codigo_fabricante from producto);
/*Subconsultas (En la cláusula HAVING)*/

/*1. Devuelve un listado con todos los nombres de los fabricantes que tienen el mismo número de productos que el fabricante Lenovo.*/

select f.nombre from fabricante f inner join producto p on f.codigo = p.codigo_fabricante
group by f.nombre having count(p.codigo_fabricante) = (select count(p.codigo_fabricante) from fabricante f 
inner join producto p on f.codigo = p.codigo_fabricante 
where f.nombre = "lenovo");




