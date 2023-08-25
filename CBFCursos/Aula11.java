package CBFCursos;
// aula 11 e 12
import CBFCursos.Classes.Jogador;

// diferença entre public e private
// continuara utilizando a classe jogador
public class Aula11 {
   
    public static void main(String[] args) {
            int num = 0;
            Jogador j1 = new Jogador(num++); // pos incremento , para  criar uma sequencia
            Jogador j2 = new Jogador(num++);
            Jogador j3 = new Jogador(num++);

            /*
            Jogador j1 = new Jogador(++num); // pre incremento , para  criar uma sequencia
            Jogador j2 = new Jogador(++num);
            Jogador j3 = new Jogador(++num);
            */ 
            System.out.printf("Vidas do jogador  %d",j1.getVidas());


        //j1.num=10;  // O num está sendo acessado de fora da classe
        //j2.num=5;
        //System.out.printf("%d\n",j1.num);
        //System.out.printf("%d\n",j2.num);
    }
}
