package relacion;

public class Macho extends Hormiga implements Obrero, Explorador, Soldado {
	public void construir() {
		System.out.println("Yo Construyo");
	}

	public void arreglar() {
		System.out.println("Yo Arreglo");
	}

	public void recolectar() {
		System.out.println("Yo recolecto");
	}

	public void excavar() {
		System.out.println("Yo excavo");
	}

	public void luchar() {
		System.out.println("Yo lucho");
	}

	public void defender() {
		System.out.println("Yo defiendo");
	}

	public void vigilar() {
		System.out.println("Yo vigilo");
	}

	public void investigar() {
		System.out.println("Yo investigo");
	}

	public void marcarCaminos() {
		System.out.println("Yo marco el camino");
	}

	public void informar() {
		System.out.println("Yo informo");
	}

	public void cuidarCrias() {
		System.out.println("Yo cuido las crias");
	}

	public void operacion() {
		System.out.println("Yo trabajo");
	}

}
