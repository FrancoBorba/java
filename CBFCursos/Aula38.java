package CBFCursos;
// Aula 38  - lançamento de exceção com Throw
public class Aula38 {
    public static void main(String[] args) {
        int nota1 , nota2, resp;
        nota1 = 65;
        nota2 = 20;
        // Em um cenario que o maximo permitido para notas é 60 podemos criar uma exceção , invalidando uma possivel entrada maior que 60
        if(nota1 > 60){
            throw new IllegalArgumentException("Valor de nota invalido" );
        }
        if(nota2 > 60){
            throw new IllegalArgumentException("Valor de nota invalido");

        }
        resp = nota1 + nota2;
        System.out.println("A resposta foi" + resp);
        
    }
}
