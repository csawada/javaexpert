package implementacao;

import beans.Televisor;

public class ExecutarTV {

	public static void main(String[] args) {
		Televisor sansung = new Televisor ( );
		
		sansung.setLigado(true);
		
		System.out.println("A TV está ligada ? " +  sansung.isLigado());
		System.out.println("A TV está ligada ? " +  sansung.isLigado());
		
		sansung.aumentarVolume();
		sansung.mostrarStaus();
		sansung.diminuirCanal();
		sansung.diminuirCanal();
		sansung.mostrarStaus();
		sansung.aumentarVolume();
		sansung.aumentarVolume();
		sansung.aumentarVolume();
		sansung.aumentarVolume();
		sansung.aumentarVolume();
		sansung.aumentarVolume();
		sansung.mostrarStaus();
		sansung.diminuirCanal();
		sansung.diminuirCanal();
		sansung.mostrarStaus();
		
	}

}
