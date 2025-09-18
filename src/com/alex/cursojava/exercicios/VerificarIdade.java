package com.alex.cursojava.exercicios;

import java.util.Scanner;

public class VerificarIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = scan.nextInt();

        boolean verificarIdade = idade >= 18;
        System.out.println("É maior de idade? " + verificarIdade);

        scan.close();
    }
}
