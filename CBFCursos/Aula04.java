
package CBFCursos;

    import java.util.*;

// Obter dados do teclado (scaner)
public class Aula04 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        float n1 , n2 , n3 ;
        String nome;
        float media;
        System.out.println("Digite seu nome");
        nome = scan.nextLine();
        System.out.printf(" Digite suas 3 notas %s\n",nome);
        n1 = scan.nextFloat();
        n2 = scan.nextFloat();
        n3 = scan.nextFloat();
        media = (n1+n2+n3)/3;
        System.out.printf(" O nome foi %s\n",nome);
        System.out.printf(" A media do aluno foi %.2f",media);
    }
}