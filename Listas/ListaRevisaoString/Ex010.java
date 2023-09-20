package Listas.ListaRevisaoString;

import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome completo");
        String nome;
        nome = scan.nextLine();
        String email="";
        String sobrenome[] = nome.split(" ");
        for(int i = 0 ; i < sobrenome.length ; i++){
            email += sobrenome[i].charAt(0);
        }
        email += "@empresa.com.br";
        
        System.out.println(email.toLowerCase());
        scan.close();


    }
}
