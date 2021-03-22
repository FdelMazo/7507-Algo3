## Antes de empezar
 
a. Crear un proyecto nuevo desde su IDE llamándolo final-iot-original. Una vez creado copiar todas las carpetas con
 clases de este zip.
 
b. Crear un proyecto nuevo desde su IDE llamándolo final-iot-estudiante. Una vez creado copiar todas las carpetas con
 clases de este zip.
 
c. Trabajar SIEMPRE sobre el proyecto **final-iot-estudiante**


## IMPORTANTE

Para aprobar este examen el/la alumno/a debe entregar una solución integral y completa que resuelva el problema dado, demostrando un alto dominio de POO, así como también de UML.
En este sentido cualquiera de las siguientes situaciones conlleva a la desaprobación **AUTOMATICA** del examen integrador:

	1. NO entregar código desarrollado por el propio/a alumno/a.
	2. NO entregar diagramas UML o diagramas con errores GROSEROS de notación.
	3. NO detallar los principios y problemas de diseño que presenta el código entregado (tanto el de cátedra como el del alumno/a)

## Consignas

### Consigna 1
El modelo de dominio pertenece a un usuario con sus dispositivos iot. Lea y ejecute `UsuarioTest`. Luego analice el modelo otorgado y conteste:

    a. ¿Qué potenciales problemas de diseño encuentra en el cóodigo? Enumérelos explicando PARA CADA UNO de ellos
	 porqué considera que representan un problema de diseño.
    
    b. ¿Se viola algún(os) principio(s) de diseño ? ¿Cual(es)? 
 
### Consigna 2
Basándonos en los items que ud. detalló en el punto (1) realice una mejora de diseño total del proyecto y a su vez incorpore:
 	
* Una nueva camara de seguridad inteligente, la misma puede detectar movimiento y al hacerlo debe notificar a la central.
* El timbre ahora se ha vuelto más inteligente también. Con lo cual el timbre sabe hacer dos cosas: "tocar el timbre" (misma funcionalidad que antes) y también detecta movimiento como las cámaras y notifica a la central.
* Si se detectan 3 eventos de movimientos PARA EL MISMO USUARIO (independientemente desde que dispositivo/s haya/n venido) debe ser notificado con un alerta especial. Luego para volver a ser notificado con dicha alerta deben volver a registrarse 3 eventos de movimientos otra vez.
> **IMPORTANTE**: NO HAY QUE IMPLEMENTARLO, pero tenga en mente que el equipo de Investigación y Desarrollo está por proponer el lanzamiento de un nuevo dispositivo al que le SI se le pueda tocar el timbre, NO detecta movimiento, y SI detectará la puesta del sol notificando que ya se hizo de noche.

    a. Realice una diagrama de clases de su nuevo diseño que incluya el timbre mejorado y la camara tambien.
    
    b. Realice en codigo dicha mejora de diseño incorporando lo soliticado en la Consigna 2.

    c. Con la mejora hecha en (b) realice un diagrama de secuencia dónde se pueda ver la notificación de la alerta especial.