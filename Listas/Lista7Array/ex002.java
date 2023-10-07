package Listas.Lista7Array;
import java.security.SecureRandom;;
public class ex002 {
    public static void main(String[] args) {
        final int tam = 10;
        double maior = 0.0;
        double vet[]  = new double[tam];
        for( int i = 0 ; i < tam; i++){
            vet[i] = new SecureRandom().nextDouble(100);
        }
        for( int i = 0 ; i < tam ; i++){
            System.out.printf("%.1f - ",vet[i]);
        }
        System.out.println();
        for( int i = 0 ; i <tam ; i++){
            if( vet[i] > maior){
                maior = vet[i];
            }
        }
        System.out.println(" O maior elemento do vetor = "+ maior);
     }
}
