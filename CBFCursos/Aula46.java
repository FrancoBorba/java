package CBFCursos;
import java.util.Stack;
// aula sobre Stack(pilhas)
public class Aula46 {
    public static void main(String[] args) {
        Stack<String> carros = new Stack<>();

        // pílhas funcionam first in , last out , ou seja o primeiro elemento a ser adicionado sera o ultimo a sair , pois ele estara no "fundo" da pilha
        carros.push("Camaro"); // push - serve para adicionar itens na pilha
        carros.push("Ferrari");
        carros.push("RedBull");
        carros.push("Lamborghini");
        carros.push("Porshe");
       
        System.out.printf("Topo da pilha %s\n",carros.peek()); // retorna o elemento que está no topo da fila
        System.out.printf("Topo da pilha %s\n",carros.pop()); // retorna o elemento no topo da pilha e o retira
            System.out.println(carros);
            carros.empty(); // retorna se a pilha está vazia ou não (boolean)
    }
}
