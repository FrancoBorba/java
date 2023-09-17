package CBFCursos;
// mais metodos de strings
public class Aula42 {
    public static void main(String[] args) {
        String s1 = "CBF Cursos - curso de java";
        String s2 = "Aula 41 de strings - Franco Borba";
        String s3 = s1.concat(s2);
        String s4 ;
        String s5 = "                   Franco  Borba             ";
        // replace - 
        s4 = s3.replace('C', '@');
        System.out.println(s4);

        // toLowerCase - toUpperCase - transforma a string toda em maiuscula ou minuscula
        System.out.println(s2.toLowerCase());
        System.out.println(s2.toUpperCase());

        // trim - corta espacos no inicio ou final de uma string

        System.out.println(s5.trim());

        // toCharArray
        char c [] = s3.toCharArray();
        System.out.println(c); // vetor de char 

        // split - separa uma string em um vetor de strings
        String s6 = " Franco Ribeiro Borba";
        String [] nome = s6.split(" ");
      for(String s:nome){
        System.out.println(s);
      }
        

    }
}
