import java.util.Scanner;
import java.util.ArrayList; // Usaremos ArrayList para armazenar Par e Ímpar dinamicamente
import java.util.Arrays; // Usaremos Arrays para imprimir o vetor principal

public class SeparadorDeNumeros {

    public static void main(String[] args) {
        // Define o número total de elementos
        final int TAMANHO = 20;
        
        // 1. Inicializa o Scanner e o vetor principal (tamanho fixo: 20)
        Scanner scanner = new Scanner(System.in);
        int[] vetorPrincipal = new int[TAMANHO];

        // 2. Inicializa as listas dinâmicas para Pares e Ímpares
        // Usamos ArrayList porque não sabemos quantos Pares/Ímpares teremos
        ArrayList<Integer> listaPar = new ArrayList<>();
        ArrayList<Integer> listaImpar = new ArrayList<>();

        System.out.println("🚀 Separador de Números Pares e Ímpares 🚀");
        System.out.println("Por favor, digite " + TAMANHO + " números inteiros:");

        // 3. Loop de Leitura, Armazenamento e Classificação
        for (int i = 0; i < TAMANHO; i++) {
            System.out.printf("Digite o %dº número: ", (i + 1));
            
            // Leitura
            int numero = scanner.nextInt();
            
            // Armazenamento no vetor principal
            vetorPrincipal[i] = numero; 

            // Classificação (usando o operador módulo %)
            if (numero % 2 == 0) {
                // Se o resto da divisão por 2 for 0, é PAR
                listaPar.add(numero);
            } else {
                // Se o resto da divisão por 2 for diferente de 0, é ÍMPAR
                listaImpar.add(numero);
            }
        }

        scanner.close(); 
        
        // --- Saída de Dados ---
        
        System.out.println("\n--- Resultados Finais ---");
        
        // 4. Imprime o Vetor Principal (usa a classe Arrays para formatação simples)
        System.out.println("\n🔢 Vetor Principal (20 números):");
        System.out.println(Arrays.toString(vetorPrincipal));
        
        // 5. Imprime o Vetor PAR
        System.out.println("\n✅ Vetor PAR (" + listaPar.size() + " elementos):");
        System.out.println(listaPar.toString());
        
        // 6. Imprime o Vetor ÍMPAR
        System.out.println("\n❌ Vetor ÍMPAR (" + listaImpar.size() + " elementos):");
        System.out.println(listaImpar.toString());
        
        System.out.println("\n--------------------------");
    }
}