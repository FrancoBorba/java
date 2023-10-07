package Listas.Lista7Array;
//Soma de Diagonais
//Escreva um programa que calcule a soma dos elementos das diagonais principal e secundária de uma matriz quadrada de inteiros

import java.security.SecureRandom;

public class ex007 {
    public static void main(String[] args) {
        final int tam =3;
        int diagonalPrincipal =0 , diagonalSecundaria=0;
        int mat[][] = new int[tam][tam];
        for(int l = 0 ; l< tam ; l++){
            for(int j=0;j<tam;j++){
                mat[l][j] = new SecureRandom().nextInt(10);
            }
        }
        for(int l = 0 ; l< tam ; l++){
            for(int j=0;j<tam;j++){
                if(l == j){
                    diagonalPrincipal = diagonalPrincipal + mat[l][j];
                }            
            }
        }
        for(int l=0;l<tam;l++){
            for(int j=0;j<tam;j++){
                if((j-l == tam -1) || (l-j == tam-1) ||(tam-2 == l && tam-2 ==j)){
                    diagonalSecundaria = diagonalSecundaria + mat[l][j];
                }
            }
        }
        for(int l = 0 ; l< tam ; l++){
            for(int j=0;j<tam;j++){
               System.out.printf("- %d ",mat[l][j]);
            }
            System.out.println();
        }
        System.out.println("Soma da diagonal principal = "+ diagonalPrincipal);
        System.out.println("Soma da diagonal secundaria = "+diagonalSecundaria);
}
}
