package com.alex.cursojava.labs;

import java.util.Scanner;

public class ex10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra");
        String vogal = scan.nextLine();

        switch (vogal) {
            case "a":
                System.out.println("É vogal");
                break;
            case "e":
                System.out.println("É vogal");
                break;
            case "i":
                System.out.println("É vogal");
                break;
            case "o":
                System.out.println("É vogal");
                break;
            case "u":
                System.out.println("É vogal");
                break;
            default:
                System.out.println("É consoante");
                break;
        }

        scan.close();
    }

}
