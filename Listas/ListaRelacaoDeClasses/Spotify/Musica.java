package Listas.ListaRelacaoDeClasses.Spotify;

public class Musica {
    private String nome;
    private double duracao;

    public Musica(){};
    public Musica(String nome , double duracao){
        this.nome = nome;
        this.duracao = duracao;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getDuracao(){
        return duracao;
    }
    public void setDuracao(double duracao){
        this.duracao = duracao;
    }
    @Override
    public String toString(){
        return nome + " : " + duracao;
    }
}
