package com.alex.cursojava.labs;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();

        // int maior = n1;

        if (n1 >= n2 && n1 >= n3) {
            System.out.println("O maior número é: " + n1);
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println("O maior número é: " + n2);
        } else {
            System.out.println("O maior número é: " + n3);
        }

        if (n1 <= n2 && n1 <= n3) {
            System.out.println("O menor é: " + n1);
        } else if (n2 <= n1 && n2 <= n3) {
            System.out.println("O menor é: " + n2);
        } else {
            System.out.println("O menor é: " + n3);
        }

        scan.close();

    }
}
