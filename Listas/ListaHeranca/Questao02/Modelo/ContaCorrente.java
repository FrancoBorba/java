package Listas.ListaHeranca.Questao02.Modelo;

public class ContaCorrente extends Conta{
    public ContaCorrente(){
        super();
    }
    public ContaCorrente(Cliente C){
        super(C);
    }
    public ContaCorrente(Cliente C , double Saldo){
        super(C, Saldo);
    }
    
}
