package Listas.Lista7Array;
//Média dos Elementos
//Escreva um programa que calcule a média dos elementos de um array de floats.

import java.security.SecureRandom;

public class ex003 {
    public static void main(String[] args) {
        final int tam = 10;
        float media =0;
        float vet[] = new float[10];
        for( int i = 0; i< tam; i++){
            vet[i] = new SecureRandom().nextFloat(100);
        }
        for( int i =0 ; i < 10; i++){
            media = media + vet[i];
        }
        for( int i =0 ; i < 10; i++){
            System.out.printf("%.1f -" , vet[i]);
        }
        media = media/10;
        System.out.printf(" A media dos elementos do vetor foi %.1f",media);
    }
}
