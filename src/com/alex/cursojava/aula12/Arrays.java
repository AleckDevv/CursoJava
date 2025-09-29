package com.alex.cursojava.aula12;

public class Arrays {
    public static void main(String[] args) {
        double[] temperaturas = new double[365];

        temperaturas[0] = 21;

        System.out.println(temperaturas[0]);

        String[] nomes = new String[5];
        nomes[0] = "Alex";
        nomes[1] = "Maria";
        nomes[2] = "João";
        nomes[3] = "Ana";
        nomes[4] = "Carlor";

        System.out.println(nomes.length);
        System.out.println(nomes[0]);

        for (int nome = 0; nome < nomes.length; nome++) {
            System.out.println("Posição: " + nome + " - " + "valor: " + nomes[nome]);
        }

        // for melhorado
        for (String nome : nomes) {
            System.out.println(nome);
        }

    }
}
