package Listas.ListaRelacaoDeClasses.TimeFutebol;

public class Jogador {
    private int numeroCamisa;
    private String nome;
    private String posicao;
    private String id;
    
    public Jogador(String nome , String posicao , int numeroCamisa , String id){
        this.nome = nome;
        this.posicao = posicao;
        this.numeroCamisa = numeroCamisa;
        this.id = id;
    }
    public Jogador (){}
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getPosicao(){
        return posicao;
    }
    public void setPosicao(String posicao){
        this.posicao = posicao;
    }
    public int getNumeroCamisa(){
      
        return numeroCamisa;
    }
    public void setNumeroCamisa(int numeroCamisa){
        
        this.numeroCamisa = numeroCamisa;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    @Override
    public String toString(){
        return "Jogador: " + nome + "| Posicação : " + posicao + " |Número: " + numeroCamisa + "/";
    }
}
