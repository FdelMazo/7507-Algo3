# Enunciado: AlgoVoz, las batallas.

Pasada la etapa de audiciones a ciegas, cada **coach** ya tiene su equipo formado. Ahora los **participantes** deben competir entre sí. Para ello deberán librar una **batalla** entre 2 participantes cantando el mismo tema a duo. Los participantes pueden tener como máximo una **habilidad extra**, aunque también pueden no tener ninguna. El coach no puede enfrentar participantes con las mismas habilidades extras.

Ellas son:
- Habilidad para bailar.
- Saber tocar un Instrumento.
- Carisma.

El ganador lo determinará el coach tieniendo en cuenta:
- Ganará el participante que haya cometido menor cantidad de errores de afinación.
- En caso de que no hayan cometido errores de afinación o empaten en esa magnitud dependerá de la habilidad extra:
	- Si uno tiene y el otro no => gana el que sí tiene.
	- Si ambos tienen habilidades:
		- Saber tocar un Instrumento gana siempre
		- Carisma le gana a saber bailar.
		
Pero **¡Cuidado!** Ahora los coaches pueden robar al participante que haya perdido la batalla. Los coaches tienen 1 solo robo disponible. Si ya lo usaron no podrán robar a otro participante.

### Se solicita:
1. Diagramas de secuencias para los siguientes escenarios.
- Calcular el ganador de una batalla en la que no se cometieron errores de afinación y un participante sabe bailar.
-Calcular el ganador de una batalla en la que ambos participantes cometieron 2 errores de afinación, un participante tiene carisma y el otro toca el charango.
- Calcular el coach asignado al perdedor de una batalla donde un participante cometió 1 error de afinación y el otro ninguno, habiendo 2 coaches queriendo robar, pero uno ya ha cometido un robo en otra batalla.
2. Diagrama de clases (completo) que corresponden a los diagramas de secuencia.
3. Foto personal con DNI.
4. Foto de la primera página de la libreta.

Entregar todo en un archivo padron.zip (NO .rar ni otros) utilizando como nombre de archivo el número de padrón. Las imágnes deben ser en UNICAMENTE en formato .png o .jpg, de lo contrario se considerá no entregado el punto correspondiente.

> Los objetos en los diagramas de secuencia no se pueden considerar “ya inicializados”, es decir, leyendo la secuencia entregada se debe poder reproducir verbalmente lo que pide la consigna