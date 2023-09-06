package Listas.ListaRevisaoBasico1;
    import java.util.*;
public class Ex007 {
   public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
    float distancia , velocidade , media;
    System.out.println("Digite a distancia da viagem");
    distancia = scan.nextFloat();
    System.out.println(" Digite a velocidade media");
    velocidade = scan.nextFloat();
    media = distancia/velocidade;
    System.out.printf(" O tempos estimado eh de %.2f",media);
    scan.close();
   }
    
}
