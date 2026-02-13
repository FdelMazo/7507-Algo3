# AlgoRoma

<div style="text-align: justify;">

## Contexto al ejercicio:

En la antigua Roma existian guerreros cuya función no era la de ir a la guerra, sino la de entretener al publico en general del Imperio batallando hasta la muerte o a veces recreando momentos historicos. Por esto, se decidió crear un simulador que permita a las personas del siglo XXI poder disfrutar de esta antigua forma de entretenimiento.

## Características técnicas:

Para determinar el ganador de cada pelea se creó un coheficiente de capacidad de pelea del gladiador (_puntaje de gladiador_ o `Pg`). Cada gladiador puede elegir hasta dos armas y una armadura para batallar en la arena. Una vez ganadas 3 batallas, un gladiador novato asciende a senior. A las 10 batallas ganadas un gladiador senior asciende a leyenda.

Cada arma tiene un daño y cada armadura una proteccion base que se aplican en el calculo del puntaje de cada gladiador. Adicionalmente, la veteranía de un gladiador aplica un efecto adicional a cada arma y armadura equipada por este según corresponda.

### Tabla de armas:

<table style="text-align: center;">
    <tr>
        <th>Arma</th>
        <th>Daño base</th>
        <th>Novato</th>
        <th>Senior</th>
        <th>Leyenda</th>
    </tr>
    <tr>
        <td>Tridente</td>
        <td>1000</td>
        <td>-</td>
        <td>-</td>
        <td>+500 daño</td>
    </tr>
    <tr>
        <td>Espada</td>
        <td>500</td>
        <td>-</td>
        <td>+25% daño</td>
        <td>+50% daño</td>
    </tr>
    <tr>
        <td>Jabalina</td>
        <td>250</td>
        <td>-50 daño</td>
        <td>-</td>
        <td>x2 daño</td>
    </tr>
</table>

### Tabla de armaduras:

<table style="text-align: center;">
    <tr>
        <th>Armadura</th>
        <th>Proteccion</th>
        <th>Novato</th>
        <th>Senior</th>
        <th>Leyenda</th>
    </tr>
    <tr>
        <td>Pesada</td>
        <td>750</td>
        <td>-</td>
        <td>+50% proteccion</td>
        <td>+75% proteccion</td>
    </tr>
    <tr>
        <td>Escamada</td>
        <td>500</td>
        <td>+20% proteccion</td>
        <td>-</td>
        <td>Cambia por pesada</td>
    </tr>
    <tr>
        <td>Escudo</td>
        <td>150</td>
        <td>-</td>
        <td>-</td>
        <td>x2 proteccion</td>
    </tr>
</table>

Además, hasta 5 gladiadores pueden unirse para formar un Cohorte, en el cual su poder de pelea es aquel de todos los gladiadores que lo conforman. Si uno de los gladiadores es un gladiador legendario, entonces este Cohorte adquiere un %20 de poder adicional a la hora de calcular su poder de batalla.

### Calculo de puntaje de gladiador:

<div style="text-align:center">

$p_g= 0.6 * \Sigma daño + 0.4 * armadura$

</div>

## Casos de uso:

- Calcular el puntaje de un gladiador legendario equipado con un tridente, una jabalina y una armadura de escamas.
- Determinar el ganador de una batalla entre Gladiador 1 y Gladiador 2:
  - Gladiador 1:
    - Espada y Jabalina
    - Pesada
    - Novato
    - 0 victorias
  - Gladiador 2:
    - Tridente
    - Escamada
    - Senior
    - 9 victorias
- Calcular el puntaje total de un Cohorte **completo** donde uno de sus integrantes es un gladiador legendario.

Se pide:

- Diagrama completo de clases.
- Diagrama de secuencia para cada caso de uso.
- Código de pruebas JUnit para cada caso de uso.

</div>
