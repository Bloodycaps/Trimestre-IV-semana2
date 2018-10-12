package innerclassbajoacoplamiento;

public class ClaseUno {
	public static InterfaceDos getClaseDos() {
		return new ClaseUno.ClaseDos();
	}

	public static class ClaseDos implements InterfaceDos {

		public static InterfaceTres getClaseTres() {
			return new ClaseUno.ClaseDos.ClaseTres();
		}

		public static class ClaseTres implements InterfaceTres {

			public static InterfaceCuatro getClaseCuatro() {
				return new ClaseUno.ClaseDos.ClaseTres.ClaseCuatro();
			}

			public static class ClaseCuatro implements InterfaceCuatro {

				public static InterfaceCinco getClaseCinco() {

					return new ClaseUno.ClaseDos.ClaseTres.ClaseCuatro.ClaseCinco();
				}

				public static class ClaseCinco implements InterfaceCinco {

					public static InterfaceSeis getClaseSeis() {

						return new ClaseUno.ClaseDos.ClaseTres.ClaseCuatro.ClaseCinco.ClaseSeis();
					}

					public static class ClaseSeis implements InterfaceSeis {

						public static InterfaceSiete getClaseSiete() {

							return new ClaseUno.ClaseDos.ClaseTres.ClaseCuatro.ClaseCinco.ClaseSeis.ClaseSiete();
						}

						public static class ClaseSiete implements InterfaceSiete {

							public static InterfaceOcho getClaseOcho() {

								return new ClaseUno.ClaseDos.ClaseTres.ClaseCuatro.ClaseCinco.ClaseSeis.ClaseSiete.ClaseOcho();
							}

							public static class ClaseOcho implements InterfaceOcho {

								public static InterfaceNueve getClaseNueve() {

									return new ClaseUno.ClaseDos.ClaseTres.ClaseCuatro.ClaseCinco.ClaseSeis.ClaseSiete.ClaseOcho.ClaseNueve();
								}

								public static class ClaseNueve implements InterfaceNueve {

									public static InterfaceDiez getClaseDiez() {
										return new ClaseUno.ClaseDos.ClaseTres.ClaseCuatro.ClaseCinco.ClaseSeis.ClaseSiete.ClaseOcho.ClaseNueve.ClaseDiez();
									}

									public static class ClaseDiez implements InterfaceDiez {

									}

								}

							}

						}

					}

				}

			}
		}

	}
}
