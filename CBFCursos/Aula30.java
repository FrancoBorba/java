package CBFCursos;

import java.util.Arrays;

// Metodos para Arrays - (repetição da aula 7)
public class Aula30 {
    public static void main(String[] args) {
        
        int [] num =  {5,78,33,61,81,17,22};
        int [] num1 = new int[8];
        int [] num2 = new int[7];
        int posicao;
        

        Arrays.sort(num); // ordena o array
        Arrays.fill(num1 , 10); // preenche o array com o parametro desejado( preenche um array vazio ou já preenchido
        System.arraycopy(num, 0, num2, 0, num.length); // copia um array em outro (array que sera copiado , posição que começara a copia , array que recebe a copia , posição que começa a receber a coppia , tamanho da copia)

        Arrays.equals(num,num1); // compara arrays , retorna um booleano(true, false)

        System.out.printf("Arrays são iguais: %s \n", Arrays.equals(num, num1)? "sim" : "nao");
         System.out.printf("Arrays são iguais: %s \n", Arrays.equals(num, num2)? "sim" : "nao");

     posicao = Arrays.binarySearch(num,5); // O bynarySearch retorna a posição do numero desejado , caso nao exista retorna -1 ( o array deve estar ordenado)

     System.out.printf(" A posicaçao: %d \n",posicao);
        for( int n:num2){
            System.out.printf("%d - ",n);
        }
    }
}
