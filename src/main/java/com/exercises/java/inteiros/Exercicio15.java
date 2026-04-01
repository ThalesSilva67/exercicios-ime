package com.exercises.java.inteiros;

import java.util.Scanner;

/*
15. Dizemos que um número i é congruente módulo m a j se i % m = j % m.

    Exemplo: 35 é congruente módulo 4 a 39, pois 35 % 4 = 3 = 39 % 4.

    Dados inteiros positivos n, j e m, imprimir os n primeiros naturais congruentes a j módulo m.
 */

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        int j = Integer.parseInt(input.nextLine());
        int modulo = Integer.parseInt(input.nextLine());
        int count = 0;
        for(int i = 1; count < num; i++) {
            if(i % modulo == j % modulo) {
                System.out.printf("%d ", i);
                count++;
            }
        }
    }
}
