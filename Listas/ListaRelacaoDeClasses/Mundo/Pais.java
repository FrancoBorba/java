package Listas.ListaRelacaoDeClasses.Mundo;

public class Pais {
    private String nome;
    private double populacao;
    private double dimensao;

    public Pais( String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getPopulacao(){
        return populacao;
    }
    public void setPopulacao(double populacao){
        this.populacao = populacao;
    }
    public double getDimensao(){
        return dimensao;
    }
    public void setDimensao(double dimensao){
        this.dimensao = dimensao;
    }
    public double densidadeDemografica(){
        return populacao/dimensao;
    }
    @Override
    public String toString(){
        return  "[  " + nome + "= População: " + populacao + " , Dimensão:" + dimensao + "]";
    }

}
