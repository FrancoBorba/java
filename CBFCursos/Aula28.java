package CBFCursos;
// passagem por valor e passagem por referencia
public class Aula28 {
    public static void main(String[] args) {
        int [] notas = {45,67,34,78,97,84,81,55,92,63,68};
        int[] resultados = {0,0}; // a posição 0 receberá aprovados e a posição 1 reprovados

        conferirNotas(notas, resultados);

        System.out.printf("Aprovados  : %d\n",resultados[0]);
        System.out.printf("Reprovados:  %d\n",resultados[1]);

    }
    public static void conferirNotas(int[] notas, int [] r){
        for( int n:notas){
            if( n >=60){
                r[0]++;
            }else{
                r[1]++;
            }
        }
    }
}
