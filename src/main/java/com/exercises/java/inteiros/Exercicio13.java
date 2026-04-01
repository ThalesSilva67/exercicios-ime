package com.exercises.java.inteiros;

import java.util.Scanner;
/*
13. (MAT 89) Dizemos que um inteiro positivo n é perfeito se for igual à soma de seus divisores positivos diferentes de n.

Exemplo: 6 é perfeito, pois 1+2+3 = 6.
       Dado um inteiro positivo n, verificar se n é perfeito.
 */
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num =  Integer.parseInt(input.nextLine());
        int sum = 0;

        for(int i = 1; i < num; i++) {
            if(num % i == 0) {
                sum = sum + i;
                System.out.println(i);
            }
        }

        if(sum == num) {
            System.out.printf("%d. É um inteiro perfeito", num);
        }  else {
            System.out.printf("%d. Não é um inteiro perfeito", num);
        }

    }
}
