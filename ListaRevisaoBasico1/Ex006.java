package ListaRevisaoBasico1;
    import java.util.*;
public class Ex006 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float metros , centrimetros , milimetros;
        System.out.println(" Digite quantos metros deseja converter");
        metros = scan.nextFloat();
        centrimetros = metros * 100;
        milimetros = centrimetros * 10;
        System.out.printf("Resultado em centimetros = %.2f \n Resultado em milimetros = %.2f ",centrimetros , milimetros);
    }
}
