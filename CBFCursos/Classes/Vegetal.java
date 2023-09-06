package CBFCursos.Classes;

public class Vegetal {
    private Boolean vivo;
    private int massa;
    public Vegetal(int massa) {
        this.vivo = true;
        this.massa = massa;
    }
    public int getMassa(){
        return this.massa;
    }
    public void setVivo(Boolean vivo){
        this.vivo = vivo;
    }
    
    public Boolean getVivo(){
        return this.vivo;
    }
    public void info(){

        System.out.printf(" Tipo : %s \n", getClass().toString());
        System.out.printf("Vivo: %s\n",this.getVivo() ? "Sim" : "Não");
        System.out.printf("Massa: %d \n",this.massa);
        
        System.out.println(" \n ------------------------------------ \n");
         
    }
}
