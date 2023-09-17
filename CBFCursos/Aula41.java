package CBFCursos;
// mais metodos de strings
public class Aula41 {
    public static void main(String[] args) {
        String s1 = "CBF Cursos - curso de java";
        String s2 = "Aula 41 de strings - Franco Borba";
        System.out.println(s1);

        // startWith - endsWith testam se uma string comeca ou termina com um determinado caracter(retorna true or false)

        if(s1.startsWith("CBF")){  //pode ser uma letra ou mais
            System.out.println("Verdadeiro");
        }else{
            System.out.println("Falso");
        }
        if(s1.endsWith("A")){  // não diferencia maiuscula de minuscula
            System.out.println("Verdadeiro");
        }else{
            System.out.println("Falso");
        }

        // infexOf - retorna a posicao de um caracter (retorna um inteiro)

        System.out.println(s1.indexOf("a"));
        System.out.println(s1.indexOf("s", 10)); // escolhe de onde comeca a procurar

        // substring - retorna um peda;o da string delimitado
        System.out.println(s1.substring(13));
        System.out.println(s1.substring(4,18));

        // concat - concatena duas strings
        System.out.println(s1.concat(s2));
       
}
}
