package Listas.ListaHeranca.Questao3.Modelo;

public class Gerente extends Funcionario {
    private String area;
   
    public Gerente(String nome , Data nascimento , double salario , String area){
        super(nome, nascimento, salario);
        this.area = area;
    } 
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public String imprimeDados(){
        return "[ Nome : " + getNome() + " \n Nascimento: " + getNascimento() + " \nImposto pago: " + calcularImposto(getSalario()) + " \nArea de trabalho: "+ area +"]";
    }
}
