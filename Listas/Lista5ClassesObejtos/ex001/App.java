package Listas.Lista5ClassesObejtos.ex001;
    //Crie uma classe chamada Pessoa com os atributos nome e idade. Em seguida, crie um construtor para inicializar esses atributos e métodos getters e setters para acessá-los. Crie 5 objetos do tipo Pessoa e teste os métodos criados.

public class App {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Franco", 19);
        Pessoa p2 = new Pessoa("Neymar", 34);
        Pessoa p3 = new Pessoa("Lara", 5);
        System.out.println(p1);
         System.out.println(p2);
          System.out.println(p3);

        if(p1.getIdade() > p2.getIdade()){
            System.out.println(" A idade de " + p1.getNome() + "é maior que" + p2.getNome()); // brincando com o atributos get
        }

        if(p1.getIdade() > p3.getIdade()){
            p3.setIdade(p1.getIdade() + 10); 
        }
        System.out.println(p3);
       
    }
}
