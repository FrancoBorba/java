public class ManchesterDifferentialDecoder {
    // Método para decodificar a sequência Manchester Diferencial em uma string de bits
    public static String decodeManchesterDifferential(String manchesterDiff) {
        StringBuilder bits = new StringBuilder();
        char currentState = '0'; // Estado inicial (assumimos '0' por padrão, baixo-alto)

        for (int i = 0; i < manchesterDiff.length(); i += 2) {
            String pair = manchesterDiff.substring(i, i + 2);
            if (pair.equals("11") || pair.equals("00")) {
                // Não há transição
                bits.append(currentState == '0' ? "0" : "1");
            } else if (pair.equals("10") || pair.equals("01")) {
                // Há transição
                bits.append(currentState == '0' ? "1" : "0");
                currentState = currentState == '0' ? '1' : '0'; // Inverte o estado atual
            } else {
                throw new IllegalArgumentException("Sequência Manchester Diferencial inválida: " + pair);
            }
        }

        return bits.toString();
    }

    // Método para converter a string de bits em texto ASCII
    public static String bitsToString(String bits) {
        StringBuilder text = new StringBuilder();
        // Processa cada byte (8 bits) da string
        for (int i = 0; i < bits.length(); i += 8) {
            String byteString = bits.substring(i, i + 8);
            int byteValue = Integer.parseInt(byteString, 2);
            text.append((char) byteValue);
        }
        return text.toString();
    }

    public static void main(String[] args) {
        // Exemplo de sequência Manchester Diferencial
        String manchesterDiff = "10010110100101101001010101101001011010010101100101101010101001"; // Substitua pela sequência Manchester Diferencial real

        // Decodifica a sequência Manchester Diferencial
        String bits = decodeManchesterDifferential(manchesterDiff);
        // Converte a string de bits para texto ASCII
        String message = bitsToString(bits);

        // Exibe a mensagem resultante
        System.out.println("Mensagem decodificada: " + message);
    }
}
