Mi solución no fue la mejor. Por lo que parece, se esperaba que se haga un double-dispatch entre instrumento y material. Yo por mi lado use un dd, de guia y no estricto, entre músico e instrumento

Los errores que encontre/arreglé fueron:
* "Test bien bien completo" no es unitario -> Lo subdividi en tests unitarios
* El Try-Catch de casteos era una truchada cero POO. Hay que arreglarlo con polimorfismo, en vez de preguntarle a un objeto de que clase es
* El musico recibe por argumento un (Object i).
* El material de un instrumento debería ser un objeto. No tuve tiempo de implementar esto
* "If piano es de madera" -> polimorfismo!
* Mejore los nombres de variables
* Imprimir por pantalla NO es testeable. Lo deje como estaba para evitar 'cambiar el modelo', pero imprimir por pantalla algo y devolver 0 no es la mejor manera de manejar un error.

Los principios que marqué como violados, de los SOLID:
* Open-Closed: Para agregar a Petinato/Saxo hay que entrar a cada cantante. Se debería poder agregar por extensión y no por modificación
* Dependency Inversion: Habría que programar contra la interfaz instrumento, en vez de contra el objeto concreto de 'guitarra' o 'piano'.

Para segregación de interfaz escribí:
* La segregación de interfaz es un principio SOL I D que dice que no hay que forzar al usuario (o en términos prácticos la clase hija) a implementar metodos que no necesita.
* Diagrama que NO cumple: Un 'cuadrado' implementa una interfaz 'forma' que contenga los métodos 'area()' y 'volumen()'. Pero como un cuadrado no tiene volumen, se ve forzado a implementar un "return 0" que nunca debería existir
* Diagrama que SI cumple: Un 'cuadrado' implementa una interfaz 'forma2d' que contenga el método 'area()'. De querer hacer un 'cubo', se lo hace implementar tanto 'forma2d' como 'forma3d'.
