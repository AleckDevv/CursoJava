package com.alex.cursojava.labs;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor em Metros");

        double metros = scan.nextDouble();

        double cm = metros * 100;
        System.out.println("O valor em cm é " + cm);

        scan.close();
    }
}
