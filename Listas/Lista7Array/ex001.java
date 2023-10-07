//Soma de Elementos
//Crie um programa que calcule a soma dos elementos de um array de inteiros
package Listas.Lista7Array;
import java.security.SecureRandom;
public class ex001 {
    public static void main(String[] args) {
        final int tam = 10;
        int soma =0;
        int vet[] = new int[tam];
        for( int i = 0 ; i < tam ; i++){
            vet[i] = new SecureRandom().nextInt(100);
        }
        for( int i = 0 ; i< tam ; i++){
            soma = soma + vet[i];
        }
        System.out.println( " A soma dos elemtentos do vetor foi " + soma);
    }
}
