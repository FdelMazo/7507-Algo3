## ANTES DE EMPEZAR 

a. Crear un proyecto nuevo desde su IDE llamándolo final-compresor-original.
  Una vez creado copiar todas las clases de este zip.

b. Crear un proyecto nuevo desde su IDE llamándolo final-compresor-alumno.
  Una vez creado copiar todas las clases de este zip.
  
c. Trabajar SIEMPRE sobre el proyecto final-compresor-alumno

## PREGUNTAS

1. Analice el problema dado.

    a. ¿Qué potenciales problemas de diseño encuentra? Enumérelos explicando PARA CADA UNO de ellos porqué   considera que representan un problema de diseño.

    b. Se viola algún(os) principio(s) de diseño ? ¿Cual(es)?

    c. Pasan todas las pruebas? Por que?

2. Realice una mejora de diseño total del proyecto solucionando los problemas identificados anteriormente

3. Haga A MANO ALZADA un diagrama de secuencia dónde se pueda ver el método comprimir de CompresorNombres.

4. Elija un patrón de diseño que usted conozca, a continuación:

    4.1. ¿Qué elementos componen el patrón de diseño seleccionado?

    4.2. Haga un diagrama de clases A MANO ALZADA del mismo APLICADO A UN EJEMPLO (No haga el diagrama de clases del patrón teórico)

5. Lecturas obligatorias: A determinar por el examinador.


## Respuestas

### 1.a

- Hay métodos cuyo comportamiento depende del valor de atributos del objeto al que pertenecen. Esto hace que el código sea menos mantenible, y mucho
más dificil de extender, ya que agregar una característica implicaría agregar otra variación al comportamiento de dichos métodos.
- Hay variables con nombres muy abreviados, no descriptivos. Dificulta la lectura del código.
- Se lanzan excepciones genéricas, dificultando el seguimiento de errores.
- Las clases no están agrupadas en paquetes. Esto impide determinar los grupos de clases que trabajan sobre problemáticas relacionadas.

### 1.b
- Se viola Open/Closed Principle, ya que de agregarse un nuevo tipo de entrada implicaría modificar la clase CompresorNombres.
- Se viola el principio de inversión de dependencia, ya que CompresorNombres depende de la clase concreta Entrada.
- Se viola indirectamente el principio de segregación de la interfaz, ya que un archivo tiene el método getSubEntradas que no tiene sentido en dicho contexto.