package ListaRevisaoBasico1;
    import java.util.*;
public class Ex001 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 , n2, soma;
        System.out.println("Digite um numero");
        n1 = scan.nextInt();
        System.out.println("Digite outro numero");
        n2 = scan.nextInt();
        soma = n1 + n2;
        System.out.printf(" A soma de %d + %d = %d",n1 , n2 , soma);
        scan.close();

    }
}
