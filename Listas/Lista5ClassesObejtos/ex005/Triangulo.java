package Listas.Lista5ClassesObejtos.ex005;

public class Triangulo {
    private double base;
    private double altura;
    public  Triangulo(double base , double altura){
        this.base = base;
        this.altura = altura;
    }
    public double getBase( ){
        return this.base;
    }
    public void setBase( double base){
        this.base = base;
    }
    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double altura){
        if(altura < 0){
            this.altura = 0;
        }else{
            this.altura = altura;
        }
        

    }
    public double areaTotal(){
        return (altura*base)/2;
    }

}
