package Listas.Lista7Array;
//Soma de Linhas
//Escreva um programa que calcule a soma dos elementos de cada linha de uma matriz de inteiros.

import java.security.SecureRandom;

public class ex005 {
    public static void main(String[] args) {
        int mat[][] = new int[3][3];
        int linha1 =0, linha2=0, linha3=0;
        for( int l = 0 ;l<3;l++){
            for( int j =0 ; j<3 ; j++){
                mat[l][j] = new SecureRandom().nextInt(10);
            }
        }
         for( int l = 0 ;l<3;l++){
            for( int j =0 ; j<3 ; j++){
                System.out.printf("%d " , mat[l][j]);
            }
            System.out.println();
        }
         
            for( int j =0 ; j<3 ; j++){
                linha1 = linha1 + mat[0][j];
            }
              for( int j =0 ; j<3 ; j++){
                linha2 = linha2 + mat[1][j];
            }
             for( int j =0 ; j<3 ; j++){
                linha3 = linha3 + mat[2][j];
            }
       System.out.println(" A soma da linha1 foi = "+linha1); 
       System.out.println(" A soma da linha2 foi = "+linha2); 
       System.out.println(" A soma da linha3 foi = "+linha3); 
    }
}
