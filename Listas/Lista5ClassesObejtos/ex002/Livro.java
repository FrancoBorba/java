package Listas.Lista5ClassesObejtos.ex002;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroPag;

    public Livro(String titulo , String autor , int numeroPag){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPag = numeroPag;
    }
    public Livro(){

    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo( String titulo){
        this.titulo = titulo;
    }
    public String getAutor(){
        return this.autor;      
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public int getNumeroPag() {
        return numeroPag;
    }
    public void setNumeroPag(int numeroPag) {
        this.numeroPag = numeroPag;
    }
    @Override
   public String toString(){
        return "O livro de " + titulo + " do autor " + autor+ " possui " + numeroPag + " paginas";
    }
}
