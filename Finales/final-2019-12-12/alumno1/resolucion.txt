
1-a)
Dificulta la legibilidad del codigo que material sea un entero:uso de numeros magicos. Si bien se podria arreglar con 
constantes tipo "static int MATERIAL_MADERA = 2" al tener clases distintas para cada tipo de material deja de ser necesario el atributo

La herramienta del lobo deberia ser privada para no romper encapsulamiento,iden con los atributos de las casas.

los test no son unitarios, cada test no deberia tener mas de un assert y,debido a esto, tampoco sirve porque en caso de fallar 
no sabria exactamente que parte es la que no funciona debidamente. Ademas tampoco tendrian que ir en la carpeta source,deberian estar en una aparte.


1-b)
La accion de tirar casas no deberia estar en Bosque sino en Lobo, esto rompe con Single-responsibility

Los if's anidados van en contra del principio Open-Closed,porque me dificultan el proceso de agregar un nuevo tipo de casa.

2)Supuesto:Se asume que con el taladro percutor tambien se puede destruir la casa de madera.
(los test de mi solucion estan incompleto pero en la defensa oral me dijeron que el diseño en general esta bastante bien)

El tema de los if's anidados se soluciona con el patron Double-Dispatch
Para la herramienta se aplicó el patron State.

3)Es teorico asique esta en las diapositivas de la clase.