package Listas.ListaRevisaoBasico3;

import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int tamanho;
    int n1= 0 , n2=1;
    System.out.println("Qual o tamanho da sequencia?");
    tamanho = scan.nextInt();

    for( int i = 0 ; i < tamanho ; i++){
        int lixo;
        System.out.printf("%d -",n1);
        lixo = n2;
        n2 = n1 + n2;
        n1 = lixo;
        
    }
    scan.close();
    
}
}
