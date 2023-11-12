package Listas.ListaRelacaoDeClasses.Carro;

public class Motor {
    private double preco;
    private String fabrincate;
    private double potencia;

    public Motor( String fabricante , double preco , double potencia){
        this.fabrincate = fabricante;
        this.potencia = potencia;
        this.preco = preco;

    }
    public Motor(){};

    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPotencia(){
        return potencia;
    }
    public void setPotencia(double potencia){
        this.potencia = potencia;
    }
    public String getFabricante(){
        return fabrincate;
    }
    public void setFabricante(String fabricante){
        this.fabrincate = fabricante;
    }
    @Override
    public String toString(){
        return "[ Motor fabricado por: " + fabrincate + " , potencia: " + potencia + " preço: " + preco;
    }
}
