package ListaRevisaoBasico1;
    import java.util.Scanner;
public class EX005 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        float peso , altura , imc;
        String nome;
        System.out.println(" Digite seu nome");
        nome = scan.nextLine();
        System.out.println("Digite seu pego em kg");
        peso = scan.nextFloat();
        System.out.println(" Digite sua altuta em metros");
        altura = scan.nextFloat();
        imc = peso/(altura*altura);
        System.out.printf(" %s seu imc eh = %.3f",nome, imc);
    }
}
