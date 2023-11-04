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
                    telaAddProfessor();
                    break;
                }
                case 2:{
                    System.out.println("Digite o cpf do professor");
                    String cpf = scan.next();
                    telaRemoveProfessor(cpf);
                    break;
                }
                case 3:{
                    telaListarProfessores();
                    break;
                }
                case 4:{
                    System.out.println("Digite o cpf do professor que deseja encontrar");
                    String cpf = scan.next();
                    telaPesquisarProfessor(cpf);
                    break;
                }
                case 5:{
                    scan.close();
                    System.exit(0);
                }
                    
                default:{
                    System.out.println("Opção invalida");
                    break;
                }
                    
            }
        }while(true);


       
        
    }
            public void telaAddProfessor(){
              Scanner scan=  new Scanner(System.in);
                System.out.println("Digite o cpf");
                String cpf = scan.nextLine();
                System.out.println("Digite o nome");
                String nome = scan.nextLine();
                System.out.println("Digite a materia");
                String materia = scan.nextLine();
                System.out.println("Digite o departamento");
                String departamento = scan.nextLine();
                Professor p = new Professor(cpf,nome,materia,departamento);
                scan.close(); // pq esse scan não da erro?
                
               if(this.departamento.addProfessor(p)){
                System.out.println("\nProfessor adicionado");
               }
               else{
                System.out.println("\n Erro , Professor já existia no banco de dados");
               }      
        }
        public void telaRemoveProfessor(String cpf){
            if(departamento.pesquisarProfessor(cpf) == null){
                 System.out.println("Professor não encontrado no banco de dados");
            }
            else{ 
                 System.out.println( departamento.pesquisarProfessor(cpf) + " Removido");
                 departamento.deleteProfessor(cpf);
                
            }
            
        }
        public void telaListarProfessores(){
            System.out.println(departamento.listarProfessores());
        }
        public void telaPesquisarProfessor(String cpf){
           System.out.println( departamento.pesquisarProfessor(cpf));
        }
}
