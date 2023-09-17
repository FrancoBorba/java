package Listas.ListaRevisaoString;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma frase");
        String frase;
        frase = scan.nextLine();

        System.out.printf("A string possui %d caracteres",frase.length());
        scan.close();


    }
}
