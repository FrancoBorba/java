package Listas.Lista5ClassesObejtos.ex007;

public class ContaBancaria {
    private int numeroConta;
    private int saldo;
   
    public ContaBancaria( int numeroConta , int saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    } 
    public int getNumeroConta() {
        return numeroConta;
    }
  
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public void depositar(int deposito){
        saldo = saldo + deposito;
    }
    public void sacar( int sacar){
       if( sacar > saldo){
        saldo = 0;
       }else{
        saldo = saldo - sacar;
       }

    }
    public void transeferir( ContaBancaria c , int transeferir){
        saldo = saldo - transeferir;
        c.saldo = c.saldo + transeferir;
    }
    @Override
    public String toString(){
        return " A conta bancaria " + numeroConta + " possui " + saldo + " em conta \n ";
    }
   
}
