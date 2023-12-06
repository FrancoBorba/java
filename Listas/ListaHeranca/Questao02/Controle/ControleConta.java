package Listas.ListaHeranca.Questao02.Controle;

import java.util.ArrayList;

import Listas.ListaHeranca.Questao02.Modelo.Cliente;
import Listas.ListaHeranca.Questao02.Modelo.Conta;
import Listas.ListaHeranca.Questao02.Modelo.ContaCorrente;
import Listas.ListaHeranca.Questao02.Modelo.ContaPoupanca;

public class ControleConta {
    private ArrayList<Conta> contas = new ArrayList<>();

    public Conta pesquisarConta(int numeroConta){
        for( Conta c: contas){
            if( c.getNumeroConta() == numeroConta){
                return c;
            }
        }
    return null;
    }
    public void cadastrarContaCorrente(Cliente c){
       contas.add(new ContaCorrente(c));
    }
    public void cadastrarContaPoupanca(Cliente c){
        contas.add(new ContaPoupanca(c));
    }
    public String mostrarHistorico(int num){
        Conta c = pesquisarConta(num);
        return c.mostrarHistorico();
    }
    public String imprimirContas (){
        String resultado="";
        for (int i=0; i<contas.size(); i++){
        resultado += contas.get(i).toString() + "\n--------\n";
        }
        return resultado;
    }
    public void depositarSaldo( int num , double saldo){
        Conta c = pesquisarConta(num);
        c.depositarSaldo(saldo);
    }
    public boolean sacar (int num, double valor){
        Conta c = pesquisarConta(num);
        return c.sacarSaldo(valor);
    }
    public double consultarSaldo (int num){
        Conta c = pesquisarConta(num);
        return c.consultarSaldo();
    }
    //public int mostrarNumeroConta(Conta c){
    //   return c.getNumeroConta();
   //  }
}
