package com.alex.cursojava.aula7;

import java.util.Scanner;

public class CondicionaisIfElse {
    public static void main(String[] args) {

        Scanner idadadeUsuario = new Scanner(System.in);
        System.out.println("Digite sua idade: ");

        int idade = idadadeUsuario.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade");
            idadadeUsuario.close();
        } else {
            System.out.println("Você é menor de idade");
        }
    }
}
