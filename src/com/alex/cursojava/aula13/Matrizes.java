package com.alex.cursojava.aula13;

public class Matrizes {
    public static void main(String[] args) {
        // matriz que guarda 4 notas de 30 alunos
        double[][] notasAlunos = new double[5][5];
        String[][] nomesCompletos = new String[3][2];

        // primeiro aluno
        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 9.2;
        notasAlunos[0][2] = 8.1;
        notasAlunos[0][3] = 7.5;

        // aluno 2
        notasAlunos[1][0] = 8.3;
        notasAlunos[1][1] = 8.1;
        notasAlunos[1][2] = 6.4;
        notasAlunos[1][3] = 7.6;

        // matriz que guarda os nomes das pessoas
        // uma linha para o primeiro nome
        // e uma coluna para o segundo nome
        nomesCompletos[0][0] = "Alex";
        nomesCompletos[0][1] = "Soares";
        nomesCompletos[1][0] = "Maria";
        nomesCompletos[1][1] = "Santos";
        nomesCompletos[2][0] = "Pedro";
        nomesCompletos[2][1] = "Gomes";

        System.out.println(notasAlunos[0][0]);
        System.out.println(notasAlunos[1][0]);

        System.out.println(nomesCompletos[0][0]);
        System.out.println(nomesCompletos[0][1]);

        System.out.println("Nome completo: " + nomesCompletos[0][0] + " " + nomesCompletos[0][1]);

        for (int i = 0; i < nomesCompletos.length; i++) {
            String nome = nomesCompletos[i][0];
            String sobrenome = nomesCompletos[i][1];
            System.out.println(nome + " " + sobrenome);
        }

        String[][] agenda = new String[7][3];
        agenda[0][0] = "Estudar Java";
        agenda[2][1] = "Ir ao médico";
        agenda[4][2] = "Jantar fora";
        agenda[6][0] = "Fazer compras";

        for (int i = 0; i < agenda.length; i++) {
            System.out.println("Compromissos do dia " + (i + 1) + ":");

            for (int j = 0; j < agenda[i].length; j++) {
                if (agenda[i][j] != null) {
                    System.out.println("- Período" + (j + 1) + ": " + agenda[i][j]);
                }
            }
        }

        // Cálculo de média

        double soma;
        for (int i = 0; i < notasAlunos.length; i++) {
            soma = 0;
            for (int j = 0; j < notasAlunos[i].length; j++) {
                soma += notasAlunos[i][j];
            }

            // Linha de impressão com as duas melhorias aplicadas
            System.out.println("Média do aluno " + (i + 1) + " é: " + (soma / notasAlunos[i].length));
        }
    }
}
