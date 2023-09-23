package CBFCursos;
import java.util.LinkedList;
import java.util.Queue;
// Aula sobre queue (filas)
public class Aula47 {
    public static void main(String[] args) {
        
         Queue<String> carros = new LinkedList<>();
      // pilhas sao do tipo fifo , ou seja primeiro elemento a entrar primeiro a sair , ultimo elemento a entrar ultimo elemento a sair 
      
        carros.add("Camaro"); 
        carros.add("Ferrari");
        carros.add("RedBull");
        carros.add("Lamborghini");
        carros.add("Porshe");

        System.out.printf("Topo da pilha %s\n",carros.peek()); // retorna o elemento que está no topo da fila
        System.out.printf("Topo da pilha %s\n",carros.poll()); // retorna o elemento no topo da pilha e o retira
        System.out.println(carros);
        if( carros.isEmpty()){ // verifica se a fila esta vazia
            System.out.println("Fila vazia");
        }else{
            System.out.println("FIla com elementos");
        }

    }
}
