package Listas.ListaRelacaoDeClasses.Agenda;

import java.util.Scanner;

public class AgendaUI {
	
	private Agenda agenda;
	
	public AgendaUI() {
		agenda = new Agenda();
	}
	
    /* public void exibirMenu()
	{
		System.out.println("1 - Incluir contato");
		System.out.println("2 - Excluir contato");
		System.out.println("3 - Pesquisar contato");
		System.out.println("4 - Listar contatos");
		System.out.println("5 - Sair do sistema");
		Scanner entrada = new Scanner(System.in);
		int opcao = entrada.nextInt();
		if (opcao == 1)
			telaIncluirContato();
		if (opcao == 5)
		{
			entrada.close();
			System.exit(0);
			
		}
	}
    public void telaIncluirContato() {
    	System.out.println("Digite o cpf:");
    	String cpf = 
    	Contato c = new Contato(cpf,nome,telefone,email);
    	agenda.incluirContato(c);
    }
}*/	