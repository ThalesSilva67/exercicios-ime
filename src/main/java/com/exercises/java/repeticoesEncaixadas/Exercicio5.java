package com.exercises.java.repeticoesEncaixadas;

import java.util.Scanner;
/*
5. Sabe-se que um número da forma n3 é igual a soma de n ímpares consecutivos.

Exemplo: 13= 1, 23= 3+5, 33= 7+9+11,  43= 13+15+17+19,...
Dado m, determine os ímpares consecutivos cuja soma é igual a n3 para n assumindo valores de 1 a m.
 */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        int nextOdd = 1;
        int sum;


        for(int i = 1; i <= num; i++) {
            sum = 0;
            for(int j = 1; j <= i; j++) {
                System.out.printf("%d ", nextOdd);
                sum += nextOdd;
                nextOdd += 2;
            }
            System.out.printf("= %d", sum);
            System.out.println();
        }
    }
}
