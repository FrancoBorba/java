package Listas.ListaRelacaoDeClasses.Universidade;

import java.util.ArrayList;

public class Departamento {
    private String nome;
    private String id;
    private ArrayList<Professor> professores;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getID() {
        return id;
    }
    public void setID(String id) {
        this.id = id;
    }

    

    public Departamento(String nome , String id){
        this.nome = nome;
        this.id = id;
       professores = new ArrayList<Professor>();
    }

    public Departamento(){};

    public Boolean addProfessor(Professor p){
        if(pesquisarProfessor(p.getCpf()) == null){
            professores.add(p);
            return true;
        }
        return false;
    }
    public void deleteProfessor(String cpf){
        professores.remove(pesquisarProfessor(cpf));
    }
    public Professor pesquisarProfessor(String cpf){
       for( Professor p : professores){
        if(p.getCpf().equals(cpf))
            return p;
       }
        return null;
        
}
    
    public ArrayList<Professor> listarProfessores(){
        return professores;
    }

    @Override
    public String toString(){
        return "Departamento[ " + nome + "  Codigo : " + id + "]";
    }
}

