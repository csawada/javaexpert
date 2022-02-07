package beans;

import java.util.Date;

public class AgendaRevisao {
	// atributo (propriedades)
	public String nomeCliente;
	public String modelo;
	public String veiculo;
	public Date hora;
	public Date data; 
	
	//Metodos (Operações)
	public void agendar ( ) {
		System.out.println("Executar o agendamento");
	};
	
	public void cancelarAgenda( ) {
		System.out.println("Cliente " + this.nomeCliente + " foi cancelado");
	}
	
}
