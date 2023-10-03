/* Obtener los datos completos de los empleados. */
select * from empleados;

/* Obtener los datos completos de los departamentos. */
select * from departamentos;

/* Listar el nombre de los departamentos. */
select nombre_depto from departamentos;

/* Obtener el nombre y salario de todos los empleados. */
select nombre, sal_emp from empleados;

/* Listar todas las comisiones. */
select comision_emp from empleados;

/* Obtener los datos de los empleados cuyo cargo sea ‘Secretaria’. */
select * from empleados where cargo_emp = 'secretaria';

/* Obtener los datos de los empleados vendedores, ordenados por nombre
alfabéticamente. */
select * from empleados where cargo_emp = 'vendedor' order by nombre asc;

/* Obtener el nombre y cargo de todos los empleados, ordenados por salario de menor a
mayor. */
select nombre, cargo_emp from empleados order by sal_emp;

/* Obtener el nombre de o de los jefes que tengan su departamento situado en la ciudad
de “Ciudad Real” */
select nombre_jefe_depto from departamentos where ciudad = 'ciudad real';

/* Elabore un listado donde para cada fila, figure el alias ‘Nombre’ y ‘Cargo’ para las
respectivas tablas de empleados. */
select nombre as Nombre, cargo_emp as Cargo from empleados;

/* Listar los salarios y comisiones de los empleados del departamento 2000, ordenado
por comisión de menor a mayor. */
select e.sal_emp, e.comision_emp from empleados e, departamentos d where d.id_depto = 2000 order by comision_emp asc;

/* Obtener el valor total a pagar a cada empleado del departamento 3000, que resulta
de: sumar el salario y la comisión, más una bonificación de 500. Mostrar el nombre del
empleado y el total a pagar, en orden alfabético. */
select nombre, SUM(sal_emp + comision_emp + 500) as total_a_pagar from empleados where id_depto = 3000 group by id_emp order by nombre asc;

/* Muestra los empleados cuyo nombre empiece con la letra J. */
select nombre from empleados where nombre like 'j%';

/* Listar el salario, la comisión, el salario total (salario + comisión) y nombre, de aquellos
empleados que tienen comisión superior a 1000. */
select nombre, sal_emp, comision_emp, SUM(sal_emp + comision_emp) as "Salario total" from empleados where comision_emp > 1000 group by id_emp order by nombre;

/* Obtener un listado similar al anterior, pero de aquellos empleados que NO tienen
comisión. */
select nombre, sal_emp, comision_emp, SUM(sal_emp + comision_emp) as "Salario total" from empleados where comision_emp = 0 group by id_emp;

/* Obtener la lista de los empleados que ganan una comisión superior a su sueldo. */
select nombre from empleados where comision_emp > sal_emp group by id_emp;

/* Listar los empleados cuya comisión es menor o igual que el 30% de su sueldo. */
select nombre from empleados where comision_emp <= (sal_emp * 0.3);

/* Hallar los empleados cuyo nombre no contiene la cadena “MA” */
select nombre from empleados where nombre not like '%ma%';

/* Obtener los nombres de los departamentos que sean “Ventas”, “Investigación” o
‘Mantenimiento. */
select nombre_depto from departamentos where nombre_depto in ('ventas', 'investigacion', 'mantenimiento', 'compras') group by nombre_depto;

/* Ahora obtener el contrario, los nombres de los departamentos que no sean “Ventas” ni
“Investigación” ni ‘Mantenimiento. */
select nombre_depto from departamentos where not nombre_depto in ('ventas', 'investigacion', 'mantenimiento', 'compras') group by nombre_depto;

/* Mostrar el salario más alto de la empresa. */
select MAX(sal_emp) from empleados;

/* Mostrar el nombre del último empleado de la lista por orden alfabético. */
select MAX(nombre) from empleados;

/* Hallar el salario más alto, el más bajo y la diferencia entre ellos. */
select MAX(sal_emp) as "Mayor salario", MIN(sal_emp) as "Menor salario",(MAX(sal_emp) - MIN(sal_emp)) as "Diferencia" from empleados;

/* Hallar el salario promedio por departamento. */
select round(avg(sal_emp)) as "salario promedio" from empleados group by id_depto;

/* CONSULTAS CON HAVING */
/* Hallar los departamentos que tienen más de tres empleados. Mostrar el número de
empleados de esos departamentos */
select d.nombre_depto as 'Departamento', count(e.id_emp) as 'Empleados' from departamentos d join empleados e on d.id_depto = e.id_depto group by d.nombre_depto having count(e.id_emp) > 3;

/* Hallar los departamentos que no tienen empleados */
select d.nombre_depto as 'Departamento', count(e.id_emp) as 'Empleados' from departamentos d  join empleados e on d.id_depto = e.id_depto group by d.nombre_depto having count(e.id_emp) = 0; /* no hay deptos sin empleados*/

/* CONSULTA CON SUBCONSULTA */
/* Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la
empresa. Ordenarlo por departamento */
select d.nombre_depto as 'Departamento', e.nombre as 'Empleados', e.sal_emp as 'Salario' from departamentos d  join empleados e on d.id_depto = e.id_depto where e.sal_emp >= (select round(avg(sal_emp)) from empleados) order by d.nombre_depto asc;
