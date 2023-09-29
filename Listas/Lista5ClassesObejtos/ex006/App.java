package Listas.Lista5ClassesObejtos.ex006;
//Crie uma classe chamada Aluno com os atributos nome, matrícula e 3 notas. Implemente um construtor para inicializar esses atributos e um método para calcular a média das notas do aluno. Crie 3 objetos e teste os métodos
public class App {
    public static void main(String[] args) {
        Aluno joao = new Aluno("joao", 111, 4, 7, 5);
        Aluno marcus = new Aluno("Marcus", 112, 9, 9, 10);
        System.out.printf(" As notas de joao foram %d / %d / %d \n",joao.getNota1(),joao.getNota2(),joao.getNota3());
         System.out.printf(" As notas de marcus foram %d / %d / %d \n",marcus.getNota1(),marcus.getNota2(),marcus.getNota3());
        System.out.println("A media de joao foi " + joao.mediaAluno());
        System.out.println("A media de marcus foi " + marcus.mediaAluno());
        joao.setNota1(10);
        marcus.setNota3(6);
         System.out.println("A nova media de joao " + joao.mediaAluno());
        System.out.println("A nova media de marcus " + marcus.mediaAluno());

    }
}
