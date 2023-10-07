package Listas.Lista7Array;

import java.security.SecureRandom;
import java.util.Scanner;

//Contagem de Ocorrências
//Desenvolva uma função que conte quantas vezes um número específico ocorre em um array de inteiros.

public class ex004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int tam = 50;
        int ocorrencia;
        int cont=0;
        int vet[] = new int[tam];
        for( int i =0; i <tam; i++){
            vet[i] = new SecureRandom().nextInt(50);
        }
        System.out.println("Digite o numero de ocorrencia");
        ocorrencia = scan.nextInt();
        
        for( int i=0;i<tam;i++){
            if(vet[i]== ocorrencia){
                cont++;
            }
        }
        System.out.printf(" O numero %d apareceu %d no vetor",ocorrencia,cont);
        scan.close();
    }
}
