package com.alex.cursojava.aula7;

import java.util.Locale;
import java.util.Scanner;

public class IfElseAninhados {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            scan.useLocale(Locale.US);

            String usuarioCorreto = "alex";
            int senhaCorreta = 1234;

            System.out.println("Digite sua senha");
            int senhaDigitada = scan.nextInt();

            scan.nextLine();

            System.out.println("Digite seu usuário");
            String usuarioDigitado = scan.nextLine();

            if (usuarioDigitado.equals(usuarioCorreto) && senhaDigitada == senhaCorreta) {
                System.out.println("Login bem-sucedido!");
            } else {
                System.out.println("Usuário ou senha incorretos");
            }

            scan.close();
        }

        /*
         * System.out.println("Digite o preço do item");
         * int valor = 10;
         * 
         * if (valor <= 10) {
         * System.out.println("Está barato, pode comprar");
         * } else if (valor < 10 && valor < 15) {
         * System.out.println("Você pode pedir desconto");
         * } else if (valor >= 15 && valor < 17) {
         * System.out.println("Pode pesquisar mais");
         * } else {
         * System.out.println("Preço muito caro");
         * }
         */

    }
}
