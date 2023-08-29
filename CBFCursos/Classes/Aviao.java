package CBFCursos.Classes;
// classes para aula 15 de superclasses e sub classes
public class Aviao extends Veiculo {
    private int categoria;
    public Aviao(String nome , int categoria){
        super(nome, 10); // referencia direta a veiculo
        this.categoria = categoria;
    }
    public void info(){
        System.out.printf("Categoria= %d\n",this.categoria);
        super.info();
    }
}
