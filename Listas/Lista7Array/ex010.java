package Listas.Lista7Array;
//Matriz Mágica
//Crie um programa que determine se uma matriz quadrada é uma matriz mágica, onde a soma das linhas, colunas e diagonais são iguais.
// Não entendi a pergunta direito , pois se for a soma de todas as linhas e todas colunas elas sempre serão iguais entre sim e nunca iguais em relação a diagonal 

import java.security.SecureRandom;

public class ex010 {
    public static void main(String[] args) {
        final int tam = 3;
        int mat[][] = new int[tam][tam];
        
        for(int l =0;l<tam;l++){
            for(int c=0;c<tam;c++){
                mat[l][c] = new SecureRandom().nextInt(10);
            }
        }
        

       

    }
}
