package test.java;

import DragonBall.ataques.BolaDeEnergia;
import DragonBall.ataques.GalickHo;
import DragonBall.ataques.KameHameHa;
import DragonBall.kaiohken.GokuMurioAplicandoKaiohKenExcepcion;
import DragonBall.kaiohken.KaiohKenNormal;
import DragonBall.kaiohken.KaiohKenX3;
import DragonBall.kaiohken.KaiohKenX4;
import org.junit.Test;


import DragonBall.personajes.Goku;
import DragonBall.personajes.Vegeta;

import static org.junit.Assert.assertEquals;


public class DragonBallTest {

    @Test
    public void testPrueboVariosAtaquesEntreSiYKaioKens() {
        Goku goku = new Goku();
        Vegeta vegeta = new Vegeta();

        goku.atacar(vegeta, new BolaDeEnergia());

        assertEquals(5950, vegeta.getVida(),0.5); // 6000 - 50

        goku.atacar(vegeta, new KameHameHa());

        assertEquals(5850, vegeta.getVida(),0.5); // 5950 - 100

        goku.aplicarKaiohKen(new KaiohKenNormal());

        goku.atacar(vegeta, new KameHameHa());

        assertEquals(5500, vegeta.getVida(),0.5); // 5850 - 100 - 5000 * 0.05

        vegeta.atacar(goku, new GalickHo());

        assertEquals(4350, goku.getVida(),0.5); // 5000 - 100 - 5500 * 0.1
    }

    @Test
    public void testGokuEmpiezaCon5000DeVida(){
        Goku goku = new Goku();
        assertEquals(5000, goku.getVida(), 0.5);
    }


    @Test
    public void testVegetaEmpiezaCon6000DeVida(){
        Vegeta vegeta = new Vegeta();
        assertEquals(6000, vegeta.getVida(), 0.5);
    }

    @Test
    public void testSeLeAplicaKaioKenX4AGokuAtacaYTiene300DeVidaMenos(){
        Goku goku = new Goku();
        Vegeta vegeta = new Vegeta();
        goku.aplicarKaiohKen(new KaiohKenX4());
        goku.atacar(vegeta, new KameHameHa());
        assertEquals(4700, goku.getVida(), 0.5);
    }

    @Test
    public void testSeLeAplicaKaioKenX3AGokuAtacaAVegetaConBolaDeEnergiaYSoloPerdio50(){
        Goku goku = new Goku();
        Vegeta vegeta = new Vegeta();
        goku.aplicarKaiohKen(new KaiohKenX3());
        goku.atacar(vegeta, new BolaDeEnergia());
        assertEquals(5950, vegeta.getVida(), 0.5);
    }


    @Test
    public void testSeLeAplicaKaioKenNormalAGokuAtacaAVegetaConKameHameHaYPierde350(){
        Goku goku = new Goku();
        Vegeta vegeta = new Vegeta();
        goku.aplicarKaiohKen(new KaiohKenNormal());
        goku.atacar(vegeta, new KameHameHa());
        assertEquals(5650, vegeta.getVida(), 0.5);
    }

    @Test
    public void testVegetaAtacaConGalickAGokuYPierde700DeVida(){
        Goku goku = new Goku();
        Vegeta vegeta = new Vegeta();
        vegeta.atacar(goku, new GalickHo());
        assertEquals(4300, goku.getVida(), 0.5);
    }

    @Test
    public void testVegetaAtacaConBolaDeEnergiaYGokuPierde50DeVida(){
        Goku goku = new Goku();
        Vegeta vegeta = new Vegeta();
        vegeta.atacar(goku, new BolaDeEnergia());
        assertEquals(4950, goku.getVida(), 0.5);
    }

    @Test
    public void testGokuAtacaDosVecesConKaioKenX4YDespuesUnaVezMasDeberiaDeEstarSinKaioKenElUltimoAtaque(){
        Goku goku = new Goku();
        Vegeta vegeta = new Vegeta();
        goku.aplicarKaiohKen(new KaiohKenX4());
        goku.atacar(vegeta, new KameHameHa());
        goku.atacar(vegeta, new KameHameHa());
        goku.atacar(vegeta, new KameHameHa());
        assertEquals(4400, goku.getVida(), 0.5);
    }

    @Test
    public void testLlevoAGokuAlBordeDeMorirConGalickHo(){
        Goku goku = new Goku();
        Vegeta vegeta = new Vegeta();
        goku.aplicarKaiohKen(new KaiohKenX4());
        vegeta.atacar(goku, new GalickHo());
        vegeta.atacar(goku, new GalickHo());
        vegeta.atacar(goku, new GalickHo());
        vegeta.atacar(goku, new GalickHo());
        vegeta.atacar(goku, new GalickHo());
        vegeta.atacar(goku, new GalickHo());
        vegeta.atacar(goku, new GalickHo());
        assertEquals(100, goku.getVida(), 0.5);
    }

    @Test(expected = GokuMurioAplicandoKaiohKenExcepcion.class)
    public void testLlevoAGokuAlBordeDeMorirConGalickHoYGokuAtacaConKaiohKenSeDeberiaDeLanzarExcepcion(){
        Goku goku = new Goku();
        Vegeta vegeta = new Vegeta();
        goku.aplicarKaiohKen(new KaiohKenX4());
        vegeta.atacar(goku, new GalickHo());
        vegeta.atacar(goku, new GalickHo());
        vegeta.atacar(goku, new GalickHo());
        vegeta.atacar(goku, new GalickHo());
        vegeta.atacar(goku, new GalickHo());
        vegeta.atacar(goku, new GalickHo());
        vegeta.atacar(goku, new GalickHo());
        goku.atacar(vegeta,new KameHameHa());
    }

}
