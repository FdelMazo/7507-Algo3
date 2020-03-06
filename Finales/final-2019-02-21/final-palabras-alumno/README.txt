/********************************************************************************************************************************************
 * ANTES DE EMPEZAR 
*********************************************************************************************************************************************/
 
a.Crear un proyecto nuevo desde su IDE llamandolo final-palabras-original. Una vez creado copiar todas las carpetas con clases de este zip.
b.Crear un proyecto nuevo desde su IDE llamandolo final-palabras-alumno. Una vez creado copiar todas las carpetas con clases de este zip.
c.Trabajar SIEMPRE sobre el proyecto final-palabras-alumno


/********************************************************************************************************************************************
* IMPORTANTE
*********************************************************************************************************************************************/

Para aprobar este examen el/la alumno/a debe entregar una solución integral y completa que resuelva el problema dado, demostrando un alto dominio de POO, así como también de UML.
En este sentido cualquiera de las siguientes situaciones conlleva a la desaprobación AUTOMATICA del examen integrador:

	1. NO entregar código desarrollado por el propio/a alumno/a.
	2. NO entregar diagramas UML.
	3. Presentar errores GROSEROS de notación UML.


/********************************************************************************************************************************************
 * PREGUNTAS 
*********************************************************************************************************************************************/

1) Analice el modelo otorgado y conteste:

	a) ¿Qué potenciales problemas de diseño encuentra en el codigo? Enumérelos explicando PARA CADA UNO de ellos porqué considera que representan un problema de diseño.
	b) ¿Se viola algún(os) principio(s) de diseño ? ¿Cual(es)? 


2) 	En base a los items que Ud. detalle en el punto (1) desarrolle diseñando y programando una mejora de diseño total del proyecto para incluir que el puntaje de la celda se debe duplicar si la palabra que esta contiene es una vocal. Para realizar esta tarea necesitará:

		a) Realizar PRIMERO un diagrama de clases A MANO ALZADA de como sera su nuevo diseño.
		b) Realizar un diagrama de secuencia A MANO ALZADA del valor de la celda cuando esta contiene una vocal.

 - RECOMENDACIÓN: Una vez decidido su diseño, comience con la programación la utilización de la vocal y luego complete el sistema.


3) Preguntas teóricas: A determinar por el docente.


4) Lecturas obligatorias: A determinar por el docente.


Problemas:

- Clases con atributos públicos permiten que se viole en encapsulamiento. Esto permite que se introduzcan bugs más rápido. Puede afectar la factorización
- Palabras mágicas
- Números mágicos
- No se estandarizan errores bajo excepciones, no se aprovecha al máximo el poo
- Test poco modularizado
- Nombre de test poco descriptivo
- Test deben servir como documentación viva, no explica de todo lo que se pretende hacer
- No hay una estandarización uniforme en cuanto a los idiomas utilizados
- Poca modularización del código en paquetes, puede dificultar su lectura. El código se lee muchas veces a lo largo del tiempo
- Atributos públicos de la palabra limitan a única implementación

- La celda viola el principio de única responsabilidad, esta clase podría estar modularizada y tener más componentes. A su vez, de la manera que están declarados sus nombres de atributos y métodos, generan una baja cohesión
- No se programa contra abstracciones, representa un problema en el diseño, no permite aprovechar al máximo el polimorfismo y puede afectar al principio abierto-cerrado
- Efectivamente se rompe abierto cerrado, no esta diseñado para agregar más requerimientos con modificaciones mínimas sobre elementos ya existentes
