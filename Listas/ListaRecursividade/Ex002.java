package Listas.ListaRecursividade;
//Fibonacci
//Implemente uma função recursiva para calcular o n-ésimo número da sequência de Fibonacci.

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite até que numero deseja da sequencia de fibonacci\n Lembre-se que a sequencia começe em 0");
        int num=0;
        num = scan.nextInt();
        System.out.println(calcularFibonacci(num));
        scan.close();
    }
    public static int calcularFibonacci(int num){
        if(num < 0){
            throw new IllegalArgumentException("O número não pode ser negativo");
        }
        if(num == 1 ){
            return 0;
        }
        if(num == 2){
            return 1;
        }else{
            return calcularFibonacci(num-1) + calcularFibonacci( num-2);
        }
    }
}
