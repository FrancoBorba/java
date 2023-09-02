package CBFCursos;

import CBFCursos.Classes.Aranha;
import CBFCursos.Classes.Formiga;
import CBFCursos.Classes.Sapo;
import CBFCursos.Classes.Vegetal;

// Aulas 20 , 21 , manipulação das classes heranças de Animal (sapo , aranha , formiga) e fixacação de interface e classes abstratas
public class Aula20 {
    public static void main(String[] args) {


        Sapo a1 = new Sapo(12, 5, 8); 
        Aranha a2 = new Aranha(6, 2, 4, 5);
        Formiga a3 = new Formiga(3, 1, 1);
        Vegetal v1 = new Vegetal(1);    
        Vegetal v2 = new Vegetal(5); 
        Vegetal v3 = new Vegetal(8); 


        a1.info();
        a2.info();
        a3.info();
       

        a2.atacar(a1);
        a1.info();
        a2.info();
        a3.info();
   

    }
}
