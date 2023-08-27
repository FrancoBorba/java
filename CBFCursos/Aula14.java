package CBFCursos;

import CBFCursos.Classes.Carro;
import CBFCursos.Classes.CarroCombate;

// aula sobre heranças em java
public class Aula14 {
    public static void main(String[] args) {
        Carro c1= new Carro("Ferrari");
        Carro c2 = new Carro("celta");
        CarroCombate c3 = new CarroCombate("Rover", 100);
        CarroCombate c4 = new CarroCombate("Putin", 50);

        c3.atirar();
        c3.atirar();
        c3.atirar();
        c1.sofrerDano(5);
        c4.sofrerDano(30);
        c1.info();
        c2.info();
        c3.info();
        c4.info();
    }
}
