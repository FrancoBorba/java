package Listas.ListaRecursividade;
//Potência
//Crie uma função recursiva para calcular a potência de um número base elevado a um expoente inteiro não negativo.

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base , pot;
        System.out.println("Digite a base ");
        base = scan.nextInt();
        System.out.println("Digite o expoente");
        pot = scan.nextInt();
        System.out.println("O resultado foi " + calcularPotencia(base, pot));
        scan.close();
    }
    public static int calcularPotencia( int base , int pot){
        if( pot  < 0){
            throw new IllegalArgumentException("O número não pode ser negativo");
        }
        if( pot == 1){
            return base;
        }
        else{
            return base * calcularPotencia(base, pot-1);
        }
    }
}
