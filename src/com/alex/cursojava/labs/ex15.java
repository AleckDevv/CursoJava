package com.alex.cursojava.labs;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual turno você estuda? ");

        String turno = scan.nextLine();

        switch (turno) {
            case "m":
                System.out.println("Bom dia");
                break;
            case "t":
                System.out.println("Boa tarde");
                break;
            case "n":
                System.out.println("Boa noite");
                break;
            default:
                System.out.println("Turno não encontrado");
                break;
        }

        scan.close();
    }
}
