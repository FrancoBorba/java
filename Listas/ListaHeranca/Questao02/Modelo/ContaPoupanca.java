package Listas.ListaHeranca.Questao02.Modelo;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(){
        super();
    }
    public ContaPoupanca(Cliente C){
        super(C);
    }
    public ContaPoupanca(Cliente C , double Saldo){
        super(C, Saldo);
    }
    public String getTipo(){
        return "Conta poupança";
    }
}
