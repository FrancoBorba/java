package CBFCursos.JogoDaVelha;

import java.util.Scanner;
// ainda não coloquei todos os possiveis casos de vitoria
public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Campo [][] jogo = new Campo [3][3];
        char simboloAtual = 'x';
        Boolean game = true;
        String vitoria = "";

            iniciarJogo(jogo);
        while(game){
            desenhaJogo(jogo);
            vitoria = verificaVitoria(jogo);
            if(!vitoria.equals("")){
                System.out.printf("Jogador %s venceu \n",vitoria);
                break;
            }
            try {
                if(verificarJogada(jogo, jogar(scan, simboloAtual), simboloAtual)){
                    if(simboloAtual == 'x'){
                        simboloAtual = 'O';
                    }
                    else{
                        simboloAtual = 'x';
                    }
                }
                
            } catch (Exception e) {
                System.out.println("Erro");
            }
           


        }
         System.out.println("Fim de jogo");
    }
    public static void desenhaJogo(Campo[][] jogo){
       limparTela();
       System.out.printf("%c  |  %c   |%c   \n",jogo[0][0].getSimbolo(),jogo[0][1].getSimbolo(),jogo[0][2].getSimbolo());
       System.out.println(" --------------");
       System.out.printf("%c  |  %c   |%c   \n",jogo[1][0].getSimbolo(),jogo[1][1].getSimbolo(),jogo[1][2].getSimbolo());
       System.out.println(" --------------");
       System.out.printf("%c  |  %c   |%c   \n",jogo[2][0].getSimbolo(),jogo[2][1].getSimbolo(),jogo[2][2].getSimbolo());
        
    }
    public static String verificaVitoria( Campo [][] jogo){
         if( (jogo[0][0].getSimbolo() == 'x') && (jogo[0][1].getSimbolo()== 'x') &&(jogo[0][2].getSimbolo()=='x') ){
            return "vitoria";
         }                      
        return "";  
    }
    public static void limparTela(){
        for(int i = 0 ; i < 200 ; i++){
            System.out.println(" ");
        }
    }
    public static Boolean verificarJogada(Campo [][] jogo , int[] p , char simboloAtual){
        if(jogo[p[0]][p[1]].getSimbolo() == ' '){
            jogo[p[0]][p[1]].setSimbolo(simboloAtual);
            return true;
        }
        else{
            return false;
        }
    }
    public static int[] jogar(Scanner scan , char simboloAtual){
        int p[] = new int[2];
        System.out.printf("%s %c \n","Quem joga",simboloAtual);
        System.out.println(" Informe a linha");
        p[0] = scan.nextInt();
         System.out.println(" Informe a coluna");
        p[1] = scan.nextInt();
        return p;
    }
    public static void iniciarJogo(Campo [][] jogo){
        for(int l =0 ; l <3 ; l++){
            for(int c = 0 ; c < 3 ; c++){
                jogo[l][c] = new Campo();
            }

        }
    }
    
}

