package com.exercises.java.repeticoesEncaixadas;

import java.util.Scanner;
/*
6. Dado um número inteiro positivo, determine a sua decomposição em fatores primos calculando também a multiplicidade de cada fator.
 */
public class exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int count = 0;

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                count++;
                n /= i;
            }
            if (count > 0) {
                System.out.printf("Fator: %d - Multiplicidade: %d ", i, count);
                System.out.println();
            }
            count = 0;
        }

    }
}
