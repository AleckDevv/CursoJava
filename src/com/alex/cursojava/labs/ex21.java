package com.alex.cursojava.labs;

import java.util.Locale;
import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        /*
         * Opção de resolução
         * while (true) {
         * System.out.println("Digite uma nota entre 0 e 10");
         * int nota1 = scan.nextInt();
         * 
         * switch (nota1) {
         * case 1:
         * System.out.println("Você digitou: " + nota1);
         * break;
         * case 2:
         * System.out.println("Você digitou: " + nota1);
         * break;
         * case 3:
         * System.out.println("Você digitou: " + nota1);
         * break;
         * case 4:
         * System.out.println("Você digitou: " + nota1);
         * break;
         * case 5:
         * System.out.println("Você digitou: " + nota1);
         * break;
         * case 6:
         * System.out.println("Você digitou: " + nota1);
         * break;
         * case 7:
         * System.out.println("Você digitou: " + nota1);
         * break;
         * case 8:
         * System.out.println("Você digitou: " + nota1);
         * break;
         * case 9:
         * System.out.println("Você digitou: " + nota1);
         * break;
         * case 10:
         * System.out.println("Você digitou: " + nota1);
         * break;
         * default:
         * System.out.println("Valor digitado incorreto: Digite novamente");
         * break;
         * }
         * }
         */

        // Opção 2
        while (true) {
            System.out.println("Digite uma nota entre 0 e 10:");
            int nota = scan.nextInt();

            if (nota >= 0 && nota <= 10) {
                System.out.println("Você digitou: " + nota);
                break;
            } else {
                System.out.println("Valor digitado incorreto");
            }
        }

        scan.close();
    }
}
