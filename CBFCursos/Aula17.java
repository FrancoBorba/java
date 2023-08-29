package CBFCursos;
    // criando uma calculadora em java orientada a obejto

import java.util.Scanner;

import CBFCursos.Classes.Numero;

public class Aula17 {
   public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);

    Numero n1 = new Numero(0);
    Numero n2 = new Numero(0);
    Numero resultado = new Numero(0);

   /*  System.out.println("Digite o valor 1");
    n1.setValor(scan.nextInt());
    System.out.println("Digite o valor 2");
    n2.setValor(scan.nextInt());
    resultado.setValor(n1.getValor() + n2.getValor());
    System.out.printf(" A soma de %d + %d = %d",n1.getValor() , n2.getValor() , resultado.getValor());
    scan.close();*/
    int opc;
    System.out.println("1- Soma");
    System.out.println("2- Subtração");
    System.out.println("3-Multiplicação");
    System.out.println("4-Divisão");
    opc = scan.nextInt();

    switch (opc) {
        case 1:
            System.out.println("Digite o valor 1");
            n1.setValor(scan.nextInt());
            System.out.println("Digite o valor 2");
            n2.setValor(scan.nextInt());
            System.out.printf(" A soma de %d + %d = %d",n1.getValor() , n2.getValor() , resultado.getResultado());
            
            break;
        case 2:{
            System.out.println("Digite o valor 1");
            n1.setValor(scan.nextInt());
            System.out.println("Digite o valor 2");
            n2.setValor(scan.nextInt());
            resultado.Subtração(n1.getValor(), n2.getValor());
            System.out.printf(" A Subtração de %d - %d = %d",n1.getValor() , n2.getValor() , resultado.getResultado());
            
            break;
        }
        case 3:{
            System.out.println("Digite o valor 1");
            n1.setValor(scan.nextInt());
            System.out.println("Digite o valor 2");
            n2.setValor(scan.nextInt());
           resultado.Multiplicação(n1.getValor(), n2.getValor());
            System.out.printf(" A Multiplicação de %d x %d = %d",n1.getValor() , n2.getValor() , resultado.getResultado());
            break;
        }
        case 4:{
            System.out.println("Digite o valor 1");
            n1.setValor(scan.nextInt());
            System.out.println("Digite o valor 2");
            n2.setValor(scan.nextInt());
            if(n2.getValor() == 0){
                System.out.println("Divisão invalida");
                break;
            }
            resultado.Divisao(n1.getValor(), n2.getValor());
            System.out.printf(" A Divisão de %d / %d = %d",n1.getValor() , n2.getValor() , resultado.getResultado());
            break;
            
        }
    
        default:
        System.out.println("Opção digitada invalida");
            break;
    }
    scan.close();
   }
}
