package Listas.Lista5ClassesObejtos.ex004;
// Crie uma classe chamada Produto com os atributos nome, preço e quantidade em estoque. Implemente métodos para calcular o valor total em estoque desse produto e para adicionar e remover unidades do estoque. Crie 5 objetos do tipo produto e teste os métodos criados.
public class App {
    public static void main(String[] args) {
        Produto arroz = new Produto("Arroz", 5, 50);
        Produto feijao = new Produto("Feijao", 4, 100);
        Produto vodka = new Produto("Vodka", 100, 500);
        System.out.println(arroz);
        System.out.println(feijao);
        System.out.println(vodka);
        for( int i = 0 ; i < 260 ; i++){
            vodka.addProduto();
        }
        feijao.setPreco(8);
        for( int i = 0 ; i < 100 ; i++){
            arroz.removeProduo();
        }
        System.out.println(arroz);
        System.out.println(vodka);
        System.out.println(feijao);
        System.out.println(vodka.valorTotal());

    }
}
