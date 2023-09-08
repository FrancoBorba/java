package CBFCursos;
 // passando arrays como parametros para funções
public class Aula27 {
    public static void main(String[] args) {


        /*String nome = "Franco";
        for ( char c:nome.toCharArray()){
            System.out.printf("%c ",c);
        } duvida respondida no inicio da aula sobre como utilizar o for de vetores com string*/ 

        int num[] = {  5, 6, 8, 12, 4 , 19 ,22 ,13 ,16};

        parImpar(num);



    }
    public static void parImpar( int[] n){
        for( int i = 0 ; i < n.length ; i++){
            if( n[i] % 2 == 0) {
                System.out.printf( " %d é par \n",n[i]);
            }else{
                System.out.printf( "  %d é impar \n",n[i]);
            }
            
        }
    }
}

