package com.alex.cursojava.exercicios;

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite suas 4 notas");

        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        double nota3 = scan.nextDouble();
        double nota4 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        boolean aprovado = media >= 7;
        boolean recuperacao = ((media <= 5.0) && (media < 7.0));

        System.out.println("Nota1: " + nota1);
        System.out.println("Nota1: " + nota2);
        System.out.println("Nota1: " + nota3);
        System.out.println("Nota1: " + nota4);

        System.out.println("Média final: " + media);
        System.out.println("Aprovado: " + aprovado);
        System.out.println("Em recuperação: " + recuperacao);

        scan.close();
    }
}
