package implementacao;

import beans.Produto;

public class ExecutarProduto {

	public static void main(String[] args) {
			
		Produto p1 = new  Produto( );
		
		p1.setNome("Notebook 14\n");
		p1.setValor(10000.05f);
		System.out.println(p1.detalhe());
		
		Produto p2 = new Produto("Impressora HP",100);
		
		System.out.println(p2.detalhe());
		System.out.println(p2.getMarca());
		
		Produto p3 = new Produto ("LG TV", "LG", 5000f , true );
		System.out.println("p3 - " + p3.detalhe());
		
		
	}

}
