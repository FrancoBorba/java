package CBFCursos;
    import java.util.*;
public class Aula05 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        // Aula de looping , iguais ao C++;
        // for , while , do-while;
        int  cont = 0 , num , flag = 0 , max , contador =0;
        for (int i = 0; i < 10; i++) {
            System.out.printf(" O contador está em %d\n", i);
        }
        do{
           
           System.out.println("Digite um numero");
           num = scan.nextInt();
           if(num % 2 == 0){
            cont ++;
           }
           System.out.println("Deseja encerrar o progama?\n 1-Sim \n 2-Nao\n");
           flag = scan.nextInt();
        }while( flag != 1);
        System.out.printf(" Foram digitados %d numeros pares\n",cont);
        System.out.println(" Quantas vezes o looping deve rodar?");
        max = scan.nextInt();
        do{
            
            contador++;
            System.out.printf(" Looping rodando pela %d\n",contador);
        
            

        }while(contador < max);
        
    }
}
