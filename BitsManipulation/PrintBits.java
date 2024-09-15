
 // Imprimindo um inteiro sem sinal em bits.

 import java.util.Scanner;


 public class PrintBits
 {
 public static void main( String args[] )
 {
 // obtém o inteiro de entrada
  @SuppressWarnings("resource")
  Scanner scanner = new Scanner( System.in );
  System.out.println( "Please enter an integer:" );
  int input = scanner.nextInt();

 // exibe a representação em bits de um inteiro
 System.out.println( "\nThe integer in bits is: ");

 // cria um valor inteiro com 1 no bit mais à esquerda e 0s em outros locais
 int displayMask = 1 << 31;

 // para cada bit exibe 0 ou 1 10
      for ( int bit = 1; bit <= 32; bit++ ){
 // utiliza displayMask para isolar o bit
 System.out.print(( input & displayMask ) == 0 ? "0" : "1");

 input <<= 1; // desloca o valor uma posição para a esquerda

if ( bit % 8 == 0 )
      System.out.print( "" ); // exibe espaço a cada 8 bits
    } // fim do for
 } // fim de main
} // fim da classe PrintBits