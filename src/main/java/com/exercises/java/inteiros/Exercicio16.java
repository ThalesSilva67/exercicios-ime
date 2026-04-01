package com.exercises.java.inteiros;

import java.util.Scanner;
/*
16. Dado um número natural na base binária, transformá-lo para a base decimal.

Exemplo: Dado 10010 a saída será 18, pois 1. 2 4 + 0. 2 3 + 0. 2 2 + 1. 2 1 + 0. 2 0 = 18.
 */
public class Exercicio16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        int sum = 0;
        int potency = 1;
        while(num > 0) {
            int resto = (num % 10) * potency;
            potency *= 2;
            sum += resto;
            num /= 10;
        }

        System.out.printf("%d", sum);
    }
}
