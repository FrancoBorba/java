package CBFCursos;
// aula sobre arrayList 

import java.util.ArrayList;

public class Aula36 {
    public static void main(String[] args) {


       //ArrayList<Integer> numeros = new ArrayList<>(); // ArrayList de inteiros
        ArrayList<String> carros = new ArrayList<>(100); // ArrayList de strings
      

      carros.trimToSize(); // elimina elementos não utilizados

        carros.add("masserati");
        carros.add("bugati");
        carros.add(0, "Ferrari"); // permite escolher a posição que será adicionado o novo elemento
        carros.add(2, "Lamborghini");

        System.out.printf("O item pesquisado esta na posicao %d \n", carros.indexOf("bugati"));// retorna a posição do item pesquisado
       //  carros.remove("masserati"); remove o elemento
       // carros.remove(1);  remove o elemento da posição indicada e retorna este elemento
       // portanto o remove pode ser utilizado para remover um elemento indicando o propio ou indicando sua posição
   
        System.out.println(carros.get(2)); // retorna o dado de uma posição especifica do ArrayList
            for( String e:carros){
            System.out.printf(" %s - ",e);
        }

        carros.size(); // retorna o tamanho do arraylist (igual ao lenght)
        carros.clear(); // limpa o arraylist
        
      
        
    }
}
