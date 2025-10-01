package com.alex.cursojava.aula13;

import java.util.Arrays;

public class Matrizes2 {
    public static void main(String[] args) {

        // declarar uma matriz
        /*
         * consiste em dizer que uma matriz é composta por linhas e colunas
         */

        String[][] nome = new String[4][2];
        nome[0][0] = "Alex";
        nome[0][1] = "Soares";

        nome[1][0] = "Maria";
        nome[1][1] = "Paz";

        nome[2][0] = "João";
        nome[2][1] = "Soares";

        nome[3][0] = "Aguinaldo";
        nome[3][1] = "Soares";
        // mudar o valor de uma célula da matriz
        nome[3][0] = "Cristiano";
        nome[3][1] = "Ronaldo";

        System.out.println(nome.length);
        System.out.println("Nome: " + nome[0][0] + " sobrenome: " + nome[0][1]);

        System.out.println(Arrays.deepToString(nome));

        for (int i = 0; i < nome.length; i++) {
            // System.out.println(nome[i]);
            /*
             * String nomes = nome[i][0];
             * String sobrenome = nome[i][1];
             * 
             * System.out.println(nomes + " " + sobrenome);
             */

            for (int j = 0; j < nome[i].length; j++) {
                System.out.println(nome[i][j]);
            }

            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < nome.length; i++) {
            // System.out.println(nome[i]);
            /*
             * String nomes = nome[i][0];
             * String sobrenome = nome[i][1];
             * 
             * System.out.println(nomes + " " + sobrenome);
             */

            for (int j = 0; j < nome[i].length; j++) {
                System.out.println(nome[i][j]);
            }

            System.out.println();
        }
    }
}
