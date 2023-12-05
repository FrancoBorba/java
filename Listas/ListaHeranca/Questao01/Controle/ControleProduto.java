package Listas.ListaHeranca.Questao01.Controle;

import java.util.ArrayList;

import Listas.ListaHeranca.Questao01.Modelo.Livro;
import Listas.ListaHeranca.Questao01.Modelo.LivroDidadico;
import Listas.ListaHeranca.Questao01.Modelo.Produto;



public class ControleProduto {
    private ArrayList<Produto> produtos = new ArrayList<>();
    

    public void cadastrarProdutos(String nome , Double preco){
        produtos.add(new Produto(nome, 0));
    }
    public void cadastrarProdutos(String nome , Double preco , int paginas , String autor){
       produtos.add(new Livro(nome, autor, paginas, paginas));
    }
    public void cadastrarProdutos(String nome , Double preco , int paginas , String autor , String disciplina){
       produtos.add(new LivroDidadico(nome, autor, paginas, paginas, disciplina));
    }
    public Produto pesquisarProduto(int codigo){
        
        for( Produto p1 :produtos ){
            if(codigo == p1.getCodigo()){
           return p1;
            }
            
        }
        return null;
    }
    public String imprimirProduto(int codigo){
        Produto p = pesquisarProduto(codigo);
        if(p != null){
            return p.toString();
        }
        else{
            return "Codigo invalido";
        }
    }
    public boolean produtoEhCaro(int codigo){
        Produto p = pesquisarProduto(codigo);
       return p.ehCaro();
    }
}
