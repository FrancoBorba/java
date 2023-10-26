package Listas.Lista7Array.ex012;

import java.util.ArrayList;

public class InteiroSet {
    
   // private Boolean conjunto[];
   private ArrayList<Boolean> conjunto;
    public InteiroSet(){
        conjunto = new ArrayList<Boolean>();
        
    }
    public void insereElemento( int elemento){
        
        if( elemento > 0 && elemento <= 100){
          conjunto.add(elemento, true);
        } else{
             System.out.println(" elemento fora do conjunto permitido");
        }
    }
    public void removeElemento( int elemento){
        conjunto.remove(elemento);
    }
    public int union(  ArrayList<Boolean> conjuntoA , ArrayList<Boolean> conjuntoB){
        int maior =0;
      ArrayList<Boolean> conjuntoC = new ArrayList<>();

        if(conjuntoA.size() > maior){
            maior = conjuntoA.size();
        }
        if( conjuntoB.size() > maior){
            maior = conjuntoB.size();
        }
        for( int i=0 ; i < maior ; i++){
            conjuntoC.add(conjuntoA.get(i));
            conjuntoC.add(conjuntoB.get(i));
        }
        

        return 0;
    }


    
}
