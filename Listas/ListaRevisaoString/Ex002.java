package Listas.ListaRevisaoString;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String frase;
        System.out.println("Digite uma palavra");
        frase = scan.nextLine();

        for( int i = frase.length(); i > 0 ; i--){
            System.out.printf("%c",frase.charAt(i-1));
        }
        scan.close();
    }
}
