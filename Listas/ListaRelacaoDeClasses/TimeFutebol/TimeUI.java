package Listas.ListaRelacaoDeClasses.TimeFutebol;


import java.util.Scanner;

public class TimeUI {
    private Time time;

    public TimeUI() {
        time = new Time();
    }
    public void menu(){
        do{
        System.out.println("1-Adicionar Jogador");
        System.out.println("2- Remover jogador");
        System.out.println("3- Listar Jogadores");
        System.out.println("4- Pesquisar jogador");
        System.out.println("5- Sair do menu");
        Scanner scan = new Scanner(System.in);
        int opcao = scan.nextInt();
        switch (opcao) {
            case 1 :{
                telaAddJogador(scan);
                break;
            }
            case 2:{
                System.out.println("Digite o id do jogador que deseja remover");
                String id = scan.next();
            
                telaRemoverJogador(time.pesquisarJogador(id));
                break;
            }
            case 3:{
               telaListarJogadores();
                break;
            }
            case 4:{
                System.out.println("Digite o id do jogador que deseja buscar");
                String id = scan.next();
                telaPesquisarJogador(id);
                break;
            }
            default:
            System.out.println("Saindo do menu");
            scan.close();
            System.exit(0);
                break;
        }
        }while(true);
        
    }
    public void telaAddJogador(Scanner scan){
        System.out.println("Digite o nome do jogador");
        String nome = scan.next();
        System.out.println("Digite o numero da camisa");
        int num = scan.nextInt();
        System.out.println("Digite a posicao");
        String posicao = scan.next();
        System.out.println("Digite o seu ID");
        String id = scan.next();
        
        Jogador j = new Jogador(nome, posicao, num, id);
        if(time.pesquisarJogador(j.getId())== null){
            time.addJogador(j);
            System.out.println("Jogador adicionado , retornando ao menu");
        }else{
           System.out.println("jogador já exisite no time");
        }
        

    }
    public void telaPesquisarJogador( String id){
       System.out.println(time.pesquisarJogador(id));
    }
    public void telaRemoverJogador(Jogador j){
        time.removeJogador(j);
    }
    public void telaListarJogadores(){
       System.out.println(time.listarJogadores());
    }

   
}
