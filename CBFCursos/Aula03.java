package CBFCursos;
// AULA 03 Comandos de decisão

public class Aula03 {
    public static void main(String[] args) {
        int nota = 6,   media = 7;
     // if else igual ao C++
        if( nota > media){
            System.out.println(" Aluno aprovado");
        }
        else{
            System.out.println( " Aluno reprovado");
        }
        int dia = 2;
        // switch igual ao C++
        // seria melhor fazer com entradas , mas é assunto da proxima aula entradas em java.
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
            System.out.println( " Segunda-Feira");
            break;
            
            default:
            System.out.println(" O caso nao corresponde a um dia da semana");
                break;
        }


    }
}
