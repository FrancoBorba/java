package Listas.Lista5ClassesObejtos.ex010;
//Crie uma classe chamada Equação do segundo grau, métodos construtores, getters, setters e um método para resolver a equação do segundo grau. Crie 3 objetos e teste os métodos.
public class App {
    public static void main(String[] args) {
        Equacao equacao1 = new Equacao(1, 2, -8);
        System.out.println(equacao1.resolveEquacao());
    }
}
