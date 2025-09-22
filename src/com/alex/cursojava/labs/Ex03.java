package com.alex.cursojava.labs;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois números: ");
        int num = scan.nextInt();

        int soma = num + num;
        System.out.println(soma);

        scan.close();
    }
}
