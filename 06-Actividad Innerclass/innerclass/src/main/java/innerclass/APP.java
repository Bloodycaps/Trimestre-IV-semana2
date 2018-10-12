package innerclass;

public class APP {
	public static void main(String[] args) {
		ClaseUno c1 = new ClaseUno();
		System.out.println(c1);
		ClaseUno.ClaseDos c2 = new ClaseUno.ClaseDos();
		System.out.println(c2);
		ClaseUno.ClaseDos.ClaseTres c3 = new ClaseUno.ClaseDos.ClaseTres();
		System.out.println(c3);
		ClaseUno.ClaseDos.ClaseTres.ClaseCuatro c4 = new ClaseUno.ClaseDos.ClaseTres.ClaseCuatro();
		System.out.println(c4);
		ClaseUno.ClaseDos.ClaseTres.ClaseCuatro.ClaseCinco c5 = new ClaseUno.ClaseDos.ClaseTres.ClaseCuatro.ClaseCinco();
		System.out.println(c5);
		ClaseUno.ClaseDos.ClaseTres.ClaseCuatro.ClaseCinco.ClaseSeis c6 = new ClaseUno.ClaseDos.ClaseTres.ClaseCuatro.ClaseCinco.ClaseSeis();
		System.out.println(c6);
		ClaseUno.ClaseDos.ClaseTres.ClaseCuatro.ClaseCinco.ClaseSeis.ClaseSiete c7 = new ClaseUno.ClaseDos.ClaseTres.ClaseCuatro.ClaseCinco.ClaseSeis.ClaseSiete();
		System.out.println(c7);
		ClaseUno.ClaseDos.ClaseTres.ClaseCuatro.ClaseCinco.ClaseSeis.ClaseSiete.ClaseOcho c8 = new ClaseUno.ClaseDos.ClaseTres.ClaseCuatro.ClaseCinco.ClaseSeis.ClaseSiete.ClaseOcho();
		System.out.println(c8);
		ClaseUno.ClaseDos.ClaseTres.ClaseCuatro.ClaseCinco.ClaseSeis.ClaseSiete.ClaseOcho.ClaseNueve c9 = new ClaseUno.ClaseDos.ClaseTres.ClaseCuatro.ClaseCinco.ClaseSeis.ClaseSiete.ClaseOcho.ClaseNueve();
		System.out.println(c9);
	}
}