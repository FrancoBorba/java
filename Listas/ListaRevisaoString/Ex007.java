package Listas.ListaRevisaoString;

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = "",s2 ="";
        int p1,p2;
        System.out.println("Digite uma string");
        s1 = scan.nextLine();
        System.out.println("Digite a sub-frase que deseja indicando o numero da posição");
        p1 = scan.nextInt();
        p2 = scan.nextInt();
        s2 = s1.substring(p1-1, p2);
        for( int i = s2.length(); i > 0 ; i--){
            System.out.printf("%c",s2.charAt(i-1));
        }
        scan.close();
        
    }
}
