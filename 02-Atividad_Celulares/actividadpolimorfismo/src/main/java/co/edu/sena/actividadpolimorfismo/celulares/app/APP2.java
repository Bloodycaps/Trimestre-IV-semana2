package co.edu.sena.actividadpolimorfismo.celulares.app;

import co.edu.sena.actividadpolimorfismo.celulares.*;

public class APP2 {

    public static void main(String[] args) {
        Iphone6 iphone6 = new Iphone6();
        Apple apples = (Apple) iphone6;
        apples.comprar();
        Iphone6 iphone61 = new Iphone6();
        Celular celular = (Celular) iphone61;
        celular.encender();
        celular.apagar();

        Iphone7 iphone7 = new Iphone7();
        Apple iph6 = (Apple) iphone7;
        iph6.comprar();
        Iphone7 iphone71 = new Iphone7();
        Celular celular1 = (Celular) iphone71;
        celular1.apagar();
        celular1.encender();

        Apple apple = new Apple();
        Celular celular2 = (Celular) apple;
        celular2.encender();
        celular2.apagar();

        Samsung samsung = new Samsung();
        Celular celular3 = (Samsung) samsung;
        ((Samsung) celular3).comprar();
        GalaxyS7 s7 = new GalaxyS7();
        Samsung samsung1 = (Samsung) s7;
        samsung1.comprar();
        GalaxyS6 s6 = new GalaxyS6();
        Samsung samsung2 = (Samsung) s6;
        samsung2.comprar();
        GalaxyS7 s71 = new GalaxyS7();
        Celular uy = (Celular) s71;
        uy.apagar();
        uy.encender();
    }
}
