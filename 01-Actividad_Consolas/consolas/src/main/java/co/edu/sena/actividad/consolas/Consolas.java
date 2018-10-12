package co.edu.sena.actividad.consolas;

public abstract class Consolas {
	private int controles;
	private String conectorSonido;
	private String conectorVideo;

	public Consolas(int controles, String conectorSonido, String conectrorVideo) {
		this.controles = controles;
		this.conectorSonido = conectorSonido;
		this.conectorVideo = conectrorVideo;

	}

	public int getControles() {
		return controles;
	}

	public void setControles(int controles) {
		this.controles = controles;
	}

	public String getConectorSonido() {
		return conectorSonido;
	}

	public void setConectorSonido(String conectorSonido) {
		this.conectorSonido = conectorSonido;
	}

	public String getConectorVideo() {
		return conectorVideo;
	}

	public void setConectorVideo(String conectorVideo) {
		this.conectorVideo = conectorVideo;
	}

}
