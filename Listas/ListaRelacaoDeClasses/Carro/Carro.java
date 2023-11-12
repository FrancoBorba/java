package Listas.ListaRelacaoDeClasses.Carro;

public class Carro {
    private Pneu pneu;
    private Motor motor;
    private Banco banco;

    public Carro( Pneu pneu , Motor motor , Banco banco){
        this.pneu = pneu;
        this.motor = motor;
        this.banco = banco;
    }
    public Carro(){};
    public double precoCarro(){
        double precoCarro = 0.0;
       precoCarro = (4*pneu.getPreco()) + motor.getPreco() + 5*banco.getPreco();
       return precoCarro;
    }
 
}
