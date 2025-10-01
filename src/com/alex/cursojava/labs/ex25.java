package com.alex.cursojava.labs;

import java.util.Arrays;

public class ex25 {
    public static void main(String[] args) {
        /*
         * int[] numerosA = new int[5];
         * numerosA[0] = 1;
         * numerosA[1] = 2;
         * numerosA[2] = 3;
         * numerosA[3] = 4;
         * numerosA[4] = 5;
         * 
         * int[] numerosB = new int[5];
         * numerosB = numerosA;
         * 
         * System.out.println(numerosA[1]);
         * System.out.println(numerosB[0]);
         * 
         * int[] vetorA = new int[8];
         * vetorA[0] = 1;
         * vetorA[1] = 2;
         * vetorA[2] = 3;
         * vetorA[3] = 4;
         * vetorA[4] = 5;
         * vetorA[5] = 6;
         * vetorA[6] = 7;
         * vetorA[7] = 8;
         * 
         * int[] vetorB = new int[vetorA.length];
         * 
         * for (int i = 0; i < vetorA.length; i++) {
         * vetorB[i] = vetorA[i] * 2;
         * }
         * 
         * System.out.println("Vetor A = " + Arrays.toString(vetorA));
         * System.out.println("Vetor B = " + Arrays.toString(vetorB));
         */

        /*
         * int[] vetorA = new int[15];
         * vetorA[0] = 1;
         * vetorA[1] = 2;
         * vetorA[2] = 3;
         * vetorA[3] = 4;
         * vetorA[4] = 5;
         * vetorA[5] = 6;
         * vetorA[6] = 7;
         * vetorA[7] = 8;
         * vetorA[8] = 9;
         * vetorA[9] = 10;
         * vetorA[10] = 11;
         * vetorA[11] = 12;
         * vetorA[12] = 13;
         * vetorA[13] = 14;
         * vetorA[14] = 15;
         * 
         * int[] vetorB = new int[vetorA.length];
         * 
         * for (int i = 0; i < vetorA.length; i++) {
         * vetorB[i] = vetorA[i] * vetorA[i];
         * System.out.println(Arrays.toString(vetorB));
         * }
         */

        /*
         * int[] vetorA = new int[15];
         * vetorA[0] = 1;
         * vetorA[1] = 2;
         * vetorA[2] = 3;
         * vetorA[3] = 4;
         * vetorA[4] = 5;
         * vetorA[5] = 6;
         * vetorA[6] = 7;
         * vetorA[7] = 8;
         * vetorA[8] = 9;
         * vetorA[9] = 10;
         * vetorA[10] = 11;
         * vetorA[11] = 12;
         * vetorA[12] = 13;
         * vetorA[13] = 14;
         * vetorA[14] = 15;
         * 
         * double[] vetorB = new double[vetorA.length];
         * 
         * for (int i = 0; i < vetorA.length; i++) {
         * vetorB[i] = vetorA[i] * vetorA[i];
         * vetorB[i] = Math.sqrt(vetorA[i]);
         * System.out.println(Arrays.toString(vetorB));
         * }
         */

        int[] vetorA = new int[10];
        vetorA[0] = 1;
        vetorA[1] = 2;
        vetorA[2] = 3;
        vetorA[3] = 4;
        vetorA[4] = 5;
        vetorA[5] = 6;
        vetorA[6] = 7;
        vetorA[7] = 8;
        vetorA[8] = 9;
        vetorA[9] = 10;

        int[] vetorB = new int[vetorA.length];
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i] * i;
        }
        System.out.println(Arrays.toString(vetorB));
    }
}