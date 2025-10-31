import java.util.Scanner;

public class CalculadoraDeMedias {

    public static void main(String[] args) {
        // Constantes para o tamanho da matriz
        final int NUMERO_ALUNOS = 10;
        final int NUMERO_NOTAS = 4;
        final double MEDIA_APROVACAO = 7.0;

        // 1. Declaração e inicialização dos vetores
        // notasAlunos: Matriz 10x4 (10 linhas para alunos, 4 colunas para notas)
        double[][] notasAlunos = new double[NUMERO_ALUNOS][NUMERO_NOTAS];
        
        // mediasAlunos: Vetor simples para armazenar as 10 médias
        double[] mediasAlunos = new double[NUMERO_ALUNOS];
        
        int alunosAprovados = 0; // Contador de alunos com média >= 7.0
        Scanner scanner = new Scanner(System.in);

        System.out.println("🚀 Calculadora de Médias Escolares 🚀\n");

        // 2. Loop principal para leitura e cálculo
        // O loop externo percorre os alunos (linhas da matriz)
        for (int i = 0; i < NUMERO_ALUNOS; i++) {
            System.out.println("--- Aluno " + (i + 1) + " ---");
            double somaNotas = 0; // Variável para somar as 4 notas do aluno atual

            // O loop interno percorre as notas de cada aluno (colunas da matriz)
            for (int j = 0; j < NUMERO_NOTAS; j++) {
                System.out.printf("Digite a %dª nota: ", (j + 1));
                
                // Leitura e armazenamento na matriz
                notasAlunos[i][j] = scanner.nextDouble();
                
                // Acumula a nota para o cálculo da média
                somaNotas += notasAlunos[i][j];
            }

            // Cálculo da média do aluno 'i'
            double media = somaNotas / NUMERO_NOTAS;
            
            // Armazena a média no vetor de médias
            mediasAlunos[i] = media;

            // 3. Verificação de aprovação e contagem
            if (media >= MEDIA_APROVACAO) {
                alunosAprovados++;
            }