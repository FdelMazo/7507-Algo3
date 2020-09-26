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
El modelo de dominio pertenece a un casa y sus gastos. Lea y ejecute `CasaTest`. Luego analice el modelo otorgado y conteste:

    a. ¿Qué potenciales problemas de diseño encuentra en el cóodigo? Enumérelos explicando PARA CADA UNO de ellos
	 porqué considera que representan un problema de diseño.
    
    b. ¿Se viola algún(os) principio(s) de diseño ? ¿Cual(es)? 
 
### Consigna 2
Basándonos en los items que ud. detalló en el punto (1) realice una mejora de diseño total del proyecto manteniendo la interfaz del método getGastoTotal de Casa y a su vez incorpore la entidad Salamandra:
 	
* Su productividad varía según el tipo de madera que se utilice
* Quebracho cuesta $4 el kg y tiene un grado de pureza 2. Calculo del gasto : metros cuadrados x kg x pureza
* Pino cuesta $2 el kg y tiene un coeficiente calórico de 3. Calculo del gasto: ( metros cuadrados x kg ) / coeficiente calorico
* La Salamandra tiene una capacidad máxima de 15 kg que NO PUEDE SER EXCEDIDA.
* La Salamandra puede ser llenada 100% con Quebracho, 100% con Pino, o puede contener una parte de Pino y otra de Quebracho (El gasto total de la salamandra siempre será la suma de lo que gastan todas sus maderas)

> **IMPORTANTE**: Supuesto otorgado por la cátedra => Los gastos son independientes del tiempo. No se debe modelar nada del tiempo. Se asume que está todo prendido todo el tiempo.

    a. Realice una diagrama de clases de su nuevo diseño que incluya la salamandra.
    
    b. Realice en codigo dicha mejora de diseño incorporando la salamandra también.

    c. Con la mejora hecha en (b) realice un diagrama de secuencia dónde se pueda ver el método getGastoTotal de Casa. Este diagrama debe incluir una salamandra y se tiene que poder ver como es el calculo del gasto de la misma.