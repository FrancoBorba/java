package Listas.ListaRevisaoBasico1;
    import java.util.Scanner;
public class Ex009 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float dolar , taxa,result;
        System.out.println("Digite quantos dolares deseja convertes");
        dolar = scan.nextFloat();
        System.out.println("Digite qual a taxa de conversao para a moeda desejada");
        taxa = scan.nextFloat();
        result = dolar*taxa;
        System.out.printf("O valor recebido da nova moeda eh %.3f",result);
    }
    
}
