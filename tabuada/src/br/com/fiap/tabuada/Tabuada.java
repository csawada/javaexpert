package br.com.fiap.tabuada;

public class Tabuada {

	public void executarTabuada(int multiplicando, int multiplicador) {
		int cont = 0;
		int produto = 0;
		
		while (cont < multiplicador) {
			produto = multiplicando * cont;
			
			System.out.println(multiplicando + "X" + cont + "=" + produto);
			
			//cont = cont + 1 ;
	         //cont = cont +3;
			cont +=3; // pega o que tem no cont acrescenta + 3
			// cont = -- 
			//cont++; // Acrescentar 1 a cada volta
		}
	}
	
}
