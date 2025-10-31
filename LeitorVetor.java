import java.util.InputMismatchException;
import java.util.Scanner;

public class LeitorVetor {

    public static void main(String[] args) {
        // Define o tamanho do vetor (Array)
        final int TAMANHO_VETOR = 5;
        // Cria um array de inteiros com o tamanho definido
        int[] vetor = new int[TAMANHO_VETOR];
        // Inicializa o objeto Scanner para leitura de entrada
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite " + TAMANHO_VETOR + " números inteiros:");

        // --- Leitura dos Números ---
        for (int i = 0; i < TAMANHO_VETOR; i++) {
            boolean entradaValida = false;
            while (!entradaValida) {
                try {
                    System.out.print("Digite o " + (i + 1) + "º número: ");
                    // Lê o próximo inteiro
                    vetor[i] = scanner.nextInt(); 
                    entradaValida = true; // Sai do loop while se a leitura for bem-sucedida
                } catch (InputMismatchException e) {
                    // Trata o erro se o usuário não digitar um inteiro
                    System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                    // Limpa o buffer do scanner para evitar loop infinito
                    scanner.next(); 
                }
            }
        }

        // Fecha o scanner após terminar a leitura para liberar recursos
        scanner.close();

        // --- Exibição do Vetor ---
        System.out.println("\n--- Vetor Lido ---");
        
        // Exibição elemento por elemento
        System.out.println("Elementos do vetor:");
        for (int i = 0; i < TAMANHO_VETOR; i++) {
            System.out.println("Posição [" + i + "]: " + vetor[i]);
        }
        
        // Opcional: Exibe o array de forma mais concisa (requer importação de Arrays)
        // import java.util.Arrays;
        // System.out.println("O vetor lido é: " + Arrays.toString(vetor));
    }
}