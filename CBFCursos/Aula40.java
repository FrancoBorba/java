package CBFCursos;
// metodos de comparacão de strings
public class Aula40 {
    public static void main(String[] args) {
        String s1 = new String("franco");
        String s2 = "franco";
        String s3 = "CBF Curso de Java";
        String s4 = "CFB Curso";
        String s5 = "Sopa de letrinhas";
        
        if(s1.equals(s2)){ // EQUALS compara strings e retona true ou false
            System.out.println("String 1 igual a 2");
        }

        if(s3.equalsIgnoreCase(s4)){ // não faz a diferenca entra maiuscula e minuscula
            System.out.println("String 3 igual a 4");
        }
            else{
                System.out.println("String 3 diferente de 4");
            }

        // compare to , compara duas strings 
        // se elas forem iguais retorna 0
        // se a string chamadora foi maior retorna um numero positivo
        // se a string chamadora foi menor retorna um numero negativo

        System.out.println(s5.compareTo(s3)); // retorno positivo
        System.out.println(s3.compareTo(s5)); // retorna negativo

        // regionMatches - permite comparar partes da string
       // retorna true se forem iguais
       // retorna false se forem diferente


        System.out.println(s4.regionMatches(true, 0, s3, 0,3));
        

    }
}
