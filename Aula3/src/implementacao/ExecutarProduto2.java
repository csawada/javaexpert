package implementacao;

import javax.swing.JOptionPane;

import beans.Produto;

public class ExecutarProduto2 {

	public static void main(String[] args) {

		Produto impressora = new Produto();

		String texto;
		texto = JOptionPane.showInputDialog("Marca");
		impressora.setMarca(texto);

		texto = JOptionPane.showInputDialog("Descri��o");
		impressora.setNome(texto);
		
		texto = JOptionPane.showInputDialog("Informe seu valor");
		impressora.setValor(Float.parseFloat(texto));

		int resp =  JOptionPane.showConfirmDialog(null, "Promo��o? " , "Informe" , 
				JOptionPane.YES_NO_OPTION);
		 if ( resp == 0) {
			 impressora.setPromocao(true);
		 }else {
			 impressora.setPromocao(false);
		 }
		 
		System.out.println(impressora.detalhe());

	//Usando Construtor 
		
		Produto note = new Produto (JOptionPane.showInputDialog("Descri��o:"),
								JOptionPane.showInputDialog("Marca") , 
								Float.parseFloat(JOptionPane.showInputDialog("Informe o valor?")),
								Boolean.parseBoolean(JOptionPane.showInputDialog(null , "Promo��o?")));
				
		System.out.println("Note - " + note.detalhe());
			
	
		
	}

}
