package com.alex.cursojava.exercicios;

import java.util.Scanner;

public class LoginSimples {
    public static void main(String[] args) {
        String usuarioCorreto = "java";
        String senhaCorreta = "123";

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        String nome = scan.nextLine();

        System.out.println("Digte a senha:");
        String senhaUsuario = scan.nextLine();

        boolean loginValido = (nome == usuarioCorreto) && (senhaUsuario == senhaCorreta);

        System.out.println("usuário: " + nome);
        System.out.println("Senha: " + senhaUsuario);
        System.out.println("Login bem-sucedido: " + loginValido);

        scan.close();

    }
}
