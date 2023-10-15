package Listas.ListaRecursividade;
//Soma de Dígitos
//Escreva uma função recursiva que calcule a soma dos dígitos de um número inteiro positivo.

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num=0;
        System.out.println("Digite o numero que deseja calcular a soma de seus digitos");
        num = scan.nextInt();
        System.out.println("A soma dos numeros de " + num + " foi = " + calcularSomaDigitos(num));
       
        scan.close();
    }
    public static int calcularSomaDigitos( int num){
       
        if(num/10 == 0){
            return num;
        }else{
            int ultimoDigito = num%10; // obtem o ultimo digito
            int restoNumero = num/10; // retira o ultimo numero
            return  ultimoDigito + calcularSomaDigitos(restoNumero);
        }
    }
}
