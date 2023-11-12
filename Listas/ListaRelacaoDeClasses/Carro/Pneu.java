package Listas.ListaRelacaoDeClasses.Carro;

public class Pneu {
    private String fabricante;
    private String tipo;
    private double preco;

 
    public Pneu( String fabricante , String tipo , double preco){
        this.tipo = tipo;
        this.fabricante = fabricante;
        this.preco= preco;
    }
    public Pneu(){};

    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    @Override
    public String toString(){
        return "[ Pneu fabricado por " + fabricante + " , do tipo: " + tipo + " custo: " + preco;
    }
}
