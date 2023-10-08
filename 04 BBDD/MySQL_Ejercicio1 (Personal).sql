#1. Obtener los datos completos de los empleados.
USE PERSONAL;
SELECT * 
FROM EMPLEADOS;

#2. Obtener los datos completos de los departamentos.
SELECT * 
FROM departamentos;

#3. Listar el nombre de los departamentos.
SELECT NOMBRE_DEPTO 
FROM DEPARTAMENTOS;

#4. Obtener el nombre y salario de todos los empleados.
SELECT NOMBRE, SAL_EMP 
FROM EMPLEADOS;

#5. Listar todas las comisiones.
SELECT COMISION_EMP 
FROM EMPLEADOS;

#6. Obtener los datos de los empleados cuyo cargo sea ‘Secretaria’.
SELECT * 
FROM EMPLEADOS 
WHERE CARGO_EMP = 'Secretaria';

#7. Obtener los datos de los empleados vendedores, ordenados por nombre alfabéticamente.
SELECT * 
FROM EMPLEADOS 
WHERE CARGO_EMP = 'Vendedor' 
ORDER BY NOMBRE;

#8. Obtener el nombre y cargo de todos los empleados, ordenados por salario de menor a mayor.
SELECT NOMBRE, CARGO_EMP 
FROM EMPLEADOS 
ORDER BY SAL_EMP ASC;

#9. Obtener el nombre de o de los jefes que tengan su departamento situado en la ciudad de “Ciudad Real”
SELECT NOMBRE_JEFE_DEPTO
 FROM DEPARTAMENTOS 
 WHERE departamentos.ciudad = 'Ciudad Real';

#10. Elabore un listado donde para cada fila, figure el alias ‘Nombre’ y ‘Cargo’ para las respectivas tablas de empleados.
SELECT NOMBRE as Nombre, CARGO_EMP as Cargo
FROM EMPLEADOS;

#11. Listar los salarios y comisiones de los empleados del departamento 2000, ordenado por comisión de menor a mayor.
SELECT SAL_EMP, COMISION_EMP
FROM EMPLEADOS
WHERE ID_DEPTO = 2000
ORDER BY COMISION_EMP ASC;

#12. Obtener el valor total a pagar a cada empleado del departamento 3000, que resulta de: sumar el salario y la comisión, más una bonificación de 500.
-- Mostrar el nombre del empleado y el total a pagar, en orden alfabético.
SELECT NOMBRE, (SAL_EMP + COMISION_EMP + 500) AS Total_a_Pagar
FROM EMPLEADOS
WHERE ID_DEPTO = 3000
order by NOMBRE;

#13. Muestra los empleados cuyo nombre empiece con la letra J.
SELECT NOMBRE
FROM EMPLEADOS
WHERE NOMBRE LIKE 'J%';

#14. Listar el salario, la comisión, el salario total (salario + comisión) y nombre, de aquellos empleados que tienen comisión superior a 1000.
SELECT SAL_EMP, COMISION_EMP, (SAL_EMP + COMISION_EMP) AS SALARIO_TOTAL, NOMBRE
FROM EMPLEADOS
WHERE COMISION_EMP > 1000;

#15. Obtener un listado similar al anterior, pero de aquellos empleados que NO tienen comisión.
SELECT SAL_EMP, COMISION_EMP, (SAL_EMP + COMISION_EMP) AS SALARIO_TOTAL, NOMBRE
FROM EMPLEADOS
WHERE COMISION_EMP = 0;

#16. Obtener la lista de los empleados que ganan una comisión superior a su sueldo.
SELECT NOMBRE
FROM EMPLEADOS
WHERE COMISION_EMP > SAL_EMP;

#17. Listar los empleados cuya comisión es menor o igual que el 30% de su sueldo.
SELECT NOMBRE, COMISION_EMP, SAL_EMP, (SAL_EMP * 0.3) AS TREINTA
FROM EMPLEADOS
WHERE COMISION_EMP <= (SAL_EMP * 0.3);

#18. Hallar los empleados cuyo nombre no contiene la cadena “MA”
SELECT NOMBRE
FROM EMPLEADOS
WHERE UPPER(NOMBRE) NOT LIKE '%MA%';

#SELECT * FROM departamentos;

#19. Obtener los nombres de los departamentos que sean “Ventas”, “Investigación” o ‘Mantenimiento.
SELECT NOMBRE_DEPTO
FROM DEPARTAMENTOS
WHERE UPPER(NOMBRE_DEPTO) IN ('VENTAS', 'INVESTIGACIÓN', 'MANTENIMIENTO');

#20. Ahora obtener el contrario, los nombres de los departamentos que no sean “Ventas” ni “Investigación” ni ‘Mantenimiento.
SELECT NOMBRE_DEPTO
FROM DEPARTAMENTOS
WHERE UPPER(NOMBRE_DEPTO) NOT IN ('VENTAS', 'INVESTIGACIÓN', 'MANTENIMIENTO');

#21. Mostrar el salario más alto de la empresa.
SELECT MAX(SAL_EMP)
FROM EMPLEADOS;

#22. Mostrar el nombre del último empleado de la lista por orden alfabético.
SELECT NOMBRE
FROM EMPLEADOS
ORDER BY NOMBRE DESC
LIMIT 1;

#23. Hallar el salario más alto, el más bajo y la diferencia entre ellos.
SELECT MAX(SAL_EMP) AS ALTO, MIN(SAL_EMP) AS BAJO, (MAX(SAL_EMP) - MIN(SAL_EMP)) AS DIFERENCIA
FROM EMPLEADOS;

#24. Hallar el salario promedio por departamento.
SELECT AVG(SAL_EMP), ID_DEPTO
FROM EMPLEADOS
GROUP BY ID_DEPTO;

-- Consultas con Having
#25. Hallar los departamentos que tienen más de tres empleados. Mostrar el número de empleados de esos departamentos.
SELECT COUNT(ID_EMP), ID_DEPTO
FROM EMPLEADOS
GROUP BY ID_DEPTO
HAVING COUNT(ID_EMP) > 3;

#26. Hallar los departamentos que no tienen empleados
SELECT ID_DEPTO
FROM EMPLEADOS
HAVING COUNT(ID_EMP) = 0;

-- Consulta con Subconsulta
#28. Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la empresa. Ordenarlo por departamento.
SELECT NOMBRE, SAL_EMP
FROM EMPLEADOS
WHERE SAL_EMP >= (SELECT AVG(SAL_EMP) FROM EMPLEADOS);
