package CBFCursos;

import java.util.Scanner;

// switch case em java ( igual c++ , já havia utilizado em exemplos anteriores);
public class Aula21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dia;
        System.out.println("Digite um numero entre 1 e 7");
        dia = scan.nextInt();

        switch(dia){
            case 1:{
                System.out.println("Segunda feira");
                break;
            }
            case 2:{
                System.out.println("Terca feira");
                break;
            }
            case 3:{
                System.out.println("Quarta feira");
                break;
            }
            case 4:{
                System.out.println("Quinta feira");
                break;
            }
            case 5:{
                System.out.println("Sexta feira");
                break;
            }
            case 6:{
                System.out.println("Sabado");
                break;
            }
            case 7:{
                System.out.println("Domingo");
                break;
            }
            default :{
                System.out.println("Numero invalido");
            }
        }
        
    }
}
