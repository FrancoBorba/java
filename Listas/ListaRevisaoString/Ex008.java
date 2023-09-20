package Listas.ListaRevisaoString;

import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = "";
        
        System.out.println("Digite uma frase");
        s1 = scan.nextLine();
      String s2[] = s1.split(" ");
      
      for( int i = 0 ; i < s2.length ; i++){
        System.out.println(s2[i]);
      }
      scan.close();
    }
}
