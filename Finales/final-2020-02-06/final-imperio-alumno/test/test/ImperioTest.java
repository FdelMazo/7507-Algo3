package test;

import modelo.*;
import org.junit.Assert;
import org.junit.Test;

public class ImperioTest {

    @Test
    public void testImperioSinPlanetasNoObtieneRemesaDeProduccion() {
        Imperio imperio = new Imperio();
        imperio.solicitarRemesaDeProduccion();
        Assert.assertEquals(0, imperio.getFondoAcumulado());
    }

    @Test
    public void testImperioConUnPlanetaObtieneRemesaDeProduccionDeEsePlaneta() {

        Imperio imperio = new Imperio();
        PlanetaAgricola tierra = new PlanetaAgricola(10, 100);
        imperio.agregarPlaneta(tierra);

        // El Imperio se queda con la mitad de lo que produce el Planeta
        imperio.solicitarRemesaDeProduccion();
        Assert.assertEquals(500,  imperio.getFondoAcumulado());
    }

    @Test
    public void testImperioConDosPlanetaObtieneRemesaDeProduccionDeTodosLosPlanetas() {

        Imperio imperio = new Imperio();
        PlanetaAgricola tierra = new PlanetaAgricola(10, 100);
        imperio.agregarPlaneta(tierra);

        PlanetaAgricola marte = new PlanetaAgricola(5, 10);
        imperio.agregarPlaneta(marte);

        // El Imperio recibe la mitad de lo que producen la tierra y marte
        imperio.solicitarRemesaDeProduccion();
        Assert.assertEquals(525, imperio.getFondoAcumulado());
    }

    @Test
    public void testImperioConUnPlanetaMineroObtieneRemesaDeProduccionDeEsePlaneta(){
        Imperio imperio = new Imperio();
        PlanetaMinero tierra = new PlanetaMinero(100);
        imperio.agregarPlaneta(tierra);

        // El Imperio se queda con la 30% de lo que produce el Planeta
        imperio.solicitarRemesaDeProduccion();
        Assert.assertEquals(15,  imperio.getFondoAcumulado());
    }

    @Test
    public void testImperioConDosPlanetaDistintosObtieneRemesaDeProduccionDeTodosLosPlanetas() {

        Imperio imperio = new Imperio();
        PlanetaAgricola tierra = new PlanetaAgricola(10, 100);
        imperio.agregarPlaneta(tierra);

        PlanetaMinero marte = new PlanetaMinero(100);
        imperio.agregarPlaneta(marte);

        // El Imperio recibe la mitad de lo que produce la tierra y 30% de lo que produce marte
        imperio.solicitarRemesaDeProduccion();
        Assert.assertEquals(515, imperio.getFondoAcumulado());
    }

    @Test
    public void testImperioQuedaEn0SiLoSSimuladoresRobanYNoHayFondos(){
        Imperio imperio = new Imperio();
        PlanetaLosSimuladores simuladores = new PlanetaLosSimuladores();
        imperio.agregarPlaneta(simuladores);

        imperio.solicitarRemesaDeProduccion();
        Assert.assertEquals(0, imperio.getFondoAcumulado());
    }

    @Test
    public void testPlanetaLosSimuladresRoba0SiImperioNoTieneFondos(){
        Imperio imperio = new Imperio();
        PlanetaLosSimuladores simuladores = new PlanetaLosSimuladores();
        imperio.agregarPlaneta(simuladores);

        imperio.solicitarRemesaDeProduccion();
        Assert.assertEquals(0, simuladores.getProdRobada());
    }

    @Test
    public void testLosSimuladoresRobaRecaudacionDeDosPlanetasAImperio() {

        Imperio imperio = new Imperio();
        PlanetaAgricola tierra = new PlanetaAgricola(10, 100);
        imperio.agregarPlaneta(tierra);

        PlanetaMinero marte = new PlanetaMinero(100);
        imperio.agregarPlaneta(marte);

        PlanetaLosSimuladores simuladores = new PlanetaLosSimuladores();
        imperio.agregarPlaneta(simuladores);

        // El Imperio recibe la mitad de lo que produce la tierra y 30% de lo que produce marte
        imperio.solicitarRemesaDeProduccion();
        Assert.assertEquals(258, imperio.getFondoAcumulado()); //Verificamos los fondos del imperio
        Assert.assertEquals(257, simuladores.getProdRobada()); //Verificamos los fondos de Los simuladores
    }
}
