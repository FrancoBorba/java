package CBFCursos;

import CBFCursos.Classes.Carro;

// arrays de tipo personalizado

public class Aula25 {
    public static void main(String[] args) {
        final int numCarros = 5;
        Carro  carros[] = new Carro[numCarros]; // criando um array utilizando a classe Carro(criada anteriomente)
        String[] nomesCarros = {"Ferrari", "Lamborghini", "Porsche" , "Mclaren","Audi"};

        // criando um array para inicializar o array carros
        for( int i = 0 ; i < numCarros ; i++){
            carros[i] = new Carro(nomesCarros[i]);
        }
        for(int i = 0 ; i < 3 ; i++){
            carros[i].setLigado(true); // "ligando os carros de 0 a 2"
        }

        for(int i = 0; i < carros.length ; i++){
            carros[i].info();
        }
    }
}
