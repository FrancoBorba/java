package Listas.Lista7Array.ex011;

public class Restaurante {
    private String nome;
    private double precoMedio;
    private String tipoComida;
   
    public Restaurante(String nome , double precoMedio , String tipoComida){
        this.nome = nome;
        this.precoMedio = precoMedio;
        this.tipoComida = tipoComida;
    }
    public Restaurante(){

    }

    public String getNome(){
        return this.nome;
    }
    public void setNome( String nome){
        this.nome = nome;
    }
    public double getPrecoMedio(){
        return this.precoMedio;
    }
    public void setPrecoMedio( double precoMedio){
        this.precoMedio = precoMedio;
    }
    
    public String getTipoComida() {
        return tipoComida;
    }
    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }
    public String toString(){
        return "O restaurante " + nome + " tem o preco medio de " + precoMedio + " e serve " + tipoComida;
    }
    
}
