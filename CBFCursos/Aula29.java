package CBFCursos;
// funções com numeros indeterminados de parametros
public class Aula29 {
    public static void main(String[] args) {
        int soma1 , soma2;
        soma1 = soma(3,5,7,9,3);
        soma2 = soma(4,6,1);

        System.out.printf(" Soma1: %d \n",soma1);
         System.out.printf(" Soma2: %d",soma2);
    }
    public static int soma(int... n){ // essa metodologia permite passar n variaveis para função sem delimitar quantas variavies são necessarias , tornando assim a função mais versátil , neste caso não é necessario ter um array como o parametro mas o n funciona como array
        int res = 0;
        for(int v:n){
            res += v;
        }
        return res;
    }
}
