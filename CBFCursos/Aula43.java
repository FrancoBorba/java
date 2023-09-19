package CBFCursos;
    import java.nio.file.*;
   
// trabalhando com arquivos em java
public class Aula43 {
    public static void main(String[] args) {
        Path diretorio = Paths.get("C:\\Users\\Pichau\\Desktop\\estudos\\java\\CBFCursos\\Classes");
         Path arquivo = Paths.get("C:\\Users\\Pichau\\Desktop\\estudos\\java\\CBFCursos\\Classes\\Sapo.java");


        if(Files.isDirectory(diretorio)){ // Files.isDirectory - verifica se é um diretorio
            System.out.println("Diretorio existe");
        }
        else{
            System.out.println("Diretorio não existe");
        }
       
        if(Files.exists(arquivo)){  // Files.exists- verifica se existe o path que esta sendo passado
            System.out.println("Arquivo existe");
        }else{
            System.out.println("Arquivo não existe");
        }
        
    }
}
