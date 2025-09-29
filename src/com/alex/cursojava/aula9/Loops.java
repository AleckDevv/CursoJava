package com.alex.cursojava.aula9;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int contador = 0;

        while (contador < 10) {
            contador++;
            System.out.println(contador);
        }

        String nomeCorreto = "alex";
        int senhaCorreta = 1234;

        boolean loginSucesso = false;

        while (!loginSucesso) {
            System.out.println("Digite o seu nome");
            String nomeDigitado = scan.nextLine();

            System.out.println("Digite sua senha");
            int senhaDigitada = scan.nextInt();

            scan.nextLine();

            if (nomeDigitado.equals(nomeCorreto) && senhaDigitada == senhaCorreta) {
                System.out.println("Bem vindo ao sistema!");
                loginSucesso = true;
            } else {
                System.out.println("Nome de usuário ou senha errados. Tente novamente.");
            }
        }

        scan.close();
        // falta fazer o do while
    }
}
