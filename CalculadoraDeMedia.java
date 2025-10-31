import java.util.Scanner; // Importa a classe Scanner para ler dados do usuário

public class CalculadoraDeMedia {

    public static void main(String[] args) {
        // 1. Inicializa o Scanner para ler a entrada do console
        Scanner scanner = new Scanner(System.in);
        
        // 2. Cria um array (vetor) para armazenar as 4 notas
        double[] notas = new double[4];
        double soma = 0; // Variável para acumular a soma das notas

        System.out.println("🚀 Calculadora de Média de 4 Notas 🚀\n");

        // 3. Loop para ler cada uma das 4 notas
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a %dª nota: ", (i + 1));
            
            // Lê a nota (como um número decimal) e armazena no array
            notas[i] = scanner.nextDouble(); 
            
            // Adiciona a nota lida à variável 'soma'
            soma += notas[i]; 
        }

        // 4. Fecha o Scanner após a leitura
        scanner.close(); 
        
        // 5. Calcula a média
        double media = soma / notas.length;

        // --- Saída de Dados ---
        
        System.out.println("\n--- Resultados ---");
        
        // Mostra as notas lidas
        System.out.print("✅ Notas Informadas: ");
        for (int i = 0; i < notas.length; i++) {
            // Usa String.format para garantir que a nota tenha apenas duas casas decimais
            System.out.print(String.format("%.2f", notas[i]));
            if (i < notas.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\n");

        // Mostra a soma e o cálculo da média
        System.out.println("🔢 Soma das Notas: " + String.format("%.2f", soma));
        System.out.println("📊 Média Aritmética: " + String.format("%.2f", media));
        
        System.out.println("\n------------------");
    }
}