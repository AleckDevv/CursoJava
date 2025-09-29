package com.alex.cursojava.aula11;

public class Continue {
    public static void main(String[] args) {
        double[] notas = { 7.5, 8.0, -1.0, 9.2, 11.5, 5.0 };

        double somaDasNotasValidas = 0;

        System.out.println("Iniciado o processamento das notas...");

        for (int i = 0; i < notas.length; i++) {

            double notaAtual = notas[i];
            System.out.println("Verficiando a nota: " + notaAtual);

            if (notaAtual < 0 || notaAtual > 10) {
                System.out.println("--> Nota inválida encontrada. Pulando para a próxima...");
                continue;
            }

            somaDasNotasValidas = somaDasNotasValidas + notaAtual;
            System.out.println("--> Nota válida. Somando ao total");
        }
        System.out.println("\nProcessamento finalizado.");
        System.out.printf("A soma das notas válidas é: %.2f%n", somaDasNotasValidas);
    }
}
