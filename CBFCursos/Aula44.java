package CBFCursos;
  
     import java.nio.file.*;
     import java.util.List;
// continuação da aula sobra arquivos
public class Aula44 {
    public static void main(String[] args) {
        Path arquivo = Paths.get("C:\\Users\\Pichau\\Desktop\\estudos\\java\\CBFCursos\\Classes\\Sapo.java");

        try{
            List<String> linhas = Files.readAllLines(arquivo);

        for( String linha:linhas){
            System.out.println(linha);
        }
        }catch(Exception e){
            System.out.println("ERRO");
        }
    }
}
