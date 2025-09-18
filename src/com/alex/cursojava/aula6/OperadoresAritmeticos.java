package com.alex.cursojava.aula6;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        /*
         * Operadores
         * + adição
         * - subtração
         * * multiplicação
         * / divisão
         * % resto da divisão
         * ++ incremento
         * -- decremento
         */

        int num1 = 40;
        int num2 = 10;
        int resultado = num1 + num2;
        System.out.println(resultado);

        // subtração
        resultado = resultado - 2;
        System.out.println("a subtração de " + num1 + "e" + num2 + " é igual a: " + resultado);

        // multiplicação
        resultado = resultado * 2;
        System.out.println("a multiplicação de " + num1 + "e" + num2 + " é igual a: " + resultado);

        // divisão
        resultado = resultado / 3;
        System.out.println("a divisão de " + num1 + "e" + num2 + " é igual a: " + resultado);

        resultado = resultado % 2;
        System.out.println("o resto da divisão de " + num1 + "e" + num2 + " é igual a: " + resultado);

        // incremento
        resultado = resultado++;
        System.out.println("o incremento de " + num1 + "e" + num2 + " é igual a: " + resultado);

        // decremento
        resultado = resultado--;
        System.out.println("o decremento de " + num1 + "e" + num2 + " é igual a: " + resultado);

        // pós-incremento
        int num3 = 10;
        num3++;
        System.out.println(num3);

        // pré-incremento
        int num4 = 12;
        ++num4;
        System.out.println(num4);

        // pós-decremento
        int num5 = 5;
        num5--;
        System.out.println(num5);

        // pré-decremento
        int num6 = 5;
        --num6;
        System.out.println(num6);
    }
}
