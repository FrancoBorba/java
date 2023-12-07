package Listas.ListaHeranca.Questao3.Modelo;

public class Cliente extends Pessoa {
    private  int codigo;
  
    private static int contador = 0;

    public Cliente(String nome , Data nascimento){
        super(nome, nascimento);
        contador++;
        this.codigo = contador;
    } 
     public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String imprimeDados(){
        return "[ Nome : " + getNome() + " \n Nascimento: " + getNascimento() + "]";
    }
}
