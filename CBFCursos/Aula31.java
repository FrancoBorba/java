package CBFCursos;
// Como passar parâmetros para o programa? [String[] args]
// foi criada uma função soma que recebe valores de fora atraves do parametro args;
public class Aula31 {
    public static void main(String[] args) {
        int soma = 0;
        if(args.length <= 0){
            System.out.println("Não existe valores para soma");
        }
        else{
            for(String n:args){
                int v = Integer.valueOf(n);
                soma += v;
            }
            System.out.printf("A soma foi %d",soma);

        }
    }
}
