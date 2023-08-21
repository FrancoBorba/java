package CBFCursos;
// Aula de matriz 
    import java.security.SecureRandom; 
public class Aula08 {
    public static void main(String[] args) {
       
        final int linha = 5 , coluna =3;
            int mat[][] = new int[linha][coluna];
        for( int i = 0 ; i < linha ; i++){
            for( int j = 0 ; j < coluna ; j++){
                mat[i][j] = new SecureRandom().nextInt(100); // numeros aleatorios
            }
        }
     /*   for( int i = 0 ; i < linha ; i++){
            for( int j = 0 ; j < coluna ; j++){
                System.out.printf("%2d ",mat[i][j]);
            }
            System.out.println(); // quebrar linha 
        }  */

        for( int[] n:mat){
            for( int v:n){
                System.out.printf("%2d ",v);
            }
            System.out.println(); // quebrar linha 
        } // forma reduzida de imprensão de matriz 

    }
}
