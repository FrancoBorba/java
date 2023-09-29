package Listas.Lista5ClassesObejtos.ex001;

public class Pessoa {
    private int idade;
    private String nome;
    public Pessoa(String nome , int idade){
        this.idade= idade;
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if( idade < 0){
            this.idade =0;
        }
        this.idade = idade;
    }
    public String getNome(){
    return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
   public String  toString(){
    return "A idade de " + nome + " é = " + idade;
   }
    
}
