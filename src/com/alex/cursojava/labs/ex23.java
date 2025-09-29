package com.alex.cursojava.labs;

import java.util.Locale;
import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        while (true) {
            System.out.println("Digite o seu nome");
            String nome = scan.nextLine();

            System.out.println("Digite sua idade");
            int idade = scan.nextInt();

            System.out.println("Digite o seu salário");
            double salario = scan.nextDouble();

            System.out.println("Qual o seu sexo");
            String sexo = scan.nextLine();

            System.out.println("Qual o seu estado civil");
            String estadoCivil = scan.nextLine();

            if (nome.length() < 3) {
                System.out.println("O nome não pode ser menor que 3 caracteres");
            } else if (idade >= 0 && idade <= 150) {
                System.out.println("Idade permitida somente entre 0 e 150");
            } else if (salario < 0) {
                System.out.println("O salário tem que ser maior que zero");
            } else if (sexo == "f") {
                System.out.println("Sexo feminino");
            } else if (sexo == "m") {
                System.out.println("Sexo masculino");
            }

        }
    }
}
