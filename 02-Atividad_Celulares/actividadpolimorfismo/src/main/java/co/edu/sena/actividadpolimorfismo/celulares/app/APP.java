package co.edu.sena.actividadpolimorfismo.celulares.app;

import co.edu.sena.actividadpolimorfismo.celulares.*;

public class APP {

    public static void main(String[] args) {
        Samsung s1 = new GalaxyS6();
        s1.comprar();
        Samsung s2 = new GalaxyS7();
        s2.comprar();
        Apple a1 = new Apple();
        a1.comprar();
        Apple a2 = new Iphone7();
        ((Iphone7) a2).tomarFotos();
        Apple a3 = new Iphone6();
        a3.comprar();
        Celular c1 = new Apple();
        c1.apagar();
        c1.encender();
        Celular sam = new Samsung();
        sam.encender();
        sam.apagar();
        Celular samg7 = new GalaxyS7();
        samg7.encender();
        Celular samg6 = new GalaxyS6();
        samg6.apagar();
        samg6.encender();
        Celular ip6 = new Iphone6();
        ip6.encender();
        ip6.apagar();
        Celular ip7 = new Iphone7();
        ip7.encender();
    }

}
