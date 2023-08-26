package CBFCursos.Classes;
    // classe da aula 10 , 11 , 12 , 13

public class Jogador {
    private final int maxVidas = 3;
    public  int num;        // Quando um atributo é definido como public é possivel acessa-lo/modifica-lo de fora   da classe
    private int vidas;          // Não é possivel acessar de fora da classe
    public static boolean alerta = false;
    static int qtdJogadores = 0;

    public Jogador(int num){             // metodo construtos , deve possuir o mesmo nome da classe ,não possui                                  retorno
        this.num = num;                  // são variaveis com nomes iguais , mas escopos diferentes
        this.vidas = 3;                  // o this "chama" o num da classe
        System.out.printf("jogador numero %d criado \n",num);
    }
    public int getVidas(){ // metodos get obtem variaveis privadas de uma classe
        return this.vidas;
    }
    public void setVidas( int vidas){ // metodos set permitem manipular variaveis privadas de uma classe com maior controle
        if( vidas > maxVidas){
            this.vidas = maxVidas;
        }
        if( vidas < 0){
            this.vidas = 0;
        }
        this.vidas = vidas;
    }
    public void info(){
        System.out.printf("Jogador %d\n",this.num);
        System.out.printf("Vidas= %d\n",this.vidas);
        System.out.printf("Alerta= %s\n",(alerta ? "Sim" : "Não"));
        System.out.printf("Jogadores= %d\n",qtdJogadores);
        System.out.println("-----------------------------");

    }

}
