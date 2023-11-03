package Listas.ListaRelacaoDeClasses.Universidade;

import java.util.Scanner;

public class DepartamentoUI {
    private Departamento departamento;

    public DepartamentoUI(){
        departamento = new Departamento();

    }
    public void exibirMenu(){
        do{
            System.out.println(" 1-Adicionar professor");
            System.out.println("2- Deletar professor");
            System.out.println("3- Listar professores");
            System.out.println("4- Pesquisar professor");
            System.out.println("5- Sair do sistema");
            Scanner scan = new Scanner(System.in);
            int opcao = scan.nextInt();
            switch (opcao) {
                case 1:{
                    

                    break;
                }
                    
                    
            
                default:
                    break;
            }
        }while(true);


       
        
    }
            public void telaAddProfessor(){
              Scanner scan=  new Scanner(System.in);
                System.out.println("Digite o cpf\n");
                String cpf = scan.nextLine();
                System.out.println("Digite o nome\n");
                String nome = scan.nextLine();
                System.out.println("Digite a materia\n");
                String materia = scan.nextLine();
                System.out.println("Digite o departamento\n");
                String departamento = scan.nextLine();
                Professor p = new Professor(cpf,nome,materia,departamento);
                
               if(){
                System.out.println("\nProfessor adicionado");
               }
               else{
                System.out.println("\n Erro , Professor já existia no banco de dados");
               }
                
                
        }
}
