package implementacao;

import beans.ContaCorrente;

public class ExecutarConta {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente ( );
		
		cc.deposito(100);
		cc.deposito(100);
		cc.deposito(1000);
		 System.out.println("O saldo é : " + cc.getSaldo());

	}

}
