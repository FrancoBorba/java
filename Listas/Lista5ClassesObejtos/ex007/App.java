package Listas.Lista5ClassesObejtos.ex007;
//Crie uma classe chamada ContaBancaria com os atributos número da conta e saldo. Implemente construtores para inicializar esses atributos e métodos para depositar, sacar e verificar o saldo. Crie 5 objetos e teste os métodos.
public class App {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria(111, 1000);
        ContaBancaria c2 = new ContaBancaria(222, 50000);

        c1.depositar(5000);
        c2.sacar(10000);
        System.out.println(c1);
        System.out.println(c2);       
        c1.transeferir(c2, 4000);
        System.out.println(c1);
        System.out.println(c2);   
        
    }
}
