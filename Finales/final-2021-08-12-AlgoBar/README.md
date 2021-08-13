# Enunciado: AlgoBar
Un importante emprendimiento gastrónomico decide lanzarse con las siguientes caracterísitcas:

Se puede visitar el bar siendo:
- **No socio**
- **Asociado**
- **Asociado Premium**

El bar, además del salón gastronómico, cuenta con una **sala de música** y una **sala de cine**. 

Solo los **asociados** y **asociados premiun** puede **reservar** ambas salas. 

La **sala de cine** tiene que tener un mínimo de **8 invitados** para poder reservarse (incluyendo al socio que siempre tiene que estar presente), pero si sos **socio premiun** no hay minimo alguno (puede reservala entera para el / ella solo/a )

Los **no socios** deben **abonar** lo que consuman **en el momento**, sin embargo los **asociados**
pagan todo lo que consumen **al final del mes**. Ser **socio** cuesta **$500 / mes** y ser **socio premiun
$1000 / mes**.

Al momento de registrar el cierre de una mesa el precio a pagar por todos los consumos serán:
- **100%** para no socio
- **90%** para asociado
- **80%** para asociado Premiun

### Se solicita:
1. Diagramas de secuencias para los siguientes escenarios.
	a. Calcular el precio que debe pagar un asociado premiun al finalizar el mes, habiendo consumido en el salón una noche $1000, una segunda noche $3000 y habiendo visitado la sala de cine con 4 personas consumiendo en ese acto
$10000.
	b. Calcular el precio que debe pagar un asociado al finalizar el mes, habiendo consumido en el salón una noche $1000 y habiendo intentado visitar la sala de cine con 5 personas.
	c. Un no socio consumiendo por $1500
2. Diagrama de clases (completo) que corresponden a los diagramas de secuencia.
3. Foto personal.
4. Foto de la primera página de la libreta.
Entregar todo en un archivo **.zip** (NO .rar ni otros) utilizando como nombre de archivo el número de padrón. Las imágnes deben ser en UNICAMENTE en formato .png o .jpg, de lo contrario se considerá no entregado el punto correspondiente.


> Los objetos en los diagramas de secuencia no se pueden considerar “ya inicializados”, es decir que leyendo la secuencia entregada se debe poder reproducir verbalmente lo que pide la consigna.

> Lo consumido en los salones cuenta como consumo de una “mesa” también.