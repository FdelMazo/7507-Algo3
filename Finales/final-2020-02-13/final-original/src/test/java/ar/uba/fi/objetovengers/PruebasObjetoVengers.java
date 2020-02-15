package ar.uba.fi.objetovengers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PruebasObjetoVengers {

    private static final double DELTA = 1e-12;

    @Test
    public void test01ThanosEmpiezaSiempreCon250PuntosDeVida() {
        Thanos thanos = new Thanos();

        assertEquals(250, thanos.getPuntosDeVida(), DELTA);
    }

    @Test
    public void test02IronManEmpiezaSiempreCon100PuntosDeVida() {
        IronManConArmaduraMarkI ironMan1 = new IronManConArmaduraMarkI();
        IronManConArmaduraMarkII ironMan2 = new IronManConArmaduraMarkII();
        IronManConArmaduraDeWarMachine ironMan3 = new IronManConArmaduraDeWarMachine();

        assertEquals(100, ironMan1.getPuntosDeVida(), DELTA);
        assertEquals(100, ironMan2.getPuntosDeVida(), DELTA);
        assertEquals(100, ironMan3.getPuntosDeVida(), DELTA);
    }

    @Test
    public void test03ThanosAtacaAIronManYLeQuita15PuntosDeVida() {
        Thanos thanos = new Thanos();
        IronManConArmaduraMarkI ironMan = new IronManConArmaduraMarkI();

        thanos.atacar(ironMan);

        assertEquals(85, ironMan.getPuntosDeVida(), DELTA);
    }

    @Test
    public void test04IronManConArmaduraMarkIQuita10PuntosDeVidaAThanos() {
        IronManConArmaduraMarkI ironMan = new IronManConArmaduraMarkI();
        Thanos thanos = new Thanos();

        ironMan.atacar(thanos);

        assertEquals(240, thanos.getPuntosDeVida(), DELTA);
    }

    @Test
    public void test05IronManConArmaduraMarkIIQuita12PorCientoDeSuVidaAThanos() {
        IronManConArmaduraMarkII ironMan = new IronManConArmaduraMarkII();
        Thanos thanos = new Thanos();

        ironMan.atacar(thanos); // Ataca con 12

        assertEquals(238, thanos.getPuntosDeVida(), DELTA);

        thanos.atacar(ironMan); // IronMan pasa a tener 85 puntos de vida

        ironMan.atacar(thanos); // Ataca con 12

        assertEquals(226, thanos.getPuntosDeVida(), DELTA);
    }

    @Test
    public void test06IronManConArmaduraWarMachineAtacaAThanosYLeRoba10PuntosDeVida() {
        IronManConArmaduraDeWarMachine ironMan = new IronManConArmaduraDeWarMachine();
        Thanos thanos = new Thanos();

        ironMan.atacar(thanos);

        assertEquals(240, thanos.getPuntosDeVida(), DELTA);
        assertEquals(110, ironMan.getPuntosDeVida(), DELTA);
    }

    @Test
    public void test07IronManConArmaduraMarkISePoneArmaduraMarkIIYAtacaAThanos() {
        IronManConArmaduraMarkI ironMan = new IronManConArmaduraMarkI();
        Thanos thanos = new Thanos();

        ironMan.atacar(thanos);

        assertEquals(240, thanos.getPuntosDeVida(), DELTA);
        assertEquals(100, ironMan.getPuntosDeVida(), DELTA);

        ironMan.agregarArmaduraMarkII();

        // Le quita los 10 de MarkI y otros 12 mas por tener MarkII.
        ironMan.atacar(thanos);

        assertEquals(218, thanos.getPuntosDeVida(), DELTA);
    }

    @Test
    public void test08IronManConArmaduraMarkISePoneArmaduraWarMachineYAtacaAThanos() {
        IronManConArmaduraMarkI ironMan = new IronManConArmaduraMarkI();
        Thanos thanos = new Thanos();

        ironMan.atacar(thanos);

        assertEquals(240, thanos.getPuntosDeVida(), DELTA);
        assertEquals(100, ironMan.getPuntosDeVida(), DELTA);

        ironMan.agregarArmaduraDeWarMachine();

        // Le quita los 10 de MarkI y otros 10 mas por tener WarMachine. Ademas absorbe 10 puntos
        ironMan.atacar(thanos);

        assertEquals(220, thanos.getPuntosDeVida(), DELTA);
        assertEquals(110, ironMan.getPuntosDeVida(), DELTA);
    }

    @Test
    public void test09IronManConArmaduraMarkIISePoneLasOtrasArmadurasYAtacaAThanos() {
        IronManConArmaduraMarkII ironMan = new IronManConArmaduraMarkII();
        Thanos thanos = new Thanos();

        ironMan.atacar(thanos);

        assertEquals(238, thanos.getPuntosDeVida(), DELTA);

        ironMan.agregarArmaduraMarkI();

        // Le quita los 12 de MarkII y otros 10 mas por tener MarkI.
        ironMan.atacar(thanos);

        assertEquals(216, thanos.getPuntosDeVida(), DELTA);

        ironMan.agregarArmaduraDeWarMachine();

        // Le quita los 12 de MarkII, 10 de MarkI y otros 10 de WarMachine. Absorbe 10 puntos.
        ironMan.atacar(thanos);

        assertEquals(184, thanos.getPuntosDeVida(), DELTA);
        assertEquals(110, ironMan.getPuntosDeVida(), DELTA);
    }

    @Test
    public void test10IronManConArmaduraWarMachineSePoneLasOtrasArmadurasYAtacaAThanos() {
        IronManConArmaduraDeWarMachine ironMan = new IronManConArmaduraDeWarMachine();
        Thanos thanos = new Thanos();

        ironMan.atacar(thanos); // Ataca con 10 y absorbe 10

        assertEquals(240, thanos.getPuntosDeVida(), DELTA);
        assertEquals(110, ironMan.getPuntosDeVida(), DELTA);

        ironMan.agregarArmaduraMarkI();

        // Le quita los 10 de WarMachine y otros 10 mas por tener MarkI. Absorbe 10 puntos.
        ironMan.atacar(thanos);

        assertEquals(220, thanos.getPuntosDeVida(), DELTA);
        assertEquals(120, ironMan.getPuntosDeVida(), DELTA);

        ironMan.agregarArmaduraMarkII();

        // Le quita los 12 de MarkII, 10 de MarkI y otros 10 de WarMachine. Absorbe 10 puntos.
        ironMan.atacar(thanos);

        assertEquals(188, thanos.getPuntosDeVida(), DELTA);
        assertEquals(130, ironMan.getPuntosDeVida(), DELTA);
    }

    @Test
    public void test11ThanosConsigueLasGemasDelInfinitoYAtacaConElCuadrupleDePoder() {
        Thanos thanos = new Thanos();
        IronManConArmaduraMarkI ironMan = new IronManConArmaduraMarkI();

        thanos.conseguirLasGemasDelInfinito();

        thanos.atacar(ironMan); // ataca con 60

        assertEquals(40, ironMan.getPuntosDeVida(), DELTA);
    }

}
