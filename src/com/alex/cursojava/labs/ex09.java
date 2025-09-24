package com.alex.cursojava.labs;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra");
        String letra = scan.nextLine();

        switch (letra) {
            case "f":
                System.out.println("é masculino");
                break;
            case "m":
                System.out.println("é feminino");
                break;
            default:
                System.out.println("Sexo não encontrado");
                break;
        }

        scan.close();

    }
}
