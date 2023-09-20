package Listas.ListaRevisaoString;
    import java.util.*;
public class Ex006 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char caracter;
        String s1 = "";
         int cont = 0;
        System.out.println("Digite uma frase");
        s1 = scan.nextLine();
        System.out.println("Digite uma letra para ver sua recorrencia");
        caracter = scan.nextLine().charAt(0);
        for( int i =0 ; i < s1.length(); i++){
           
            if(s1.toLowerCase(null).charAt(i) == caracter){
                cont++;
            }
        }
        System.out.printf(" O caracter %c aparareceu %d vezes",caracter,cont);
        scan.close();
    }
}
