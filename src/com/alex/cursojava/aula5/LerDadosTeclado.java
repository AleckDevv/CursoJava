package com.alex.cursojava.aula5;

import java.util.Locale;
import java.util.Scanner;

public class LerDadosTeclado {

    public static void main(String[] args) {
        /*
         * Lendo uma linha completa
         * Scanner entrada = new Scanner(System.in);
         * 
         * System.err.println("Digite o seu nome: ");
         * String nome = entrada.nextLine();
         * System.out.println("Você digitou: " + nome);
         * 
         * entrada.close();
         */

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        System.out.println("Digite seu nome, idade e se tem carro e altura: ");
        String nome = entrada.next();
        int idade = entrada.nextInt();
        Boolean temCarro = entrada.nextBoolean();
        // double peso = entrada.nextDouble();
        float altura = entrada.nextFloat();

        System.out.println("Seu nome: " + nome);
        System.out.println("Sua idade: " + idade);
        System.out.println("Tem carro?" + temCarro);
        // System.out.println("Seu peso: " + peso);
        System.out.println("Sua altura" + altura);
        entrada.close();

    }

}