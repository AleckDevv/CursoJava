package com.alex.cursojava.labs;

import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double nota1 = scan.nextInt();
        double nota2 = scan.nextInt();

        double media = (nota1 + nota2) / 2;

        if (media >= 9 && media >= 10) {
            System.out.println("A");
            System.out.println("Aprovado");
        } else if (media >= 7.5 && media >= 9.0) {
            System.out.println("B");
            System.out.println("Aprovado");
        } else if (media >= 6.0 && media >= 7.5) {
            System.out.println("C");
            System.out.println("Aprovado");
        } else if (media >= 4 && media >= 6.0) {
            System.out.println("D");
            System.out.println("Reprovado");
        } else {
            System.out.println("E");
            System.out.println("Reprovado");
        }

        scan.close();
    }
}
