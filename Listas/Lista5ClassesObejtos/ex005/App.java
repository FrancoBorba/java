package Listas.Lista5ClassesObejtos.ex005;
//Crie uma classe chamada Triângulo com os atributos base e altura. Adicione um construtor e um método para calcular a área do triângulo. Crie 3 objetos e teste os métodos.

public class App {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(10, 5);
        Triangulo t2 = new Triangulo(5, 3);
        Triangulo t3 = new Triangulo(3,8);

        System.out.println(" A area do triangulo 1 foi "+ t1.areaTotal());
        System.out.println(" A area do triangulo 2 foi "+ t2.areaTotal());
        System.out.println(" A area do triangulo 3 foi "+ t3.areaTotal());

        t1.setAltura(10);
        t2.setBase(9);
        t3.setBase(8);
          System.out.println(" A area do triangulo 1 foi "+ t1.areaTotal());
        System.out.println(" A area do triangulo 2 foi "+ t2.areaTotal());
        System.out.println(" A area do triangulo 3 foi "+ t3.areaTotal());
    }
}
