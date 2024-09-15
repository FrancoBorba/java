

import java.util.Scanner;

public class ConverterBinario {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite uma letra para ver sua conversão em binario");
    char letra = scan.next().charAt(0);

    int valorASCII = (int) letra;

    System.out.println("Valor na Tabela ASCII");
    System.out.println(valorASCII);
    System.out.println();

    System.out.println("Valor em Binario");
    System.out.println(converterParaBinario(valorASCII));

  }

     public static String converterParaBinario(int numero) {
        if (numero == 0) {
            return "00000000";
        }

        StringBuilder binario = new StringBuilder(); // StringBuilder para armazenar o binário

        while (numero > 0) {
            int bit = numero % 2; // Obtém o bit menos significativo (0 ou 1)
            binario.insert(0, bit); // Insere o bit na frente da string
            numero /= 2; // Divide o número por 2 para processar o próximo bit
        }

        // Garante que o binário tenha exatamente 8 bits
        while (binario.length() < 8) {
            binario.insert(0, '0');
        }

        return binario.toString(); // Retorna a string binária com 8 bits
    }
}
