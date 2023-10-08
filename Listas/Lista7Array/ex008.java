package Listas.Lista7Array;
//Matriz Transposta
//Desenvolva um método que gere a matriz transposta de uma matriz dada.

import java.security.SecureRandom;

public class ex008 {
    public static void main(String[] args) {
        final int tam = 4;
        int mat[][] = new int[tam][tam];
        int matTransposta[][] = new int[tam][tam];
        for(int l =0;l<tam;l++){
            for(int c=0;c<tam;c++){
                mat[l][c] = new SecureRandom().nextInt(10);
            }
        }
        for(int l =0;l<tam;l++){
            for(int c=0;c<tam;c++){
                matTransposta[c][l] = mat[l][c];
            }
        }
        
        for(int l =0;l<tam;l++){
            for(int c=0;c<tam;c++){
            System.out.printf("%d -",mat[l][c]);
            }
            System.out.println();
        }
        System.out.println("----------------------------");
        for(int l =0;l<tam;l++){
            for(int c=0;c<tam;c++){
            System.out.printf("%d -",matTransposta[l][c]);
            }
            System.out.println();
        }
        
    }
}
