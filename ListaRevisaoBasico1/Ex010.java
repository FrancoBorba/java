package ListaRevisaoBasico1;
    import java.util.*;
public class Ex010 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    float distancia , velocidade , tempo;
    System.out.println("Digite a distancia da viagem(em KM)");
    distancia = scan.nextFloat();
    System.out.println(" Qual foi o tempo gasto(em horas)?");
    tempo = scan.nextFloat();
    velocidade = distancia/tempo;
    System.out.printf(" A velocidade media foi de %.2f",velocidade);
    }
}
