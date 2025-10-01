package com.alex.cursojava.aula13;

public class Teste {
    public static void main(String[] args) {
        double[] notas = { 8.4, 7.5, 6.6, 9.4 };
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = soma / 4;
        System.out.println(media);

        // matrizes

        String[][] nomes = { { "Alex", "Soares" }, { "Maria", "Paz" }, { "Jão", "Vitor" } };

        for (int i = 0; i < nomes.length; i++) {

            for (int j = 0; j < nomes[i].length; j++) {
                // dessa forma, ele não agrupa em uma única linha
                System.out.println(nomes[i][j]);
            }
        }

        System.out.println();

        // único for para agrupar em uma linha
        for (int i = 0; i < nomes.length; i++) {
            String nome = nomes[i][0];
            String sobrenome = nomes[i][1];

            System.out.println("Nome: " + nome + " - " + "Sobrenome: " + sobrenome);
        }

        for (int i = 0; i < nomes.length; i++) {
            for (int j = 0; j < nomes[i].length; j++) {
                System.out.println(nomes[i][j]);
            }
        }
    }
}
