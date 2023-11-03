package Listas.ListaRelacaoDeClasses.Universidade;
import java.util.Scanner;
public class UniversidadeUI {
    private Universidade universidade;

    public UniversidadeUI(){
        universidade = new Universidade();
    }
    public void exibirMenu(){
        Scanner scan = new Scanner(System.in);

        do{
         
        System.out.println("1-Criar departamento");
        System.out.println("2-Excluir departamento");
        System.out.println("3- Sair do menu");
        int opcao = scan.nextInt();


            switch (opcao) {
                case 1:{
                    System.out.println("Departamento criado!");
                    System.out.println("Deseja acessar o departamento?");
                    System.out.println("1-Sim");
                    System.out.println("2-Não");
                    opcao = scan.nextInt();
                    if(opcao == 1){
                        
                    }
                    break;
                }
                    
                case 2: {
                    System.out.println("Departamento excluido");
                    break;
                }
                case 3:{
                    scan.close();
                    System.exit(0);
                }
                default:
                    break;
            }



        }while(true);

       
    }
}
