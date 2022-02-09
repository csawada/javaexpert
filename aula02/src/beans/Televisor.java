package beans;

public class Televisor {
// atributos

	private short canal;
	private short volume = 0;
	private boolean ligado;

	public Short getCanal() {
		return canal;
	}

	public void setCanal(Short canal) {
		this.canal = canal;
	}

	public Short getVolume() {
		return volume;
	}

	public void setVolume(short volume) {
		if (this.volume >0 && this.volume <10)
		this.volume = volume;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	// Metodos

	public void ligar() {
		this.ligado = true;
	}

	public void desligar() {
		this.ligado = false;
	}

	public void aumentarVolume() {
		if (this.volume < 10) {
		this.volume = (short) (this.volume + 1);
		} else {
		System.out.println("+++");
		}
	};

	public void diminuirVolume( ) {
		setVolume((short) (getVolume() - 1 ));
		System.out.println("Volume --");
	};

	public void mostrarStaus() {
		System.out.println("Canal: " + this.canal + "/ Vol : " + this.volume + "/ Ligado: " + this.ligado);
	};

	public void aumentarCanal() {
		System.out.println("Aumentar Canal: " + this.canal);
	};

	public void diminuirCanal() {
		System.out.println("Dimunir Canal: " + this.canal);
	};
}