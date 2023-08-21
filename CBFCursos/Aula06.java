package CBFCursos;
// array em java
    import java.util.*;
public class Aula06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num[] = new int[5]; // declaração de array
        int numeros[] = { 2,5,7,8,11}; // declarando array com numeros ja definidos
        
        for(int i = 0 ; i < num.length ; i++){ // array.lenght , retorna o tamanho do array
            num[i] = scan.nextInt(); 
        } // ler array 
        for(int i = 0 ; i < 5 ; i++){
            System.out.printf("%d \n",num[i]);
        }// imprimir array
         
    }
}
