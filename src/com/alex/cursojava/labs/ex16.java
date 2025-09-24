package com.alex.cursojava.labs;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double salarioNovo;

        System.out.println("Qual o seu salário para recalcular o reajuste? ");
        double salario = scan.nextDouble();

        if (salario <= 270.00) {
            salarioNovo = salario * 1.20;
            System.out.println("Seu novo salário é: " + salarioNovo);
        } else if (salario <= 700.00) {
            salarioNovo = salario * 1.5;
            System.out.println("Seu novo salário é: " + salarioNovo);
        } else if (salario <= 1500.00) {
            salarioNovo = salario * 1.0;
            System.out.println("Seu novo salário é: " + salarioNovo);
        } else {
            salarioNovo = salario * 1.05;
            System.out.println("Seu novo salário é: " + salarioNovo);
        }

        scan.close();
    }
}
