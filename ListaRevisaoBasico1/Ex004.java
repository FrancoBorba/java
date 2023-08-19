package ListaRevisaoBasico1;
    import java.util.*;
public class Ex004 {
   public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
    float produto , desconto , resultado;
    System.out.println("Digite o valor do produto");
    produto = scan.nextFloat();
    System.out.println(" Digite o valor do desconto");
    desconto = scan.nextFloat();
    resultado = produto * (desconto/100);
    System.out.printf(" O valor do produto após o desconto eh %.2f",(produto -resultado));

   }
}
