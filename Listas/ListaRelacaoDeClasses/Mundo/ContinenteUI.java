package Listas.ListaRelacaoDeClasses.Mundo;

import java.util.ArrayList;
import java.util.Scanner;

public class ContinenteUI {
    private Continente continente;
    public ContinenteUI(){
        continente = new Continente();
    }
    public void menu(){
        do{
           System.out.println("1-Criar pais");
        System.out.println("2-Remover pais");
        System.out.println("3-Listar paises ");
        System.out.println("4-Pais com maior população");
        System.out.println("5-Pais com menor população");
        System.out.println("6- Soma da area de todos os paises");
        System.out.println("7- Soma da população de todos os paises");
        System.out.println("8- Densidade demografica total do 'contintente' "); 
        System.out.println("Digite outro numero para sair do menu");
        Scanner scan = new Scanner(System.in);
        int opcao = scan.nextInt();
        switch ( opcao) {
            case 1:{
                telaAddPais(scan);
                break;
            }
            case 2:{
                System.out.println("digite o nome do pais que deseja excluir");
                String nome = scan.next();
                telaRemovePais(nome);
                break;
            }
            case 3:{
                System.out.println(telaListarPaises());
                break;
            }
            case 4:{
                System.out.println(telaMaiorPopulacao());
                break;
            }
            case 5:{
                System.out.println(telaMenorPopulacao());
                break;
            }
            case 6:{
                System.out.println(telaSomaArea());
                break;
            }
            case 7:{
                System.out.println(telaSomaPopuulacao());
                break;
            }
            case 8:{
                System.out.println(telaDensidadeTotal());
                break;
            }
                
                
            default:
            System.out.println("Saindo do sistema");
            System.exit(0);
            scan.close();
                break;
        }
        }while(true);
        

    }
    public void telaAddPais(Scanner scan){
        System.out.println("Digite o nome no pais");
        String nome = scan.next();
        System.out.println("Digite a população");
        double populacao = scan.nextDouble();
        System.out.println("Digite a area");
        double area = scan.nextDouble();
        Pais p = new Pais(nome);
        p.setDimensao(area);
        p.setPopulacao(populacao);
        if( continente.buscarPais(nome) == null){
            continente.addPais(p);
            System.out.println(p.getNome() + " Adicionado ao continente");
            System.out.println("Voltanto ao menu");
        }else{
            System.out.println("Pais já existia");
        }
    }
    public void telaRemovePais(String nome){
        continente.removePais(nome);
        System.out.println( nome + " removido");
    }
    public ArrayList<Pais> telaListarPaises(){
        return continente.listarPaises();
    }
    public Pais telaMaiorPopulacao(){
        return continente.maiorPopulacao();
    }
    public Pais telaMenorPopulacao(){
        return continente.menorPopulacao();
    }
    public double telaSomaArea(){
        return continente.dimensaoTotal();
    }
    public double telaSomaPopuulacao(){
        return continente.populacaoTotal();
    }
    public double telaDensidadeTotal(){
        return continente.dimensaoTotal();
    }
}
