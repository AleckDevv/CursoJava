package com.alex.cursojava.aula8;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int idade = scan.nextInt();

        switch (idade) {
            case 10:
                System.out.println("Menor de idade");
                break;
            case 18:
                System.out.println("Maior de Idade");
                break;
            case 60:
                System.out.println("Você é um idoso");
                break;
            default:
                System.out.println("Idade maior que o esperado");
                break;
        }
        scan.close();
    }
}
