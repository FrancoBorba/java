package CBFCursos;
// Coleção Hash set
import java.util.HashSet;
public class Aula49 {
    public static void main(String[] args) {
        HashSet<String> carros = new HashSet<String>();
        //Elementos Únicos: Um HashSet não permite a inclusão de elementos duplicados. Se você tentar adicionar um elemento que já existe no conjunto, a operação será ignorada
        //Em resumo, um HashSet é uma estrutura de dados útil quando você precisa armazenar uma coleção de elementos únicos sem se preocupar com a ordem deles e deseja acesso rápido para verificar a existência de elementos específicos.
        carros.add("Ferrari"); // add - retorna um boolean
        carros.add("Porche");
        carros.add("Camaro");
        carros.add("Camaro");
        carros.add("Camaro");
        carros.add("Mustangue");
        carros.contains("Ferrari"); // verifica se o elemento esta na lista
        carros.remove(""); // remove o elemento
        //carros.clear(); remove todos os elementos
        carros.isEmpty(); // verifica se existe elementos 

        if(carros.isEmpty()){
            System.out.println("HashSet vazio");
        }else{
            System.out.println("Possui elementos");
        }

        System.out.println(carros.contains("Ferrari")? "ja adicionado" : "adicionado");
        
         System.out.println(carros);
   


    }
}
