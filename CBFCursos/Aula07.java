package CBFCursos;
// metodos da classe array

import java.util.Arrays;

public class Aula07 {
    public static void main(String[] args) {
        final int tam = 10;
        int num[] = {9,4,6,3,8,10,2,5,1,7};
        int num1[] = new int[tam];
        int key = 4;
        int pos;
        Arrays.sort(num); // ordena o array

        Arrays.fill(num1,10); // prenche o array com o valor inserido

        System.arraycopy(num, 0, num1, 0, tam); // copia um array em outro , ( origem , posição de começo ,destino , posição de começo , tamanho)

        Arrays.equals(num,num1); // compara arrays , retorna um booleano(true, false)

        System.out.printf("Arrays são iguais: %s \n", Arrays.equals(num, num1)? "sim" : "nao");

       pos = Arrays.binarySearch(num,key); // faz uma busca do elemento dentro do array , o array deve estar ordenado

        System.out.printf(" O elemento  %d esta no array ? %s" ,key, pos > 0 ? "Sim" : "Não");
        for( int n:num1){
            System.out.printf("%d -",n);
        } // for mais simplres para imprimir elementos de um array
    }
}
