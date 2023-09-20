package Listas.ListaRevisaoString;

import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome ="" , nomeSeparado="";
        char primeiraLetra;
        System.out.println("Digite seu nome e sobrenome");
        nome = scan.nextLine();
        nome.toLowerCase(null);
        String s1[] = nome.split(" ");

        primeiraLetra = s1[0].charAt(0);
        primeiraLetra = Character.toUpperCase(primeiraLetra);
        
        nomeSeparado += primeiraLetra;
        nomeSeparado += s1[0].substring(1);

        nomeSeparado += " ";
        nomeSeparado += s1[1].toUpperCase();
       System.out.println(nomeSeparado);
       scan.close();
       
       
        
    }
}
