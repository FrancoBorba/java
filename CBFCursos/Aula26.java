package CBFCursos;
// desafio da aula 26
import java.util.Scanner;

public class Aula26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
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
        char resp;
        String nome;
        double nota = 0;
        System.out.println("Digite seu nome");
        nome = scan.nextLine();
        for ( int i = 0 ; i < numPerguntas ; i++){
            System.out.println("------------------------");
            System.out.printf("Pergunta %d \n",i+1);
            System.out.printf("%s \n",perguntas[i]);
            System.out.printf("%s \n",alternativas[i]);
            resp = scan.nextLine().charAt(0);
            respostas[i] = resp;
        }
        for( int i = 0 ; i < numPerguntas ; i++){
            if(gabarito[i]== respostas[i]){
                nota = nota + 2.5;
            }
        }
        System.out.printf(" %s sua nota foi %.2f , voce foi %s ",nome,nota, nota >= 6 ? "Aprovado" : "Reprovado");
        scan.close();
    }
}
