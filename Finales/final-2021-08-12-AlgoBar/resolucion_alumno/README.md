## Correcciones

### Modelo:

- Debe modelar los consumos, no puede acumularse simplemente en monto en el cliente. Error grave. Tampoco modela la reserva
> en este ejercicio es imporatante modelar el concepto de compra, o consumisión. Esto se refiere a un objeto que vincula el cliente con un monto . Lo mismo aplica a la reserva, donde adicionalmente es esencial tener la fecha para la cual se reserva la sala. Esto es similiar a lo visto en el ejercicio de Librería, visto en clase. Sugiero volver a ver la clase práctica donde se trata ese ejercicio.
> Si se tratase de modelar los objetos que explícitamente están escritos en la consigna, la verdad el ejercicio es inútil.
> El concepto de reserva es claro, el de un consumo también, solo acumular un monto es trivializar el problema.
- reservarPara no reserva, solo pregunta si puede reservarse, viola el principio tell don’t ask.
> Una forma de resolver como saber si ese socio puede reservar la sala , SalaCine puede enviar un mensaje a TipoDeSocio, algo así como puedoReservarSalaCinePara(cantidad de personas)
> Otra opción es hacer un **double dispatch** entre Sala y Cliente.
- Sala de cine, ¿como sabe si puede o no reservar? Si lo decide según el tipo de cliente, sin delegar esto en el tipo, entonces es un error grave.


### Diagrama de Clases:

- Las clases están desconectadas, debe mostrarse las relaciones entre ellas
> En el diagrama de clases, debe mostrar la relación entre Cliente y OPriducto, Entre Sala y TipoDeSocio y demás relaciones, además en el diagrama de clases debe mostrar los atributos relevantes de cada clase. 