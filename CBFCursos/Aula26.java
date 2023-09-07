package CBFCursos;
// desafio da aula 26
import java.util.Scanner;

public class Aula26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        final int numPerguntas= 4;
        char [] gabarito = {'c','c' ,'a','a'};

        String[] perguntas ={
            "Qual primeiro planeta do sistema solar?",
            "Qual a primeira letra do alfabeto",
            "Quanto eh 2x10?",
            "Valor de pi?"

        };
        String [] alternativas = {
            "a) venus | b) marte |c) terra",
            "a) F     | b) D     | c) A",
            "a) 20    | b) 12    |  c) 210",
            "a) 3,14  | b) nulo  |   c)0"

        };
        char[] respostas = new char[numPerguntas];
    }
}
