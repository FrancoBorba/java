package Listas.ListaRelacaoDeClasses.Universidade;


import java.util.ArrayList;

public class Universidade {
    ArrayList<Departamento> departamentos;
    public Universidade(){
        departamentos = new ArrayList<Departamento>();
    }


    public void excluirDepartamento(String id){
       departamentos.remove(procurarDepartamento(id));
    }
   
    public Boolean criarDepartamento(Departamento d ){
        if(procurarDepartamento(d.getID()) == null){
            departamentos.add(d);
            return true;
        }
        return false;
        
    }
   public Departamento procurarDepartamento(String id){
    for( Departamento d : departamentos){
        if(d.getID().equals(id)){
            return d;
        }
    }
    return null;
   }
   public ArrayList<Departamento> listarDepartamentos(){
        return departamentos;
   }

   
    
}
