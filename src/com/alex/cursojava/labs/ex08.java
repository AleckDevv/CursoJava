package com.alex.cursojava.labs;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número negativo ou positivo");
        int num = scan.nextInt();

        if (num > 0) {
            System.out.println("é positivo");
        } else if (num < 0) {
            System.out.println("é negativo");
        }

        scan.close();
    }
}
