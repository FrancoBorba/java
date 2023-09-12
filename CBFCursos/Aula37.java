package CBFCursos;

import java.util.ArrayList;

// Tratamento de Erros com Try Catch Finally
// Aula 38 imbutida - lançamento de exceção com Throw
public class Aula37{
    public static void main(String[] args) {
        ArrayList<String> carros = new ArrayList<>(100);

         carros.add("masserati");
        carros.add("bugati");
        carros.add( "Ferrari"); 
        carros.add( "Lamborghini");

        //System.out.printf(carros.get(10));  Está é uma operação sucetivel a erro já que pode ser passado como parametro no get valores indisponiveis

        try {
            System.out.printf(carros.get(10)); 
        } catch (Exception e) {                    
            System.out.println("ERRO " + e.getMessage());
        } finally{ // o bloco finally sera executado apos o bloco try caso não tenha erro ou apos o catch caso tenha erro
            System.out.println("fim do try-catch");
        }
        try{

        }catch( IndexOutOfBoundsException e){ // tratamento de execessao especifico

        }
       
    }
}