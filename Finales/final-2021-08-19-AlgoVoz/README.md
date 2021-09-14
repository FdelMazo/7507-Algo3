# Enunciado: AlgoVoz
Un importante canal de televisión está por lanzar un reality show en busca de la voz algoritmica. Para ellos se cuenta con 3 **coaches**, quienes presentan las siguientes afinidades musicales:
- **Soledad**: Tiene afinidad por el folclore, la cumbia y el tango.
- **Lali**: Tiene afininidad por el pop, la cumbia y el rock.
- **Familia Montaner**: Tienen afininidad por las baladas románticas y el pop.

En el show los participantes deberán realizar una **performance**. Cada participante también tiene una serie de **afinidades musicales**. 
Durante su performance los coaches estarán dados vueltas y en caso de interesarles el participante oprimirán un botón para **darse vuelta**. 
Los coaches no pueden darse vuelta al mismo tiempo que otro, siempre hay un orden en el que se dan vuelta. El **resultado** de la performance puede ser positivo o negativo: Si es positivo signifca que el participante tiene un coach asignado, si es negativo no lo tendrá y quedará afuera de la competición.

Para determinar qué coach tendrá asignado se debe tener en cuenta:
- Si 1 solo coach se dio vuelta => le corresponde ese.
- Si 2 o más se dieron vuelta, se asignará el coach con el cual el participante tenga un mayor número de coincidencias de afinidades musicales. En caso de empate se le asignará al que **primero** se haya dado vuelta.
* Si 2 o más se dieron vuelta y no hay coincidencias de afinidades con ninguno entonces se le asignará el **último** que se haya dado vuelta.

Pero **¡Cuidado!** Si el “participante” es en realidad un dueto siempre se le asigna la familia montaner si es que se dieron vuelta. Sino se dieron vuelta aplican las reglas ya vistas.

### Se solicita:
1. Diagramas de secuencias para los siguientes escenarios.
- Calcular el coach asignado para un participante con afinidad musical de cumbia y folclore en el que primero se dio vuelta Lali y luego Soledad.
- Calcular el coach asignado para un participante con afinidad musical heavy metal en el que primero se dio vuelta Soledad, luego la familia Montaner y por último Lali.
- Calcular el coach asignado para un participante dueto con afinidad pop y rock en el que primero se dio vuelta Soledad, luego Lali y última la familia Montaner.
- Calcular el coach asignado para un participante en el que ningún coach se dió vuelta.
2. Diagrama de clases (completo) que corresponden a los diagramas de secuencia.
3. Foto personal con DNI.
4. Foto de la primera página de la libreta.

Entregar todo en un archivo padron.zip (NO .rar ni otros) utilizando como nombre de archivo el número de padrón. Las imágnes deben ser en UNICAMENTE en formato .png o .jpg, de lo contrario se considerá no entregado el punto correspondiente.

> Los objetos en los diagramas de secuencia no se pueden considerar “ya inicializados”, es decir, leyendo la
secuencia entregada se debe poder reproducir verbalmente lo que pide la consigna.