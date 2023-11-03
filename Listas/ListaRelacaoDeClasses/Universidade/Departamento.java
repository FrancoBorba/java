package Listas.ListaRelacaoDeClasses.Universidade;

import java.util.ArrayList;

public class Departamento {
    ArrayList<Professor> professores;

    public Departamento( ){
       professores = new ArrayList<Professor>();
    }
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
}

