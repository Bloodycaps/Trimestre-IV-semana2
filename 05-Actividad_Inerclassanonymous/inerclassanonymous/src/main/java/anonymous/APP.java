package anonymous;

public class APP {
	public static void main(String[] args) {
		Soldado s1 = new Soldado() {

			public void respirar() {
				System.out.println("Yo Respiro");
			}

			public void nacer() {
				System.out.println("Yo nazco");
			}

			public void morir() {
				System.out.println("Yo muero");
			}

			public void correr() {
				System.out.println("Yo Corro");
			}

			public void comer() {
				System.out.println("Yo como");
			}

			public void caminar() {
				System.out.println("Yo camino");

			}

			public void vigilar() {
				System.out.println("Yo vigilo");

			}

			public void luchar() {
				System.out.println("Yo lucho");

			}

			public void defender() {
				System.out.println("Yo defiendo");

			}
		};
		s1.caminar();
		s1.comer();
		s1.correr();
		s1.defender();
		s1.luchar();
		s1.morir();
		s1.nacer();
		s1.respirar();
		s1.vigilar();
		System.out.println(s1);

		Explorador e1 = new Explorador() {

			public void respirar() {
				System.out.println("Yo Respiro");

			}

			public void nacer() {
				System.out.println("Yo nazco");

			}

			public void morir() {
				System.out.println("Yo muero");

			}

			public void correr() {
				System.out.println("Yo Corro");

			}

			public void comer() {
				System.out.println("Yo como");

			}

			public void caminar() {
				System.out.println("Yo camino");

			}

			public void marcarCaminos() {
				System.out.println("Yo marco los caminos");
			}

			public void investigar() {
				System.out.println("Yo investigo");
			}

			public void informar() {
				System.out.println("Yo informo");
			}
		};
		e1.caminar();
		e1.comer();
		e1.correr();
		e1.informar();
		e1.investigar();
		e1.marcarCaminos();
		e1.morir();
		e1.nacer();
		e1.respirar();
		System.out.println(e1);

		Obrero o1 = new Obrero() {

			public void respirar() {
				System.out.println("Yo respiro");
			}

			public void nacer() {
				System.out.println("Yo nazco");
			}

			public void morir() {
				System.out.println("Yo muero");

			}

			public void correr() {
				System.out.println("Yo corro");

			}

			public void comer() {
				System.out.println("Yo como");

			}

			public void caminar() {
				System.out.println("Yo camino");

			}

			public void recolectar() {
				System.out.println("Yo recolecto");

			}

			public void excavar() {
				System.out.println("Yo excavo");

			}

			public void cuidarCrias() {
				System.out.println("Yo cuido las crias");

			}

			public void construir() {
				System.out.println("Yo construyo");

			}

			public void arreglar() {
				System.out.println("Yo arreglo");

			}
		};
		o1.arreglar();
		o1.caminar();
		o1.comer();
		o1.construir();
		o1.correr();
		o1.cuidarCrias();
		o1.excavar();
		o1.morir();
		o1.nacer();
		o1.recolectar();
		o1.respirar();
		System.out.println("o1");
	}

}
