package Listas.ListaRelacaoDeClasses.Carro;



public class App {
    public static void main(String[] args) {
       Motor m1 = new Motor("Ferrari", 2000000, 420);
       Banco b1 = new Banco("Ferrari", "confortavel", 15000);
       Pneu p1 = new Pneu("Pirelli", "soft", 20000);

       Carro c1 = new Carro(p1, m1, b1);
       System.out.println(c1.precoCarro());
       

    }
}
