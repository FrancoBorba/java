package Listas.ListaRevisaoBasico3;

import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float media=0, num , resp;
        int i=0;
        do{
           
            System.out.println("Digite um numero");
            num = scan.nextFloat();
            media = media + num;
             i++;

        }while(num!=0);
        resp = media/(i-1);
        System.out.printf(" A media foi %.3f\n",resp);
        scan.close();
    }
}
