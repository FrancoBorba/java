package CBFCursos.Classes;
// classes para aula 15 de superclasses e sub classes
public class Veiculo {
    private String nome;
    private int tipo;
    protected int velocidade; // o modificador de acesso protected só pode ser acessado de fora da classe , por classes no mesmo pacote
    public Veiculo(String nome , int tipo){
        this.nome = nome;
        this.tipo = tipo;
        
    }
    public void info(){
        System.out.printf("Nome = %s\n",this.nome);
        System.out.printf("Tipo = %d\n",this.tipo);
        System.out.printf(" Velocidade= %d\n",this.velocidade);
    }
    public int getVelocidade(){
        return this.velocidade;
    }
    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }
    
}

