2. El primer problema que se nota, es que no existen pruebas unitarias, aparte de la primera planteada. Esto puede significar un problema, dado que no se hace un testeo de las clases una por una, asegurandonos de su correcto funcionamiento. Esto lleva tambien a que la cobertura de los tests es muy limitada. Solo 2 de 6 clases, 3 metodos de 16 metodos.

Las pruebas tambien estan en la carpeta src, cuando deberian estar en la carpeta test.

Otro gran problema es que la clase TiendaOnline crea y opera internamente los pedidos, cuando estos deberian ser una clase aparte.

En la funcion agregarEnvio, se utiliza un try catch totalmente innecesario que puede ser reemplazado con polimorfismo y herencia. Dado que tanto EnvioInternacional como EnvioLocal son clases hijas de Envio, no es necesario fijarse que tipo de Envio es para realizar el recargo.


3. Se rompe el principio de diseño Single Responsibility de las siglas SOLID, que establece que una clase debe tener una sola razon para existir y no debe realizar cosas que no le corresponden. Esto se rompe en la clase Tienda Online, ya que se encarga de crear los pedidos y manejarlos internamente. 
Tambien se rompe lo establecido en el texto Unit Testin Principles, en el que se especifica que los nombres de las pruebas deben ser especificos de lo que hacen, y no prueba01 prueba02 como se recibieron en el codigo original.


7. Cambios realizados:

Se decidió utilizar Double Dispatch para la implementación del recargo a realizar por envío en el precio total de los pedidos. Esto se debe, a que dada la distinta variedad de Envios, se comenzó utilizando polimorfismo, llamando a un método agregarRecargo que recibe el precio del pedido original, para devolver el precio final con el precio actualizado. El programa solo sabe cual recargo realizar, y esto ayuda a no caer en los try's y catches que habían en el código.

Se creó una clase pedido que administra dentro de si misma los productos y el precio total de este. Esto se hizo para respetar Single Responsibility para que la clase Tienda no tenga que manejar internamente los pedidos.



