package CBFCursos.Classes;
    // classe da aula 10 , 11 , 12

public class Jogador {
    private final int maxVidas = 3;
    public  int num;        // Quando um atributo é definido como public é possivel acessa-lo/modifica-lo de fora   da classe
    private int vidas;          // Não é possivel acessar de fora da classe

    public Jogador(int num){             // metodo construtos , deve possuir o mesmo nome da classe ,não possui                                  retorno
        this.num = num;                  // são variaveis com nomes iguais , mas escopos diferentes
        this.vidas = 3;                  // o this "chama" o num da classe
        System.out.printf("jogador numero %d criado \n",num);
    }
    public int getVidas(){
        return this.vidas;
    }
    public void setVidas( int vidas){
        if( vidas > maxVidas){
            this.vidas = maxVidas;
        }
        if( vidas < 0){
            this.vidas = 0;
        }
        this.vidas = vidas;
    }
  

}
