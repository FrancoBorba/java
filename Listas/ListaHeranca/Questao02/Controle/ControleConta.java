package Listas.ListaHeranca.Questao02.Controle;

import java.util.ArrayList;

import Listas.ListaHeranca.Questao02.Modelo.Cliente;
import Listas.ListaHeranca.Questao02.Modelo.Conta;

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
    public void cadastrarConta(Cliente c){
       contas.add(new Conta(c));
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
}
