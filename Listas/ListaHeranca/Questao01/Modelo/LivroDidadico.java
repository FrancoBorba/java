package Listas.ListaHeranca.Questao01.Modelo;

public class LivroDidadico extends Livro {
    private String disciplina;
    public LivroDidadico(String nome ,String autor, int  paginas, double preco , String disciplina){
        super(nome, autor, paginas, preco);
        this.disciplina = disciplina;
    }
    public String getDisciplina(){
        return disciplina;
    }
    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }
    @Override
    public boolean ehCaro(){
        boolean caro = false;
        if( getPreco() > 200){
             caro = true;
        }
        return caro;
    }
    @Override 
    public String toString(){
       return super.toString() + " \n Disciplina : " + getDisciplina(); 
    }
}
