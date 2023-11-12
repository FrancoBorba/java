package Listas.ListaRelacaoDeClasses.Carro;

public class Banco {
    private double preco;
    private String fabricante;
    private String modelo;

   
    public Banco( String fabricante , String modelo , double preco){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.preco = preco;
    }
    public Banco(){};

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    @Override
    public String toString(){
        return "[Banco : " + modelo + " , fabricado por: " + fabricante + " ,custo de : " + preco;
    }
}
