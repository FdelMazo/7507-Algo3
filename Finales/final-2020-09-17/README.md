## Antes de empezar
 
a. Crear un proyecto nuevo desde su IDE llamándolo final-casa-original. Una vez creado copiar todas las carpetas con
 clases de este zip.
 
b. Crear un proyecto nuevo desde su IDE llamándolo final-casa-estudiante. Una vez creado copiar todas las carpetas con
 clases de este zip.
 
c. Trabajar SIEMPRE sobre el proyecto **final-casa-estudiante**


## IMPORTANTE

Para aprobar este examen el/la alumno/a debe entregar una solución integral y completa que resuelva el problema dado, demostrando un alto dominio de POO, así como también de UML.
En este sentido cualquiera de las siguientes situaciones conlleva a la desaprobación **AUTOMATICA** del examen integrador:

	1. NO entregar código desarrollado por el propio/a alumno/a.
	2. NO entregar diagramas UML o diagramas con errores GROSEROS de notación.
	3. NO detallar los principios y problemas de diseño que presenta el código entregado (tanto el de cátedra como el del alumno/a)

## Consignas

### Consigna 1
El modelo de dominio pertenece a vehículos y sus capacidades de cargas (`Auto` y `Moto`). Lea y ejecute `VehiculosTest`. Luego analice el modelo otorgado y conteste:

    a. ¿Qué potenciales problemas de diseño encuentra en el código? Enumérelos explicando PARA CADA UNO de ellos
	 porqué considera que representan un problema de diseño.
    
    b. ¿Se viola algún(os) principio(s) de diseño? ¿Cual(es)? 
 
### Consigna 2
Basándonos en los ítems que UD. detalló en el punto (1) realice una mejora de diseño total del proyecto manteniendo la funcionalidad, agregando los siguientes requerimientos:
 	
1. Un `Auto` puede ser equipado con un `PortaBici` y luego de esto puede cargar una bicicleta.
2. Una `Moto` **no** debe poder ser equipada con un `PortaBici`.
3. Una `Moto` **no** puede cargar una bici.

#### Se pide

    a. Realice una diagrama de clases de su nuevo diseño que incluya las clases agregadas para cumplir con los requerimientos.
    
    b. Realice en código dicha mejora de diseño incorporando los nuevos requerimientos.

    c. Con la mejora hecha en (b) realice un diagrama de secuencia dónde se pueda ver la carga y descargar de una bicicleta en un auto con porta bici. 

