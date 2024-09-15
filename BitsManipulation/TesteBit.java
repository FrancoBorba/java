

import java.util.Scanner;

public class TesteBit {
  public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma palavra com até 4 caracteres: ");
        String palavra = scanner.nextLine();
        
        // Garantir que a palavra tenha no máximo 4 caracteres
        if (palavra.length() > 4) {
            System.out.println("A palavra deve ter no máximo 4 caracteres.");
            return;
        }
        
        int valorCombinado = 0;
        
        // Armazenando cada caractere na variável int
        for (int i = 0; i < palavra.length(); i++) {
            int valorASCII = (int) palavra.charAt(i); // Obtém o valor ASCII do caractere
            valorCombinado |= (valorASCII << (8 * (3 - i))); // Shift left e combinação com OR bit a bit
        }
        
        // Exibindo o resultado
        System.out.println("Valor combinado das letras em uma posição do vetor: " + valorCombinado);
      //  System.out.printf("Em binário: %32s\n", Integer.toBinaryString(valorCombinado).replace(' ', '0'));
      System.out.println("Em binario: " + converterParaBinario(valorCombinado));

        
        
        scanner.close();
  }
  public static String converterParaBinario(int numero) {
        if (numero == 0) {
            return "0";
        }

        StringBuilder binario = new StringBuilder(); // StringBuilder para armazenar o binário

        while (numero > 0) {
            int bit = numero % 2; // Obtém o bit menos significativo (0 ou 1)
            binario.insert(0, bit); // Insere o bit na frente da string
            numero /= 2; // Divide o número por 2 para processar o próximo bit
        }

        return binario.toString(); // Retorna a string binária
    }
}
