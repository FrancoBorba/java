package CBFCursos.Classes;
   
public class Aranha extends Animal{

    private int veneno;

    public Aranha(int velocidade , int forca , int massa , int veneno){
        super(velocidade , forca , massa);
        this.veneno = veneno;
    }
    @Override
    public void atacar(Animal a){
        if(this.getVivo()){
           if( (getForca() + this.veneno) > a.getForca()){
            setForca(this.getForca() + a.getMassa());
            a.setVivo(false);
           }else{
            this.setVivo(false);
           }


        }else{
            System.out.println("-----------------------------------");
            System.out.println(this.getClass().toGenericString() + " este animal esta morto , nao pode atacar");
            System.out.println("-----------------------------------");
        }
    }
}
