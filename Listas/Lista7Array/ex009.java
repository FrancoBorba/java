package Listas.Lista7Array;
// Maior e Menor Elemento
// Desenvolva um programa que encontre o maior e o menor elemento em um array de inteiros.

import java.security.SecureRandom;

public class ex009 {
    public static void main(String[] args) {
        int maior = 0, menor =9999;
        final int tam = 10;
        int vet[] = new int[tam];
        for(int i =0; i<tam;i++){
            vet[i] = new SecureRandom().nextInt(100);
        }
        for( int i =0 ; i < tam ; i++){
            if(vet[i] > maior){
                maior = vet[i];
            }
            if(vet[i] < menor){
                menor = vet[i];
            }
        }
        for(int i= 0 ; i < tam; i++){
            System.out.printf("%d -",vet[i]);
        }
        System.out.println();
        System.out.println("o maior elemento do vetor foi "+maior);
        System.out.println("O menor elemento do vetor foi "+menor);
    }
}
