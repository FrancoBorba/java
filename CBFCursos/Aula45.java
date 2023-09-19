package CBFCursos;
// Substituir conteudos de um arquivo
import java.nio.file.*;
public class Aula45 {
    public static void main(String[] args) {
        Path logoNova = Paths.get(""); // não peguei imagens para manipular , vou ficar só na teoria
        Path logoAntiga = Paths.get("");

        try{
            byte[] bytesLogonova = Files.readAllBytes(logoNova); // transforma em uma array de bytes a logo nova
            Files.write(logoAntiga, bytesLogonova); // escreve os bytes na loga antiga assim a transformando na logo nova
        }catch(Exception e){
            System.out.println("ERRO");
        }
    }
}
