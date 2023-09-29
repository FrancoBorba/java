package Listas.Lista5ClassesObejtos.ex010;
    import java.lang.Math;
public class Equacao {
    private double a;
    private double b;
    private double c;
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
    public Equacao(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double resolveEquacao(){
        double delta = b*b +(-4*a*c);
        double resp1 , resp2;
        if( delta < 0){
            System.out.println(" não existe resposta");
        }else if( delta == 0){
            resp1 = -b/2*a;
            return resp1;
        }
        else{
            resp1 = (-b + Math.sqrt(delta))/2*a;
            resp2 = (-b - Math.sqrt(delta))/2*a;
           System.out.println(" As raizes da equação são " + resp1 + "e " + resp2);
        }
        return 0;
    }

}
