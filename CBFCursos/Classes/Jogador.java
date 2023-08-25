package CBFCursos.Classes;
    // classe da aula 10 

public class Jogador {

    public  int num;  // Quando um atributo é definido como public é possivel acessa-lo/modifica-lo de fora da classe
    private int vidas; // Não é possivel acessar de fora da classe

    public Jogador(int num){ // metodo construtos , deve possuir o mesmo nome da classe , não ppossui retorno
        this.num = num; // são variaveis com nomes iguais , mas escopos diferentes
        this.vidas = 3;               // o this "chama" o num da classe
        System.out.printf("jogador numero %d criado \n",num);
    }
}
