package Listas.ListaRelacaoDeClasses.Carro;

public class App {
    public static void main(String[] args) {
        Motor m1 = new Motor();
        m1.setFabricante("Ferrari");
        m1.setPotencia(100);
        m1.setPreco(1000000);
       // System.out.println(m1);
        Pneu p1 = new Pneu("pirelli", "soft", 20000);
       // System.out.println(p1);
        Banco b1 = new Banco("ferrari", "urus", 15000);
       // System.out.println(b1);
        Carro ferrari = new Carro(p1, m1, b1);
        System.out.println("Preço do carro:" + ferrari.precoCarro());

    }
}
