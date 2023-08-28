package Listas.ListaRevisaoBasico3;

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num , resultado=0;
        System.out.println("Digite um numero");
        num = scan.nextInt();
        for (int i = 2; i <= num/2 ; i++) {
            if (num % i == 0) {
               resultado++;
               break;
            }
         }
         if (resultado == 0)
    System.out.println("Numero primo");
        else
    System.out.println("Não é primo");
        scan.close();
    }
}
