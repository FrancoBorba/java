package CBFCursos;

import java.util.ArrayList;
import java.util.Iterator;




// Aula sobre iterator
public class Aula50 {
    public static void main(String[] args) {
        ArrayList<String> carros = new ArrayList<String>();

      
        carros.add("Ferrari"); 
        carros.add("Porche");
        carros.add("Mustangue");
        carros.add("Mercedes");
        System.out.println(carros);
        
        Iterator<String> it = carros.iterator() ;
      
        while(it.hasNext()){ // hasNext(): Este método verifica se há mais elementos na coleção para serem percorridos. Ele retorna true se há mais elementos a serem percorridos e false caso contrário.
            String c =it.next();// next(): Este método avança para o próximo elemento na coleção e retorna esse elemento. Se não houver mais elementos, ele pode lançar uma exceção ou retornar um valor especial para indicar o fim da iteração.


            if(c == "Mercedes"){
                it.remove(); // remove um elemento
            }      
        }
        System.out.println(carros);
           
        

    }
}
