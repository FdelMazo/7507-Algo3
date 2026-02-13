# Unit-Tests de AlgoRoma

## Supuestos:

<div style="text-align: justify">

- El calculo de puntaje de gladiador es:
  $p_g=(0.6*\Sigma daño)+(0.4*proteccion)$
- Al aplicar el efecto de leyenda a la armadura escamada, no se aplica el efecto de la armadura pesada, solo la protección.
- Para un gladiador sin equipamiento sus puntos son 0.
- El 20% adicional de gladiador legendario se aplica al cohorte luego de la sumatoria de puntuación.

</div>

## Código:

```java
class GladiadorTest {

    @Test
    public void Test01CalcularPuntajeGladiadorLegendario() {
        // Arrange:
        AlgoRoma algoRoma = new AlgoRoma();
        Gladiador g = algoRoma.registrarGladiador(new Tridente(), new Jabalina(), new Escamada(), 10);
        int puntajeEsperado = 1500;

        // Act:
        int puntajeGladiador = algoRoba.obtenerPuntajeGladiador(g);

        // Assert:
        assertEquals(puntajeEsperado, puntajeGladiador);
    }

    @Test
    public void Test02DeterminarGanadorEntreDosGladiadores() {
        // Arrange:
        AlgoRoma algoRoma = new AlgoRoma();
        Gladiador g1 = algoRoma.registrarGladiador(new Espada(), new Jabalina(), new Pesada(), 0);
        Gladiador g2 = algoRoma.registrarGladiador(new Tridente(), new Escamada(), 9);
        bool eraLeyenda = g2.esLeyenda();
        // Ya que al ganar el decimo combate se volverá un gladiador leyenda.

        // Act:
        Gladiador ganador = algoRoma.batallar(g1, g2)
        bool ahoraLeyenda = g2.esLeyenda();

        // Assert:
        assertEquals(g2, ganador);
        assertFalse(eraLeyenda);
        assertTrue(ahoraLeyenda);
    }

    @Test
    public void Test03CalcularPuntajeCohorteConUnaLeyenda() {
        // Arrange:
        AlgoRoma algoRoma = new AlgoRoma();
        Gladiador g1 = algoRoma.registrarGladiador(new Tridente(), new Jabalina(), new Escamada(), 10);
        Gladiador g2 = algoRoma.registrarGladiador(new Tridente(), new Escamada(), 9);
        Gladiador g3 = algoRoma.registrarGladiador(new Tridente(), new Escamada(), 0);
        Gladiador g4 = algoRoma.registrarGladiador(new Tridente(), new Escamada(), 0);
        Gladiador g5 = algoRoma.registrarGladiador(new Tridente(), new Escamada(), 0);
        Cohorte c = algoRoma.formarCohorte(new Gladiador[]{g1, g2, g3, g4, g5});
        int puntajeEsperado = 4700;

        // Act:
        int puntajeCohorte = algoRoma.obtenerPuntaje(c);

        // Assert:
        assertEquals(puntajeEsperado, puntajeCohorte);
    }
}
```
