## Antes de empezar
 
a. Crear un proyecto nuevo desde su IDE llamándolo final-buscador-original. Una vez creado copiar todas las carpetas con
 clases de este zip.
 
b. Crear un proyecto nuevo desde su IDE llamándolo final-buscador-estudiante. Una vez creado copiar todas las carpetas con
 clases de este zip.
 
c. Trabajar SIEMPRE sobre el proyecto **final-buscador-estudiante**


## IMPORTANTE

Para aprobar este examen el/la alumno/a debe entregar una solución integral y completa que resuelva el problema dado, demostrando un alto dominio de POO, así como también de UML.
En este sentido cualquiera de las siguientes situaciones conlleva a la desaprobación **AUTOMATICA** del examen integrador:

	1. NO entregar código desarrollado por el propio/a alumno/a.
	2. NO entregar diagramas UML o diagramas con errores GROSEROS de notación.
	3. NO detallar los principios y problemas de diseño que presenta el código entregado (tanto el de cátedra como el del alumno/a)

## Consignas

### Consigna 1
El modelo de dominio pertenece a productos y un buscador de los mismos. Lea y ejecute `BuscadorTest`. Luego analice el modelo otorgado y conteste:

    a. ¿Qué potenciales problemas de diseño encuentra en el código? Enumérelos explicando PARA CADA UNO de ellos
	 porqué considera que representan un problema de diseño.
    
    b. ¿Se viola algún(os) principio(s) de diseño? ¿Cual(es)? 
 
### Consigna 2
Basándonos en los ítems que UD. detalló en el punto (1) realice una mejora de diseño total del proyecto manteniendo la funcionalidad, agregando los siguientes requerimientos:
 	
1. El sistema debe permitir una busqueda por nombre (exacto o aproximado) y precio. Es decir, por ejemplo, buscar todos los productos que empiecen con "pelo" y cuesten entre 50 y 70.
2. En cualquier busqueda que se realice, el sistema debe permitir indicar un limite de resultados, de forma tal que la busqueda no recorra todos los productos, si no que se detenga al encontrar esa cantidad de resultados.

#### Se pide

    a. Realice una diagrama de clases de su nuevo diseño que incluya las clases agregadas para cumplir con los requerimientos.
    
    b. Realice en código dicha mejora de diseño incorporando los nuevos requerimientos.

    c. Con la mejora hecha en (b) realice un diagrama de secuencia dónde se pueda ver la busqueda de productos por nombre aproximado y precio. 
