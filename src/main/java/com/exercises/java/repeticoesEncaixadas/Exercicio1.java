package com.exercises.java.repeticoesEncaixadas;

import java.util.Scanner;
/*
1. Dados n e n seqüências de números inteiros não-nulos, cada qual seguida por um 0, calcular a soma dos números pares de cada seqüência.
 */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite os números da sequencia:");
        int n;
        int sum = 0;
        String choose;

        while (true) {
            n = Integer.parseInt(input.nextLine());

            if (n == 0) {
                System.out.printf("Fim da sequencia. Resultado da soma dos números pares: %d\n", sum);
                sum = 0;
                System.out.println("Deseja continuar uma nova sequencia? Y/N");
                choose = input.nextLine();
                if (choose.equalsIgnoreCase("n")) {
                    break;
                } else {
                    System.out.println("Digite os números da sequencia:");
                }
                continue;
            }

            if (n % 2 == 0) {
                sum += n;
            }

        }
    }
}
