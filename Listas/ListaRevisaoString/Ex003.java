package Listas.ListaRevisaoString;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String frase;
        int cont = 0;
        
        System.out.println("Digite uma palavra");
        frase = scan.nextLine();
       char palindromo[] = new char[frase.length()];
        
        for( int i = frase.length(); i > 0 ; i--){     
            
            palindromo [cont]= frase.charAt(i-1);
            cont++;
            
        }
        String s1 = new String( palindromo);
        
        

        if(frase.equals(s1)){
            System.out.println("É palindromo");
        }else{
            System.out.println("Não é palindromo");
        }
        
       
       
        
        scan.close();
    }
}
