package CBFCursos;
    // aula sobre metodos em java
public class Aula09 {
    public static void main(String[] args) {
        //canal();
        int resposta;
        resposta = soma(10, 5); 


        System.out.printf("A soma foi %d\n",resposta);
        System.out.println(somaIndefinida(1,5,6,4));
        System.out.println(somaIndefinida(1.5,5.3));
    }
    // criar um metodo indicando , modificador de acesso , tipo de retorno , nome , parametros;

   /*  public static void canal(){ 
        System.out.println(" Teste de metodos");
    }*/
    public static int soma(int n1 ,int n2){
      int  res = n1 + n2;
        return res;
    }
    public static int somaIndefinida( int ... numeros){  // metodo com parametros indefinidos
        int res=0;
        for ( int n:numeros ){
            res+=n;
        }
        return res;
    }
    // sobrecarga de metodos , são metodos com mesmo nome , mas parametros diferentes.
     public static Double somaIndefinida( Double... numeros){  // metodo com parametros indefinidos
        Double res=0.0;
        for ( Double n:numeros ){
            res+=n;
        }
        return res;
    }
}
