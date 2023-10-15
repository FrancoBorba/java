package Listas.ListaRecursividade;
// Fatorial
//Escreva uma função recursiva para calcular o fatorial de um número inteiro não negativo.
    import java.util.*;
public class Ex001 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num=0;
        System.out.println("Digite o numero que deseja o fatorail");
        num = scan.nextInt();
        System.out.println(fatorail(num));
      
        scan.close();
    }
    public static int fatorail(int num){
        if(num < 0){
            throw new IllegalArgumentException("O número não pode ser negativo");
        }
        if(num == 0 || num == 1){
            return 1;
        }
        else{
            return num * fatorail( num -1);
        }
        

}
}
