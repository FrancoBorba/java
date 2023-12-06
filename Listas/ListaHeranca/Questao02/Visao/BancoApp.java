package Listas.ListaHeranca.Questao02.Visao;

import java.util.Scanner;

import Listas.ListaHeranca.Questao02.Controle.ControleCliente;
import Listas.ListaHeranca.Questao02.Controle.ControleConta;

public class BancoApp {

     public static void main(String[] args) {
        ControleCliente cl = new ControleCliente();
        ControleConta cc = new ControleConta();
        Scanner scan = new Scanner(System.in);
        System.out.println("Já é cliente do banco do brasil");
        System.out.println("1- Sim \n2-Não");
        int opCliente = scan.nextInt();
        int opConta;
        if(opCliente == 2){
          System.out.println("Deseja se cadastrar no banco do brasil");
          System.out.println("1- Sim \n 2- Não");
          opCliente = scan.nextInt();
          if(opCliente == 1){
               System.out.println("Digite seu nome");
               String nomeCliente = scan.next();
               System.out.println("Digite seu cpf ");
               long cpfCLiente = scan.nextLong();
               cl.cadastrarCliente(nomeCliente, cpfCLiente);
               System.out.println("Cliente " + cl.mostrarCliente(cl.pesquisarCliente(cpfCLiente))+ "cadastrado");
          }
        }
        
          do{
          
          System.out.println(menu());
          opConta = scan.nextInt();
          switch (opConta) {
               case 1:
                    System.out.println("Digite seu cpf");
                    long cpfCLiente = scan.nextLong();
                    if(cl.pesquisarCliente(cpfCLiente) == null){
                         System.out.println("cliente não encontrado");
                         break;
                    }else{
                       System.out.println("Deseja criar: \n 1-Conta corrente \n 2-Conta poupança");
                       int opcConta = scan.nextInt();
                       if(opcConta == 1){
                         cc.cadastrarContaCorrente(cl.pesquisarCliente(cpfCLiente));
                         System.out.println("Conta Corrente criada");
                       }else{
                         cc.cadastrarContaPoupanca(cl.pesquisarCliente(cpfCLiente));
                         System.out.println("Conta Poupança criada");
                       }
                    
                  
                   
                    break;
                    }
               case 2:
                    System.out.println("Digite o numero da sua conta");
                    int numConta = scan.nextInt();
                    System.out.println("Digite o valor que deseja depositar");
                    double valor = scan.nextDouble();
                    cc.depositarSaldo(numConta, valor);
                    System.out.println("DEPOSITADO " + valor + "reais.");
                    // esse codigo ta uma merda pq eu não consigo acessar o numero da conta , e como na classe ControleConta ele foi utilizado como metodo de pesquisa fica subentendido que o usuario já sabe , não vou alterar pois o codigo da questão foi dado e estou sem tempo mas fica o aviso
                    break;
               case 3:{
                    System.out.println("Digite o numero da sua conta");
                    numConta = scan.nextInt();
                    System.out.println("Digite quanto deseja sacar");
                    double saque = scan.nextDouble();
                    cc.sacar(numConta, saque);
                    if(cc.sacar(numConta, saque)){
                         System.out.println("Sacou: " + saque);
                    }else{
                         System.out.println("Saque invalido");
                    }
                    break;
               }
               case 4:{
                    System.out.println("Digite o numero da sua conta");
                    numConta = scan.nextInt();
                   System.out.println( cc.consultarSaldo(numConta));
               }
               case 5:{
                   System.out.println("Digite o numero da sua conta");
                    numConta = scan.nextInt();
                  System.out.println(cc.mostrarHistorico(numConta));
               }
               case 6:{
                    System.out.println(cc.imprimirContas());
               }
               default:
                    break;
          }

          }while(opConta != 0 );
        
     }
     public static String menu(){
          return "Banco AP2\n\n" +
          "1-Criar Conta\n" +
          "2-Depositar Valor\n" +
          "3-Sacar Valor\n" +
          "4-Consultar Saldo\n" +
          "5-Mostrar Histórico\n" +
          "6-Imprimir Contas\n"+
          "0-Finalizar\n\n" +
          "Digite a opção desejada:";
          }
}