package Listas.ListaRevisaoBasico1;
    import java.util.*;
public class Ex002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float n1 , n2 , n3;
        float media;
        System.out.println(" Digite sua primera nota");
        n1 = scan.nextFloat();
        System.out.println(" Digite sua segunda nota");
        n2 = scan.nextFloat();
        System.out.println(" Digite sua terceira nota ");
        n3 = scan.nextFloat();
        media = (n1+n2+n3)/3;
        System.out.printf(" A media de %.2f , %.2f , %.2f eh = %.2f",n1 , n2 ,n3 , media);
        scan.close();

    }
}
