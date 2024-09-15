public class ManchesterDecoder {
    // Método para decodificar a sequência Manchester em uma string de bits
    public static String decodeManchester(String manchester) {
        StringBuilder bits = new StringBuilder();
        
        // Verifica a sequência em pares de bits
        for (int i = 0; i < manchester.length(); i += 2) {
            String pair = manchester.substring(i, i + 2);
            if ("01".equals(pair)) {
                bits.append("0");
            } else if ("10".equals(pair)) {
                bits.append("1");
            } else {
                throw new IllegalArgumentException("Sequência Manchester inválida: " + pair);
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
        // Exemplo de sequência Manchester
        String manchester = "0110010110101010011010011010010101101001010101100101010101010101"; // Substitua pela sequência Manchester real

        // Decodifica a sequência Manchester
        String bits = decodeManchester(manchester);
        // Converte a string de bits para texto ASCII
        String message = bitsToString(bits);

        // Exibe a mensagem resultante
        System.out.println("Mensagem decodificada: " + message);
    }
}
