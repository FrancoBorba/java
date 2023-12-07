package Listas.ListaHeranca.Questao3;

import java.util.Scanner;

import Listas.ListaHeranca.Questao3.Controle.CadastrarPessoas;
import Listas.ListaHeranca.Questao3.Modelo.Cliente;
import Listas.ListaHeranca.Questao3.Modelo.Data;
import Listas.ListaHeranca.Questao3.Modelo.Funcionario;
import Listas.ListaHeranca.Questao3.Modelo.Gerente;

public class TesteCadastro {
    public static void main(String[] args) {
        int op =0;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite quantas pessoas vão ser cadastradas");
        int quantidadePessoas = scan.nextInt();
        CadastrarPessoas cp = new CadastrarPessoas(quantidadePessoas);
        do{
           menuFuncionarios();
           op = scan.nextInt();
           switch (op) {
            case 1:
                System.out.println("Digite seu nome");
                String nome = scan.next();
                System.out.println("Digite a data de nascimento na ordem dia , mes e ano");
                int dia = scan.nextInt();
                int mes = scan.nextInt();
                int ano = scan.nextInt();
                Data nascimento = new Data(dia, mes, ano);
                System.out.println("Digite seu salario");
                double salario = scan.nextDouble();
                Funcionario f1 = new Funcionario(nome, nascimento, salario);
                cp.cadastrarPessoas(f1);
                
                break;
            case 2:
                System.out.println("Digite seu nome");
                nome = scan.next();
                System.out.println("Digite a data de nascimento na ordem dia , mes e ano");
                 dia = scan.nextInt();
                 mes = scan.nextInt();
                 ano = scan.nextInt();
                 nascimento = new Data(dia, mes, ano);
                System.out.println("Digite seu salario");
                 salario = scan.nextDouble();
                 Gerente g1 = new Gerente(nome, nascimento, salario, nome);
                cp.cadastrarPessoas(g1);
                break;
            case 3:{
                cp.imprimeCadastro();
            }
            default:
                break;
           }

        }while(op != 4);
    }
    public static void menuFuncionarios(){
        System.out.println("1-cadastrar funcionario");
        System.out.println("2-Cadastrar gerente");
        System.out.println("3- Imprimir Dados");
        System.out.println("4- Sair");
    }
}
