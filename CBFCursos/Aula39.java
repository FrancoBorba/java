package CBFCursos;

public class Aula39 {
    public static void main(String[] args) {
        char texto_c[] = {'f','r','a','n','c','o',' ','b','o','r','b','a'}; // um vetor de char é uma string
        String texto_s = new String("Curso de java"); 

        String s1 = new String(); // string vazia
        String s2 = new String(texto_s);
        String s3 = new String(texto_c); // uma string pode receber um array de char pois " são a mesma coisa"
        String s4 = new String(texto_c,0,6);

        System.out.println(s3);
        System.out.println(s4);
         
        int tam = texto_s.length(); // retorna a posição
        System.out.println("O tamanho da string: " + tam);
        char c = texto_s.charAt(2); // retorna a letra(char) da pposição indicada
        System.out.println("A letra da posição 3: "+ c);
    }
}
