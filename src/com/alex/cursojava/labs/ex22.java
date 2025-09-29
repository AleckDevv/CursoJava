package com.alex.cursojava.labs;

// import java.util.Locale;
import java.util.Scanner;

public class ex22 {
    public static void main(String[] asgs) {
        Scanner scan = new Scanner(System.in);
        // scan.useLocale(Locale.US);

        while (true) {
            System.out.println("Digite seu nome:");
            String nome = scan.nextLine();

            System.out.println("Digite sua senha:");
            String senha = scan.nextLine();

            if (senha.equals(nome)) {
                System.out.println("A senha não pode ser igual ao nome de usuário.");
            } else {
                System.out.println("Bem vindo ao sistema");
                break;
            }

        }
        scan.close();
    }
}
