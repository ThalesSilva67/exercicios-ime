package com.exercises.java.inteiros;

import java.util.Scanner;
/*
8. Dado um inteiro não negativo n, determinar n!
 */
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        int fatorial = 1;
        for(int i = num; i >= 1; i--) {
            fatorial *= i;
        }

        System.out.printf("%d!, é igual a: %d", num, fatorial);
    }

}
