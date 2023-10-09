package Listas.Lista7Array.ex011;

import java.util.Scanner;



/*Crie uma classe para descrever restaurantes. Os atributos devem ser: o nome, o endereço, o preço médio e o tipo de comida. a) Crie um construtor com argumentos e sem argumentos; b) Crie os métodos gets e sets; c) crie o método toString; d) Escreva um programa que crie um vetor de objetos restaurante e solicite a entrada dos dados pelo usuário. Em seguida, o programa pergunta o tipo de comida ao usuário e lista todos os restaurantes que o oferecem. */
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite quantos restaurantes deseja cadastrar");
         final int tam;
         tam = scan.nextInt();
        Restaurante restaurantes[] = new Restaurante[tam];
        String nome = "";
        double precoMedio =0;
        String tipoComida = "";
        for( int i =0 ; i < tam ; i++){
            
        }

        for(int i = 0 ; i < tam ; i++){
            restaurantes[i] = new Restaurante();
            System.out.println("Qual o nome do restaurante");
            nome = scan.next();
            System.out.println();
            restaurantes[i].setNome(nome);
            
            System.out.println("Digite o preço medio desse restaurante");
            precoMedio = scan.nextDouble();
            restaurantes[i].setPrecoMedio(precoMedio);
            System.out.println("Qual o tipo de comida servido");
             tipoComida = scan.next();
           restaurantes[i].setTipoComida(tipoComida);
               restaurantes[i] = new Restaurante(nome , precoMedio , tipoComida);
           

            
        }
     
        //for(int i =0 ; i < tam ; i++){
          //  System.out.println(restaurantes[i]);
       // }
        System.out.println("Qual o tipo de comida deseja comer?");
        
        String escolhaUsuario = "";
        escolhaUsuario = scan.next();
        for( int i =0; i < tam ; i++){
            if(escolhaUsuario.equals(restaurantes[i].getTipoComida())){
                System.out.println(restaurantes[i]);
            }
        }
        scan.close();

    }
    
}
