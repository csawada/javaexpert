package implementacao;

import beans.ContaBancaria;
import util.Input;

public class ExecutarConta {

	public static void main(String[] args) {

		ContaBancaria cc = new ContaBancaria(Input.texto("Informe Numero:"), Input.texto("Cliente:"),
				Input.decimal("Qual o valor de Limite?"), Input.texto("Informe tipo 'corrrente' ou 'poupança'"));

		cc.extrato();

		System.out.println(cc.deposito(Input.decimal("Valor do deposito:")));
		System.out.println(cc.saque(Input.decimal("Valor de Saque:")));
		System.out.println(cc.saque(Input.decimal("Valor de Saque:")));

	}

}