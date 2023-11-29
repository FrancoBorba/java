package Listas.ListaHeranca.Questao01.Modelo;

public class Livro extends Produto{
   
    private int paginas;
    private String autor;

    public Livro( String nome ,String autor, int  paginas, double preco){
        super(nome, preco);
        this.paginas = paginas;
        this.autor = autor;
    }
    public int getPaginas(){
        return paginas;
    }
    private String getAutor(){
        return autor;
    }

    public Boolean ehGrande(){
        Boolean grande = false;
        if( getPaginas() > 200){
            grande = true;
        }
    return grande;
    }
    @Override
    public String toString(){
        return super.toString() + "\n Paginas: " + getPaginas() + "\n Autor: " + getAutor();
    }
}
