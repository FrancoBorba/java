 package CBFCursos.Classes;
// a clase animal vai implementar a classe SerVivo
// a classe animal é abstrata( aula 19 - classes abstratas)
abstract class Animal implements SerVivo{

    private Boolean vivo;
    private int massa;
    private int x;
    private int y;
    private int velocidade;
    private int forca;

    public Animal(int velocidade , int forca , int massa){
        this.vivo = true;
        this.massa = massa;
        this.forca = forca;
        this.velocidade = velocidade;
        this.x = 0;
        this.y = 0;
    }
    public void setVivo( Boolean vivo){
        this.vivo = vivo;
    }
    public Boolean getVivo(){
        return this.vivo;
    }
    public void setMassa( int massa){
        this.massa = massa;
    }
    public int getMassa(){
        return this.massa;
    }
    public void setForca( int forca){
        this.forca = forca;
    }
    public int getForca(){
        return this.forca;
    }
    public void setVelocidade( int velocidade){
        this.velocidade = velocidade;
    }
    public int getVelocidade(){
        return this.velocidade;
    }
    public void atacar(Animal a){
        if(this.vivo){
            if(this.forca > a.forca){
                this.forca += a.getMassa();
                a.vivo = false;
            }else{
                this.vivo = false;
            }
        }else{
            System.out.println("-----------------------------------");
            System.out.println(this.getClass().toGenericString() + " este animal esta morto , nao pode atacar");
            System.out.println("-----------------------------------");
        }
    }
   

    public void mover(){
        if(this.vivo){
            this.x += this.velocidade;
            this.y += this.velocidade;
        }
        else{
            System.out.println("-----------------------------------");
            System.out.println(this.getClass().toGenericString() + " este animal esta morto , nao pode mover");
            System.out.println("-----------------------------------");
        }

    }


     public void comer(int massa){
        if(this.vivo){
            this.forca += massa;
        }
        else{
            System.out.println("-----------------------------------");
            System.out.println(this.getClass().toGenericString() + " este animal esta morto , nao pode comer");
            System.out.println("-----------------------------------");
        }
    }
    public void info(){

        System.out.printf(" Tipo : %s \n", getClass().toString());
        System.out.printf("Vivo: %s\n",this.getVivo() ? "Sim" : "Não");
        System.out.printf("Massa: %d \n",this.massa);
        System.out.printf("Velocidade: %d \n",this.velocidade);
        System.out.printf("Força: %d \n",this.forca);
        System.out.println(" \n ------------------------------------ \n");
         
    }
}
