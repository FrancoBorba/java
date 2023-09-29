package Listas.Lista5ClassesObejtos.ex002;

import java.util.Scanner;

//Crie uma classe chamada Livro com os atributos título, autor e número de páginas. Adicione um construtor e métodos getters e setters para todos os atributos. Crie 5 objetos do tipo Livro e teste os métodos criados.
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String autor , titulo;
        int paginas;
        Livro l1 = new Livro("A roda dos ventos", "Jeremias ", 548);
        Livro l2 = new Livro();
        System.out.println("Digite seu nome");
        autor = scan.nextLine();
        System.out.println("Digite o nome do seu lirvo");
        titulo = scan.nextLine();
        System.out.println("Quantas paginas tem seu livro");
        paginas = scan.nextInt();
        l2.setAutor(autor);
        l2.setTitulo(titulo);
        l2.setNumeroPag(paginas);
        System.out.println(l1);
        System.out.println(l2);
        scan.close();

    }
}
