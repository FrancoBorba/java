package Listas.ListaHeranca.Questao02.Modelo;

public class Cliente {
    private String nome;
    private long cpf;
    public Cliente( String nome , long cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    public String getNome(){
        return nome;
    }
    public long getCPF(){
        return cpf;
    }
    @Override
    public String toString(){
        return "[Nome : " + nome + " \n Cpf: " + cpf;
    }
}
