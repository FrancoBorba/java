package Listas.ListaRecursividade;

import java.security.SecureRandom;

public class ex006 {
    public static void main(String[] args) {
       
        int num [] = new int[50];
        for( int i =0 ; i < num.length ; i++){
            num[i ] = new SecureRandom().nextInt(10);
        }
     boolean resultado = buscaBinaria(num , 4);
     System.out.println(resultado);
     System.out.println(buscaBinaria(num, 7));
        

    }
    public static boolean buscaBinaria(int[] array, int numero) {
        return buscaRecursiva(array, numero, 0, array.length - 1);
      }
    
      public static  boolean buscaRecursiva(int[] array, int numero, int pivotInicio, int pivotFim) {
        int pivot = (pivotInicio + pivotFim) / 2;
        if (array[pivot] == numero)
            return true;
        if (pivotFim <= pivotInicio)
            return false;
    
        if (numero > array[pivot])
            return buscaRecursiva(array, numero, pivot + 1, pivotFim);
        else
            return buscaRecursiva(array, numero, pivotInicio, pivot - 1);
    }
    
}
