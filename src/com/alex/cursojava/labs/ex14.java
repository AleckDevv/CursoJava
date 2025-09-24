package com.alex.cursojava.labs;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = scan.nextInt();

        System.out.println("Digite outro número: ");
        int n2 = scan.nextInt();

        System.out.println("Digite mais um número: ");
        int n3 = scan.nextInt();

        System.out.println("Em ordem decrecente fica assim: " + n3 + "," + n2 + "," + n1);
        scan.close();


    }
}
