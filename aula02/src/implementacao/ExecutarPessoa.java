package implementacao;

import java.security.PublicKey;

import beans.Pessoa;

public class ExecutarPessoa {

	public static void main(String[] args) {
		System.out.println("FUNCIONA");
		
		Pessoa cliente1 = new Pessoa( );
		
		//cliente1.nome = "Claudia Sawada";
		//cliente1.idade =  - 43;
		cliente1.setNome("Luciana");
		cliente1.setIdade (-40);
		System.out.println("Cliente: " + cliente1.getNome());
		System.out.println("Idade: " + cliente1.getIdade());
		
		/** cliente1.comer("BigMac");
		cliente1.dormir(5);
	
		System.out.println("Cliente: " + cliente1.nome);
		System.out.println("Idade: " + cliente1.idade); **/
	}

}
