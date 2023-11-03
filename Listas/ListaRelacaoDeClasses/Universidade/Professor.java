package Listas.ListaRelacaoDeClasses.Universidade;



public class Professor {
    private String cpf;
    private String nome;
    private String materia;
    private String departamento;

    public Professor( String cpf, String nome , String materia , String departamento){
        this.cpf = cpf;
        this.nome = nome;
        this.materia = materia;
        this.departamento = departamento;
    }
    public Professor(){};
    
    public String getCpf(){
        return cpf;
    }
    public void setCpf( String cpf){
        this.cpf = cpf;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getMateria(){
        return materia;
    }
    public void setMateria(String materia){
        this.materia = materia;
    }
    public String getDepartamento(){
        return departamento;
    }
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    @Override
    public String toString(){
        return " Professor: " + nome + ", cpf: " + cpf + ", Materia: " + materia + ", Departamento: " + departamento;
    }

    
}
