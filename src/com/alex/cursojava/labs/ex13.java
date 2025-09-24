package com.alex.cursojava.labs;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double produto1 = 10.50;
        double produto2 = 8.75;
        double produto3 = 5.25;

        if (produto1 >= produto2 && produto1 >= produto3) {
            System.out.println("O produto 1 está caro");
        } else if (produto2 >= produto1 && produto2 <= produto3) {
            System.out.println("Produto 2 está muito caro");
        } else {
            System.out.println("O produto 3 é o mais barato");
        }

        scan.close();
    }
}
