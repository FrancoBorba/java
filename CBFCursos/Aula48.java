package CBFCursos;
import java.util.HashMap;
// coleção HashMap
public class Aula48{
    public static void main(String[] args) {
        HashMap<Integer ,String> carros = new HashMap<Integer,String>();
        // HashMap<Chave , Valor> 
        carros.put(1, "Camaro");
        carros.put(2, "Ferrari");
        carros.put(3, "Bugati");
        carros.put(4, "Porche");
        carros.put(5, "Lamborghini");
        carros.put(6, "Mercedes");

        System.out.println(carros);
        carros.remove(4); // remove - remove um item
        // carros.clear() - clear - limpa toda a  coleção
        for( int i = 1 ; i <= carros.size() ; i++){
            System.out.println(carros.get(i));// se informa a chave , e retorna o valor
        }
        
    }
}