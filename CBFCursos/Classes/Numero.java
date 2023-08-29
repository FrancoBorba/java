package CBFCursos.Classes;
    // tentei criar metodos para a "calculadora " , porém não sei se é o jeito certo de se fazer , utilizei para praticar
public class Numero {
    private int valor;
    private int resultado;
    public Numero( int valor){
        this.valor = valor;
        this.resultado = 0;
    }    
    public void setValor(int valor){
        this.valor= valor;
    }
    public int getValor(){
        return this.valor;
    }
    public int getResultado(){
        return this.resultado;
    }
   public int Soma(int v1 , int v2){
      return this.resultado = v1 + v2;
   }
   public int Subtração(int v1 , int v2){
    return this.resultado = v1 -v2;
   }
   public int Multiplicação( int v1 , int v2){
    return this.resultado = v1*v2;
   }
   public int Divisao( int v1 , int v2){
    
    return this.resultado = v1/v2;
   }
}
