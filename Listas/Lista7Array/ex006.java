package Listas.Lista7Array;
//Multiplicação de Matrizes
// Crie uma função que realize a multiplicação de duas matrizes quadradas

public class ex006 {
    
        public static void main(String[] args) {
            // Defina as matrizes de exemplo
            int[][] matrizA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            int[][] matrizB = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
            
            // Realize a multiplicação das matrizes
            int[][] resultado = multiplicarMatrizes(matrizA, matrizB);
            
            // Imprima o resultado
            imprimirMatriz(resultado);
        }
        
        public static int[][] multiplicarMatrizes(int[][] matrizA, int[][] matrizB) {
            int linhasA = matrizA.length;
            int colunasB = matrizB[0].length;
            int colunasA = matrizA[0].length;
            
            if (colunasA != matrizB.length) {
                throw new IllegalArgumentException("O número de colunas da matriz A deve ser igual ao número de linhas da matriz B.");
            }
            
            int[][] resultado = new int[linhasA][colunasB];
            
            for (int i = 0; i < linhasA; i++) {
                for (int j = 0; j < colunasB; j++) {
                    for (int k = 0; k < colunasA; k++) {
                        resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                    }
                }
            }
            
            return resultado;
        }
        
        public static void imprimirMatriz(int[][] matriz) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }
    
    
}
