package Listas.Lista5ClassesObejtos.ex004;

public class Produto {
    private String nome;
    private int preco;
    private int quantidadeEstoque;

    public Produto(String nome, int preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getPreco() {
        return preco;
    }
    public void setPreco(int preco) {
        this.preco = preco;
    }
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public int valorTotal( ){
        return quantidadeEstoque*preco;

    }
    public void addProduto(){
        quantidadeEstoque++;
    }
    public void removeProduo(){
        if(quantidadeEstoque > 0){
            quantidadeEstoque--;
        }else{
            quantidadeEstoque = 0;
        }
        
    }
    public String toString(){
        return "Arroz: \n Preço: "+ preco + " \nQuantidade em estoque: " + quantidadeEstoque;
    }

}
