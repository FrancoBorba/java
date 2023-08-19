package ListaRevisaoBasico1;
    import java.util.Scanner;
public class Ex003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float temperatura , conversor;
        System.out.println(" Digite a temperatura em graus celcius");
        temperatura = scan.nextFloat();
        conversor = (temperatura *9/5) + 32;
        System.out.printf("  A temperatura em farenhaits eh %.3f",conversor);
    }
}
