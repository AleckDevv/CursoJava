package com.alex.cursojava.exercicios;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois números inteiros: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int soma = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        double div = num1 / num2;
        int resto = num1 % num2;
        System.out.println("A soma é: " + soma);
        System.out.println("A subtração é: " + sub);
        System.out.println("A multiplicação é: " + mult);
        System.out.println("A A divisão é: " + div);
        System.out.println("O resto é: " + resto);
        scan.close();
    }
}
