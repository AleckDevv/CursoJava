package com.alex.cursojava.exercicios;

import java.util.Scanner;

public class MeuPerfil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");

        String nome = scan.next();

        System.out.println("Digite sua cidade: ");
        String cidade = scan.next();

        System.out.println("Olá, " + nome + "!" + "Que legal que você é de " + cidade);

        scan.close();

    }
}
