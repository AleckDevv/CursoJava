package com.alex.cursojava.labs;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma nota: ");

        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();

        double media = (n1 + n2) / 2;

        if (media >= 7) {
            System.out.println("Aprovado: " + media);
        } else if (media < 5) {
            System.out.println("Recuperação: " + media);
        } else {
            System.out.println("Reprovado: " + media);
        }

        scan.close();
    }

}
