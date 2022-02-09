package beans;

public class Pessoa {
	// Atributos - private usar o setters
	
	private int id;
	private String nome;
	private int idade;
	private String sentimento;
	private String cidade;
	
	// setters
	public void setNome(String nomeParametro) {
		this.nome =  	nomeParametro;
	}
	public void setIdade(int valor) {
		if ( valor < 0) {
			this.idade = 0;
			}else {
		this.idade = valor;
			}
	}
	
	//getter
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	//Metodos + opera��es
	public void comer( String alimento ) {
		System.out.println("Matanto a Fome!!!" + alimento);
	}
	
	public void dormir(int tempo ) {
		System.out.println("Tempo para descansar " + tempo);
		
	}
}
