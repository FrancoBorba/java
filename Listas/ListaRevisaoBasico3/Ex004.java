package Listas.ListaRevisaoBasico3;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n , resp;
        System.out.println("Digite um numero para a tabuada\n");
        n = scan.nextInt();
        for( int i = 1 ; i <= 10 ; i++){
            resp = n*i;
            System.out.printf(" %d x %d = %d \n",n,i,resp);
        }
        scan.close();
    }
}
