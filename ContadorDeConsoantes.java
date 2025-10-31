import java.util.Scanner;

public class ContadorDeConsoantes {

    public static void main(String[] args) {
        // Define o tamanho do vetor
        final int TAMANHO = 10;
        
        // 1. Inicializa o Scanner e o vetor de caracteres
        Scanner scanner = new Scanner(System.in);
        char[] vetorCaracteres = new char[TAMANHO];
        int contadorConsoantes = 0; // Variável para contar as consoantes
        
        System.out.println("🚀 Contagem de Consoantes 🚀");
        System.out.println("Por favor, digite " + TAMANHO + " caracteres (letras):");

        // 2. Loop para ler os 10 caracteres e preencher o vetor
        for (int i = 0; i < TAMANHO; i++) {
            System.out.printf("Digite o %dº caractere: ", (i + 1));
            // Lê a linha inteira e pega o primeiro caractere digitado
            String entrada = scanner.next();
            vetorCaracteres[i] = entrada.charAt(0);
        }

        // 3. Processamento: Contar as consoantes
        
        // Cria um array para armazenar as consoantes encontradas (opcional, mas bom para imprimir)
        char[] consoantesLidas = new char[TAMANHO];
        int indiceConsoantes = 0; // Índice auxiliar para o vetor de consoantes

        for (int i = 0; i < TAMANHO; i++) {
            char c = vetorCaracteres[i];
            
            // Converte o caractere para minúsculo para facilitar a comparação
            char minusculo = Character.toLowerCase(c);