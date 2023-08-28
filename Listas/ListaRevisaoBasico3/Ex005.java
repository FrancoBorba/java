package Listas.ListaRevisaoBasico3;

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fat ;
        System.out.println("Digite um numero ");
        fat = scan.nextInt();
        for( int i = fat ; i > 1 ; i--){
            fat = fat*(i-1);
        }
        System.out.printf("Fatorial = %d",fat);
        scan.close();
    }
    
    
}
