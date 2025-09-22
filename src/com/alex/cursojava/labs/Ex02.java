package com.alex.cursojava.labs;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int num1 = scan.nextInt();
        System.out.println("Você digitou: " + num1);

        scan.close();
    }
}
