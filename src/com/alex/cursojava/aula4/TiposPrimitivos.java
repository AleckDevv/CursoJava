package com.alex.cursojava.aula4;

public class TiposPrimitivos {
    public static void main(String[] args) {
        /*
         * Tipos Primitivos de dados
         * Números inteiros:
         * byte = -128 a 127
         * short = -32.768 a 32.767
         * int = -2.147.483.648 a 2.147.483.647
         * long = -9223.372.036.854.775.808 a 9223.372.036.854.775.807
         * Strings:
         * String
         * char
         * Números com virgula:
         * float
         * double
         * Valores para true ou false:
         * boolean
         */

        String nome = "Alex";
        char letra = 'm';

        System.out.println(nome);
        System.out.println(letra);

        byte idade1 = 20;
        short idade2 = 20;
        int idade3 = 25;
        long idade4 = 1000000000000l;

        System.out.println(idade1);
        System.out.println(idade2);
        System.out.println(idade3);
        System.out.println(idade4);

        float saldo = 1000.20f;
        double saldo2 = 100.30;

        System.out.println(saldo);
        System.out.println(saldo2);
    }
}
