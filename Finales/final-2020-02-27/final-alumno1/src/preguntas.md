* Inversión de dependencias:
Las dependencias deben estar en las abstracciones, no en las implementaciones.
Los módulos de alto nivel no deberían depender de módulos de bajo nivel, ambos deben depender
de abstracciones,
Aqui pasa que para cada efecto distinto, las implementaciones estan atadas a los mismos pedazos de codigo y la
abstraccion Efecto esta atada a la implementacion de cada uno. Esto es poco mantenible y aumenta
el acoplamiento.

* Segregación de interfaces:
Los clientes no deberían depender de interfaces que no usan.
En este caso, a las clases relacionada a efectos distintos no estan correctamente 
segregadas. La intefaz Efecto contiene distintos tipos de efectos que podrian separarse en
distintas interfases.

* Cadenas mágicas:
Las cadenas agregadas al final de cada clase son implementadas de forma arbitraria. 
Estas cadenas, al estar atadas a una implementación (dentro de un metodo) son dificilmente
rastreables, más si surge la necesidad de usarlas en otro lugar de la misma clase. 
Un número de este estilo deberia ser un atributo de clase, estático y final (si se quisiera usar,
en mi implementación, permito que el usuario añada qué caracter agregar al final).

* Abierto Cerrado:
Las entidades deberían estar abiertas para su extensión, pero cerradas para su modificación.
La clase FabricaDeEfectos es un mega instanciador de clases, esto viola el principio de OC porque al agregar un nuevo efecto, 
deberia modificar la clase para añadir un nuevo constructor. Esto es poco mantenible y muy acoplado

* Uso de ifs en todas las clases:
En todas las clases se usa ifs para comparar contra la cadena vacia "", esto podria evitarse usando un PatternNull
(pero no llegué a implementarlo). Se recomienda no usar ifs porque cada rama de desicion puede volverse poco mantenible a medida que 
crece el código.

* Para mejorar el diseño entregado, utilicé los patrones de diseño State y Composite.
