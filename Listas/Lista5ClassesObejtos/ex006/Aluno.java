package Listas.Lista5ClassesObejtos.ex006;

public class Aluno {
    private String nome;
    private int matrícula;
    private int nota1;
    private int nota2;
    private int nota3;
    
    public Aluno(String nome, int matrícula, int nota1, int nota2, int nota3) {
        this.nome = nome;
        this.matrícula = matrícula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatrícula() {
        return matrícula;
    }
    public void setMatrícula(int matrícula) {
        this.matrícula = matrícula;
    }
    public int getNota1() {
        return nota1;
    }
    public void setNota1(int nota1) {
        if( nota1 < 0){
            nota1 = 0;
        }else{
            this.nota1 = nota1;
        }
        
    }
    public int getNota2() {
        return nota2;
    }
    public void setNota2(int nota2) {
        if( nota2 < 0){
            nota2 = 0;
        }else{
            this.nota2 = nota2;
        }
        
    }
    public int getNota3() {
        return nota3;
    }
    public void setNota3(int nota3) {
        if( nota3 < 0){
            nota3 = 0;
        }else{
            this.nota3 = nota3;
        }
        
    }
    public double mediaAluno(){
        return (nota1 + nota2 + nota3)/3;
    }

}
