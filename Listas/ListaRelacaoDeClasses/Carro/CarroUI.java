package Listas.ListaRelacaoDeClasses.Carro;

import java.util.Scanner;

public class CarroUI {
    private Carro carro;

    public CarroUI(){
         Carro carro = new Carro();
    }
    public void menu(){
        
        do{
        System.out.println("1- Criar carro");
        Scanner scan = new Scanner(System.in);
        int opcao = scan.nextInt();
        switch (opcao) {
            case 1: {
                System.out.println("1- Adicionar motor");
                System.out.println("2- Adicionar pneus");
                System.out.println("3- Adicionar bancos");
                System.out.println("4- Exibir valor total do carro");
                System.out.println("5- Sair do menu");
                int opcao2 = scan.nextInt();
                switch (opcao2) {
                    case 1:
                        
                        break;
                
                    default:
                        break;
                }
                break;
            }
                
                
        
            default:
                break;
        }
        }while(true);
    }
    public void addMotor(){
        
    }

}
