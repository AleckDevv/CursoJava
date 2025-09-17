package com.alex.cursojava.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.println("Digite suas notas: ");
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        double nota3 = scan.nextDouble();
        double nota4 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A media é: " + media);
        scan.close();
    }
}
