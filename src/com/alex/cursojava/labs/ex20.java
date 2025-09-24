package com.alex.cursojava.labs;

import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um lado:");
        int lado1 = scan.nextInt();

        System.out.println("Digite outro lado:");
        int lado2 = scan.nextInt();

        System.out.println("Digite mais um lado:");
        int lado3 = scan.nextInt();

        if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
            System.out.println("É um trinângulo");
        } else if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("trinângulo equilatero");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("isoceles");
        } else {
            System.out.println("escaleno");
        }

        scan.close();
    }
}
