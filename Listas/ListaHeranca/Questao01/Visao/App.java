package Listas.ListaHeranca.Questao01.Visao;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Listas.ListaHeranca.Questao01.Modelo.Produto;
import Listas.ListaHeranca.Questao01.Controle.ControleProduto;
import Listas.ListaHeranca.Questao01.Modelo.Livro;
import Listas.ListaHeranca.Questao01.Modelo.LivroDidadico;




public class App {
    public static void main(String[] args) {
        ControleProduto cp = new ControleProduto();
        Scanner scan = new Scanner(System.in);
      int op =1;
        while (op != 0) {
          System.out.println(menu());
          op = scan.nextInt();
       
        
            switch (op) {
                case 1:{
                    System.out.println("Qual é o produto? \n 1-Livro \n 2-Livro Didatico");
                    int op1 = scan.nextInt();
                    if(op1 == 1){
                        System.out.println("Nome do livro");
                        String nome = scan.next();
                        System.out.println("Digite o autor");
                        String autor = scan.next();
                        System.out.println("Digite o preço");
                        double preco = scan.nextDouble();
                        System.out.println("Digite quantas paginas tem  ");
                        int paginas = scan.nextInt();
                        cp.cadastrarProdutos(nome, preco, paginas, autor);
                    }else{
                          System.out.println("Nome do livro");
                        String nome = scan.next();
                        System.out.println("Digite o autor");
                        String autor = scan.next();
                        System.out.println("Digite o preço");
                        double preco = scan.nextDouble();
                        System.out.println("Digite quantas paginas tem  ");
                        int paginas = scan.nextInt();
                        System.out.println("Digite a disciplina ");
                        String disciplina = scan.next();
                        cp.cadastrarProdutos(nome, preco, paginas, autor, disciplina);
                    }
                    break; 
                }
                case 2:{
                    System.out.println("Digite o codigo do produto");
                    int codigo = scan.nextInt();
                    System.out.println(cp.imprimirProduto(codigo));
                    break;
                }
                case 3:{
                    System.out.println("Digite o codigo do produto");
                      int codigo = scan.nextInt();
                    if(cp.produtoEhCaro(codigo)){
                        System.out.println("produtto caro");
                    }
                    else{
                        System.out.println("produto barato");
                    }
                    break;
                }
                    
                   
            
                default:
                    break;
            }
            
        }
        
        
       
    }
    public static String menu(){
        return "Digite:\n" +
        "1 - Cadastrar produto \n" +
        "2 - Imprimir produto \n"+
        "3 - Eh caro? \n"+
        "0 - para sair";
        }
}
