

import static org.junit.Assert.assertEquals;

import model.armaduras.MarkI;
import model.armaduras.MarkII;
import model.armaduras.WarMachine;
import model.entidades.IronMan;
import model.entidades.Thanos;
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
        IronMan ironMan1 = new IronMan(new MarkI());
        IronMan ironMan2 = new IronMan(new MarkII());
        IronMan ironMan3 = new IronMan(new WarMachine());

        assertEquals(100, ironMan1.getPuntosDeVida(), DELTA);
        assertEquals(100, ironMan2.getPuntosDeVida(), DELTA);
        assertEquals(100, ironMan3.getPuntosDeVida(), DELTA);
    }

    @Test
    public void test03ThanosAtacaAIronManYLeQuita15PuntosDeVida() {
        Thanos thanos = new Thanos();
        IronMan ironMan = new IronMan();

        thanos.atacar(ironMan);

        assertEquals(85, ironMan.getPuntosDeVida(), DELTA);
    }

    @Test
    public void test04IronManQuita10PuntosDeVidaAThanos() {
        IronMan ironMan = new IronMan();
        Thanos thanos = new Thanos();

        ironMan.atacar(thanos);

        assertEquals(240, thanos.getPuntosDeVida(), DELTA);
    }

    @Test
    public void test05IronManQuita12PorCientoDeSuVidaAThanos() {
        IronMan ironMan = new IronMan(new MarkII());
        Thanos thanos = new Thanos();

        ironMan.atacar(thanos); // Ataca con 12

        assertEquals(238, thanos.getPuntosDeVida(), DELTA);

        thanos.atacar(ironMan); // IronMan pasa a tener 85 puntos de vida

        ironMan.atacar(thanos); // Ataca con 12

        assertEquals(226, thanos.getPuntosDeVida(), DELTA);
    }

    @Test
    public void test06IronManConArmaduraWarMachineAtacaAThanosYLeRoba10PuntosDeVida() {
        IronMan ironMan = new IronMan(new WarMachine());
        Thanos thanos = new Thanos();

        ironMan.atacar(thanos);

        assertEquals(240, thanos.getPuntosDeVida(), DELTA);
        assertEquals(110, ironMan.getPuntosDeVida(), DELTA);
    }

    @Test
    public void test07IronManSePoneArmaduraMarkIIYAtacaAThanos() {
        IronMan ironMan = new IronMan();
        Thanos thanos = new Thanos();

        ironMan.atacar(thanos);

        assertEquals(240, thanos.getPuntosDeVida(), DELTA);
        assertEquals(100, ironMan.getPuntosDeVida(), DELTA);


        // Le quita los 10 de MarkI y otros 12 mas por tener MarkII.
        ironMan.agregarArmadura(new MarkII());
        ironMan.atacar(thanos);

        assertEquals(218, thanos.getPuntosDeVida(), DELTA);
    }

    @Test
    public void test08IronManSePoneArmaduraWarMachineYAtacaAThanos() {
        IronMan ironMan = new IronMan();
        Thanos thanos = new Thanos();

        ironMan.atacar(thanos);

        assertEquals(240, thanos.getPuntosDeVida(), DELTA);
        assertEquals(100, ironMan.getPuntosDeVida(), DELTA);


        // Le quita los 10 de MarkI y otros 10 mas por tener WarMachine. Ademas absorbe 10 puntos
        ironMan.agregarArmadura(new WarMachine());
        ironMan.atacar(thanos);

        assertEquals(220, thanos.getPuntosDeVida(), DELTA);
        assertEquals(110, ironMan.getPuntosDeVida(), DELTA);
    }

    @Test
    public void test09IronManSePoneLasOtrasArmadurasYAtacaAThanos() {
        IronMan ironMan = new IronMan(new MarkII());
        Thanos thanos = new Thanos();

        ironMan.atacar(thanos);

        assertEquals(238, thanos.getPuntosDeVida(), DELTA);


        // Le quita los 12 de MarkII y otros 10 mas por tener MarkI.
        ironMan.agregarArmadura(new MarkI());
        ironMan.atacar(thanos);

        assertEquals(216, thanos.getPuntosDeVida(), DELTA);


        // Le quita los 12 de MarkII, 10 de MarkI y otros 10 de WarMachine. Absorbe 10 puntos.
        ironMan.agregarArmadura(new WarMachine());
        ironMan.atacar(thanos);

        assertEquals(184, thanos.getPuntosDeVida(), DELTA);
        assertEquals(110, ironMan.getPuntosDeVida(), DELTA);
    }

    @Test
    public void test10IronManConArmaduraWarMachineSePoneLasOtrasArmadurasYAtacaAThanos() {
        IronMan ironMan = new IronMan(new WarMachine());
        Thanos thanos = new Thanos();

        ironMan.atacar(thanos); // Ataca con 10 y absorbe 10

        assertEquals(240, thanos.getPuntosDeVida(), DELTA);
        assertEquals(110, ironMan.getPuntosDeVida(), DELTA);


        // Le quita los 10 de WarMachine y otros 10 mas por tener MarkI. Absorbe 10 puntos.
        ironMan.agregarArmadura(new MarkI());
        ironMan.atacar(thanos);

        assertEquals(220, thanos.getPuntosDeVida(), DELTA);
        assertEquals(120, ironMan.getPuntosDeVida(), DELTA);


        // Le quita los 12 de MarkII, 10 de MarkI y otros 10 de WarMachine. Absorbe 10 puntos.
        ironMan.agregarArmadura(new MarkII());
        ironMan.atacar(thanos);

        assertEquals(188, thanos.getPuntosDeVida(), DELTA);
        assertEquals(130, ironMan.getPuntosDeVida(), DELTA);
    }

    @Test
    public void test11ThanosConsigueLasGemasDelInfinitoYAtacaConElCuadrupleDePoder() {
        Thanos thanos = new Thanos();
        IronMan ironMan = new IronMan();

        thanos.conseguirLasGemasDelInfinito();

        thanos.atacar(ironMan); // ataca con 60

        assertEquals(40, ironMan.getPuntosDeVida(), DELTA);
    }

}
