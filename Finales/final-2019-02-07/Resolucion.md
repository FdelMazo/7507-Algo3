//SUPUESTOS
Si los otros inversionistas invierten de tipo bitcoins van a obtener el monto normal


//PROBLEMAS
-Hay una gran prueba gigante. Es necesatio muschas preubas cortas, rapidas y explicitas. Cada una con un nombre
 que explique claramente la unica cosa que se va a probar. De esta manera una vez que falla la prueba se va a
  saber por que es exactamente. Si falla la prueba gigante pueden ser por cualquier razon y va a ser mas dificil
  de hallar y solucionar el error. Es preferible nombres descriptivos a comentarios innecesarios. No se utiliza
   TDD, simplemente se hizo un test grande con muchos asserts que verifican el correcto funcionamiento del
    codigo en conjunto. Ademas no usa asserts
-La cantidad de condicionales y try/catch hacen el codigo poco claro, ademas de no muy orientado a objetos.
 Hay que arreglarlo con polimorfismo, en vez de preguntarle a un objeto de que clase es
- Los tipos de inversion deberian ser objetos.
-


// Principios que viola
- Unica Responsabilidad: : Cada clase debe tener solo una responsabilidad, La inversion realiza todas las acciones.
- Se viola el Open/Closed principle: si añado un nuevo Inversionista o un nuevo tipo de inversion voy a tener que
 ir a la Inversion y editar el if. Deberia ser Open for extension and closed for modification, es decir que se
  debería poder agregar por extensión y no por modificación. Como esto fue modificado con los objetos abstractos
  y las interfaces fue muy sencillo agregar Bitcons y Los inversionistas agresivos. Y ademas de sencillo, no fue
  necesario modificar el codigo principal en lo absoluto.


// Patrones que se utilizan

Por un lado se utilizo STATE para los diferentes tipos de inversion. En el caso hipotetico de que quisiera cambiar
el comportamiento de una inversion podria al cambiar su estado interno. Creo la clase abstracta del tipo de inversion
y a partir de ello dependiendo el tipo, el calculo de la inversion sera distinta. Esto es abierto-cerrado ya que
se van a poder agregar nuevos tipos de inversion de forma sencilla, de otra manera simplemente anidariamos mas ifs.

Por otro lado se utiliza el patron de Double Dispatch, en tiempo de ejecucion se determina que es lo que debe
llamar segun los parametros que reciba. Por ejemplo si es un inversionista arriesgado en una inversion nula el monto
se multiplica por dos.


