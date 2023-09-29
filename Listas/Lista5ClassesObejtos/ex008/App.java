package Listas.Lista5ClassesObejtos.ex008;
//Crie uma classe chamada Retângulo com os atributos comprimento e largura. Adicione um construtor e um método para calcular a área do retângulo. Crie 3 objetos e teste os métodos.

public class App {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo( 5,5);
        Retangulo r2 = new Retangulo(4, 5);
        System.out.println(" A area do r1 = " + r1.area());
          System.out.println(" A area do r2 = " + r2.area());
    }
}
