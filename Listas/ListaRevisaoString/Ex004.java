package Listas.ListaRevisaoString;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma frase");
        String s1 = scan.nextLine();
        int contA =0, contE=0, contI=0, contO=0, contU=0;
        for( int i  = 0 ; i < s1.length()-1 ; i++){
            System.out.println(s1.charAt(i));
            
            if(s1.charAt(i) == 'a'){
                contA++;
            }
            if(s1.charAt(i) == 'e'){
                contE++;
            }
            if(s1.charAt(i) == 'i'){
                contI++;
            }
            if(s1.charAt(i) == 'o'){
                contO++;
            }
            if(s1.charAt(i) == 'u'){
                contU++;
            }
        }
        System.out.printf("Letras A = %d\n",contA);
        System.out.printf("Letras E = %d\n",contE);
        System.out.printf("Letras I = %d\n",contI);
        System.out.printf("Letras O = %d\n",contO);
        System.out.printf("Letras U = %d\n",contU);
        scan.close();

    }
}
