package implementacao;

import beans.Produto;
import util.Input;


public class ExecutarProduto3 {
	
	public static void main(String[] args) {

		
		Produto p1 = new Produto();
		
		p1.setMarca(Input.texto("Informe a Marca"));
		p1.setNome(Input.texto("Informe a Nome/Descri��o"));
		p1.setValor(Input.decimal("Informe o Valor"));
		p1.setPromocao(Input.logico("Esta em promo��o?"));
		System.out.println(p1.detalhe());
	}	
 
}