package com.alex.cursojava.aula11;

import java.util.Scanner;

public class Break {

    public static void main(String[] args) {
        /*
         * Scanner scan = new Scanner(System.in);
         * 
         * System.out.println("Entre com um número: ");
         * int num = scan.nextInt();
         * 
         * System.out.println("Entre com um limite");
         * int max = scan.nextInt();
         * 
         * for (int i = num; i <= max; i++) {
         * System.out.println("Valor de i: " + i);
         * // verifica se o número é divisivel por 7
         * if (i % 7 == 0) {
         * System.out.println("O valor de i (primeiro divisor por 7) é: " + i);
         * break; // sai do loop
         * }
         * }
         * 
         * scan.close();
         */

        String[] alunos = { "Ana", "Carlos", "Beatriz", "João", "Maria", "José" };

        String alunoProcurado = "João";

        boolean alunoEncontrado = false;
        int posicaoEncontrada = -1;

        System.out.println("Iniciando a busca pelo aluno: " + alunoProcurado);

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Verificando a posição: " + i + ": " + alunos[i]);

            if (alunos[i].equals(alunoProcurado)) {
                alunoEncontrado = true;
                posicaoEncontrada = i;
                System.out.println("Aluno encontrado");
                break;
            }
        }

        if (alunoEncontrado) {
            System.out.println(
                    "Sucesso! O aluno " + alunoProcurado + " está na posição " + posicaoEncontrada + " da lista.");
        } else {
            System.out.println("O aluno " + alunoProcurado + " não foi encontrado na lista.");
        }
    }
}