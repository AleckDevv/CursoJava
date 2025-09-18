package com.alex.cursojava.aula6;

public class OperadoresLogicos {
    public static void main(String[] args) {
        /*
         * Operadores Lógicos
         * & and ambas as condições tem que ser true
         * | or basta uma ser true para que seja true
         * ^ xor o resultado é falso quando ambas os valores são iguais
         * || or curto circuito
         * && and curto circuito
         * ! not inverte a condição
         */

        int valor1 = 1;
        int valor2 = 2;

        boolean resultado1 = (valor1 == 1) && (valor2 == 2);
        System.out.println("valor1 é 1 and valor2 é 2 - resultado: " + resultado1);

        boolean resultado2 = (valor1 == 1) || (valor2 == 2);
        System.out.println("valor1 é 1 and valor2 é 2 - resultado: " + resultado2);
    }
}
