package Listas.ListaRelacaoDeClasses.Universidade;
import java.util.Scanner;
public class UniversidadeUI {
    private Universidade universidade;

    public UniversidadeUI(){
        universidade = new Universidade();
    }
    public void exibirMenu(){
        

        do{
         
        System.out.println("1-Criar departamento");
        System.out.println("2-Excluir departamento");
        System.out.println("3-Listar departamentos");
        System.out.println("4- Sair do menu");
        Scanner scan = new Scanner(System.in);
        int opcao = scan.nextInt();

            switch (opcao) {
                case 1:{
                    telaCriarDepartamento();
                    break;          
                }
                    
                case 2: {
                    System.out.println("Digite o codigo(id) do departamento ");
                    String id = scan.next();
                    telaExcluirDepartamento(id);
                    
                    break;
                }
                case 3:{
                    telaListarDepartamentos();
                    break;
                }
                case 4:{
                    scan.close();
                    System.exit(0);
                }
                default:
                    break;
            }

        }while(true);

    }
    public void telaCriarDepartamento(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite o id do departamento");
            String id = scan.next();
            System.out.println("Digite o nome do departamento");
            String nome = scan.next();
            Departamento d1 = new Departamento(nome, id); 
            // Não pode ter um scan.close() aq pq da erro     

            if(universidade.criarDepartamento(d1)){
              System.out.println("Departamento criado");
            }
            else{
              System.out.println("Departamento já existia");
            }

        }
    public void telaExcluirDepartamento(String id){
        System.out.println(universidade.procurarDepartamento(id) + " excluido");
        universidade.excluirDepartamento(id);
    }
    public void telaListarDepartamentos(){
       System.out.println(universidade.listarDepartamentos());
    }
}
