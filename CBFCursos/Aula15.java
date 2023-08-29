package CBFCursos;
// Super classes e sub classes
// Aula 16 - modificador protecd ( deixei a aula aqui pois era basica e pequena)
import CBFCursos.Classes.Aviao;

public class Aula15 {
    public static void main(String[] args) {
        Aviao v1 = new Aviao("F-18", 1);
      // v1.velocidade = 300; não consigo acessar pois aula 15 não está no mesmo pacote de veiculo( esta na pasta classes)
        v1.setVelocidade(100);
        v1.info();

    }
    
}
