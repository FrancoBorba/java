package Listas.ListaRecursividade;
//Palíndromo
//Desenvolva uma função recursiva para verificar se uma string é um palíndromo (lê-se igual de trás para frente).

public class Ex005 {
    public static void main(String[] args) {
    
                String palavra = "carro"; // Substitua pela string que deseja verificar
                boolean resultado = isPalindromo(palavra);
                if (resultado) {
                    System.out.println("'" + palavra + "' é um palíndromo.");
                } else {
                    System.out.println("'" + palavra + "' não é um palíndromo.");
                }
            
    }
        
   
    public static boolean isPalindromo(String str) {
                // Remove espaços em branco e converte a string para minúsculas para ignorar maiúsculas e minúsculas
                str = str.replaceAll("\\s", "").toLowerCase();
                return isPalindromoRecursivo(str, 0, str.length() - 1);
            }
        
            public static boolean isPalindromoRecursivo(String str, int inicio, int fim) {
                // Caso base: se a string tiver 0 ou 1 caractere, é um palíndromo
                if (inicio >= fim) {
                    return true;
                }
                // Verifica se o primeiro e o último caractere são iguais
                if (str.charAt(inicio) != str.charAt(fim)) {
                    return false;
                }
                // Chama a função recursivamente para a substring entre os caracteres iniciais e finais
                return isPalindromoRecursivo(str, inicio + 1, fim - 1);
            }

 } 