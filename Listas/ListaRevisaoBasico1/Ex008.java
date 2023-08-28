package Listas.ListaRevisaoBasico1;
    import java.util.*;
public class Ex008 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float valorHora , horasTrabalhadas , valorBruto;
        System.out.println("Quantas horas foram trabalhadas?");
        horasTrabalhadas = scan.nextFloat();
        System.out.println("Qual o valor da hora de trabalho");
        valorHora = scan.nextFloat();
        valorBruto = horasTrabalhadas * valorHora;
        System.out.printf(" O salario bruto eh de %.2f",valorBruto);
    }
}
