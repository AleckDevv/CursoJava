package com.alex.cursojava.labs;

public class ex24 {
    public static void main(String[] args) {
        int[] codigos = { 101, 102, 103, -1, 105, -2, 108, 0, 110, 112 };

        System.out.println("--- Iniciando processamento do lote ---");

        for (int codigo = 0; codigo < codigos.length; codigo++) {

            int positivo = codigos[codigo];
            int negativo = codigos[codigo];
            int codigoEspecial = codigos[codigo];

            if (positivo > 0) {
                System.out.println("Código processado..." + positivo);
            } else if (negativo < 0) {
                System.out.println("Código negativo ignorado..." + negativo);
                continue;
            } else if (codigoEspecial == 0) {
                System.out.println("Código especial encontrado. Encerrando processamento..." + codigoEspecial);
                break;
            }
        }
    }
}
