# Respuestas de la consigna 1
### Potenciales problemas de diseño de la solucion dada

* Uso de los ataques como si fueran strings en la clase Goku, esto lleva a que para agregar nuevos KaiohKen se tengan que ir a tocar los ifs de ese metodo.

* Uso de los ifs en el metodo de atacar, primero para revisar si se esta muerto, y despues para los ataques. Si se quisieran agregar nuevos ataques hay que ir agregandolos en ese if.

* Se pide y settea informacion para actualizar la vida del enemigo en la clase Goku. 

* Se tiene un metodo de aplicar KaiohKen en Vegeta que no realizaria nada.

* Esta el mismo problema que en la clase de Goku con los ifs.

### Principios de diseño violados

* Se viola el Tell Don't Ask al estar pidiendo la vida para realizar los ataques, ya que se la pide, se la afecta, y se le aplica la nueva vida.

* Se viola el principio de Open-Closed si quisiera agregar nuevos ataques, ya que tengo que ir a modificar las clases.

* Se viola Single Responsability en la clase de Goku, ya que esta sabe aplicarse el KaiohKen y atacar.

### Mi implementacion
* Se crearon varias clases nuevas para representar a las diferentes entidades.

* Vegeta ya no conoceria nada del Kaiohken

* Se creo un sistema de Kaiohken para Goku, facilitando el agregado de nuevos tipos, permitiendo que afecten a los ataques de forma diferente.

* Los personajes ahora pueden morir, dejandolos inactivos, ya no serian capaces de realizar acciones

* Se creo un sistema de ataques, permitiendo crear nuevos ataques facilmente y poder agregarlos a los personajes que se deseen.

* Me faltaron realizar mas pruebas probando las diferentes entidades nuevas surgidas.

### Supuestos: 
* El KaioKenX4 afecta solo al KameHameHa

* La Bola de energia siempre va a realizar 50 de daño, independientemente del KaioKen y de la vida

* Se interpreto que una vez muerto, no se afectarian los ataques y que no pueden realizarlos, no se hizo una excepcion para este caso, directamente no los afectan. 

