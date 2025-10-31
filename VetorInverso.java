import java.util.InputMismatchException;
import java.util.Scanner;

public class VetorInverso {

    public static void main(String[] args) {
        // Define o tamanho do vetor
        final int TAMANHO = 10;
        
        // Cria um array de números reais (double)
        double[] vetorReais = new double[TAMANHO];
        
        // Inicializa o objeto Scanner para leitura de entrada
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite " + TAMANHO + " números reais (com casas decimais):");

        // --- 1. Leitura dos Números ---
        for (int i = 0; i < TAMANHO; i++) {
            boolean entradaValida = false;
            while (!entradaValida) {
                try {
                    System.out.print("Digite o " + (i + 1) + "º número: ");
                    // Lê o próximo número real (double)
                    vetorReais[i] = scanner.nextDouble(); 
                    entradaValida = true; // A leitura foi bem-sucedida
                } catch (InputMismatchException e) {
                    // Trata o erro se o usuário não digitar um número válido
                    System.out.println("Entrada inválida. Por favor, digite um número real (ex: 5.5 ou 10).");
                    // Limpa o buffer do scanner para evitar loop infinito
                    scanner.next(); 
                }
            }
        }

        // Fecha o scanner após terminar a leitura
        scanner.close();

        // --- 2. Exibição na Ordem Inversa ---
        System.out.println("\n--- Exibindo os Números na Ordem Inversa ---");

        /*
         * O laço começa na última posição válida do array (TAMANHO - 1, que é 9)
         * e decrementa até a primeira posição (índice 0).
         */
        for (int i = TAMANHO - 1; i >= 0; i--) {
            // Imprime o elemento na posição 'i'
            System.out.println("Posição [" + i + "]: " + vetorReais[i]);
        }
        
        System.out.println("\nPrograma finalizado.");
    }
}