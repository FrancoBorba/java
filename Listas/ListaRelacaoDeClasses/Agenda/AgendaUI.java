package Listas.ListaRelacaoDeClasses.Agenda;

import java.util.Scanner;

public class AgendaUI {
	
	private Agenda agenda;
	
	public AgendaUI() {
		agenda = new Agenda();
	}
	
     public void exibirMenu()
	{
		do {
		System.out.println("1 - Incluir contato");
		System.out.println("2 - Excluir contato");
		System.out.println("3 - Pesquisar contato");
		System.out.println("4 - Listar contatos");
		System.out.println("5 - Sair do sistema");
		Scanner entrada = new Scanner(System.in);
		int opcao = entrada.nextInt();
		if (opcao == 1)
			telaIncluirContato();
		if(opcao == 2){
			System.out.println("Digite o cpf do contato que sera removido");
			String cpf;
			cpf = entrada.next();
			telaExcluirContato(cpf);
		}
		if(opcao == 3){
			System.out.println("Digite o cpf que deseja procurar");
			String cpf;
			cpf = entrada.next();
			telaPesquisarContato(cpf);
		}
		if(opcao == 4)
			telaListarContatos();
			
		if (opcao == 5)
		{
			entrada.close();
			System.exit(0);
			
		}
		}while(true);
		
	}
    public void telaIncluirContato() {
        Scanner entrada = new Scanner(System.in);
    
    	System.out.print("\nDigite o cpf: ");
        String cpf = entrada.next();
    	System.out.print("Digite o nome: ");
        String nome = entrada.next();
    	System.out.print("Digite o telefone: ");
        String telefone = entrada.next();
    	System.out.print("Digite o email: ");
        String email = entrada.next();


    	Contato c = new Contato(cpf,nome,telefone,email);
        if(agenda.incluirContato(c)){
            System.out.println("\nContato adicionado com sucesso, voltando ao menu...");
        }else{
            System.out.println("\nErro ao adicinar contato, já existe um contato com esse cpf, voltando ao menu...");
        }
    }
	public void telaExcluirContato(String cpf){
		System.out.println("Contato removido " + agenda.pesquisarContato(cpf));
		agenda.contatos.remove(agenda.pesquisarContato(cpf));
	}
	public void telaPesquisarContato(String cpf){
		
		System.out.println(agenda.pesquisarContato(cpf));
	}
	public void telaListarContatos(){

		if(agenda.listarContatos().isEmpty()){
			System.out.println("Agenda vazia");
		} else{
			for(Contato c : agenda.listarContatos()){
				System.out.println(c);
			}
		}
	}
}	