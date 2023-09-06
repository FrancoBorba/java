package CBFCursos;
// break e continue em java
public class Aula23 {
    public static void main(String[] args) {
        int cont = 100;
        for( int i = 0 ; i < cont ; i++){
            System.out.printf("%d \n",i);
            if(i >= 10){
                break;
            }
            // o break encerra imediatamente as estruturas do-while, do , while e switch
        }
        for( int i = 0 ; i < cont ; i++){
            if((i >= 10) && ( i <=60)){
            continue; // o continue para a iteração corrente e 
            }

            System.out.printf("%d \n",i);
        }
    }
}
