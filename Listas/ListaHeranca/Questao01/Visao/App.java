package Listas.ListaHeranca.Questao01.Visao;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Listas.Lista5ClassesObejtos.ex004.Produto;
import Listas.ListaHeranca.Questao01.Modelo.Livro;

public class App {
    public static void main(String[] args) {
        ArrayList <Produto> produtos = new ArrayList<Produto>();
        //Livro l1 = new Livro("Java Como Programar", "Deitel", 1000, 300);
        // Produto p1 = Produto("sdfsd", 324);  está pegando o produto de outra pasta
        
        String resultado= "";
       // os livros não estão sendo adicionados
           // produtos.add(new Livro ("Java Como Programar", "Deitel", 1000, 300)); 
           // produtos.add(new Produto("Lapis preto", 2));
           // produtos.add(new Produto("Caneta azul", 3.5));
         //  produtos.add(new Livro ("A hora da estrela","Clarice Lispector", 120, 37.8));
        for (int i=0; i<produtos.size(); i++){
            resultado = resultado + produtos.get(i).toString()+"\n--------\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}
