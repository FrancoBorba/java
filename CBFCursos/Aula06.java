package CBFCursos;
// aray em java
    import java.util.*;
public class Aula06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num[] = new int[5]; // declaração de array
        for(int i = 0 ; i < 5 ; i++){
            num = scan.nextInt();
        }
        System.out.printf("%d",num[0]);
    }
}
