package Listas.Lista5ClassesObejtos.ex003;

public class Carro {
    private String marca;
    private String modelo;
    private int anoFabricado;

    public Carro(String marca , String modelo , int anoFabricado){
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricado = anoFabricado;
    }
    public int getAnoFabricado() {
        return anoFabricado;
    }
    public void setAnoFabricado( int anoFabricado){
        this.anoFabricado = anoFabricado;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setMarca( String marca){
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void info(){
        System.out.println("-------------------------\n");
        System.out.printf("Marca do carro %s\n",marca);
        System.out.printf("Modelo do carro: %s \n",modelo);
        System.out.printf("Ano do carro: %d \n ",anoFabricado);
    }
    
}
