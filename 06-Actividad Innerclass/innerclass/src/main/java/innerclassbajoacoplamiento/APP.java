package innerclassbajoacoplamiento;

public class APP {
	public static void main(String[] args) {
		InterfaceDos c2 = ClaseUno.getClaseDos();
		InterfaceTres c3 = ClaseUno.ClaseDos.getClaseTres();
		InterfaceCuatro c4 = ClaseUno.ClaseDos.ClaseTres.getClaseCuatro();
		InterfaceCinco c5 = ClaseUno.ClaseDos.ClaseTres.ClaseCuatro.getClaseCinco();
		InterfaceSeis c6 = ClaseUno.ClaseDos.ClaseTres.ClaseCuatro.ClaseCinco.getClaseSeis();
		InterfaceSiete c7 = ClaseUno.ClaseDos.ClaseTres.ClaseCuatro.ClaseCinco.ClaseSeis.getClaseSiete();
		InterfaceOcho c8 = ClaseUno.ClaseDos.ClaseTres.ClaseCuatro.ClaseCinco.ClaseSeis.ClaseSiete.getClaseOcho();
		InterfaceNueve c9 = ClaseUno.ClaseDos.ClaseTres.ClaseCuatro.ClaseCinco.ClaseSeis.ClaseSiete.ClaseOcho
				.getClaseNueve();
	}

}
