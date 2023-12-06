package Listas.ListaHeranca.Questao02.Modelo;

import java.util.ArrayList;

public class Conta {
    private int numeroConta;
    private double saldo;
    private ArrayList<String> historico;
    private static int identificador = 0;
    private Cliente cliente;


        public Conta (){
        numeroConta = ++identificador;
        historico = new ArrayList<String>();
        }
        public Conta(Cliente cliente){
        numeroConta = ++identificador;
        this.cliente=cliente;
        this.saldo=0.0;
        historico = new ArrayList<String>();
        }
        public Conta (Cliente c, double saldo){
        numeroConta=++identificador;
        this.cliente = c;
        this.saldo = saldo;
        historico = new ArrayList<String>();
        }
        public int getNumeroConta() {
            return numeroConta;
            }
        public Cliente getCliente() {
            return cliente;
            }
        public void setCliente(Cliente c){
            this.cliente = c;
            }
        public double getSaldo() {
            return saldo;
            }
        public void setSaldo(double saldo) {
            this.saldo = saldo;
            }
        public void depositarSaldo(double deposito){
            if(saldo > 0)
            saldo = saldo + deposito;
            historico.add("Depositou: " + deposito);
        }
        public boolean sacarSaldo( double saque){
            
            if((saldo >= saque) && (saque > 0) ){
                saldo = saldo - saque;
                historico.add("Depositou R$ "+ saque);
                return true;
            }
        return false;
        }
        public double consultarSaldo() {
            return getSaldo();
            }
        
        public String mostrarHistorico(){
            String s = "";
            for(int i=0; i < historico.size(); i++)
            s = s + historico.get(i) + "\n";
            return s;
            }
}
