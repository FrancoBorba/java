package CBFCursos.Classes;

public class CarroCombate extends Carro{ // a classe CarroCombate herda as caracteristica de Carro
    private final int MAX_ARMAMENTO =100;
    private final int MIN_ARMAMENTO =0;
    private int qtdArmamento;

    public CarroCombate(String nome , int blindagem){
        super(nome);
        setArmamento(true);
        setBlindagem(blindagem);
        this.qtdArmamento = 100;
    }
    public void setQtdArmamento(int armamento){
        this.qtdArmamento += armamento;
        if( this.qtdArmamento > MAX_ARMAMENTO){
            this.qtdArmamento = MAX_ARMAMENTO;
        }
         if( this.qtdArmamento < MIN_ARMAMENTO){
            this.qtdArmamento = MIN_ARMAMENTO;
        }
    }
    public int getQtdArmamento(){
        return this.qtdArmamento;
    }
    public void atirar(){
        if(this.qtdArmamento > MIN_ARMAMENTO){
            setQtdArmamento(-1); 
        }
        else{
            System.out.println(" Sem munição");
        }
    }
    public  void info(){
        super.info();
        System.out.printf("Armamento....:%d%n",this.qtdArmamento);
    }
}
