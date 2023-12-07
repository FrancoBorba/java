package Listas.ListaHeranca.Questao3.Modelo;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome , Data nascimento , double salario){
        super(nome, nascimento);
        this.salario = salario;
    }
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public double calcularImposto(double salario){
        return salario*0.03;
    }
    public String imprimeDados(){
        return "[ Nome : " + getNome() + " \n Nascimento: " + getNascimento() + " \nImposto pago: " + calcularImposto(salario) + "]";
    }
}
